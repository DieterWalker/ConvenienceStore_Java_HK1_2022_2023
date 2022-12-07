package GUI.Manager.Panel;

import BUS.SaleManagerLogic;
import DAL.ProductDAO;
import DAL.SaleDAO;
import DTO.ProductDTO;
import DTO.SaleDTO;
import GUI.Helper.DataValidator;
import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class SalePanel extends MyPanel {
    JLabel labSaleID, labSale, labSaleName, labProductID,
           labSaleRate;
    JTextField txtSaleID, txtSaleName, txtSaleRate, txtSearch;
    JTable tabSale;
    JButton btnAdd, btnClear, btnDelete, btnEdit, btnSearch;
    JScrollPane pnlTable;
    JComboBox cbbProductID;
    DefaultTableModel tableModel;
    ManagerScreen manager; 
    public SalePanel(){
        super();
        GUI();
        Show();
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
            txtSaleID.setBounds( 25 , 70 , 275 , 30 );
            txtSaleID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSaleID.setForeground(Color.black);
        
        cbbProductID = new JComboBox();
            cbbProductID.setBounds( 25 , 140 , 275 , 30 );
            cbbProductID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            cbbProductID.setBackground(Color.white);
                for (ProductDTO dto:new ProductDAO().getAllData()) {
                    cbbProductID.addItem(dto.ProductID);
            }
            
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
            
        tableModel = new DefaultTableModel(new Object[] { "Sale ID", "Product ID", "Sale Name", "Rate" }, 0);
            
        tabSale = new JTable(tableModel);
            tabSale.setBackground(Color.white);
            tabSale.getTableHeader().setOpaque(false);
            tabSale.getTableHeader().setBackground(Color.BLACK);
            tabSale.getTableHeader().setForeground(Color.WHITE);
        
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
        
        tabSale.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabSale.getSelectedRow();
                if (row >= 0 ){
                    txtSaleID.setText(Integer.toString((int) tabSale.getValueAt(row,0)));
                    cbbProductID.setSelectedItem((int)tabSale.getValueAt(row, 1));
                    txtSaleName.setText((String)tabSale.getValueAt(row, 2));
                    txtSaleRate.setText(Float.toString((float)tabSale.getValueAt(row, 3)));
                        }
                    }  
            });
        
                btnAdd.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReturnWhite();
                        if ( JOptionPane.showConfirmDialog(manager,"Do you want to add the new information?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        
                        StringBuilder sb = new StringBuilder();
                        DataValidator.validateTextEmpty(txtSaleID, sb, "Sale ID cannot be blank!");
                        DataValidator.validateTextEmpty(txtSaleName, sb, "Sale Name cannot be blank!");
                        DataValidator.validateTextEmpty(txtSaleRate, sb, "Sale rate cannot be blank!");
                        if (sb.length()>0){
                            JOptionPane.showMessageDialog(manager,sb.toString(), "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        //add code before clear
                        ReturnWhite();
                        if ( JOptionPane.showConfirmDialog(manager,"Do you want to add the new information?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        SaleManagerLogic logic = new SaleManagerLogic();
                        logic.dto.SaleID = Integer.parseInt(txtSaleID.getText());
                        logic.dto.ProductID = (int) cbbProductID.getSelectedItem();
                        logic.dto.SaleName = txtSaleName.getText().trim();
                        logic.dto.SaleRate = Float.parseFloat(txtSaleRate.getText());
                        
                        int flag = 1;
                        for (SaleDTO Edto : logic.list){
                            String ID = Integer.toString(Edto.SaleID);          
                            if (txtSaleID.getText().trim().equalsIgnoreCase(ID)){
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
                        JOptionPane.showMessageDialog(manager, "Product added to database successfully!" , "Done!",  JOptionPane.INFORMATION_MESSAGE);
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
                        DataValidator.validateTextEmpty(txtSaleID , sb, "ID not found!");
                        if (sb.length()>0){
                            JOptionPane.showMessageDialog(manager,sb.toString(), "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        SaleManagerLogic logic = new SaleManagerLogic(); 
                        logic.dto.SaleID = Integer.parseInt(txtSaleID.getText());;
                        logic.Remove();
                        JOptionPane.showMessageDialog(manager, "Sale deleted successfully!" , "Done!",  JOptionPane.INFORMATION_MESSAGE);
                        Clear();
                        Show();
                        //add code before clear
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
                        DataValidator.validateTextEmpty(txtSaleID , sb, "ID not found!");
                        DataValidator.validateTextEmpty(txtSaleName, sb, "Sale Name cannot be blank!");
                        DataValidator.validateTextEmpty(txtSaleRate, sb, "Sale rate cannot be blank!");
                        if (sb.length()>0){
                            JOptionPane.showMessageDialog(manager,sb.toString(), "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        SaleManagerLogic logic = new SaleManagerLogic();
                        logic.dto.SaleID = Integer.parseInt(txtSaleID.getText());
                        logic.dto.ProductID = (int) cbbProductID.getSelectedItem();
                        logic.dto.SaleName = txtSaleName.getText().trim();
                        logic.dto.SaleRate = Integer.parseInt(txtSaleRate.getText());
                        int flag = 0;
                        for (SaleDTO Cdto : logic.list){
                            String n = Integer.toString(Cdto.SaleID);
                            if (txtSaleID.getText().trim().equalsIgnoreCase(n)){
                                flag = 1;
                                break;
                        }}
                        
                        if(flag == 1) {
                            logic.Edit();
                        } 
                        else {
                            JOptionPane.showMessageDialog(manager, "The ID is not matches the product already in the database!" , "Information is wrong!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        JOptionPane.showMessageDialog(manager, "Employee edited successfully!" , "Done!",  JOptionPane.INFORMATION_MESSAGE);    
                        Clear();
                        Show();
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
                        SaleManagerLogic logic = new SaleManagerLogic();
                        ArrayList<SaleDTO> list = new ArrayList<SaleDTO>();
                        for (SaleDTO Pdto : logic.list){
                            if(Pdto.SaleName.contains(txtSearch.getText().trim()))
                                list.add(Pdto);
                        }
                        tableModel.setRowCount(0);
                        for(SaleDTO dto : list){
                             tableModel.addRow(new Object[]
                             {dto.getSaleID(), dto.getProductID(), dto.getSaleName(), 
                              dto.getSaleRate()});
                        }
                        ReturnWhite();
                    }
            });  
    }
    @Override
    public void Clear(){
        txtSaleID.setText("");
        txtSaleName.setText("");
        txtSaleRate.setText("");
    }     
    
    @Override
    public void ReturnWhite(){
        txtSaleID.setBackground(Color.WHITE);
        txtSaleName.setBackground(Color.WHITE);;
        txtSaleRate.setBackground(Color.WHITE);
    }
    
        @Override
    public void Show() {
        tableModel.setRowCount(0);
        for(SaleDTO dto :new SaleDAO().getAllData()){
            tableModel.addRow(new Object[]
                             {dto.getSaleID(), dto.getProductID(), dto.getSaleName(), 
                              dto.getSaleRate()});
        }
    }
    
}
