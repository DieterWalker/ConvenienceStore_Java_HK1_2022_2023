package DTO;

public class AccountDTO {
    String Username, Password;
    int EmployeeID;

    public AccountDTO() {
    }


    public AccountDTO(String Username, String Password, int EmployeeID) {
        this.Username = Username;
        this.Password = Password;
        this.EmployeeID = EmployeeID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

}
