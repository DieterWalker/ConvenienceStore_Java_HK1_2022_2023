package GUI.InputFrom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class CategoryInput extends JFrame {
    JPanel pnlTitle;
    JLabel labTitle, labCategoryID, labCategoryName;
    JTextField txtCategoryID, txtCategoryName;
    JButton btnConfirm;
    
    public CategoryInput(){
        this.setPreferredSize(new Dimension(440,280));
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

        labTitle = new JLabel("Product Category");
            labTitle.setForeground(new Color( 250 , 250 , 250 ));
            labTitle.setFont(new Font( "Jaldi" , Font.BOLD , 30 ));
            labTitle.setBounds( 10, 10 , 600 , 30 );
            
        labCategoryID = new JLabel("Category ID");
            labCategoryID.setForeground(Color.black);
            labCategoryID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labCategoryID.setBounds( 15, 60 , 400 , 18 );
            
        txtCategoryID = new JTextField();
            txtCategoryID.setForeground(new Color ( 60 , 60 , 60 ));
            txtCategoryID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtCategoryID.setBounds( 10 , 80 , 400 , 30 );
        
        labCategoryName = new JLabel("CategoryName");
            labCategoryName.setForeground(Color.black);
            labCategoryName.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labCategoryName.setBounds( 15, 120 , 400 , 18 );
            
        txtCategoryName = new JTextField();
            txtCategoryName.setForeground(new Color ( 60 , 60 , 60 ));
            txtCategoryName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtCategoryName.setBounds( 10 , 140 , 400 , 30 );
        
        pnlTitle = new JPanel();
            pnlTitle.setBounds( 0 , 0, 450 ,50 );
            pnlTitle.setBackground(Color.black);
        
        btnConfirm = new JButton("Confirm");
            btnConfirm.setBackground(Color.black);
            btnConfirm.setForeground(new Color ( 250 , 250 , 250 ));
            btnConfirm.setBorder(null);
            btnConfirm.setFocusable(false);
            btnConfirm.setBounds( 110 , 190 , 200 , 40 );
            btnConfirm.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
    
        this.add(labTitle);
        this.add(labCategoryID);
        this.add(labCategoryName);
        
        this.add(txtCategoryID);
        this.add(txtCategoryName);
        
        this.add(pnlTitle);

        this.add(btnConfirm);
        
    }
}
