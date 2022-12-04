package GUI.Manager.Panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;


public class CategoryPanel extends MyPanel {
    JLabel labCategory, labCategoryID, labCategoryName;
    JTextField txtCategoryName, txtCategoryID, txtSearch;  
    JTable tabCategory;
    JButton btnAdd, btnClear, btnDelete, btnEdit, btnSearch;
    JScrollPane pnlTable;
    public CategoryPanel(){
        super();
        GUI();
    }
    
    public void GUI(){ 
        this.setBounds(0,0,1350,800);
        this.setVisible(true);
        this.setLayout(null);
        
        labCategory = new JLabel("CATEGORY MANAGER");
            labCategory.setForeground(Color.black);
            labCategory.setBounds( 5 , 5 , 240 , 30 );
            labCategory.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
        
        labCategoryID = new JLabel("Category ID");
            labCategoryID.setForeground(Color.black);
            labCategoryID.setBounds( 20 , 40 , 240 , 30 );
            labCategoryID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
                      
        labCategoryName = new JLabel("Name");
            labCategoryName.setForeground(Color.black);
            labCategoryName.setBounds( 20  ,110 , 240 , 30 );
            labCategoryName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
            
         txtCategoryID = new JTextField();
            txtCategoryID.setText("NND-S");
            txtCategoryID.setBounds( 25 , 70 , 275 , 30 );
            txtCategoryID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtCategoryID.setForeground(Color.black);
        
        txtCategoryName = new JTextField();
            txtCategoryName.setBounds( 25 , 140 , 275 , 30 );
            txtCategoryName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtCategoryName.setForeground(Color.black);
            
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
            
        tabCategory = new JTable();
        
        pnlTable = new JScrollPane(tabCategory);
            pnlTable.setBounds( 700 , 40 , 620, 700);
            
        this.add(pnlTable);
        this.add(labCategoryID);
        this.add(labCategory);
        this.add(labCategoryName);
        this.add(txtCategoryID);
        this.add(txtCategoryName);
        this.add(txtSearch);
        this.add(btnSearch);
        this.add(btnAdd);
        this.add(btnEdit);
        this.add(btnDelete);
        this.add(btnClear);
    }
}
