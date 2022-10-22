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
public class StatisticalDTO extends DTO{
    int StatisticalID,StatisticalCollect,StatisticalTarget;
    Date StatisticalMonth;
    public StatisticalDTO(){
    }
    public StatisticalDTO(Date StatisticalMonth,int StatisticalID,int StatisticalCollect,int StatisticalTarget){
        this.StatisticalCollect=StatisticalCollect;
        this.StatisticalID=StatisticalID;
        this.StatisticalTarget=StatisticalTarget;
        this.StatisticalMonth=StatisticalMonth;
    }

    public int getStatisticalCollect() {
        return StatisticalCollect;
    }

    public int getStatisticalID() {
        return StatisticalID;
    }

    public Date getStatisticalMonth() {
        return StatisticalMonth;
    }

    public int getStatisticalTarget() {
        return StatisticalTarget;
    }

    public void setStatisticalCollect(int StatisticalCollect) {
        this.StatisticalCollect = StatisticalCollect;
    }

    public void setStatisticalID(int StatisticalID) {
        this.StatisticalID = StatisticalID;
    }

    public void setStatisticalMonth(Date StatisticalMonth) {
        this.StatisticalMonth = StatisticalMonth;
    }

    public void setStatisticalTarget(int StatisticalTarget) {
        this.StatisticalTarget = StatisticalTarget;
    }
    
}
