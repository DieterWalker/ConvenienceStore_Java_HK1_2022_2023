package DTO;

import java.util.Date;

public class ReceiptDTO {
    int ReceiptID, EmployeeID, ReceiptPrice;
    Date ReceiptDay;

    public ReceiptDTO() {
    }
    
    public ReceiptDTO(int ReceiptID, int EmployeeID, int ReceiptPrice, Date ReceiptDay) {
        this.ReceiptID = ReceiptID;
        this.EmployeeID = EmployeeID;
        this.ReceiptPrice = ReceiptPrice;
        this.ReceiptDay = ReceiptDay;
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

    public int getReceiptPrice() {
        return ReceiptPrice;
    }

    public void setReceiptPrice(int ReceiptPrice) {
        this.ReceiptPrice = ReceiptPrice;
    }

    public Date getReceiptDay() {
        return ReceiptDay;
    }

    public void setReceiptDay(Date ReceiptDay) {
        this.ReceiptDay = ReceiptDay;
    }

    
}
