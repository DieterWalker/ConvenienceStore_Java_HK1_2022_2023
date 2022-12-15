package GUI;

import BUS.AccountManagerLogic;
import GUI.Helper.DataValidator;
import GUI.Cashier.CashierScreen;
import DAL.DAO;
import DTO.AccountDTO;
import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.*;


public class SignInScreen extends JFrame {
    JButton btnClose, btnLogin;
    JTextField txtUsername, txtPassword;
    JLabel labUsername, labPassword, labLogo;
    JPanel pnlMain;
    Icon icon_Close, icon_Logo, icon_Attention, icon_Nocation;
    
    public static int EmployeeID;
    
    public SignInScreen(){
        DAO.start();
        this.setPreferredSize(new Dimension(400,310));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        //this.setShape(new RoundRectangle2D.Double(0, 0, 350, 430, 30, 30));
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        
        initGUI();
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public void initGUI(){
        this.getContentPane().setBackground(Color.black);
        
            try {
                System.out.println(new File("/GUI/Icons/Close.png").toURI().toURL());
                icon_Close = new ImageIcon(new File("src/GUI/Icons/Close.png").toURI().toURL());
                icon_Logo = new ImageIcon(new File("src/GUI/Icons/Logo.png").toURI().toURL());
                icon_Attention = new ImageIcon(new File("src/GUI/Icons/Attention.png").toURI().toURL());
                icon_Nocation = new ImageIcon(new File("src/GUI/Icons/Nocation.png").toURI().toURL());
            } catch (MalformedURLException ex) {
                System.out.print("False");
            }
            
        pnlMain = new JPanel();
            pnlMain.setBackground( new Color( 250, 250, 250 ));
            pnlMain.setBounds( 0 , 100 , 400 , 210 );
        
        labLogo = new JLabel("Logo");
            labLogo.setBounds( 125 , 0 , 150 , 100 );
            labLogo.setIcon(icon_Logo);
            
        
        labUsername = new JLabel("Username");
            labUsername.setForeground(Color.black);
            labUsername.setBounds( 10, 110 , 300 , 30 );
            labUsername.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        labPassword = new JLabel("Password");
            labPassword.setForeground(Color.black);
            labPassword.setBounds( 10, 180 , 300 , 30 );
            labPassword.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        txtUsername = new JTextField();
            txtUsername.setBounds( 10 , 140 , 380 , 30 );
            txtUsername.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtUsername.setForeground(new Color ( 60 , 60 , 60 ));
            
        txtPassword = new JPasswordField ();
            txtPassword.setBounds( 10 , 210 , 380 , 30 );
            txtPassword.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtPassword.setForeground(new Color ( 60 , 60 , 60 ));
            
        btnLogin = new JButton("LOG IN");
            btnLogin.setBackground(Color.black);
            btnLogin.setForeground(new Color ( 250 , 250 , 250 ));
            btnLogin.setBorder(null);
            btnLogin.setFocusable(false);
            btnLogin.setBounds( 10 , 260 , 380 , 40 );
            btnLogin.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
            
            btnLogin.addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e) {
                            StringBuilder sb = new StringBuilder();
                            DataValidator.validateTextEmpty(txtUsername, sb, "Please enter Username!" );
                            DataValidator.validateTextEmpty(txtPassword, sb, "Please enter Password!" );
                            if (sb.length() > 0){
                                JOptionPane.showMessageDialog(rootPane, sb.toString() , "Information is wrong or missing!",  JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            if (txtUsername.getText().equals("Manager") && txtPassword.getText().equals("12345")){
                                new ManagerScreen();
                                dispose();
                                return;
                            } else {
                            AccountManagerLogic logic = new AccountManagerLogic();
                            int flag = 0;
                            for (AccountDTO Cdto : logic.list){
                            String user = Cdto.Username;
                            String pass = Cdto.Password;
                            if (txtUsername.getText().trim().equalsIgnoreCase(user) && txtPassword.getText().trim().equalsIgnoreCase(pass)){
                                String m = Cdto.Position;
                                System.out.println(m);
                                EmployeeID = Cdto.EmployeeID;
                                if (m.equals("Manager")){
                                        new ManagerScreen();
                                        dispose();
                                        flag = 1;
                                }
                                if (m.equals("Cashier")){
                                        new CashierScreen();
                                        dispose();
                                        flag = 1;
                                    }   
                                }
                            }
                             if (flag == 0 ){
                                 JOptionPane.showMessageDialog(rootPane, "Information is wrong!" , "Error!",  JOptionPane.INFORMATION_MESSAGE);
                                 return;
                             }  
                            dispose();
                    }}});  
            
        btnClose = new JButton();                                    
            btnClose.setIcon(icon_Close);                             
            btnClose.setBackground(null);                              
            btnClose.setBorder(null);                                   
            btnClose.setFocusable(false);                               
            btnClose.setBounds( 370 , 5 , 25 , 25 );
                
                btnClose.addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e) {
                            if (JOptionPane.showConfirmDialog(rootPane, "Do you want to exit the program?", "Exit", JOptionPane.YES_NO_OPTION, HEIGHT, icon_Attention) == JOptionPane.YES_OPTION )
                                dispose();
                        }
                    });  
                

        this.add(labUsername);
        this.add(labPassword);
        this.add(labLogo);
        
        this.add(txtUsername);
        this.add(txtPassword);
        
        this.add(btnClose);
        this.add(btnLogin);
        
        this.add(pnlMain);
    }
}

