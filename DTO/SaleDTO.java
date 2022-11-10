package DTO;

import java.util.Date;

public class SaleDTO {
    int SaleID, ProductID;
    Date SaleStart, SaleEnd;
    float SaleRate;

    public SaleDTO() {
    }

    
    public SaleDTO(int SaleID, int ProductID, Date SaleStart, Date SaleEnd, float SaleRate) {
        this.SaleID = SaleID;
        this.ProductID = ProductID;
        this.SaleStart = SaleStart;
        this.SaleEnd = SaleEnd;
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

    public Date getSaleStart() {
        return SaleStart;
    }

    public void setSaleStart(Date SaleStart) {
        this.SaleStart = SaleStart;
    }

    public Date getSaleEnd() {
        return SaleEnd;
    }

    public void setSaleEnd(Date SaleEnd) {
        this.SaleEnd = SaleEnd;
    }

    public float getSaleRate() {
        return SaleRate;
    }

    public void setSaleRate(float SaleRate) {
        this.SaleRate = SaleRate;
    }

}
