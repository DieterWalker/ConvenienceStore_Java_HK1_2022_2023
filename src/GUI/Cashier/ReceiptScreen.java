package GUI.Cashier;

import GUI.SignInScreen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ReceiptScreen extends JFrame {
    JPanel pnlLeft, pnlRight;
    JTextField txtEmployeeName, txtCustomerPhone, txtDate, txtTotalPrice,
               txtPaymentPrice, txtChange , txtFindProduct, txtProductID, 
               txtProductName, txtProductCategory, txtProductPrice, 
               txtProductSale, txtProductTotalPrice, txtProductAmount,
               txtReceiptID; 
    JLabel labEmployeeName, labCustomerPhone, labDate, labReceiptDetail, 
           labTotalPrice, labTotalPriceVND, labPaymentPrice, labPaymentPriceVND,
           labChange, labChangeVND, labPaymentMethod, labProduct, labFindProduct,
           labImage, labProductID, labProductName, labProductCategory,
           labProductPrice, labProductSale, labProductTotalPrice, 
           labProductAmount, labPicture, labReceiptID;
    JTable tabReceiptDetailData;
    JButton btnCancel, btnPayment, btnFindProduct, btnAdd, btnDelete ,btnEdit, 
            btnClear; 
    JComboBox cbbPayment, cbbFindProduct;
    JScrollPane pnlTable, pnlProductTable;
    DefaultTableModel tableModel;
    String[] Payment = {"Cash" , "Bank account"};
    
    public ReceiptScreen(){
        this.setPreferredSize(new Dimension(1500,800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        
        ReceiptGUI();
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void ReceiptGUI(){
        CreateLeft();
        CreateRight();
    }
    
    private void CreateRight(){
        pnlRight = new JPanel();
            pnlRight.setBounds(250, 0, 1300, 800);
            pnlRight.setLayout(null);
        
        labProduct = new JLabel(" Product: ");
            labProduct.setForeground(Color.black);
            labProduct.setBounds( 5 , 5 , 240 , 30 );
            labProduct.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        labFindProduct = new JLabel("Input Product ID:");
            labFindProduct.setForeground(Color.black);
            labFindProduct.setBounds( 20 , 35 , 240 , 30 );
            labFindProduct.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        txtFindProduct = new JTextField();
            txtFindProduct.setText("999999");
            txtFindProduct.setBounds( 150 , 35 , 250 , 30 );
            txtFindProduct.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            
        btnFindProduct = new JButton("Search"); 
            btnFindProduct.setBackground(Color.black);
            btnFindProduct.setForeground(Color.white);
            btnFindProduct.setBorder(null);
            btnFindProduct.setFocusable(false);
            btnFindProduct.setBounds( 410 , 35 , 70 , 29 );
            btnFindProduct.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
        
        cbbFindProduct = new JComboBox (Payment);
            cbbFindProduct.setBounds( 490 , 35 , 200 , 30 );
            cbbFindProduct.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));      
            
        labImage = new JLabel("Image:");
            labImage.setForeground(Color.black);
            labImage.setBounds( 20 , 100 , 240 , 30 );
            labImage.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        labPicture = new JLabel();
            labPicture.setBounds( 30 , 130 , 250 , 250 );
            labPicture.setBackground(Color.gray);
            
        labProductID = new JLabel("Product ID:");
            labProductID.setForeground(Color.black);
            labProductID.setBounds( 300 , 100 , 240 , 30 );
            labProductID.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
        
        labProductName = new JLabel("Name:");
            labProductName.setForeground(Color.black);
            labProductName.setBounds( 300 , 170 , 240 , 30 );
            labProductName.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        labProductCategory = new JLabel("Category:");
            labProductCategory.setForeground(Color.black);
            labProductCategory.setBounds( 300 , 240 , 240 , 30 );
            labProductCategory.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        labProductPrice = new JLabel("Price:");
            labProductPrice.setForeground(Color.black);
            labProductPrice.setBounds( 300 , 310 , 240 , 30 );
            labProductPrice.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        labProductSale = new JLabel("Sale:");
            labProductSale.setForeground(Color.black);
            labProductSale.setBounds( 300 , 380 , 240 , 30 );
            labProductSale.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        labProductAmount = new JLabel("Amount:");
            labProductAmount.setForeground(Color.black);
            labProductAmount.setBounds( 300 , 450 , 240 , 30 );
            labProductAmount.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        labProductTotalPrice = new JLabel("TotalPrice:");
            labProductTotalPrice.setForeground(Color.black);
            labProductTotalPrice.setBounds( 300 , 520 , 240 , 30 );
            labProductTotalPrice.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
        txtProductID = new JTextField();
            txtProductID.setBounds( 310 , 130 , 300 , 30 );
            txtProductID.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtProductID.setEnabled(false);
            
        txtProductName = new JTextField();
            txtProductName.setBounds( 310 , 200 , 300 , 30 );
            txtProductName.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtProductName.setEnabled(false);
            
        txtProductCategory = new JTextField();
            txtProductCategory.setBounds( 310 , 270 , 300 , 30 );
            txtProductCategory.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtProductCategory.setEnabled(false);
            
        txtProductPrice = new JTextField();
            txtProductPrice.setBounds( 310 , 340 , 300 , 30 );
            txtProductPrice.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtProductPrice.setEnabled(false);
            
        txtProductSale = new JTextField();
            txtProductSale.setBounds( 310 , 410 , 300 , 30 );
            txtProductSale.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtProductSale.setEnabled(false);
            
        txtProductTotalPrice = new JTextField();
            txtProductTotalPrice.setBounds( 310 , 550 , 300 , 30 );
            txtProductTotalPrice.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtProductTotalPrice.setEnabled(false);
            
        txtProductAmount = new JTextField();
            txtProductAmount.setBounds( 310 , 480 , 300 , 30 );
            txtProductAmount.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
          
        btnClear = new JButton("Clear"); 
            btnClear.setBackground(Color.black);
            btnClear.setForeground(Color.white);
            btnClear.setBorder(null);
            btnClear.setFocusable(false);
            btnClear.setBounds( 5 , 725 , 100 , 30 );
            btnClear.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            
        btnAdd = new JButton("Add"); 
            btnAdd.setBackground(Color.black);
            btnAdd.setForeground(Color.white);
            btnAdd.setBorder(null);
            btnAdd.setFocusable(false);
            btnAdd.setBounds( 370 , 725 , 100 , 30 );
            btnAdd.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            
        btnEdit = new JButton("Edit"); 
            btnEdit.setBackground(Color.black);
            btnEdit.setForeground(Color.white);
            btnEdit.setBorder(null);
            btnEdit.setFocusable(false);
            btnEdit.setBounds( 475 , 725 , 100 , 30 );
            btnEdit.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            
        btnDelete = new JButton("Delete"); 
            btnDelete.setBackground(Color.red);
            btnDelete.setForeground(Color.white);
            btnDelete.setBorder(null);
            btnDelete.setFocusable(false);
            btnDelete.setBounds( 580 , 725 , 100 , 30 );
            btnDelete.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            
            
        pnlRight.add(txtProductID);
        pnlRight.add(txtProductName);
        pnlRight.add(txtProductCategory);
        pnlRight.add(txtProductPrice);
        pnlRight.add(txtProductSale);
        pnlRight.add(txtProductAmount);
        pnlRight.add(txtProductTotalPrice);
        pnlRight.add(labPicture);
        pnlRight.add(labProductPrice);
        pnlRight.add(labProductTotalPrice);
        pnlRight.add(labProductAmount);    
        pnlRight.add(labProductSale);    
        pnlRight.add(labProductCategory);    
        pnlRight.add(labProductName);
        pnlRight.add(labProductID);    
        pnlRight.add(labImage);
        pnlRight.add(cbbFindProduct);    
        pnlRight.add(btnFindProduct);
        pnlRight.add(btnAdd);
        pnlRight.add(btnClear);
        pnlRight.add(btnEdit);
        pnlRight.add(btnDelete);
        pnlRight.add(labProduct);
        pnlRight.add(labFindProduct);
        pnlRight.add(txtFindProduct);
        
            
        labReceiptDetail = new JLabel("ReceiptDetail:");
            labReceiptDetail.setForeground(Color.black);
            labReceiptDetail.setBounds( 700 , 5 , 240 , 30 );
            labReceiptDetail.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
        
        labTotalPrice = new JLabel("Total Price: ");
            labTotalPrice.setForeground(Color.black);
            labTotalPrice.setBounds( 850 , 585 , 250 , 30 );
            labTotalPrice.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtTotalPrice = new JTextField();
            txtTotalPrice.setText("999999");
            txtTotalPrice.setBounds( 1050 , 585 , 130 , 30 );
            txtTotalPrice.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtTotalPrice.setEnabled(false);
            
        labTotalPriceVND = new JLabel("VND");
            labTotalPriceVND.setForeground(Color.black);
            labTotalPriceVND.setBounds( 1190 , 585 , 50 , 30 );
            labTotalPriceVND.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        labPaymentPrice = new JLabel("Payment Price: ");
            labPaymentPrice.setForeground(Color.black);
            labPaymentPrice.setBounds( 850 , 620 , 250 , 30 );
            labPaymentPrice.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtPaymentPrice = new JTextField();
            txtPaymentPrice.setText("999999");
            txtPaymentPrice.setBounds( 1050 , 620 , 130 , 30 );
            txtPaymentPrice.setFont(new Font( "Jaldi" , Font.BOLD , 20 )); 
            
        labPaymentPriceVND = new JLabel("VND");
            labPaymentPriceVND.setForeground(Color.black);
            labPaymentPriceVND.setBounds( 1190 , 620 , 50 , 30 );
            labPaymentPriceVND.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        labChange = new JLabel("Change: ");
            labChange.setForeground(Color.black);
            labChange.setBounds( 850 , 655 , 250 , 30 );
            labChange.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtChange = new JTextField();
            txtChange.setText("999999");
            txtChange.setBounds( 1050 , 655 , 130 , 30 );
            txtChange.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtChange.setEnabled(false);
            
        labChangeVND = new JLabel("VND");
            labChangeVND.setForeground(Color.black);
            labChangeVND.setBounds( 1190 , 655 , 50 , 30 );
            labChangeVND.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        labPaymentMethod= new JLabel("Payment Method: ");
            labPaymentMethod.setForeground(Color.black);
            labPaymentMethod.setBounds( 850 , 690 , 150 , 30 );
            labPaymentMethod.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        cbbPayment = new JComboBox (Payment);
            cbbPayment.setBounds( 1050 , 690 , 130 , 30 );
            cbbPayment.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));    
        
        btnPayment = new JButton("Payment"); 
            btnPayment.setBackground(Color.black);
            btnPayment.setForeground(Color.white);
            btnPayment.setBorder(null);
            btnPayment.setFocusable(false);
            btnPayment.setBounds( 1040 , 725 , 190 , 30 );
            btnPayment.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
        
        tableModel = new DefaultTableModel(new Object[] { "Product ID", "ProductName", "Quanlity", "Total Price" }, 0);
            
        tabReceiptDetailData = new JTable(tableModel);
            tabReceiptDetailData.setBackground(Color.white);
            tabReceiptDetailData.getTableHeader().setOpaque(false);
            tabReceiptDetailData.getTableHeader().setBackground(Color.BLACK);
            tabReceiptDetailData.getTableHeader().setForeground(Color.WHITE);
            
        pnlTable = new JScrollPane(tabReceiptDetailData);
            pnlTable.setBounds( 700 , 35 , 525 , 545);
            
        pnlRight.add(labReceiptDetail);
        pnlRight.add(labTotalPrice);
        pnlRight.add(labTotalPriceVND);
        pnlRight.add(labPaymentPriceVND);
        pnlRight.add(labPaymentPrice);
        pnlRight.add(labChangeVND);
        pnlRight.add(labChange);
        pnlRight.add(labPaymentMethod);
        pnlRight.add(txtChange);
        pnlRight.add(txtTotalPrice);
        pnlRight.add(pnlTable); 
        pnlRight.add(txtPaymentPrice);
        pnlRight.add(cbbPayment);
        pnlRight.add(btnPayment);
        
        this.add(pnlRight);
   
            btnAdd.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Add products to the invoice?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        //add code before clear
                        Clear();
                    }
            });  
            
            btnDelete.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Delete products to the invoice?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        //add code before clear
                        Clear();
                    }
            });  
            
            btnEdit.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Edit products to the invoice?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        //add code before clear
                        Clear();
                    }
            });  
            
            btnClear.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        Clear();
                        JOptionPane.showMessageDialog(rootPane, "All input fields have been refreshed.");
                    }
            });  
            
            btnFindProduct.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
            });
            
            
            btnPayment.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Complete payment?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        new CashierScreen();
                        dispose();
                    }
            });  
            
    }
    
    private void Clear(){
        txtProductID.setText("");
        txtProductName.setText("");
        txtProductCategory.setText("");
        txtProductPrice.setText("");
        txtProductSale.setText("");
        txtProductTotalPrice.setText("");
        txtProductAmount.setText("");
        labPicture.setText("");
    }
    
    private void CreateLeft(){
        pnlLeft = new JPanel();
            pnlLeft.setBackground(Color.black);
            pnlLeft.setBounds(0, 0, 250, 800);
            pnlLeft.setLayout(null);
            
        labEmployeeName = new JLabel("Employee perform:");
            labEmployeeName.setForeground(Color.white);
            labEmployeeName.setBounds( 5 , 5 , 240 , 30 );
            labEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtEmployeeName = new JTextField();
            txtEmployeeName.setText("Tran Giang Nam");
            txtEmployeeName.setBounds( 10 , 35 , 230 , 30 );
            txtEmployeeName.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeName.setForeground(Color.black);
            txtEmployeeName.setEnabled(false);
            txtEmployeeName.setBorder(null);
            
        labCustomerPhone = new JLabel("Customer Number:");
            labCustomerPhone.setForeground(Color.white);
            labCustomerPhone.setBounds( 5 , 70 , 240 , 30 );
            labCustomerPhone.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtCustomerPhone = new JTextField();
            txtCustomerPhone.setText("");
            txtCustomerPhone.setBounds( 10 , 100 , 230 , 30 );
            txtCustomerPhone.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtCustomerPhone.setForeground(Color.black);
            txtCustomerPhone.setBorder(null);
            
        labDate = new JLabel("Date:");
            labDate.setForeground(Color.white);
            labDate.setBounds( 5 ,135 , 240 , 30 );
            labDate.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
            
        txtDate = new JTextField();
            txtDate.setText("");
            txtDate.setBounds( 10 , 170 , 230 , 30 );
            txtDate.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtDate.setForeground(Color.black);
            txtDate.setBorder(null);     
        
        labReceiptID = new JLabel("Receipt ID");
            labReceiptID.setForeground(Color.white);
            labReceiptID.setBounds( 5 ,200 , 240 , 30 );
            labReceiptID.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
        
        txtReceiptID = new JTextField();
            txtReceiptID.setText("");
            txtReceiptID.setBounds( 10 , 235 , 230 , 30 );
            txtReceiptID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtReceiptID.setForeground(Color.black);
            txtReceiptID.setBorder(null);     
            
        btnCancel = new JButton("Cancel");  
            btnCancel.setBackground(Color.red);
            btnCancel.setForeground(Color.white);
            btnCancel.setBorder(null);
            btnCancel.setFocusable(false);
            btnCancel.setBounds( 5 , 725 , 240 , 30 );
            btnCancel.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));        

            btnCancel.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Do you want to cancel order creation?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        new CashierScreen();
                        dispose();
                    }
                });  
            
        pnlLeft.add(labCustomerPhone);
        pnlLeft.add(labEmployeeName);
        pnlLeft.add(labDate);

        pnlLeft.add(txtDate);
        pnlLeft.add(txtEmployeeName);
        pnlLeft.add(txtCustomerPhone);
        pnlLeft.add(txtReceiptID);
        pnlLeft.add(labReceiptID);
        pnlLeft.add(btnCancel);
        this.add(pnlLeft);
    }
   
}
