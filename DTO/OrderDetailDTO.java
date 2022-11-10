package DTO;

public class OrderDetailDTO {
    int ProductID, OrderID, OrderDetailAmount, OrderDetailPrice;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int ProductID, int OrderID, int OrderDetailAmount, int OrderDetailPrice) {
        this.ProductID = ProductID;
        this.OrderID = OrderID;
        this.OrderDetailAmount = OrderDetailAmount;
        this.OrderDetailPrice = OrderDetailPrice;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getOrderDetailAmount() {
        return OrderDetailAmount;
    }

    public void setOrderDetailAmount(int OrderDetailAmount) {
        this.OrderDetailAmount = OrderDetailAmount;
    }

    public int getOrderDetailPrice() {
        return OrderDetailPrice;
    }

    public void setOrderDetailPrice(int OrderDetailPrice) {
        this.OrderDetailPrice = OrderDetailPrice;
    }

}