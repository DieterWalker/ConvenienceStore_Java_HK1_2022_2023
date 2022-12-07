package DTO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDTO extends DTO {
    public String EmployeeName, EmployeeAddress, EmployeePhone, EmployeeGender, EmployeeImage;;
    public int  EmployeeID,  EmployeeWage;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String EmployeeName, String EmployeeAddress, String EmployeePhone, int EmployeeID, String EmployeeGender, int EmployeeWage, String EmployeeImage) {
        this.EmployeeName = EmployeeName;
        this.EmployeeAddress = EmployeeAddress;
        this.EmployeePhone = EmployeePhone;
        this.EmployeeID = EmployeeID;
        this.EmployeeGender = EmployeeGender;
        this.EmployeeWage = EmployeeWage;
        this.EmployeeImage = EmployeeImage;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String EmployeeAddress) {
        this.EmployeeAddress = EmployeeAddress;
    }

    public String getEmployeePhone() {
        return EmployeePhone;
    }

    public void setEmployeePhone(String EmployeePhone) {
        this.EmployeePhone = EmployeePhone;
    }

    public String getEmployeeGender() {
        return EmployeeGender;
    }

    public void setEmployeeGender(String EmployeeGender) {
        this.EmployeeGender = EmployeeGender;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getEmployeeWage() {
        return EmployeeWage;
    }

    public void setEmployeeWage(int EmployeeWage) {
        this.EmployeeWage = EmployeeWage;
    }

    public String getEmployeeImage() {
        return EmployeeImage;
    }

    public void setEmployeeImage(String EmployeeImage) {
        this.EmployeeImage = EmployeeImage;
    }

  
    @Override
    public boolean retriveData(ResultSet rs) {
        boolean flag;
        try {
            this.EmployeeID = rs.getInt(1);
            this.EmployeeName = rs.getString(2);
            this.EmployeeImage= rs.getString(3);
            this.EmployeeGender = rs.getString(4);
            this.EmployeeAddress = rs.getString(5);
            this.EmployeePhone = rs.getString(6);
            this.EmployeeWage = rs.getInt(7);
            flag = true;
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }
    
}
    

   