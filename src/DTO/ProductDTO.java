    package DTO;
    
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductDTO extends DTO {
    public int ProductID, ProductStorage, CategoryID,  ProductPrice;
    public String ProductName , ProductBrand, ProductWarranty, ProductImage;
    
    public ProductDTO() {
    }

    public ProductDTO(int ProductID, int ProductStorage, int CategoryID, int ProductPrice, String ProductName, String ProductBrand, String ProductWarranty, String ProductImage) {
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

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    @Override
    public boolean retriveData(ResultSet rs) {
        boolean flag;
        try {
            this.ProductID = rs.getInt(1);
            this.ProductName = rs.getString(2);
            this.ProductImage = rs.getString(3);
            this.CategoryID = rs.getInt(4);
            this.ProductBrand= rs.getString(5);
            this.ProductWarranty= rs.getString(6);
            this.ProductStorage= rs.getInt(7);
            this.ProductPrice= rs.getInt(8);
            flag = true;
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }
}