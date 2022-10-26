package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainScreen extends JFrame {
    public static final Color LIGHT_BACKGROUND = new Color(227, 253, 253);
    public static final Color BTN_BACKGROUND = Color.black;
    public static final Color BACKGROUND = new Color(166, 227, 233);
    public static final Color BORDER = Color.RED;
    public static final Color FOREGROUND = Color.white;
    public static final Color BTN_BACKGROUND2 =  Color.black;
    
    ManagerScreen MS;
    AccountantScreen AS;
    CashierScreen CS;
    CardLayout mainLayout;
    
    public MainScreen(){
        initGUI();
        CreateScreen();
       
    }
    
    private void initGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setAlwaysOnTop(true);
        this.setVisible(true);
        this.mainLayout = new CardLayout();
        this.setLayout(mainLayout);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void CreateScreen(){
        AS =  new AccountantScreen();
        MS = new ManagerScreen();
        CS =  new CashierScreen();
        this.add(MS);
//        this.add("Accountant", AS);
//        this.add("Cashier", CS);
    }

}
