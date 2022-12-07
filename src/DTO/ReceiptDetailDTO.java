package DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReceiptDetailDTO extends DTO{
    public int ReceiptID, ProductID, ReceiptDetailAmount, ReceiptDetailPrice;

    public ReceiptDetailDTO() {
    }

    public ReceiptDetailDTO(int ReceiptID, int ProductID, int ReceiptDetailAmount, int ReceiptDetailPrice) {
        this.ReceiptID = ReceiptID;
        this.ProductID = ProductID;
        this.ReceiptDetailAmount = ReceiptDetailAmount;
        this.ReceiptDetailPrice = ReceiptDetailPrice;
    }

    public int getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(int ReceiptID) {
        this.ReceiptID = ReceiptID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getReceiptDetailAmount() {
        return ReceiptDetailAmount;
    }

    public void setReceiptDetailAmount(int ReceiptDetailAmount) {
        this.ReceiptDetailAmount = ReceiptDetailAmount;
    }

    public int getReceiptDetailPrice() {
        return ReceiptDetailPrice;
    }

    public void setReceiptDetailPrice(int ReceiptDetailPrice) {
        this.ReceiptDetailPrice = ReceiptDetailPrice;
    }


    @Override
    public boolean retriveData(ResultSet rs) {
        boolean flag;
        try {
            this.ReceiptID = rs.getInt(1);
            this.ProductID = rs.getInt(2);
            this.ReceiptDetailAmount = rs.getInt(3);
            this.ReceiptDetailPrice = rs.getInt(4);
            flag = true;
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }
}
