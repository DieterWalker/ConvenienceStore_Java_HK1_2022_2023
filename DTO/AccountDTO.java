/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;

/**
 *
 * @author ACER
 */
public class AccountDTO extends DTO{
  int EmployeeId;
  String AccountID,AccountPass,AccountPosition;
  public AccountDTO(){
  }
    public AccountDTO(int EmployeeId,String AccountID,String AccountPass,String AccountPositon){
        this.AccountID=AccountID;
        this.AccountPass=AccountPass;
        this.AccountPosition=AccountPositon;
        this.EmployeeId=EmployeeId;
  }

    public String getAccountID() {
        return AccountID;
    }

    public String getAccountPass() {
        return AccountPass;
    }

    public String getAccountPosition() {
        return AccountPosition;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    public void setAccountPass(String AccountPass) {
        this.AccountPass = AccountPass;
    }

    public void setAccountPosition(String AccountPosition) {
        this.AccountPosition = AccountPosition;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }
    
}
