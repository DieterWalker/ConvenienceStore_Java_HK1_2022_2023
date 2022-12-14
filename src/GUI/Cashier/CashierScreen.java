package GUI.Cashier;

import DAL.ReceiptDAO;
import DTO.ReceiptDTO;
import GUI.SignInScreen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CashierScreen extends JFrame {
    JTable tabReceiptData;
    JPanel pnlTop, pnlCenter, pnlBottom;
    JTextField txtEmployeeName, txtSearch;
    JLabel labCashier, labEmployee, labSearch, labLogo;
    JButton btnSearch, btnNewReceiptData, btnExit;
    JScrollPane pnlTable;
    DefaultTableModel tableModel;
    Icon icon_Logo;

    SignInScreen Screen= new SignInScreen();
    public CashierScreen(){
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
        CreateTop();
        CreateCenter();
        CreateButtom();
        Show();
    }
    
    private void CreateCenter(){
        
        
        pnlCenter = new JPanel();
            pnlCenter.setBounds( 0, 120, 1500, 590 );
            pnlCenter.setBackground(Color.WHITE);
            pnlCenter.setLayout(null);

        tableModel = new DefaultTableModel(new Object[] { "Receipt ID", "Employee ID", "Customer Phone" ,"Total Price", "Date", "Payment" }, 0);
            
        tabReceiptData = new JTable(tableModel);
            tabReceiptData.setBackground(Color.white);
            tabReceiptData.getTableHeader().setOpaque(false);
            tabReceiptData.getTableHeader().setBackground(Color.BLACK);
            tabReceiptData.getTableHeader().setForeground(Color.WHITE);
        
        pnlTable = new JScrollPane(tabReceiptData);
            pnlTable.setBounds( 5 , 5, 1475, 580);
            
        pnlCenter.add(pnlTable);
        this.add(pnlCenter);
        
        tabReceiptData.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {}

            });
    }
    
    
    private void CreateTop (){
        try {
                System.out.println(new File("/GUI/Icons/Close.png").toURI().toURL());
                icon_Logo = new ImageIcon(new File("src/GUI/Icons/Logo.png").toURI().toURL());
            } catch (MalformedURLException ex) {
                System.out.print("False");
            }
        
        pnlTop = new JPanel();
            pnlTop.setBackground(Color.black);
            pnlTop.setBounds( 0, 0 , 1550, 120); 
            
        labLogo = new JLabel("");
            labLogo.setBounds( 0 , 10 , 150 , 100 );
            labLogo.setIcon(icon_Logo);
            
        labCashier = new JLabel("CASHIER PAGE");
            labCashier.setForeground(Color.white);
            labCashier.setBounds( 155 , 5 , 300 , 30 );
            labCashier.setFont(new Font( "Jaldi" , Font.BOLD , 24 ));
        
        labEmployee = new JLabel("Hello! Cashier: ");
            labEmployee.setForeground(Color.white);
            labEmployee.setBounds( 165, 45 , 300 , 30 );
            labEmployee.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));     
        
        labSearch = new JLabel("Search by ID: ");
            labSearch.setForeground(Color.white);
            labSearch.setBounds( 1100, 45 , 250 , 30 );
            labSearch.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtEmployeeName = new JTextField();
            txtEmployeeName.setText(Integer.toString(Screen.EmployeeID));
            Screen.dispose();
            txtEmployeeName.setBounds( 175 , 75 , 250 , 30 );
            txtEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeName.setForeground(Color.black);
            txtEmployeeName.setEnabled(false);
            txtEmployeeName.setBorder(null);
            
        txtSearch = new JTextField();
            txtSearch.setBounds( 1100 , 75 , 250 , 30 );
            txtSearch.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSearch.setForeground(Color.black);
            txtSearch.setBorder(null);
            
        btnSearch = new JButton("Search");
            btnSearch.setBackground(Color.white);
            btnSearch.setForeground(Color.black);
            btnSearch.setBorder(null);
            btnSearch.setFocusable(false);
            btnSearch.setBounds( 1360 , 75 , 100 , 30 );
            btnSearch.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
            
            btnSearch.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                   
                    }
            });  
            
        pnlTop.setLayout(null);
        pnlTop.add(labCashier);
        pnlTop.add(labEmployee);
        pnlTop.add(labLogo);
        pnlTop.add(labSearch);
        
        pnlTop.add(txtEmployeeName);
        pnlTop.add(txtSearch);
        
        pnlTop.add(btnSearch);

        this.add(pnlTop);
    }
    
    private void CreateButtom(){
        pnlBottom = new JPanel();
            pnlBottom.setBounds( 0 , 710 , 1500 , 90);
            pnlBottom.setBackground(Color.lightGray);
            pnlBottom.setLayout(null);
           
        btnNewReceiptData = new JButton("ADD NEW RECEIPT");
            btnNewReceiptData.setBackground(Color.black);
            btnNewReceiptData.setForeground(Color.WHITE);
            btnNewReceiptData.setBorder(null);
            btnNewReceiptData.setFocusable(false);
            btnNewReceiptData.setBounds( 1290 , 10 , 175 , 35 );
            btnNewReceiptData.setFont(new Font( "Jaldi" , Font.BOLD ,20 )); 
               
        btnExit = new JButton("LOG OUT");
            btnExit.setBackground(Color.RED);
            btnExit.setForeground(Color.WHITE);
            btnExit.setBorder(null);
            btnExit.setFocusable(false);
            btnExit.setBounds( 10 , 10 , 175 , 35 );
            btnExit.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));
            
            btnExit.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Do you want to return to \r \n the login screen?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        new SignInScreen();
                        dispose();;
                    }
            });  
            
            btnNewReceiptData.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Do you want to create a new invoice?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                            }
                        new ReceiptScreen();
                        dispose();
                    }
            });  
        
        pnlBottom.add(btnExit);
        pnlBottom.add(btnNewReceiptData);
        this.add(pnlBottom);
     }
    
    public void Show(){
        tableModel.setRowCount(0);
        for(ReceiptDTO dto :new ReceiptDAO().getAllData()){
            tableModel.addRow(new Object[]{dto.getReceiptID(), dto.getEmployeeID(), dto.getReceiptCustomerPhone()
                                , dto.getReceiptDate(), dto.getReceiptTotalPrice(), dto.getReceiptPayment()});
        }  
    }
}
    



