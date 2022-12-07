package GUI.Manager.Panel;

import GUI.Helper.DataValidator;
import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ProductPanel extends MyPanel {
    JLabel labProduct, labProductID, labProductName, labProductCategory, 
           labProductPrice, labProductBrand, labProductWarranty, labProductImage, 
           labPictrue, labStorage;
    JTextField txtProductName, txtProductID, txtProductBrand, txtStorage, 
               txtProductWarranty, txtProductPrice, txtSearch, txtURL;  
    JTable tabProduct;
    JButton btnAdd, btnClear, btnDelete, btnEdit, btnChooseImage, btnSearch;
    JScrollPane pnlTable;
    JComboBox cbbProductCategory;
    DefaultTableModel tableModel;
    ManagerScreen manager; 
    public ProductPanel(){
        super();
        GUI();
    }

    private void GUI(){ 
        this.setBounds(0,0,1350,800);
        this.setVisible(true);
        this.setLayout(null);
        
        labProduct = new JLabel("PRODUCT MANAGER");
            labProduct.setForeground(Color.black);
            labProduct.setBounds( 5 , 5 , 240 , 30 );
            labProduct.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
        
        labProductID = new JLabel("Product ID");
            labProductID.setForeground(Color.black);
            labProductID.setBounds( 20 , 40 , 240 , 30 );
            labProductID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
            
        labProductImage = new JLabel("Image");
            labProductImage.setForeground(Color.black);
            labProductImage.setBounds( 370 , 40 , 240 , 30 );
            labProductImage.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        txtProductID = new JTextField();
            txtProductID.setEnabled(false);
            txtProductID.setBounds( 25 , 70 , 275 , 30 );
            txtProductID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductID.setForeground(Color.black);
            
        labPictrue = new JLabel("Picture Here!");
            labPictrue.setBackground(Color.black);
            labPictrue.setBounds( 380 , 70 , 250 , 250 );
            labPictrue.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        btnChooseImage = new JButton("Choose Image");
            btnChooseImage.setBackground(Color.black);
            btnChooseImage.setForeground(Color.WHITE);
            btnChooseImage.setBorder(null);
            btnChooseImage.setFocusable(false);
            btnChooseImage.setBounds( 380 , 330 , 250 , 29 );
            btnChooseImage.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));
            
        txtURL = new JTextField();
            txtURL.setBounds( 380 , 370 , 250 , 30 );
            txtURL.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtURL.setForeground(Color.black);
            
        labProductName = new JLabel("Name");
            labProductName.setForeground(Color.black);
            labProductName.setBounds( 20  ,110 , 240 , 30 );
            labProductName.setFont(new Font( "Jaldi" , Font.BOLD , 16 )); 
                           
        txtProductName = new JTextField();
            txtProductName.setBounds( 25 , 140 , 275 , 30 );
            txtProductName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductName.setForeground(Color.black);
            
        labProductCategory = new JLabel("Category");
            labProductCategory.setForeground(Color.black);
            labProductCategory.setBounds( 20 , 180 , 240 , 30 );
            labProductCategory.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));   
            
        cbbProductCategory = new JComboBox();
            cbbProductCategory.setBounds( 25 , 210 , 275 , 30 );
            cbbProductCategory.setFont(new Font( "Jaldi" , Font.BOLD , 16 )); 
            cbbProductCategory.setBackground(Color.WHITE);
            
        labProductBrand = new JLabel("Brand");
            labProductBrand.setForeground(Color.black);
            labProductBrand.setBounds( 20 , 250 , 240 , 30 );
            labProductBrand.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));     
            
        txtProductBrand = new JTextField();
            txtProductBrand.setBounds( 25 , 280 , 275 , 30 );
            txtProductBrand.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductBrand.setForeground(Color.black);
            
        labProductWarranty = new JLabel("Warranty Period");
            labProductWarranty.setForeground(Color.black);
            labProductWarranty.setBounds( 20 , 320 , 240 , 30 );
            labProductWarranty.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        txtProductWarranty = new JTextField();
            txtProductWarranty.setBounds( 25 , 350 , 275 , 30 );
            txtProductWarranty.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductWarranty.setForeground(Color.black);
            
        labProductPrice = new JLabel("Price");
            labProductPrice.setForeground(Color.black);
            labProductPrice.setBounds( 20 , 390 , 240 , 30 );
            labProductPrice.setFont(new Font( "Jaldi", Font.BOLD , 16 )); 
            
        txtProductPrice = new JTextField();
            txtProductPrice.setBounds( 25 , 420 , 275 , 30 );
            txtProductPrice.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductPrice.setForeground(Color.black);

         labStorage = new JLabel("Storage");
            labStorage.setForeground(Color.black);
            labStorage.setBounds( 20 , 460 , 240 , 30 );
            labStorage.setFont(new Font( "Jaldi", Font.BOLD , 16 )); 
            
        txtStorage = new JTextField();
            txtStorage.setBounds( 25 , 490 , 275 , 30 );
            txtStorage.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtStorage.setForeground(Color.black);
            
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
            
        tableModel = new DefaultTableModel(new Object[] { "Product ID", "Name" , "Category" , "Brand" , "Warranty", "Price" , "Storage" }, 0); 
            
        tabProduct = new JTable(tableModel);
            tabProduct.setBackground(Color.white);
            tabProduct.getTableHeader().setOpaque(false);
            tabProduct.getTableHeader().setBackground(Color.BLACK);
            tabProduct.getTableHeader().setForeground(Color.WHITE);
            
        pnlTable = new JScrollPane(tabProduct);
            pnlTable.setBounds( 700 , 40 , 620, 700);
            
        this.add(txtURL);
        this.add(pnlTable);
        this.add(labProduct);
        this.add(labProductWarranty);
        this.add(labProductPrice);
        this.add(labProductImage);
        this.add(labProductName);
        this.add(labProductID);
        this.add(labProductCategory);
        this.add(labProductBrand);
        this.add(txtProductBrand);
        this.add(txtProductID);
        this.add(txtProductName);
        this.add(txtProductPrice);
        this.add(txtProductWarranty);
        this.add(txtSearch);
        this.add(btnSearch);
        this.add(btnAdd);
        this.add(btnEdit);
        this.add(btnDelete);
        this.add(btnClear);
        this.add(btnChooseImage);
        this.add(labPictrue);
        this.add(cbbProductCategory);
        this.add(labStorage);
        this.add(txtStorage);
        
        tabProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {}

            });
        
        btnAdd.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReturnWhite();
                        if ( JOptionPane.showConfirmDialog(manager,"Do you want to add the new information?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        
                        StringBuilder sb = new StringBuilder();
                        DataValidator.validateTextEmpty(txtProductName, sb, "Product name cannot be blank!");
                        DataValidator.validateTextEmpty(txtProductPrice, sb, "Product price cannot be blank!");
                        DataValidator.validateTextEmpty(txtProductBrand, sb, "Product brand cannot be blank!");
                        DataValidator.validateTextEmpty(txtProductWarranty, sb, "Product warranty cannot be blank!");
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        //add code before clear
                        Clear();
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
                        DataValidator.validateTextEmpty(txtProductID , sb, "ID not found!");
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
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
                        DataValidator.validateTextEmpty(txtProductID , sb, "ID not found!");
                        DataValidator.validateTextEmpty(txtProductName, sb, "Product name cannot be blank!");
                        DataValidator.validateTextEmpty(txtProductPrice, sb, "Product price cannot be blank!");
                        DataValidator.validateTextEmpty(txtProductBrand, sb, "Product brand cannot be blank!");
                        DataValidator.validateTextEmpty(txtProductWarranty, sb, "Product warranty cannot be blank!");
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        //add code before clear
                        Clear();
                    }
            });  
            
            btnClear.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReturnWhite();
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
        
        btnChooseImage.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
            });
    }
    @Override
    public void Clear(){
        txtProductBrand.setText("");
        txtProductID.setText("");
        txtProductName.setText("");
        txtProductPrice.setText("");
        txtProductWarranty.setText("");
        txtStorage.setText("");
        labPictrue.setText("");
    } 

    @Override
    public void ReturnWhite(){
        txtProductBrand.setBackground(Color.white);
        txtProductID.setBackground(Color.white);
        txtProductName.setBackground(Color.white);
        txtProductPrice.setBackground(Color.white);
        txtProductWarranty.setBackground(Color.white);
        txtStorage.setBackground(Color.white);
    }
}
