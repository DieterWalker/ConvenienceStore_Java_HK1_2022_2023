package DTO;

import java.util.Date;

public class OrderDTO {
    int OrderID, OrderPrice, EmployeeID;
    Date OrderDay;

    public OrderDTO() {
    }

    public OrderDTO(int OrderID, int OrderPrice, int EmployeeID, Date OrderDay) {
        this.OrderID = OrderID;
        this.OrderPrice = OrderPrice;
        this.EmployeeID = EmployeeID;
        this.OrderDay = OrderDay;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(int OrderPrice) {
        this.OrderPrice = OrderPrice;
    }

    public Date getOrderDay() {
        return OrderDay;
    }

    public void setOrderDay(Date OrderDay) {
        this.OrderDay = OrderDay;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    
}
