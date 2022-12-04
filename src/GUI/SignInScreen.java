package GUI;

import GUI.Cashier.CashierScreen;
import DAO.DAO;
import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.*;


public class SignInScreen extends JFrame {
    JButton btnClose, btnLogin;
    JTextField txtUsername, txtPassword;
    JLabel labUsername, labPassword, labLogo;
    JPanel pnlMain;
    Icon icon_Close, icon_Logo, icon_Attention, icon_Nocation;
    
    public SignInScreen(){
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
                            if (txtUsername.getText().equals("Manager") && txtPassword.getText().equals("12345")){
                                new ManagerScreen();
                                dispose();
                                DAO.start();
                            } else {
                            if (txtUsername.getText().equals("Cashier") && txtPassword.getText().equals("12345")){
                                new CashierScreen();
                                dispose();
                                DAO.start();
                            }   else {
                                JOptionPane.showMessageDialog(rootPane , "Không đăng nhập được do tên tài khoản hoặc mật khẩu sai! " , "Thông tin sai" , HEIGHT , icon_Nocation );
                            }}
                        }
                    });  
            
        btnClose = new JButton();                                    
            btnClose.setIcon(icon_Close);                             
            btnClose.setBackground(null);                              
            btnClose.setBorder(null);                                   
            btnClose.setFocusable(false);                               
            btnClose.setBounds( 370 , 5 , 25 , 25 );
                
                btnClose.addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e) {
                            if (JOptionPane.showConfirmDialog(rootPane, "Bạn có thật sự muốn thoát?", "Exit", JOptionPane.YES_NO_OPTION, HEIGHT, icon_Attention) == JOptionPane.YES_OPTION )
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

