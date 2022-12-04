package DTO;

import java.util.Date;

public class ReceiptDTO {
    int ReceiptID, EmployeeID, ReceiptTotalPrice;
    String ReceiptDate, ReceiptPayment, ReceiptCustomerPhone;

    public ReceiptDTO() {
    }

    public ReceiptDTO(int ReceiptID, int EmployeeID, int ReceiptTotalPrice, String ReceiptDate, String ReceiptPayment, String ReceiptCustomerPhone) {
        this.ReceiptID = ReceiptID;
        this.EmployeeID = EmployeeID;
        this.ReceiptTotalPrice = ReceiptTotalPrice;
        this.ReceiptDate = ReceiptDate;
        this.ReceiptPayment = ReceiptPayment;
        this.ReceiptCustomerPhone = ReceiptCustomerPhone;
    }

    public int getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(int ReceiptID) {
        this.ReceiptID = ReceiptID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getReceiptTotalPrice() {
        return ReceiptTotalPrice;
    }

    public void setReceiptTotalPrice(int ReceiptTotalPrice) {
        this.ReceiptTotalPrice = ReceiptTotalPrice;
    }

    public String getReceiptDate() {
        return ReceiptDate;
    }

    public void setReceiptDate(String ReceiptDate) {
        this.ReceiptDate = ReceiptDate;
    }

    public String getReceiptPayment() {
        return ReceiptPayment;
    }

    public void setReceiptPayment(String ReceiptPayment) {
        this.ReceiptPayment = ReceiptPayment;
    }

    public String getReceiptCustomerPhone() {
        return ReceiptCustomerPhone;
    }

    public void setReceiptCustomerPhone(String ReceiptCustomerPhone) {
        this.ReceiptCustomerPhone = ReceiptCustomerPhone;
    }
    
    
}