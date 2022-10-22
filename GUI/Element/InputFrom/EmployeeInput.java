package GUI.Element.InputFrom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class EmployeeInput extends JFrame {
    JPanel pnlImage, pnlTitle;
    JLabel labEmployeeID, labEmployeeName, labEmployeePhone,
           labEmployeeWage, labEmployeeAndress, labTitle, labImage;
    JTextField txtEmployeeID, txtEmployeeName, txtEmployeePhone,
               txtEmployeeWage, txtEmployeeAddress;
    JButton btnConfirm, btnImage;
    
    public EmployeeInput(){
        this.setPreferredSize(new Dimension(650,450));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        
        initGUI();
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public void initGUI(){
        this.getContentPane().setBackground(new Color( 250 ,250 , 250 ));

        labTitle = new JLabel("Employee Information");
            labTitle.setForeground(new Color( 250 , 250 , 250 ));
            labTitle.setFont(new Font( "Jaldi" , Font.BOLD , 30 ));
            labTitle.setBounds( 10, 10 , 600 , 30 );
        
        labImage = new JLabel("Image");
            labImage.setForeground(Color.black);
            labImage.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labImage.setBounds( 425 , 60 , 400 , 18 );
            
        labEmployeeID = new JLabel("Employee ID");
            labEmployeeID.setForeground(Color.black);
            labEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeID.setBounds( 15, 60 , 400 , 18 );
            
        txtEmployeeID = new JTextField();
            txtEmployeeID.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeID.setBounds( 10 , 80 , 400 , 30 );
        
        labEmployeeName = new JLabel("Employee Name");
            labEmployeeName.setForeground(Color.black);
            labEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeName.setBounds( 15, 120 , 400 , 18 );
        
        txtEmployeeName = new JTextField();
            txtEmployeeName.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeName.setBounds( 10 , 140 , 400 , 30 );
            
        labEmployeePhone = new JLabel("Employee Phone");
            labEmployeePhone.setForeground(Color.black);
            labEmployeePhone.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeePhone.setBounds( 15, 180 , 400 , 18 );
            
        txtEmployeePhone  = new JTextField();
            txtEmployeePhone.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeePhone.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeePhone.setBounds( 10 , 200 , 400 , 30 );
        
        labEmployeeWage = new JLabel("Employee Wage");
            labEmployeeWage.setForeground(Color.black);
            labEmployeeWage.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeWage.setBounds( 15, 240 , 400 , 18 );
        
        txtEmployeeWage = new JTextField();
            txtEmployeeWage.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeWage.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeWage.setBounds( 10 , 260 , 400 , 30 );    
            
        labEmployeeAndress = new JLabel("Employee Andress");
            labEmployeeAndress.setForeground(Color.black);
            labEmployeeAndress.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeAndress.setBounds( 15, 300 , 400 , 18 );
            
        txtEmployeeAddress = new JTextField();
            txtEmployeeAddress.setForeground(new Color ( 60 , 60 , 60 ));
            txtEmployeeAddress.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeAddress.setBounds( 10 , 320 , 400 , 30 );
            
        pnlImage = new JPanel();
            pnlImage.setBounds( 420 , 90 , 200 , 200 );
            pnlImage.setBackground(Color.GRAY);
        
        pnlTitle = new JPanel();
            pnlTitle.setBounds( 0 , 0, 650 ,50 );
            pnlTitle.setBackground(Color.black);
            
        btnImage = new JButton("Choose Image");
            btnImage.setBackground(Color.black);
            btnImage.setForeground(new Color ( 250 , 250 , 250 ));
            btnImage.setBorder(null);
            btnImage.setFocusable(false);
            btnImage.setBounds( 420 , 300 , 200 , 40 );
            btnImage.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
        
        btnConfirm = new JButton("Confirm");
            btnConfirm.setBackground(Color.black);
            btnConfirm.setForeground(new Color ( 250 , 250 , 250 ));
            btnConfirm.setBorder(null);
            btnConfirm.setFocusable(false);
            btnConfirm.setBounds( 225 , 360 , 200 , 40 );
            btnConfirm.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
            
        this.add(labTitle);
        this.add(labEmployeeID);
        this.add(labEmployeeName);
        this.add(labEmployeePhone);
        this.add(labEmployeeWage);
        this.add(labEmployeeAndress);
        this.add(labImage);
        
        this.add(txtEmployeeID);
        this.add(txtEmployeeName);
        this.add(txtEmployeePhone);
        this.add(txtEmployeeWage);
        this.add(txtEmployeeAddress);
        
        this.add(pnlTitle);
        this.add(pnlImage);
        
        this.add(btnImage);
        this.add(btnConfirm);
    }
}
