package DTO;

public class StatisticDetaiilDTO {
    int StatisticID, ProductID, StatisticSellNum, StatisticOrderNum, 
        StatisticOrderPrice, StatisticBuyPrice;

    public StatisticDetaiilDTO() {
    }

    public StatisticDetaiilDTO(int StatisticID, int ProductID, int StatisticSellNum, int StatisticOrderNum, int StatisticOrderPrice, int StatisticBuyPrice, String ProductName) {
        this.StatisticID = StatisticID;
        this.ProductID = ProductID;
        this.StatisticSellNum = StatisticSellNum;
        this.StatisticOrderNum = StatisticOrderNum;
        this.StatisticOrderPrice = StatisticOrderPrice;
        this.StatisticBuyPrice = StatisticBuyPrice;
    }

    public int getStatisticID() {
        return StatisticID;
    }

    public void setStatisticID(int StatisticID) {
        this.StatisticID = StatisticID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getStatisticSellNum() {
        return StatisticSellNum;
    }

    public void setStatisticSellNum(int StatisticSellNum) {
        this.StatisticSellNum = StatisticSellNum;
    }

    public int getStatisticOrderNum() {
        return StatisticOrderNum;
    }

    public void setStatisticOrderNum(int StatisticOrderNum) {
        this.StatisticOrderNum = StatisticOrderNum;
    }

    public int getStatisticOrderPrice() {
        return StatisticOrderPrice;
    }

    public void setStatisticOrderPrice(int StatisticOrderPrice) {
        this.StatisticOrderPrice = StatisticOrderPrice;
    }

    public int getStatisticBuyPrice() {
        return StatisticBuyPrice;
    }

    public void setStatisticBuyPrice(int StatisticBuyPrice) {
        this.StatisticBuyPrice = StatisticBuyPrice;
    }
    
}
