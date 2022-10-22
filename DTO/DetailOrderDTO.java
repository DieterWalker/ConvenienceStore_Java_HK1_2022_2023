/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;

/**
 *
 * @author ACER
 */
public class DetailOrderDTO extends DTO{
    int OrderID,SPID,DetailOrderNumber,DetailOrderPriceA,DetailOrderPriceB;
    String SPName;
    public DetailOrderDTO(){
    }
    public DetailOrderDTO(String SPName,int DetailOrderNumber, int OrderID,int SPID,int DetailOrderPriceA,int DetailOrderPriceB ){
        this.DetailOrderNumber=DetailOrderNumber;
        this.DetailOrderPriceA=DetailOrderPriceA;
        this.DetailOrderPriceB= DetailOrderPriceB;
        this.OrderID=OrderID;
        this.SPID=SPID;
        this.SPName=SPName;
    }

    public int getDetailOrderNumber() {
        return DetailOrderNumber;
    }

    public int getDetailOrderPriceA() {
        return DetailOrderPriceA;
    }

    public int getDetailOrderPriceB() {
        return DetailOrderPriceB;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getSPID() {
        return SPID;
    }

    public String getSPName() {
        return SPName;
    }

    public void setDetailOrderNumber(int DetailOrderNumber) {
        this.DetailOrderNumber = DetailOrderNumber;
    }

    public void setDetailOrderPriceA(int DetailOrderPriceA) {
        this.DetailOrderPriceA = DetailOrderPriceA;
    }

    public void setDetailOrderPriceB(int DetailOrderPriceB) {
        this.DetailOrderPriceB = DetailOrderPriceB;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setSPID(int SPID) {
        this.SPID = SPID;
    }

    public void setSPName(String SPName) {
        this.SPName = SPName;
    }
    
}
