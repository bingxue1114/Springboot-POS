package mis.product_crud;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppProductController {

    private final ProductDAO productDao = new ProductDAO();

    @Autowired
    private HttpSession httpSession;

    //url根路徑 或稱為 家路徑 也適合
    @RequestMapping("/")
    public String home(Model model) {
        List<Product> products = productDao.getAllProducts();
        System.out.println(products.get(0).toString());
        model.addAttribute("listProducts", products);
        System.out.println(model.toString());
        return "home.html";
    }

    //新增產品
    @GetMapping("/showNewProductForm")
    public String showNewProductForm(Model model) {
        //產品id最大值判斷
        String product_num = productDao.getMaxOrderNum();
        if (product_num == null) {
            product_num = "p-j-100";
        }

        //將現有訂單編號加上1
        int serial_num = Integer.parseInt(product_num.split("-")[2]) + 1;
        System.out.println(serial_num);

        //每家公司都有其訂單或產品的編號系統，這裡用ord-xxx表之
        String new_product_num = "p-j-" + serial_num;

        // 新增一個產品物件，內容填入範例資料，全都不填入資料也是可以
        Product product = new Product();
        product.setProduct_id(new_product_num);
        model.addAttribute("product", product);
        return "new_product.html"; //渲染並開啟一個新增產品網頁
    }

    //確定新增一筆資料，進行寫入資料庫，並重新導向到網站的根路徑
    @PostMapping("/createProduct")
    public String saveProduct(Product product) {
        productDao.insert(product);
        return "redirect:/";
    }

// 寫法1 使用GET傳遞產品編號 後端使用@RequestPath抓取路徑參數的方式
    // http://localhost:8080/showFormForUpdate/p-j-000
    @GetMapping("/showFormForUpdate/{pid}")
    public String showFormForUpdate(@PathVariable(value = "pid") String product_id, Model model) {
        // get product
        Product product = productDao.findById(product_id);
        System.out.println(product.getProduct_id());

        // product bean
        model.addAttribute("product", product);
        return "update_product.html";
    }

    //確定更新這一筆資料，進行寫入資料庫，並重新導向到網站的根路徑
    @RequestMapping("/updateProduct")
    public String updateProduct(@ModelAttribute("product") Product product) {
        System.out.println(product.getProduct_id());
        this.productDao.update(product);
        return "redirect:/";
    }

    //寫法D 較安全
    //使用Post的方式較佳。
    //@RequestParam參數: name= "product_id" 或 value= "product_id" 皆可
    @PostMapping("/deleteProduct")
    public String deleteProduct(@RequestParam(name = "product_id") String product_id) {
        this.productDao.delete(product_id);
        return "redirect:/";
    }

    // 搜尋
    @RequestMapping("/searchProductById")
    public String searchById(@RequestParam("product_id") String product_id, Model model) {
        List<Product> products = productDao.findByIdContaining(product_id);
        model.addAttribute("listProducts", products);
        return "home.html";
    }

    @RequestMapping("/searchProductByName")
    public String searchByName(@RequestParam("name") String name, Model model) {
        List<Product> products = productDao.findByNameContaining(name);
        model.addAttribute("listProducts", products);
        return "home.html";
    }

    @RequestMapping("/searchProductByPrice")
    public String searchByPrice(@RequestParam(name = "price") String strprice, Model model) {
        int price = 0;
        try {
            price = Integer.parseInt(strprice);
        } catch (NumberFormatException ex) {
            System.out.println("價格輸入格式錯誤");
            System.out.println(ex);
            return "redirect:" + "/";  //跳到到根路徑網頁  等於回到首頁的意思         
        }

        List<Product> products = productDao.findByPriceLessThanEqual(price);
        model.addAttribute("listProducts", products);
        return "home.html";
    }

    @RequestMapping("/searchProductByCate")
    public String searchByCate(@RequestParam(name = "category") String cate, Model model) {

        System.out.println("cate:" + cate);
        List<Product> products = productDao.findByCate(cate);
        model.addAttribute("listProducts", products);
        return "home.html";
    }

}
