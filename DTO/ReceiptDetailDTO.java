package DTO;

public class ReceiptDetailDTO {
    int ReceiptID, ProductID, ReceiptDetailAmount, ReceiptDetailPrice;

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
    
    
}
