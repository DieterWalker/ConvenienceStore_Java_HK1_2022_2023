/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class receiptDTO extends DTO{
    int ReceiptID,EmployeeId,ReceiptPrice;
    Date ReceiptFounded;
    public receiptDTO(){
    }
        public receiptDTO(Date ReceiptFounded,int ReceiptID,int ReceiptPrice,int EmployeeId){
            this.EmployeeId=EmployeeId;
            this.ReceiptFounded=ReceiptFounded;
            this.ReceiptID= ReceiptID;
            this.ReceiptPrice= ReceiptPrice;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public Date getReceiptFounded() {
        return ReceiptFounded;
    }

    public int getReceiptID() {
        return ReceiptID;
    }

    public int getReceiptPrice() {
        return ReceiptPrice;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setReceiptFounded(Date ReceiptFounded) {
        this.ReceiptFounded = ReceiptFounded;
    }

    public void setReceiptID(int ReceiptID) {
        this.ReceiptID = ReceiptID;
    }

    public void setReceiptPrice(int ReceiptPrice) {
        this.ReceiptPrice = ReceiptPrice;
    }
       
}
