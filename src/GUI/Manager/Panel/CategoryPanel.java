package GUI.Manager.Panel;

import BUS.CategoryManagerLogic;
import GUI.Helper.DataValidator;
import DAL.CategoryDAO;
import DTO.CategoryDTO;
import javax.swing.JTable;
import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


public class CategoryPanel extends MyPanel {
    JLabel labCategory, labCategoryID, labCategoryName;
    JTextField txtCategoryName, txtCategoryID, txtSearch;  
    JTable tabCategory;
    JButton btnAdd, btnClear, btnDelete, btnEdit, btnSearch;
    JScrollPane pnlTable;
    ManagerScreen manager; 
    DefaultTableModel tableModel;
    
    public CategoryPanel(){
        super();
        GUI();
        Show();
    }

    private void GUI(){ 
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
            
        tableModel = new DefaultTableModel(new Object[] { "Category ID", "Name" }, 0);
            
        tabCategory = new JTable(tableModel);
            tabCategory.setBackground(Color.white);
            tabCategory.getTableHeader().setOpaque(false);
            tabCategory.getTableHeader().setBackground(Color.BLACK);
            tabCategory.getTableHeader().setForeground(Color.WHITE);

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
        
        tabCategory.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = tabCategory.getSelectedRow();
                if (row >= 0 ){
                    txtCategoryID.setText(Integer.toString((int) tabCategory.getValueAt(row,0)));
                    txtCategoryName.setText((String)tabCategory.getValueAt(row,1));
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
                        DataValidator.validateTextEmpty(txtCategoryName, sb, "Category name cannot be blank!");
                        
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        CategoryManagerLogic logic = new CategoryManagerLogic();
                        int id;
                        id = Integer.parseInt(txtCategoryID.getText());
                        String name = txtCategoryName.getText().trim();
                        logic.dto.CategoryID = id;
                        logic.dto.CategoryName = name;
                        int flag = 1;
                        for (CategoryDTO Cdto : logic.list){
                            String n = Integer.toString(Cdto.CategoryID);
                            if (txtCategoryID.getText().trim().equalsIgnoreCase(n)){
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
                            //show lỗi trùng id
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
                        DataValidator.validateTextEmpty(txtCategoryID , sb, "ID not found!");
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
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
                        DataValidator.validateTextEmpty(txtCategoryID , sb, "ID not found!");
                        DataValidator.validateTextEmpty(txtCategoryName, sb, "Category name cannot be blank!");
                        
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
        
    }
    
    @Override
    public void Clear(){
        txtCategoryID.setText("");
        txtCategoryName.setText("");
    }     
    
    @Override
    public void ReturnWhite(){
        txtCategoryID.setBackground(Color.white);
        txtCategoryName.setBackground(Color.white);
    }
    
    public void Show() {
        tableModel.setRowCount(0);
        for(CategoryDTO dto :new CategoryDAO().getAllData()){
            tableModel.addRow(new Object[]{dto.getCategoryID(), dto.getCategoryName()});
        }
    }
    
    
    public CategoryDTO getData() {
        CategoryDTO tmp = new CategoryDTO();
        tmp.setCategoryID(Integer.parseInt(txtCategoryID.getText()));
        tmp.setCategoryName(txtCategoryName.getText());
        return tmp;
    }
}
