package DTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class SaleDTO extends DTO {
    int SaleID, ProductID;
    String SaleName;
    float SaleRate;

    public SaleDTO() {
    }

    public SaleDTO(int SaleID, int ProductID, String SaleName, float SaleRate) {
        this.SaleID = SaleID;
        this.ProductID = ProductID;
        this.SaleName = SaleName;
        this.SaleRate = SaleRate;
    }

    public int getSaleID() {
        return SaleID;
    }

    public void setSaleID(int SaleID) {
        this.SaleID = SaleID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getSaleName() {
        return SaleName;
    }

    public void setSaleName(String SaleName) {
        this.SaleName = SaleName;
    }

    public float getSaleRate() {
        return SaleRate;
    }

    public void setSaleRate(float SaleRate) {
        this.SaleRate = SaleRate;
    }
    
    @Override
    public boolean retriveData(ResultSet rs) {
        boolean flag;
        try {
            this.SaleID = rs.getInt(1);
            this.ProductID = rs.getInt(2);
            this.SaleName = rs.getString(3);
            this.SaleRate= rs.getFloat(4);
            flag = true;
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }

    
}
