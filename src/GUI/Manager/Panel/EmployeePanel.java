package GUI.Manager.Panel;

import BUS.EmployeeManagerLogic;
import DAL.EmployeeDAO;
import DTO.EmployeeDTO;
import GUI.Helper.DataValidator;
import GUI.Manager.ManagerScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class EmployeePanel extends MyPanel {
    JLabel labEmployee, labEmployeeID, labEmployeeName, labEmployeeGender,
           labEmployeeNumberPhone, labEmployeeAddress, labEmployeeWage, 
           labEmployeeImage, labPictrue;
    JTextField txtEmployeeName, txtEmployeeID, txtEmployeeWage, 
               txtEmployeeAddress, txtEmployeeNumberPhone, txtSearch, txtURL;  
    JTable tabEmployee;
    JButton btnAdd, btnClear, btnDelete, btnEdit, btnChooseImage, btnSearch;
    JScrollPane pnlTable;
    JRadioButton radMale, radFemale;
    DefaultTableModel tableModel;
    ButtonGroup radgroupGender;
    ManagerScreen manager; 
    
    public EmployeePanel(){
        super();
        GUI();
        Show();
    }

    private void GUI(){ 
        this.setBounds(0,0,1350,800);
        this.setVisible(true);
        this.setLayout(null);
        
        labEmployee = new JLabel("EMPLOYEE MANAGER");
            labEmployee.setForeground(Color.black);
            labEmployee.setBounds( 5 , 5 , 240 , 30 );
            labEmployee.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
        
        labEmployeeID = new JLabel("Employee ID");
            labEmployeeID.setForeground(Color.black);
            labEmployeeID.setBounds( 20 , 40 , 240 , 30 );
            labEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
            
        labEmployeeImage = new JLabel("Image");
            labEmployeeImage.setForeground(Color.black);
            labEmployeeImage.setBounds( 370 , 40 , 240 , 30 );
            labEmployeeImage.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        labPictrue = new JLabel("Picture Here!");
            labPictrue.setBackground(Color.black);
            labPictrue.setBounds( 380 , 70 , 200 , 250 );
            labPictrue.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            
        btnChooseImage = new JButton("Choose Image");
            btnChooseImage.setBackground(Color.black);
            btnChooseImage.setForeground(Color.WHITE);
            btnChooseImage.setBorder(null);
            btnChooseImage.setFocusable(false);
            btnChooseImage.setBounds( 380 , 330 , 200 , 29 );
            btnChooseImage.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));
            
        txtURL = new JTextField();
            txtURL.setEnabled(false);
            txtURL.setBounds( 380 , 370 , 200 , 30 );
            txtURL.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtURL.setForeground(Color.black);
            
        labEmployeeName = new JLabel("Name");
            labEmployeeName.setForeground(Color.black);
            labEmployeeName.setBounds( 20  ,110 , 240 , 30 );
            labEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
            
        labEmployeeGender = new JLabel("Gender");
            labEmployeeGender.setForeground(Color.black);
            labEmployeeGender.setBounds( 20 , 180 , 240 , 30 );
            labEmployeeGender.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
        
        radMale = new JRadioButton("Male");
            radMale.setForeground(new Color ( 64 , 64 , 64 ));
            radMale.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radMale.setBounds( 30, 220 , 70 , 30 );
            radMale.setBackground(null);
            radMale.setSelected(true);
            
        radFemale = new JRadioButton("Female");
            radFemale.setForeground(new Color ( 64 , 64 , 64 ));
            radFemale.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radFemale.setBounds( 130, 220 , 70 , 30 );
            radFemale.setBackground(null);    
            
        labEmployeeNumberPhone = new JLabel("Phone Number");
            labEmployeeNumberPhone.setForeground(Color.black);
            labEmployeeNumberPhone.setBounds( 20 , 250 , 240 , 30 );
            labEmployeeNumberPhone.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));     
            
        labEmployeeAddress = new JLabel("Address");
            labEmployeeAddress.setForeground(Color.black);
            labEmployeeAddress.setBounds( 20 , 320 , 240 , 30 );
            labEmployeeAddress.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));  
            
        labEmployeeWage = new JLabel("Wage");
            labEmployeeWage.setForeground(Color.black);
            labEmployeeWage.setBounds( 20 , 390 , 240 , 30 );
            labEmployeeWage.setFont(new Font( "Jaldi", Font.BOLD , 16 ));  

        txtEmployeeID = new JTextField();
            txtEmployeeID.setBounds( 25 , 70 , 275 , 30 );
            txtEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeID.setForeground(Color.black);
        
        txtEmployeeName = new JTextField();
            txtEmployeeName.setBounds( 25 , 140 , 275 , 30 );
            txtEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeName.setForeground(Color.black);
            
        txtEmployeeAddress = new JTextField();
            txtEmployeeAddress.setBounds( 25 , 280 , 275 , 30 );
            txtEmployeeAddress.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeAddress.setForeground(Color.black);
            
        txtEmployeeNumberPhone = new JTextField();
            txtEmployeeNumberPhone.setBounds( 25 , 350 , 275 , 30 );
            txtEmployeeNumberPhone.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeNumberPhone.setForeground(Color.black);
            
        txtEmployeeWage = new JTextField();
            txtEmployeeWage.setBounds( 25 , 420 , 275 , 30 );
            txtEmployeeWage.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeWage.setForeground(Color.black);

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
            
        tableModel = new DefaultTableModel(new Object[] { "ID", "Name" , "Gender","Phone","Address","Wage" }, 0);    
            
        tabEmployee = new JTable(tableModel);
            tabEmployee.setBackground(Color.white);
            tabEmployee.getTableHeader().setOpaque(false);
            tabEmployee.getTableHeader().setBackground(Color.BLACK);
            tabEmployee.getTableHeader().setForeground(Color.WHITE);
        
        pnlTable = new JScrollPane(tabEmployee);
            pnlTable.setBounds( 700 , 40 , 620, 700);
            
        radgroupGender = new ButtonGroup();
            radgroupGender.add(radFemale);
            radgroupGender.add(radMale);    
            
        this.add(txtURL);
        this.add(pnlTable);
        this.add(labEmployeeID);
        this.add(labEmployee);
        this.add(labEmployeeName);
        this.add(labEmployeeAddress);
        this.add(labEmployeeGender);
        this.add(labEmployeeImage);
        this.add(labEmployeeNumberPhone);
        this.add(labEmployeeWage);
        this.add(txtEmployeeID);
        this.add(txtEmployeeName);
        this.add(txtEmployeeNumberPhone);
        this.add(txtEmployeeWage);
        this.add(txtEmployeeAddress);
        this.add(txtSearch);
        this.add(btnSearch);
        this.add(btnAdd);
        this.add(btnEdit);
        this.add(btnDelete);
        this.add(btnClear);
        this.add(btnChooseImage);
        this.add(labPictrue);
        this.add(radFemale);
        this.add(radMale);
        
        
        tabEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clear(); 
                int row = tabEmployee.getSelectedRow();
                if ( row >= 0 ){
                    txtEmployeeID.setText(Integer.toString((int) tabEmployee.getValueAt(row,0)));
                    txtEmployeeName.setText((String) tabEmployee.getValueAt(row,1));
                    if ( tabEmployee.getValueAt(row,2).equals("Female") )
                        radFemale.setSelected(true);
                    else
                        radMale.setSelected(true);
                    
                    txtEmployeeNumberPhone.setText((String) tabEmployee.getValueAt(row,3));
                    txtEmployeeAddress.setText((String) tabEmployee.getValueAt(row,4));
                    txtEmployeeWage.setText(Integer.toString((int) tabEmployee.getValueAt(row,5)));
                    EmployeeManagerLogic logic = new EmployeeManagerLogic();
                    for (EmployeeDTO Cdto : logic.list){
                            if (tabEmployee.getValueAt(row,0).equals(Cdto.EmployeeID)){
                                    txtURL.setText(Cdto.EmployeeImage);
                                    String filename = null;
                                    filename = Cdto.EmployeeImage;                
                                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(labPictrue.getWidth(), labPictrue.getHeight(), Image.SCALE_SMOOTH));
                                    labPictrue.setIcon(imageIcon); 
                                break;
                            }
                        }
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
                        DataValidator.validateTextEmpty(txtEmployeeID, sb, "Please enter ID");
                        DataValidator.validateTextEmpty(txtEmployeeName, sb, "Employee name cannot be blank!");
                        DataValidator.validateTextEmpty(txtEmployeeNumberPhone, sb, "Employee phone number cannot be blank!");
                        DataValidator.validateTextEmpty(txtEmployeeAddress, sb, "Employee address cannot be blank!");
                        DataValidator.validateTextEmpty(txtEmployeeWage, sb, "Employee wage cannot be blank!");
                        DataValidator.validateTextEmpty(txtURL, sb, "Please choose image!");
                        
                        try {
                            double d = Double.parseDouble(txtEmployeeID.getText()); 
                        } catch (NumberFormatException nfe) {
                            txtEmployeeID.setBackground(new Color(226,110,110));
                            JOptionPane.showMessageDialog(manager, "Get alphanumeric values ​​only!" , "Information is wrong!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        //add code before clear
                        EmployeeManagerLogic logic = new EmployeeManagerLogic();
                        logic.dto.EmployeeID = Integer.parseInt(txtEmployeeID.getText());
                        logic.dto.EmployeeName = txtEmployeeName.getText().trim();
                        logic.dto.EmployeeImage = txtURL.getText().trim();
                        logic.dto.EmployeePhone = txtEmployeeNumberPhone.getText().trim();
                        logic.dto.EmployeeAddress = txtEmployeeAddress.getText().trim();
                        logic.dto.EmployeeWage = Integer.parseInt(txtEmployeeWage.getText());
                        
                        String Female  = "Female";
                        String Male = "Male";
                        
                        if ( radFemale.isSelected() == true )
                            logic.dto.EmployeeGender = Female;
                        
                        if ( radMale.isSelected() == true ){
                            logic.dto.EmployeeGender = Male;
                            System.out.println(".actionPerformed()");
                        }
                        
                        int flag = 1;
                        for (EmployeeDTO Edto : logic.list){
                            String ID = Integer.toString(Edto.EmployeeID);          
                            if (txtEmployeeID.getText().trim().equalsIgnoreCase(ID)){
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
                        JOptionPane.showMessageDialog(manager, "Employee added to database successfully!" , "Done!",  JOptionPane.INFORMATION_MESSAGE);
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
                        DataValidator.validateTextEmpty(txtEmployeeID , sb, "ID not found!");
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        EmployeeManagerLogic logic = new EmployeeManagerLogic(); 
                        logic.dto.EmployeeID = Integer.parseInt(txtEmployeeID.getText());;
                        logic.Remove();
                        JOptionPane.showMessageDialog(manager, "Employee deleted successfully!" , "Done!",  JOptionPane.INFORMATION_MESSAGE);
                        Clear();
                        Show();
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
                        DataValidator.validateTextEmpty(txtEmployeeID , sb, "ID not found!");
                        DataValidator.validateTextEmpty(txtEmployeeName, sb, "Employee name cannot be blank!");
                        DataValidator.validateTextEmpty(txtEmployeeNumberPhone, sb, "Employee phone number cannot be blank!");
                        DataValidator.validateTextEmpty(txtEmployeeAddress, sb, "Employee address cannot be blank!");
                        DataValidator.validateTextEmpty(txtEmployeeWage, sb, "Employee wage cannot be blank!");
                        DataValidator.validateTextEmpty(txtURL, sb, "Please choose image!");
                        if (sb.length()>0 ){
                            JOptionPane.showMessageDialog(manager, sb , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        EmployeeManagerLogic logic = new EmployeeManagerLogic();
                        logic.dto.EmployeeID = Integer.parseInt(txtEmployeeID.getText());
                        logic.dto.EmployeeName = txtEmployeeName.getText().trim();
                       
                        String Female  = "Female";
                        String Male = "Male";
                        if ( radFemale.isSelected() == true ){
                            logic.dto.EmployeeGender = Female;
                        }
                        
                        if ( radMale.isSelected() == true ){
                            logic.dto.EmployeeGender = Male;
                        }
                        
                        logic.dto.EmployeeImage = txtURL.getText().trim();
                        logic.dto.EmployeePhone = txtEmployeeNumberPhone.getText().trim();
                        logic.dto.EmployeeAddress = txtEmployeeAddress.getText().trim();
                        logic.dto.EmployeeWage = Integer.parseInt(txtEmployeeWage.getText());
                        int flag = 0;
                        for (EmployeeDTO Cdto : logic.list){
                            String n = Integer.toString(Cdto.EmployeeID);
                            if (txtEmployeeID.getText().trim().equalsIgnoreCase(n)){
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
                        EmployeeManagerLogic logic = new EmployeeManagerLogic();
                        ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
                        for (EmployeeDTO Cdto : logic.list){
                            if(Cdto.EmployeeName.contains(txtSearch.getText().trim()))
                                list.add(Cdto);
                        }
                        tableModel.setRowCount(0);
                        for(EmployeeDTO dto : list){
                            tableModel.addRow(new Object[]{dto.getEmployeeID(), dto.getEmployeeName()});
                        }
                        ReturnWhite();
                    }
            });
        
        btnChooseImage.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        String filename = null;
                        JFileChooser file = new JFileChooser();
                        file.showOpenDialog(null);
                        File F = file.getSelectedFile();
                        filename = F.getAbsolutePath();
                        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(labPictrue.getWidth(), labPictrue.getHeight(), Image.SCALE_SMOOTH));
                        labPictrue.setIcon(imageIcon); 
                        txtURL.setText(filename);
                    }                    
            });
    }
    
    public void Clear(){
        txtEmployeeAddress.setText("");
        txtEmployeeID.setText("");
        txtEmployeeName.setText("");
        txtEmployeeNumberPhone.setText("");
        txtEmployeeWage.setText("");
        labPictrue.setIcon(null);
        txtURL.setText("");
    }     
    
    @Override
    public void ReturnWhite(){
        txtEmployeeAddress.setBackground(Color.white);
        txtEmployeeID.setBackground(Color.white);
        txtEmployeeName.setBackground(Color.white);
        txtEmployeeNumberPhone.setBackground(Color.white);
        txtEmployeeWage.setBackground(Color.white);
    }
    
    @Override
    public void Show() {
        tableModel.setRowCount(0);
        for(EmployeeDTO dto :new EmployeeDAO().getAllData()){
            tableModel.addRow(new Object[]
                             {dto.getEmployeeID(), dto.getEmployeeName(), dto.getEmployeeGender(), 
                              dto.getEmployeePhone(), dto.getEmployeeAddress(), dto.getEmployeeWage()});
        }
    }
}
