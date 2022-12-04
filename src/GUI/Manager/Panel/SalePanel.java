package GUI.Manager.Panel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class SalePanel extends MyPanel {
    JLabel labSaleID, labSale, labSaleName, labProductID,
           labSaleRate;
    JTextField txtSaleID, txtSaleName, txtSaleRate, txtSearch;
    JTable tabSale;
    JButton btnAdd, btnClear, btnDelete, btnEdit, btnSearch;
    JScrollPane pnlTable;
    JComboBox cbbProductID;
    
    public SalePanel(){
        super();
        GUI();
    }
   
    public void GUI(){ 
        this.setBounds(0,0,1350,800);
        this.setVisible(true);
        this.setLayout(null);
        
        labSale = new JLabel("SALE MANAGER");
            labSale.setForeground(Color.black);
            labSale.setBounds( 5 , 5 , 240 , 30 );
            labSale.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
        
        labSaleID = new JLabel("Sale ID");
            labSaleID.setForeground(Color.black);
            labSaleID.setBounds( 20 , 40 , 240 , 30 );
            labSaleID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
            
        labProductID = new JLabel("Product ID");
            labProductID.setForeground(Color.black);
            labProductID.setBounds( 20 , 110 , 240 , 30 );
            labProductID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        labSaleName = new JLabel("Name");
            labSaleName.setForeground(Color.black);
            labSaleName.setBounds( 20 , 180 , 240 , 30 );
            labSaleName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
        
        labSaleRate = new JLabel("Rate");
            labSaleRate.setBounds( 20 , 250 , 240 , 30 );
            labSaleRate.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            labSaleRate.setForeground(Color.black);

        txtSaleID = new JTextField();
            txtSaleID.setText("NND-S");
            txtSaleID.setBounds( 25 , 70 , 275 , 30 );
            txtSaleID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSaleID.setForeground(Color.black);
        
        cbbProductID = new JComboBox();
            cbbProductID.setBounds( 25 , 140 , 275 , 30 );
            cbbProductID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            cbbProductID.setBackground(Color.white);
            
        txtSaleName = new JTextField();
            txtSaleName.setBounds( 25 , 210 , 275 , 30 );
            txtSaleName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSaleName.setForeground(Color.black);
            
        txtSaleRate = new JTextField();
            txtSaleRate.setBounds( 25 , 280 , 275 , 30 );
            txtSaleRate.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSaleRate.setForeground(Color.black);
            
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
            
        tabSale = new JTable();
        
        pnlTable = new JScrollPane(tabSale);
            pnlTable.setBounds( 700 , 40 , 620, 700); 
            
        this.add(pnlTable);
        this.add(labSale);
        this.add(labSaleID);
        this.add(labSaleName);
        this.add(labSaleRate);
        this.add(labProductID);
        this.add(txtSaleID);
        this.add(txtSaleName);
        this.add(txtSaleRate);
        this.add(cbbProductID);
        this.add(txtSearch);
        this.add(btnSearch);
        this.add(btnAdd);
        this.add(btnEdit);
        this.add(btnDelete);
        this.add(btnClear);
        
    }
}
