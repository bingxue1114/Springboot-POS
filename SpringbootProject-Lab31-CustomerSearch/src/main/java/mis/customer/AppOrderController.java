package mis.customer;

import java.util.List;
import mis.models.OrderDetail;
import mis.models.OrderDetailDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppOrderController {

    //***資料庫操作物件
    private final OrderDetailDAO orderdetailDao = new OrderDetailDAO();

    
    // 訂單明細
    @RequestMapping("/")
    public String orderdetail(Model model) {
        List<OrderDetail> orderdetails = orderdetailDao.getAllOrdersDetail();
//        OrderDetail orderdetails = new OrderDetail();
        model.addAttribute("orderdetails", orderdetails);
        return "orderdetail.html";
    }
    
    //搜尋 -- order_num
    @RequestMapping("/searchOrderDetailByOrderNum")
    public String searchByOrder_num(@RequestParam("order_num") String order_num, Model model) {
        List<OrderDetail> orderdetails = orderdetailDao.findByOrder_num(order_num);
        model.addAttribute("orderdetails", orderdetails);
        return "orderdetail.html";
    }
    
    //搜尋 -- Customer_phone
    @RequestMapping("/searchOrderDetailByCustomerphone")
    public String searchByCustomerphone(@RequestParam("customer_phone") String customer_phone, Model model) {
        List<OrderDetail> orderdetails = orderdetailDao.findByCustomerphone(customer_phone);
        model.addAttribute("orderdetails", orderdetails);
        return "orderdetail.html";
    }
    
    //搜尋 -- Customer_name
    @RequestMapping("/searchOrderDetailByCustomername")
    public String searchByCustomername(@RequestParam("customer_name") String customer_name, Model model) {
        List<OrderDetail> orderdetails = orderdetailDao.findByCustomername(customer_name);
        model.addAttribute("orderdetails", orderdetails);
        return "orderdetail.html";
    }
}
