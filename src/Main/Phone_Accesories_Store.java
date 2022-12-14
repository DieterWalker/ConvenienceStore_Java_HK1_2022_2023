package Main;

import GUI.Cashier.CashierScreen;
import GUI.Manager.ManagerScreen;
import GUI.SignInScreen;

public class Phone_Accesories_Store {
    public static void main(String[] args) {
        DAL.DAO.start();
          new SignInScreen();
          //new ManagerScreen();
          //new CashierScreen();
    }
}
