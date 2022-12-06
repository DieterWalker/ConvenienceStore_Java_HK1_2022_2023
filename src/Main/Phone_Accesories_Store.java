package Main;

import GUI.Manager.ManagerScreen;
import GUI.*;
import GUI.Cashier.CashierScreen;
import GUI.Cashier.ReceiptScreen;

public class Phone_Accesories_Store {
    public static void main(String[] args) {
        DAL.DAO.start();
        new SignInScreen();
//          new ManagerScreen();
    }
}
