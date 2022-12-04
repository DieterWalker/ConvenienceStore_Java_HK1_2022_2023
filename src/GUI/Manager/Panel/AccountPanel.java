package GUI.Manager.Panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;


public class AccountPanel extends MyPanel {
    JLabel labAccount, labAccountID, labAccountUsername, labEmployeeID,
           labAccountPassword, labAccountPosition;
    JTextField txtAccountID, txtAccountUserName, txtAccountPassword, txtSearch;
    JTable tabAccount;
    JButton btnAdd, btnClear, btnDelete, btnEdit, btnSearch;
    JScrollPane pnlTable;
    JComboBox cbbEmployeeID;
    JRadioButton radAccountant, radManager, radCashier;
    ButtonGroup radgroupAccount;
    
    public AccountPanel(){
        super();
        GUI();
    }
   
    public void GUI(){ 
        this.setBounds(0,0,1350,800);
        this.setVisible(true);
        this.setLayout(null);
        
        labAccount = new JLabel("ACCOUNT MANAGER");
            labAccount.setForeground(Color.black);
            labAccount.setBounds( 5 , 5 , 240 , 30 );
            labAccount.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
        
        labAccountID = new JLabel("Account ID");
            labAccountID.setForeground(Color.black);
            labAccountID.setBounds( 20 , 40 , 240 , 30 );
            labAccountID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
        
        labEmployeeID = new JLabel("Employee ID");
            labEmployeeID.setForeground(Color.black);
            labEmployeeID.setBounds( 20 , 110 , 240 , 30 );
            labEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
            
        labAccountUsername= new JLabel("Username");
            labAccountUsername.setForeground(Color.black);
            labAccountUsername.setBounds( 20 , 180 , 240 , 30 );
            labAccountUsername.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        labAccountPassword = new JLabel("Password");
            labAccountPassword.setForeground(Color.black);
            labAccountPassword.setBounds( 20 , 250 , 240 , 30 );
            labAccountPassword.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
        
        labAccountPosition = new JLabel("Position");
            labAccountPosition.setBounds( 20 , 320 , 240 , 30 );
            labAccountPosition.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            labAccountPosition.setForeground(Color.black);
            
        txtAccountID = new JTextField();
            txtAccountID.setBounds( 25 , 70 , 275 , 30 );
            txtAccountID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtAccountID.setForeground(Color.black);
            
        txtAccountUserName = new JTextField();
            txtAccountUserName.setBounds( 25 , 210 , 275 , 30 );
            txtAccountUserName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtAccountUserName.setForeground(Color.black);
        
        cbbEmployeeID = new JComboBox();
            cbbEmployeeID.setBounds( 25 , 140 , 275 , 30 );
            cbbEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            cbbEmployeeID.setBackground(Color.white);
            
        txtAccountPassword = new JTextField();
            txtAccountPassword.setBounds( 25 , 280 , 275 , 30 );
            txtAccountPassword.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtAccountPassword.setForeground(Color.black);
            
        radAccountant = new JRadioButton("Accountant");
            radAccountant.setForeground(new Color ( 64 , 64 , 64 ));
            radAccountant.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radAccountant.setBounds( 25 , 350 , 100 , 30 );
            radAccountant.setBackground(null);    
        
        radCashier = new JRadioButton("Cashier");
            radCashier.setForeground(new Color ( 64 , 64 , 64 ));
            radCashier.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radCashier.setBounds( 175 , 350 , 100 , 30 );
            radCashier.setBackground(null);    
            
        radManager = new JRadioButton("Manager");
            radManager.setForeground(new Color ( 64 , 64 , 64 ));
            radManager.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radManager.setBounds( 350 , 350 , 100 , 30 );
            radManager.setBackground(null);    
            
        txtSearch = new JTextField();
            txtSearch.setBounds( 700 , 5 , 515 , 30 );
            txtSearch.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSearch.setForeground(Color.black);
            
        btnSearch = new JButton("Search");
            btnSearch.setBackground(Color.black);
            btnSearch.setForeground(Color.WHITE);
            btnSearch.setBorder(null);
            btnSearch.setFocusable(false);
            btnSearch.setBounds( 1220 , 5 , 100 , 29 );
            btnSearch.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));    
         
        btnAdd = new JButton("Add");
            btnAdd.setBackground(Color.black);
            btnAdd.setForeground(Color.WHITE);
            btnAdd.setBorder(null);
            btnAdd.setFocusable(false);
            btnAdd.setBounds( 540 , 710 , 150 , 29 );
            btnAdd.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));
            
        btnEdit = new JButton("Edit");
            btnEdit.setBackground(Color.black);
            btnEdit.setForeground(Color.WHITE);
            btnEdit.setBorder(null);
            btnEdit.setFocusable(false);
            btnEdit.setBounds( 380 , 710 , 150 , 29 );
            btnEdit.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));
            
        btnDelete = new JButton("Delete");
            btnDelete.setBackground(Color.red);
            btnDelete.setForeground(Color.WHITE);
            btnDelete.setBorder(null);
            btnDelete.setFocusable(false);
            btnDelete.setBounds( 220 , 710 , 150 , 29 );
            btnDelete.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));
            
        btnClear = new JButton("Clear");
            btnClear.setBackground(Color.black);
            btnClear.setForeground(Color.WHITE);
            btnClear.setBorder(null);
            btnClear.setFocusable(false);
            btnClear.setBounds( 590 , 5 , 100 , 29 );
            btnClear.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));
            
        tabAccount = new JTable();
        
        pnlTable = new JScrollPane(tabAccount);
            pnlTable.setBounds( 700 , 40 , 620, 700); 
            
        radgroupAccount = new ButtonGroup();
            radgroupAccount.add(radManager);
            radgroupAccount.add(radCashier);    
            radgroupAccount.add(radAccountant);  
            
        this.add(pnlTable);
        this.add(labAccount);
        this.add(labAccountPassword);
        this.add(labEmployeeID);
        this.add(labAccountUsername);
        this.add(labAccountPosition);
        this.add(txtAccountPassword);
        this.add(txtAccountUserName);
        this.add(radManager);
        this.add(radCashier);
        this.add(radAccountant);
        this.add(cbbEmployeeID);
        this.add(txtSearch);
        this.add(btnSearch);
        this.add(btnAdd);
        this.add(btnEdit);
        this.add(btnDelete);
        this.add(btnClear);
        this.add(labAccountID);
        this.add(txtAccountID);
    }
}
