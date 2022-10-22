package DTO;

import java.sql.Date;

public class EmployeeDTO extends DTO {
    String EmployeeId, EmployeeName, EmployeeAddress, EmployeePhone;
    Date EmployeeBirthDay;
    //AccountDTO accountDTO;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String EmployeeId, String EmployeeName, String EmployeeAddress, String EmployeePhone, Date EmployeeBirthDay){// AccountDTO accountDTO) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.EmployeeAddress = EmployeeAddress;
        this.EmployeePhone = EmployeePhone;
        this.EmployeeBirthDay = EmployeeBirthDay;
        //this.accountDTO = accountDTO;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
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

    public Date getEmployeeBirthDay() {
        return EmployeeBirthDay;
    }

    public void setEmployeeBirthDay(Date EmployeeBirthDay) {
        this.EmployeeBirthDay = EmployeeBirthDay;
    }

//    public AccountDTO getAccountDTO() {
//        return accountDTO;
//    }
//
//    public void setAccountDTO(AccountDTO accountDTO) {
//        this.accountDTO = accountDTO;
//    }
//    
}
    

   