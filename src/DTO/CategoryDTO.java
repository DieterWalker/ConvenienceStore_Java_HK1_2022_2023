package DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryDTO extends DTO {
    int CategoryID;
    String CategoryName;

    public CategoryDTO() {
    }

    public CategoryDTO(int CategoryID, String CategoryName) {
        this.CategoryID = CategoryID;
        this.CategoryName = CategoryName;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }
    
    @Override
    public String toString() {
        return CategoryID + "," + CategoryName;
    }

    @Override
    public boolean retriveData(ResultSet rs) {
        boolean flag;
        try {
            this.CategoryID = rs.getInt(1);
            this.CategoryName = rs.getString(2);
            flag = true;
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }
    
    
}
