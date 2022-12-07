package GUI.Manager.Panel;

import BUS.AccountManagerLogic;
import DAL.AccountDAO;
import DAL.EmployeeDAO;
import DTO.AccountDTO;
import DTO.EmployeeDTO;
import GUI.Helper.DataValidator;
import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


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
    DefaultTableModel tableModel;
    ManagerScreen manager; 
    public AccountPanel(){
        super();
        GUI();
    }
   
    private void GUI(){ 
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
            for(EmployeeDTO dto :new EmployeeDAO().getAllData()){
                cbbEmployeeID.addItem(dto.EmployeeID);
            }
            
        txtAccountPassword = new JTextField();
            txtAccountPassword.setBounds( 25 , 280 , 275 , 30 );
            txtAccountPassword.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtAccountPassword.setForeground(Color.black);
            
        radAccountant = new JRadioButton("Accountant");
            radAccountant.setForeground(new Color ( 64 , 64 , 64 ));
            radAccountant.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radAccountant.setBounds( 25 , 350 , 100 , 30 );
            radAccountant.setBackground(null);
            radAccountant.setSelected(true);
        
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
        
        tableModel = new DefaultTableModel(new Object[] { "Account ID", "Employee ID", "Username" , "Password" , "Position" }, 0);    
            
        tabAccount = new JTable(tableModel);
            tabAccount.setBackground(Color.white);
            tabAccount.getTableHeader().setOpaque(false);
            tabAccount.getTableHeader().setBackground(Color.BLACK);
            tabAccount.getTableHeader().setForeground(Color.WHITE);
        
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
    
    public void Event(){
        tabAccount.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {}
                    
                });
        
            btnAdd.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReturnWhite();
                        if ( JOptionPane.showConfirmDialog(manager,"Do you want to add the new information?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        DataValidator.validateTextEmpty(txtAccountID, sb, "Please enter ID" );
                        DataValidator.validateTextEmpty(txtAccountUserName, sb, "Please enter Username" );
                        DataValidator.validateTextEmpty(txtAccountPassword, sb, "Please enter Password" );
                        if (sb.length() > 0){
                            JOptionPane.showMessageDialog(manager, sb.toString() , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        //add code before clear
                        AccountManagerLogic logic = new AccountManagerLogic();
                        logic.dto.AccountID = Integer.parseInt(txtAccountID.getText());
                        logic.dto.Password = cbbEmployeeID.getSelectedItem().toString();
                        logic.dto.Username = txtAccountUserName.getText().trim();
                        logic.dto.Password = txtAccountPassword.getText().trim();
                        
                        if ( radAccountant.isSelected() == true )
                            logic.dto.Position = "Accountant";
                        
                        if ( radCashier.isSelected() == true )
                            logic.dto.Position = "Cashier";
                        
                        if ( radManager.isSelected() == true )
                            logic.dto.Position = "Manager";
                        
                        int flag = 1;
                        for (AccountDTO Adto : logic.list){
                            String n = Integer.toString(Adto.AccountID);
                            if (txtAccountID.getText().trim().equalsIgnoreCase(n)){
                                flag = 0;
                                break;
                            }
                        }
                        if(flag==1) {
                            logic.Add();
                        } else {
                            JOptionPane.showMessageDialog(manager, "The ID matches the product already in the database!" , "Information is wrong!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        Clear();
                        Show();
                    }
            });  
            
            btnDelete.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReturnWhite();
                        if ( JOptionPane.showConfirmDialog(manager,"Do you want to delete the information?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        DataValidator.validateTextEmpty(txtAccountID, sb, "Please choose account!" );
                        if (sb.length() > 0){
                            JOptionPane.showMessageDialog(manager, sb.toString() , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        //add code before clear
                        Clear();
                    }
            });  
            
            btnEdit.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReturnWhite();
                        if ( JOptionPane.showConfirmDialog(manager,"Do you want to change the information?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        
                        StringBuilder sb = new StringBuilder();
                        DataValidator.validateTextEmpty(txtAccountID, sb, "Please choose account!" );
                        DataValidator.validateTextEmpty(txtAccountUserName, sb, "Please enter Username" );
                        DataValidator.validateTextEmpty(txtAccountPassword, sb, "Please enter Password" );     
                        if (sb.length() > 0){
                            JOptionPane.showMessageDialog(manager, sb.toString() , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        //add code before clear
                        Clear();
                    }
            });  
            
            btnClear.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        Clear();
                        JOptionPane.showMessageDialog(manager, "All input fields have been refreshed.");
                    }
            });  
            
        
            btnSearch.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReturnWhite();
                    }
            });
    }
    
    @Override
    public void Clear(){
        txtAccountID.setText("");
        txtAccountPassword.setText("");
        txtAccountUserName.setText("");
    } 
    
    @Override
    public void ReturnWhite(){
        txtAccountID.setBackground(Color.WHITE);
        txtAccountPassword.setBackground(Color.WHITE);
        txtAccountUserName.setBackground(Color.WHITE);
    }
    
    @Override
    public void Show() {
        tableModel.setRowCount(0);
        for(AccountDTO dto :new AccountDAO().getAllData()){
            tableModel.addRow(new Object[]
                             {dto.getAccountID(), dto.getEmployeeID(), dto.getUsername(), 
                              dto.getPassword(), dto.getPosition()});
        }
    }
    
}
