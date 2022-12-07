package DTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ReceiptDTO extends DTO      {
    public int ReceiptID, EmployeeID, ReceiptTotalPrice;
    public String ReceiptDate, ReceiptPayment, ReceiptCustomerPhone;

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

    @Override
    public boolean retriveData(ResultSet rs) {
        boolean flag;
        try {
            this.ReceiptID = rs.getInt(1);
            this.EmployeeID = rs.getInt(2);
            this.ReceiptCustomerPhone = rs.getString(3);
            this.ReceiptDate = rs.getString(4);
            this.ReceiptTotalPrice = rs.getInt(5);
            this.ReceiptPayment  = rs.getString(6);
            flag = true;
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }
   
    
}