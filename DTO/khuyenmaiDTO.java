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
public class khuyenmaiDTO extends DTO{
    int PromotionID,SPID,PromotionTiGia;
    Date PromotionBegin,PromotionEnd;
    public khuyenmaiDTO(){
    }
    public khuyenmaiDTO(int PromotionID,int PromotionTiGia,int SPID,Date PromotionBegin,Date PromotionEnd){
        this.PromotionBegin=PromotionBegin;
        this.PromotionEnd=PromotionEnd;
        this.PromotionID=PromotionID;
        this.PromotionTiGia=PromotionTiGia;
        this.SPID=SPID;
    }

    public void setPromotionBegin(Date PromotionBegin) {
        this.PromotionBegin = PromotionBegin;
    }

    public void setPromotionEnd(Date PromotionEnd) {
        this.PromotionEnd = PromotionEnd;
    }

    public void setPromotionID(int PromotionID) {
        this.PromotionID = PromotionID;
    }

    public void setPromotionTiGia(int PromotionTiGia) {
        this.PromotionTiGia = PromotionTiGia;
    }

    public void setSPID(int SPID) {
        this.SPID = SPID;
    }

    public Date getPromotionBegin() {
        return PromotionBegin;
    }

    public Date getPromotionEnd() {
        return PromotionEnd;
    }

    public int getPromotionID() {
        return PromotionID;
    }

    public int getPromotionTiGia() {
        return PromotionTiGia;
    }

    public int getSPID() {
        return SPID;
    }
    
    
}
