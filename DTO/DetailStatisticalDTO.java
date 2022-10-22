/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;

/**
 *
 * @author ACER
 */
public class DetailStatisticalDTO extends DTO{
    int StatisticalID,DetailStatisticalID,DetailStatisticalNumberA,DetailStatisticalNumberB,DetailStatisticalCollect,DetailStatisticalTarget;
    String SPName;
    public DetailStatisticalDTO(){
    }
    public DetailStatisticalDTO(String SPName,int StatisticalID,int DetailStatisticalID,int DetailStatisticalNumbetA,int DetailStatisticalNumberB,int DetailStatisticalCollect,int DetailStatisticalTarget){
        this.DetailStatisticalCollect=DetailStatisticalCollect;
        this.DetailStatisticalID=DetailStatisticalID;
        this.DetailStatisticalNumberA=DetailStatisticalNumbetA;
        this.DetailStatisticalNumberB=DetailStatisticalNumberB;
        this.DetailStatisticalTarget=DetailStatisticalTarget;
        this.SPName=SPName;
        this.StatisticalID=StatisticalID;
    }

    public int getDetailStatisticalCollect() {
        return DetailStatisticalCollect;
    }

    public int getDetailStatisticalID() {
        return DetailStatisticalID;
    }

    public int getDetailStatisticalNumberA() {
        return DetailStatisticalNumberA;
    }

    public int getDetailStatisticalNumberB() {
        return DetailStatisticalNumberB;
    }

    public int getDetailStatisticalTarget() {
        return DetailStatisticalTarget;
    }

    public String getSPName() {
        return SPName;
    }

    public int getStatisticalID() {
        return StatisticalID;
    }

    public void setDetailStatisticalCollect(int DetailStatisticalCollect) {
        this.DetailStatisticalCollect = DetailStatisticalCollect;
    }

    public void setDetailStatisticalID(int DetailStatisticalID) {
        this.DetailStatisticalID = DetailStatisticalID;
    }

    public void setDetailStatisticalNumberA(int DetailStatisticalNumberA) {
        this.DetailStatisticalNumberA = DetailStatisticalNumberA;
    }

    public void setDetailStatisticalNumberB(int DetailStatisticalNumberB) {
        this.DetailStatisticalNumberB = DetailStatisticalNumberB;
    }

    public void setDetailStatisticalTarget(int DetailStatisticalTarget) {
        this.DetailStatisticalTarget = DetailStatisticalTarget;
    }

    public void setSPName(String SPName) {
        this.SPName = SPName;
    }

    public void setStatisticalID(int StatisticalID) {
        this.StatisticalID = StatisticalID;
    }
    
    
}
