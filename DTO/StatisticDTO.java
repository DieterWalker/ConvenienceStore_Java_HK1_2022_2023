package DTO;

public class StatisticDTO {
    int StatisticID, StatisticMonth, StatisticSpend, StatisticCollect;

    public StatisticDTO() {
    }

    public StatisticDTO(int StatisticID, int StatisticMonth, int StatisticSpend, int StatisticCollect) {
        this.StatisticID = StatisticID;
        this.StatisticMonth = StatisticMonth;
        this.StatisticSpend = StatisticSpend;
        this.StatisticCollect = StatisticCollect;
    }

    public int getStatisticID() {
        return StatisticID;
    }

    public void setStatisticID(int StatisticID) {
        this.StatisticID = StatisticID;
    }

    public int getStatisticMonth() {
        return StatisticMonth;
    }

    public void setStatisticMonth(int StatisticMonth) {
        this.StatisticMonth = StatisticMonth;
    }

    public int getStatisticSpend() {
        return StatisticSpend;
    }

    public void setStatisticSpend(int StatisticSpend) {
        this.StatisticSpend = StatisticSpend;
    }

    public int getStatisticCollect() {
        return StatisticCollect;
    }

    public void setStatisticCollect(int StatisticCollect) {
        this.StatisticCollect = StatisticCollect;
    }
    
}