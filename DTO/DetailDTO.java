/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;

/**
 *
 * @author ACER
 */
public class DetailDTO extends DTO{
    int OrderID,DetailID,DetailNumber,DetailPrice;
    public DetailDTO() {
    }
        public DetailDTO(int OrderID,int DetailID,int DetailNumber, int DetailPrice) {
            this.DetailID=DetailID;
            this.DetailNumber=DetailNumber;
            this.DetailPrice=DetailPrice;
            this.OrderID=OrderID;
    }

    public int getDetailID() {
        return DetailID;
    }

    public int getDetailNumber() {
        return DetailNumber;
    }

    public int getDetailPrice() {
        return DetailPrice;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setDetailID(int DetailID) {
        this.DetailID = DetailID;
    }

    public void setDetailNumber(int DetailNumber) {
        this.DetailNumber = DetailNumber;
    }

    public void setDetailPrice(int DetailPrice) {
        this.DetailPrice = DetailPrice;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }
        

}
