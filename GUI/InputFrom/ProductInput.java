package GUI.InputFrom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class ProductInput extends JFrame {
    JPanel pnlImage, pnlTitle;
    JLabel labProductID, labProductName, labProductCategory, labProductBrand,
           labProductWarranties, labProductInStock, labProductPrice, labTitle, labImage;
    JTextField txtProductID, txtProductName, txtProductInStock,
               txtProductPrice, txtProductBrand, txtProductWarranties;
    JComboBox cboProductCategory;
    JButton btnConfirm, btnImage;
    
    public ProductInput(){
        this.setPreferredSize(new Dimension(650,585));
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

        labTitle = new JLabel("Product Information");
            labTitle.setForeground(new Color( 250 , 250 , 250 ));
            labTitle.setFont(new Font( "Jaldi" , Font.BOLD , 30 ));
            labTitle.setBounds( 10, 10 , 600 , 30 );
        
        labImage = new JLabel("Image");
            labImage.setForeground(Color.black);
            labImage.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labImage.setBounds( 425 , 60 , 400 , 18 );
            
        labProductID = new JLabel("Product ID");
            labProductID.setForeground(Color.black);
            labProductID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductID.setBounds( 15, 60 , 400 , 18 );
            
        txtProductID = new JTextField();
            txtProductID.setForeground(new Color ( 60 , 60 , 60 ));
            txtProductID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductID.setBounds( 10 , 80 , 400 , 30 );
        
        labProductName = new JLabel("Name");
            labProductName.setForeground(Color.black);
            labProductName.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductName.setBounds( 15, 120 , 400 , 18 );
        
        txtProductName = new JTextField();
            txtProductName.setForeground(new Color ( 60 , 60 , 60 ));
            txtProductName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductName.setBounds( 10 , 140 , 400 , 30 );
            
        labProductCategory = new JLabel("Category");
            labProductCategory.setForeground(Color.black);
            labProductCategory.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductCategory.setBounds( 15, 180 , 400 , 18 );
            
        cboProductCategory = new JComboBox();
            cboProductCategory.setForeground(new Color ( 64 , 64 , 64 ));
            cboProductCategory.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            cboProductCategory.setBounds( 10, 200 , 400 , 30 );
            cboProductCategory.setBackground(Color.white);
                  
        labProductBrand = new JLabel("Brand");
            labProductBrand.setForeground(Color.black);
            labProductBrand.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductBrand.setBounds( 15, 240 , 400 , 18 );
            
        txtProductBrand = new JTextField();
            txtProductBrand.setForeground(new Color ( 60 , 60 , 60 ));
            txtProductBrand.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductBrand.setBounds( 10 , 260 , 400 , 30 );
            
        labProductWarranties = new JLabel("Warranies");
            labProductWarranties.setForeground(Color.black);
            labProductWarranties.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductWarranties.setBounds( 15, 300 , 400 , 18 );
            
        txtProductWarranties = new JTextField();
            txtProductWarranties.setForeground(new Color ( 60 , 60 , 60 ));
            txtProductWarranties.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductWarranties.setBounds( 10 , 320 , 400 , 30 );
            
        labProductInStock = new JLabel("In Stock");
            labProductInStock.setForeground(Color.black);
            labProductInStock.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductInStock.setBounds( 15, 360 , 400 , 18 );
            
        txtProductInStock  = new JTextField();
            txtProductInStock.setForeground(new Color ( 60 , 60 , 60 ));
            txtProductInStock.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductInStock.setBounds( 10 , 380 , 400 , 30 );
        
        labProductPrice = new JLabel("Price");
            labProductPrice.setForeground(Color.black);
            labProductPrice.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            labProductPrice.setBounds( 15, 420 , 400 , 18 );
        
        txtProductPrice  = new JTextField();
            txtProductPrice.setForeground(new Color ( 60 , 60 , 60 ));
            txtProductPrice.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtProductPrice.setBounds( 10 , 440 , 400 , 30 );
                   
        pnlImage = new JPanel();
            pnlImage.setBounds( 420 , 80 , 200 , 200 );
            pnlImage.setBackground(Color.GRAY);
        
        pnlTitle = new JPanel();
            pnlTitle.setBounds( 0 , 0, 650 ,50 );
            pnlTitle.setBackground(Color.black);
            
        btnImage = new JButton("Choose Image");
            btnImage.setBackground(Color.black);
            btnImage.setForeground(new Color ( 250 , 250 , 250 ));
            btnImage.setBorder(null);
            btnImage.setFocusable(false);
            btnImage.setBounds( 420 , 290 , 200 , 40 );
            btnImage.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
        
        btnConfirm = new JButton("Confirm");
            btnConfirm.setBackground(Color.black);
            btnConfirm.setForeground(new Color ( 250 , 250 , 250 ));
            btnConfirm.setBorder(null);
            btnConfirm.setFocusable(false);
            btnConfirm.setBounds( 225 , 485 , 200 , 40 );
            btnConfirm.setFont(new Font( "Jaldi" , Font.BOLD , 25 ));
    
        this.add(labTitle);
        this.add(labProductID);
        this.add(labProductName);
        this.add(labProductInStock);
        this.add(labProductPrice);
        this.add(labProductCategory);
        this.add(labProductBrand);
        this.add(labProductWarranties);
        this.add(labImage);
        
        this.add(txtProductID);
        this.add(txtProductName);
        this.add(txtProductInStock);
        this.add(txtProductPrice);
        this.add(txtProductBrand);
        this.add(txtProductWarranties);
        
        this.add(cboProductCategory);
        
        this.add(pnlTitle);
        this.add(pnlImage);
        
        this.add(btnImage);
        this.add(btnConfirm);
        
    }
}
