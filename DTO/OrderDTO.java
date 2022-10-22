/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class OrderDTO extends DTO{
    int OrderID, EmployeeId, OrderTotal;
    Date OrderFounded;
    public OrderDTO(){
        
    }
     public OrderDTO( Date OrderFounded,int OrderID,int OrderTotal,int EmployeeId){
         this.EmployeeId=EmployeeId;
         this.OrderFounded=OrderFounded;
         this.OrderID=OrderID;
         this.OrderTotal=OrderTotal;
        
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public Date getOrderFounded() {
        return OrderFounded;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getOrderTotal() {
        return OrderTotal;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setOrderFounded(Date OrderFounded) {
        this.OrderFounded = OrderFounded;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setOrderTotal(int OrderTotal) {
        this.OrderTotal = OrderTotal;
    }
     
}
