package DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDTO extends DTO {
    public String Username, Password, Position ;
    public int EmployeeID, AccountID;

    public AccountDTO() {
    }

    public AccountDTO(String Username, String Password, String Position, int EmployeeID, int AccountID) {
        this.Username = Username;
        this.Password = Password;
        this.Position = Position;
        this.EmployeeID = EmployeeID;
        this.AccountID = AccountID;
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

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    
    @Override
    public boolean retriveData(ResultSet rs) {
        boolean flag;
        try {
            this.AccountID = rs.getInt(1);
            this.EmployeeID = rs.getInt(2);
            this.Username = rs.getString(3);
            this.Password = rs.getString(4);
            this.Position = rs.getString(5);
            flag = true;
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }

}
   