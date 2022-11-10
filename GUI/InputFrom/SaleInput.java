package GUI.InputFrom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class SaleInput extends JFrame {
    JPanel pnlTitle;
    JLabel labSaleID, labProductID, labTitle, labStart, labEnd, labRate;
    JTextField txtStart, txtEnd, txtRate, txtSaleID;
    JComboBox cboProductID;
    JButton btnConfirm;
    
    public SaleInput(){
        this.setPreferredSize(new Dimension(440,450));
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

        labTitle = new JLabel("Sale of");
            labTitle.setForeground(new Color( 250 , 250 , 250 ));
            labTitle.setFont(new Font( "Jaldi" , Font.BOLD , 30 ));
            labTitle.setBounds( 10, 10 , 600 , 30 );
            
        labSaleID = new JLabel("Sale ID");
            labSaleID.setForeground(Color.black);
            labSaleID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labSaleID.setBounds( 15, 60 , 400 , 18 );
            
        txtSaleID = new JTextField();
            txtSaleID.setForeground(new Color ( 60 , 60 , 60 ));
            txtSaleID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSaleID.setBounds( 10 , 80 , 400 , 30 );
        
        labProductID = new JLabel("Product ID");
            labProductID.setForeground(Color.black);
            labProductID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductID.setBounds( 15, 120 , 400 , 18 );
            
        cboProductID = new JComboBox();
            cboProductID.setForeground(new Color ( 60 , 60 , 60 ));
            cboProductID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            cboProductID.setBounds( 10 , 140 , 400 , 30 );
            cboProductID.setBackground(Color.white);
            
        labStart = new JLabel("Start Day");
            labStart.setForeground(Color.black);
            labStart.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labStart.setBounds( 15, 180 , 400 , 18 );
            
        txtStart = new JTextField();
            txtStart.setForeground(new Color ( 60 , 60 , 60 ));
            txtStart.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtStart.setBounds( 10 , 200 , 400 , 30 );
           
        labEnd = new JLabel("End Day");
            labEnd.setForeground(Color.black);
            labEnd.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labEnd.setBounds( 15, 240 , 400 , 18 );
            
        txtEnd = new JTextField();
            txtEnd.setForeground(new Color ( 60 , 60 , 60 ));
            txtEnd.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEnd.setBounds( 10 , 260 , 400 , 30 );
            
        labRate = new JLabel("Rate");
            labRate.setForeground(Color.black);
            labRate.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labRate.setBounds( 15, 300 , 400 , 18 );
            
        txtRate = new JTextField();
            txtRate.setForeground(new Color ( 60 , 60 , 60 ));
            txtRate.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtRate.setBounds( 10 , 320 , 400 , 30 );
        
        pnlTitle = new JPanel();
            pnlTitle.setBounds( 0 , 0, 450 ,50 );
            pnlTitle.setBackground(Color.black);
        
        btnConfirm = new JButton("Confirm");
            btnConfirm.setBackground(Color.black);
            btnConfirm.setForeground(new Color ( 250 , 250 , 250 ));
            btnConfirm.setBorder(null);
            btnConfirm.setFocusable(false);
            btnConfirm.setBounds( 120 , 360 , 200 , 40 );
            btnConfirm.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
    
        this.add(labTitle);
        this.add(labProductID);
        this.add(labSaleID);
        this.add(labStart);
        this.add(labEnd);
        this.add(labRate);
        
        this.add(txtSaleID);
        this.add(txtStart);
        this.add(txtEnd);
        this.add(txtRate);
        
        this.add(cboProductID);
        
        this.add(pnlTitle);

        this.add(btnConfirm);
        
    }
}
