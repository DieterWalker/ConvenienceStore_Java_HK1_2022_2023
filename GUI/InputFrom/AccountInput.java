package GUI.InputFrom;

import GUI.MainScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.*;

public class AccountInput extends JFrame {
    JPanel pnlTitle;
    JLabel labTitle, labEmployeeID, labUserName, labPassword, labPosition;
    JTextField txtUsername, txtPassword;
    JButton btnConfirm;
    JRadioButton radAccoutant, radCashier, radManager;
    JComboBox cboEmployeeID;
    ButtonGroup radgroupPosttion;
    
    public AccountInput(){
        this.setPreferredSize(new Dimension(440,400));
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

        labTitle = new JLabel("Account Information");
            labTitle.setForeground(new Color( 250 , 250 , 250 ));
            labTitle.setFont(new Font( "Jaldi" , Font.BOLD , 30 ));
            labTitle.setBounds( 10, 10 , 600 , 30 );
        
        labEmployeeID = new JLabel("Employee ID");
            labEmployeeID.setForeground(Color.black);
            labEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEmployeeID.setBounds( 15, 60 , 400 , 18 );
            
        cboEmployeeID = new JComboBox();
            cboEmployeeID.setForeground(new Color ( 60 , 60 , 60 ));
            cboEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            cboEmployeeID.setBounds( 10 , 80 , 400 , 30 );
            cboEmployeeID.setBackground(Color.white);
        
        labUserName = new JLabel("Username");
            labUserName.setForeground(Color.black);
            labUserName.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labUserName.setBounds( 15, 120 , 400 , 18 );
        
        txtUsername = new JTextField();
            txtUsername.setForeground(new Color ( 60 , 60 , 60 ));
            txtUsername.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtUsername.setBounds( 10 , 140 , 400 , 30 );
            
        labPassword = new JLabel("Password");
            labPassword.setForeground(Color.black);
            labPassword.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labPassword.setBounds( 15, 180 , 400 , 18 );
            
        txtPassword  = new JTextField();
            txtPassword.setForeground(new Color ( 60 , 60 , 60 ));
            txtPassword.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtPassword.setBounds( 10 , 200 , 400 , 30 );
            
        labPosition = new JLabel("Position");
            labPosition.setForeground(Color.black);
            labPosition.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labPosition.setBounds( 15, 240 , 400 , 18 );
            
        radAccoutant = new JRadioButton("Accountant");
            radAccoutant.setForeground(new Color ( 64 , 64 , 64 ));
            radAccoutant.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radAccoutant.setBounds( 15, 260 , 100 , 40 );
            radAccoutant.setBackground(null);
            
        radCashier = new JRadioButton("Cashier");
            radCashier.setForeground(new Color ( 64 , 64 , 64 ));
            radCashier.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radCashier.setBounds( 120, 260 , 100 , 40 );
            radCashier.setBackground(null);
            
        radManager = new JRadioButton("Manager");
            radManager.setForeground(new Color ( 64 , 64 , 64 ));
            radManager.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            radManager.setBounds( 240 , 260 , 100 , 40 );
            radManager.setBackground(null);

        pnlTitle = new JPanel();
            pnlTitle.setBounds( 0 , 0, 650 ,50 );
            pnlTitle.setBackground(Color.black);
            
        btnConfirm = new JButton("Confirm");
            btnConfirm.setBackground(Color.black);
            btnConfirm.setForeground(new Color ( 250 , 250 , 250 ));
            btnConfirm.setBorder(null);
            btnConfirm.setFocusable(false);
            btnConfirm.setBounds( 120 , 305 , 200 , 40 );
            btnConfirm.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
            
            btnConfirm.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                            JOptionPane.showInputDialog(rootPane, "Pass", DISPOSE_ON_CLOSE);
                    }
                });  
        
        radgroupPosttion = new ButtonGroup();
            radgroupPosttion.add(radAccoutant);
            radgroupPosttion.add(radCashier);
            radgroupPosttion.add(radManager);
            
        this.add(labTitle);
        this.add(labEmployeeID);
        this.add(labUserName);
        this.add(labPassword);
        this.add(labPosition);
        
        this.add(txtPassword);
        this.add(txtUsername);
        
        this.add(cboEmployeeID);
        
        this.add(pnlTitle);
        
        this.add(btnConfirm);
        
        this.add(radAccoutant);
        this.add(radCashier);
        this.add(radManager);
        
    }
}
