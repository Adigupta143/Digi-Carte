
package hib.dto;


public class Order {
    private int orderId;
    private int tableNo;
    private String userName;
    private String items;
    
    public Order(){}

    public Order(int orderId, int tableNo, String userName, String items) {
        this.orderId= orderId;
        this.tableNo = tableNo;
        this.userName = userName;
        this.items = items;
    }

   
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    
     public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}
