package DTO;
    
public class ProductDTO {
    int ProductID, ProductStorage, CategoryID,  ProductPrice;
    String ProductName , ProductBrand, ProductWarranty ; 
    byte[] ProductImage;
    
    public ProductDTO() {
    }

    public ProductDTO(int ProductID, int ProductStorage, int CategoryID, int ProductPrice, String ProductName, String ProductBrand, String ProductWarranty, byte[] ProductImage) {
        this.ProductID = ProductID;
        this.ProductStorage = ProductStorage;
        this.CategoryID = CategoryID;
        this.ProductPrice = ProductPrice;
        this.ProductName = ProductName;
        this.ProductBrand = ProductBrand;
        this.ProductWarranty = ProductWarranty;
        this.ProductImage = ProductImage;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getProductStorage() {
        return ProductStorage;
    }

    public void setProductStorage(int ProductStorage) {
        this.ProductStorage = ProductStorage;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductBrand() {
        return ProductBrand;
    }

    public void setProductBrand(String ProductBrand) {
        this.ProductBrand = ProductBrand;
    }

    public String getProductWarranty() {
        return ProductWarranty;
    }

    public void setProductWarranty(String ProductWarranty) {
        this.ProductWarranty = ProductWarranty;
    }

    public byte[] getProductImage() {
        return ProductImage;
    }

    public void setProductImage(byte[] ProductImage) {
        this.ProductImage = ProductImage;
    }

}