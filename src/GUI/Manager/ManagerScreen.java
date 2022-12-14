package GUI.Manager;

import GUI.Manager.Panel.AccountPanel;
import GUI.Manager.Panel.CategoryPanel;
import GUI.Manager.Panel.EmployeePanel;
import GUI.Manager.Panel.MyPanel;
import GUI.Manager.Panel.ProductPanel;
import GUI.Manager.Panel.SalePanel;
import GUI.SignInScreen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.*;

public class ManagerScreen extends JFrame {
    JPanel pnlMenu, pnlContent;
    JButton btnEmployee, btnProduct, btnSale, btnAccount, btnReceipt, 
            btnCategory, btnExit;
    JLabel labLogo;
    Icon icon_Logo;
    
    MyPanel[] Panel = {
        new EmployeePanel(),
        new ProductPanel(),
        new CategoryPanel(),
        new SalePanel(),
        new AccountPanel(),
    };
    
    public ManagerScreen(){
        this.setPreferredSize(new Dimension(1500,800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        
        GUI();
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    public void GUI(){
        CreateMenu();
        CreateContent();
        
    }
    
    private void CreateContent(){
        pnlContent = new JPanel();
            pnlContent.setBounds(150, 0, 1350, 800);
            pnlContent.setLayout(null);
           
        this.add(pnlContent);
    }
    
        
    private void CreateMenu(){
        try {
                icon_Logo = new ImageIcon(new File("src/GUI/Icons/Logo.png").toURI().toURL());
            } catch (MalformedURLException ex) {
                System.out.print("False");
            }
        
        pnlMenu = new JPanel();
            pnlMenu.setBounds(0, 0, 150, 800);
            pnlMenu.setLayout(null);
            pnlMenu.setBackground(Color.black);
        
        labLogo = new JLabel("Logo");
            labLogo.setBounds( 0 , 0 , 150 , 100 );
            labLogo.setIcon(icon_Logo);
            
        btnEmployee = new JButton("EMPLOYEE");
            btnEmployee.setBackground(Color.white);
            btnEmployee.setForeground(Color.black);
            btnEmployee.setBorder(null);
            btnEmployee.setFocusable(false);
            btnEmployee.setBounds( 5 , 105 , 140 , 30 );
            btnEmployee.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
            
        btnProduct = new JButton("PRODUCT");
            btnProduct.setBackground(Color.white);
            btnProduct.setForeground(Color.black);
            btnProduct.setBorder(null);
            btnProduct.setFocusable(false);
            btnProduct.setBounds( 5 , 140 , 140 , 30 );
            btnProduct.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
            
        btnCategory = new JButton("CATEGORY");
            btnCategory.setBackground(Color.white);
            btnCategory.setForeground(Color.black);
            btnCategory.setBorder(null);
            btnCategory.setFocusable(false);
            btnCategory.setBounds( 5 , 175 , 140 , 30 );
            btnCategory.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            
        btnSale = new JButton("SALE");
            btnSale.setBackground(Color.white);
            btnSale.setForeground(Color.black);
            btnSale.setBorder(null);
            btnSale.setFocusable(false);
            btnSale.setBounds( 5 , 210 , 140 , 30 );
            btnSale.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
            
            
        btnAccount = new JButton("ACCOUNT");
            btnAccount.setBackground(Color.white);
            btnAccount.setForeground(Color.black);
            btnAccount.setBorder(null);
            btnAccount.setFocusable(false);
            btnAccount.setBounds( 5 , 245 , 140 , 30 );
            btnAccount.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
            
//        btnReceipt = new JButton("RECEIPT");
//            btnReceipt.setBackground(Color.white);
//            btnReceipt.setForeground(Color.black);
//            btnReceipt.setBorder(null);
//            btnReceipt.setFocusable(false);
//            btnReceipt.setBounds( 5 , 280 , 140 , 30 );
//            btnReceipt.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
            
        btnExit = new JButton("LOG OUT");
            btnExit.setBackground(Color.red);
            btnExit.setForeground(Color.white);
            btnExit.setBorder(null);
            btnExit.setFocusable(false);
            btnExit.setBounds( 5 , 720 , 140 , 30 );
            btnExit.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
               
        pnlMenu.add(btnEmployee);
        pnlMenu.add(btnExit);
        pnlMenu.add(btnProduct);
        pnlMenu.add(btnCategory);
        pnlMenu.add(btnSale);
        pnlMenu.add(btnAccount);
//        pnlMenu.add(btnReceipt);
        pnlMenu.add(labLogo);
        this.add(pnlMenu);
        
        btnExit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){;
                    if ( JOptionPane.showConfirmDialog(rootPane,"Do you want to return to \r \n the login screen?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                        return;
                    }
                    new SignInScreen();
                    dispose();
                }});
        
        btnEmployee.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){;
                    MyPanel Panel = new EmployeePanel();
                    ChangePanel(Panel);
                } 
            });
        
        btnProduct.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){;
                    MyPanel Panel = new ProductPanel();
                    ChangePanel(Panel);
                } 
            });
        
        btnCategory.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){;
                    MyPanel Panel = new CategoryPanel();
                    ChangePanel(Panel);
                } 
            });
        
        btnSale.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){;
                    MyPanel Panel = new SalePanel();
                    ChangePanel(Panel);
                } 
            });
        
        
        btnAccount.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){;
                    MyPanel Panel = new AccountPanel();
                    ChangePanel(Panel);
                } 
            });
        
//        btnReceipt.addActionListener(new ActionListener(){
//                @Override
//                public void actionPerformed(ActionEvent e){;
//                    ChangePanel(Panel[5]);
//                } 
//            });
    }
    private void ChangePanel(MyPanel ThisPanel){
        pnlContent.removeAll();
        pnlContent.add(ThisPanel);
        pnlContent.revalidate();
        pnlContent.repaint();
    }
}