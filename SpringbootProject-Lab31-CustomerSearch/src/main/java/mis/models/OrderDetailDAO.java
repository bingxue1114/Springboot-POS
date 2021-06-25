package mis.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailDAO {

    private Connection conn;

    public List<OrderDetail> getAllOrdersDetail() {
        conn = DBConnection.getConnection();
        String query = "select * from order_detail";
        List<OrderDetail> orderdetails = new ArrayList();

        try {
            PreparedStatement ps
                    = conn.prepareStatement(query);
            ResultSet rset = ps.executeQuery();

            while (rset.next()) {
//                不傳遞任何資料
//                OrderDetail orderdetail = new OrderDetail();
//                orderdetail.setId(rset.getInt("id"));
//                orderdetail.setOrder_num(rset.getString("order_num"));
//                orderdetail.setProduct_id(rset.getString("product_id"));
//                orderdetail.setProduct_name(rset.getString("product_name"));
//                orderdetail.setQuantity(rset.getInt("quantity"));
//                orderdetail.setFinished(rset.getString("finished"));
//                orderdetail.setCustomer_name(rset.getString("customer_name"));
//                orderdetail.setCustomer_phone(rset.getString("customer_phone"));
//                orderdetail.setCustomer_address(rset.getString("customer_address"));
//                orderdetail.setTable_num(rset.getString("table_num"));
//                orderdetails.add(orderdetail);

            }
        } catch (SQLException ex) {
            System.out.println("getAllproducts異常:" + ex.toString());
        }

        return orderdetails;

    }

    //選擇某個order_num
    public List<OrderDetail> findByOrder_num(String order_num) {
        conn = DBConnection.getConnection();
        boolean success = false;
        List<OrderDetail> orderdetails = new ArrayList();
        String query = "select * from order_detail where order_num like ?";

        try {
            PreparedStatement state = conn.prepareStatement(query);
            state.setString(1, "%" + order_num + "%");
            ResultSet rset = state.executeQuery();

            while (rset.next()) {
                success = true;
                OrderDetail orderdetail = new OrderDetail();
                orderdetail.setId(rset.getInt("id"));
                orderdetail.setOrder_num(rset.getString("order_num"));
                orderdetail.setProduct_id(rset.getString("product_id"));
                orderdetail.setProduct_name(rset.getString("product_name"));
                orderdetail.setQuantity(rset.getInt("quantity"));
                orderdetail.setFinished(rset.getString("finished"));
                orderdetail.setCustomer_name(rset.getString("customer_name"));
                orderdetail.setCustomer_phone(rset.getString("customer_phone"));
                orderdetail.setCustomer_address(rset.getString("customer_address"));
                orderdetail.setTable_num(rset.getString("table_num"));
                orderdetails.add(orderdetail);
            }
        } catch (SQLException ex) {
            System.out.println("資料庫selectByID操作異常:" + ex.toString());
        }

        if (success) {
            return orderdetails;
        } else {
            return null;
        }

    }
    
        //選擇某個Customerphone
    public List<OrderDetail> findByCustomerphone(String customer_phone) {
        conn = DBConnection.getConnection();
        boolean success = false;
        List<OrderDetail> orderdetails = new ArrayList();
        String query = "select * from order_detail where customer_phone like ?";

        try {
            PreparedStatement state = conn.prepareStatement(query);
            state.setString(1, customer_phone);
            ResultSet rset = state.executeQuery();

            while (rset.next()) {
                success = true;
                OrderDetail orderdetail = new OrderDetail();
                orderdetail.setId(rset.getInt("id"));
                orderdetail.setOrder_num(rset.getString("order_num"));
                orderdetail.setProduct_id(rset.getString("product_id"));
                orderdetail.setProduct_name(rset.getString("product_name"));
                orderdetail.setQuantity(rset.getInt("quantity"));
                orderdetail.setFinished(rset.getString("finished"));
                orderdetail.setCustomer_name(rset.getString("customer_name"));
                orderdetail.setCustomer_phone(rset.getString("customer_phone"));
                orderdetail.setCustomer_address(rset.getString("customer_address"));
                orderdetail.setTable_num(rset.getString("table_num"));
                orderdetails.add(orderdetail);
            }
        } catch (SQLException ex) {
            System.out.println("資料庫selectByID操作異常:" + ex.toString());
        }

        if (success) {
            return orderdetails;
        } else {
            return null;
        }

    }
    
            //選擇某個Customername
    public List<OrderDetail> findByCustomername(String customer_name) {
        conn = DBConnection.getConnection();
        boolean success = false;
        List<OrderDetail> orderdetails = new ArrayList();
        String query = "select * from order_detail where customer_name like ?";

        try {
            PreparedStatement state = conn.prepareStatement(query);
            state.setString(1, customer_name);
            ResultSet rset = state.executeQuery();

            while (rset.next()) {
                success = true;
                OrderDetail orderdetail = new OrderDetail();
                orderdetail.setId(rset.getInt("id"));
                orderdetail.setOrder_num(rset.getString("order_num"));
                orderdetail.setProduct_id(rset.getString("product_id"));
                orderdetail.setProduct_name(rset.getString("product_name"));
                orderdetail.setQuantity(rset.getInt("quantity"));
                orderdetail.setFinished(rset.getString("finished"));
                orderdetail.setCustomer_name(rset.getString("customer_name"));
                orderdetail.setCustomer_phone(rset.getString("customer_phone"));
                orderdetail.setCustomer_address(rset.getString("customer_address"));
                orderdetail.setTable_num(rset.getString("table_num"));
                orderdetails.add(orderdetail);
            }
        } catch (SQLException ex) {
            System.out.println("資料庫selectByID操作異常:" + ex.toString());
        }

        if (success) {
            return orderdetails;
        } else {
            return null;
        }

    }

}
