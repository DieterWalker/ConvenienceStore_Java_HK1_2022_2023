package GUI.Cashier;

import BUS.ProductManagerLogic;
import BUS.ReceiptManagerLogic;
import BUS.SaleManagerLogic;
import DAL.ProductDAO;
import DTO.ProductDTO;
import DTO.ReceiptDTO;
import DTO.SaleDTO;
import GUI.Helper.DataValidator;
import static GUI.Helper.IDCaculation.FindID;
import GUI.SignInScreen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ReceiptScreen extends JFrame {
    SignInScreen Screen = new SignInScreen();
    JPanel pnlLeft, pnlRight;
    JTextField txtEmployeeID, txtCustomerPhone, txtDate, txtTotalPrice,
               txtPaymentPrice, txtChange , txtFindProduct, txtProductID, 
               txtProductName, txtProductCategory, txtProductPrice, 
               txtProductSale, txtProductTotalPrice, txtProductAmount,
               txtReceiptID, txtStorage; 
    JLabel labEmployeeName, labCustomerPhone, labDate, labReceiptDetail, 
           labTotalPrice, labTotalPriceVND, labPaymentPrice, labPaymentPriceVND,
           labChange, labChangeVND, labPaymentMethod, labProduct, labFindProduct,
           labImage, labProductID, labProductName, labProductCategory,
           labProductPrice, labProductSale, labProductTotalPrice, 
           labProductAmount, labPicture, labReceiptID, labStorage;
    JTable tabReceiptDetailData;
    JButton btnCancel, btnPayment, btnFindProduct, btnAdd, btnDelete ,btnEdit, 
            btnClear, btnCreate; 
    JComboBox cbbPayment, cbbFindProduct;
    JScrollPane pnlTable, pnlProductTable;
    DefaultTableModel tableModel;
    String[] Payment = {"Cash" , "Bank account"};
    int flag = 0;
    public ReceiptScreen(){
        this.setPreferredSize(new Dimension(1500,800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        
        ReceiptGUI();
        
        this.pack();
        this.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(rootPane,"Please enter the invoice information first!", "Attention!",  JOptionPane.INFORMATION_MESSAGE);
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
            labFindProduct.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));;
            
        txtFindProduct = new JTextField();
            txtFindProduct.setBounds( 150 , 35 , 250 , 30 );
            txtFindProduct.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtFindProduct.setEnabled(false);
            
        btnFindProduct = new JButton("Search"); 
            btnFindProduct.setBackground(Color.black);
            btnFindProduct.setForeground(Color.white);
            btnFindProduct.setBorder(null);
            btnFindProduct.setFocusable(false);
            btnFindProduct.setBounds( 410 , 35 , 70 , 29 );
            btnFindProduct.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            btnFindProduct.setEnabled(false);
        
        cbbFindProduct = new JComboBox ();
            cbbFindProduct.setBounds( 490 , 35 , 200 , 30 );
            cbbFindProduct.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));      
            cbbFindProduct.setEnabled(false);
            for(ProductDTO dto :new ProductDAO().getAllData()){
                cbbFindProduct.addItem(dto.ProductID);
            }

            
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
            
        labStorage = new JLabel("Storage:");
            labStorage.setForeground(Color.black);
            labStorage.setBounds( 300 , 590 , 240 , 30 );
            labStorage.setFont(new Font( "Jaldi" , Font.BOLD , 18 ));
            
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
            
        txtStorage = new JTextField();
            txtStorage.setBounds( 310 , 620 , 300 , 30 );
            txtStorage.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtStorage.setEnabled(false);
            
        txtProductAmount = new JTextField();
            txtProductAmount.setBounds( 310 , 480 , 300 , 30 );
            txtProductAmount.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
            txtProductAmount.setEnabled(false);
            
        btnClear = new JButton("Clear"); 
            btnClear.setBackground(Color.black);
            btnClear.setForeground(Color.white);
            btnClear.setBorder(null);
            btnClear.setFocusable(false);
            btnClear.setBounds( 5 , 725 , 100 , 30 );
            btnClear.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            btnClear.setEnabled(false);
            
        btnAdd = new JButton("Add"); 
            btnAdd.setBackground(Color.black);
            btnAdd.setForeground(Color.white);
            btnAdd.setBorder(null);
            btnAdd.setFocusable(false);
            btnAdd.setBounds( 370 , 725 , 100 , 30 );
            btnAdd.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            btnAdd.setEnabled(false);
            
        btnEdit = new JButton("Edit"); 
            btnEdit.setBackground(Color.black);
            btnEdit.setForeground(Color.white);
            btnEdit.setBorder(null);
            btnEdit.setFocusable(false);
            btnEdit.setBounds( 475 , 725 , 100 , 30 );
            btnEdit.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            btnEdit.setEnabled(false);
            
        btnDelete = new JButton("Delete"); 
            btnDelete.setBackground(Color.red);
            btnDelete.setForeground(Color.white);
            btnDelete.setBorder(null);
            btnDelete.setFocusable(false);
            btnDelete.setBounds( 580 , 725 , 100 , 30 );
            btnDelete.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            btnDelete.setEnabled(false);
            
        pnlRight.add(labStorage);
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
        pnlRight.add(txtStorage);
        
            
        labReceiptDetail = new JLabel("ReceiptDetail:");
            labReceiptDetail.setForeground(Color.black);
            labReceiptDetail.setBounds( 700 , 5 , 240 , 30 );
            labReceiptDetail.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
        
        labTotalPrice = new JLabel("Total Price: ");
            labTotalPrice.setForeground(Color.black);
            labTotalPrice.setBounds( 850 , 585 , 250 , 30 );
            labTotalPrice.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtTotalPrice = new JTextField();;
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
            txtPaymentPrice.setText("9");
            txtPaymentPrice.setBounds( 1050 , 620 , 130 , 30 );
            txtPaymentPrice.setFont(new Font( "Jaldi" , Font.BOLD , 20 )); 
            txtPaymentPrice.setEnabled(false);
            
        labPaymentPriceVND = new JLabel("VND");
            labPaymentPriceVND.setForeground(Color.black);
            labPaymentPriceVND.setBounds( 1190 , 620 , 50 , 30 );
            labPaymentPriceVND.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        labChange = new JLabel("Change: ");
            labChange.setForeground(Color.black);
            labChange.setBounds( 850 , 655 , 250 , 30 );
            labChange.setFont(new Font( "Jaldi" , Font.BOLD , 18 )); 
            
        txtChange = new JTextField();
            txtChange.setText("");
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
            cbbPayment.setEnabled(false);
        
        btnPayment = new JButton("Payment"); 
            btnPayment.setBackground(Color.black);
            btnPayment.setForeground(Color.white);
            btnPayment.setBorder(null);
            btnPayment.setFocusable(false);
            btnPayment.setBounds( 1040 , 725 , 190 , 30 );
            btnPayment.setFont(new Font( "Jaldi" , Font.BOLD ,16 ));
            btnPayment.setEnabled(false);
        
        tableModel = new DefaultTableModel(new Object[] { "Product ID", "ProductName", "Quanlity", "Total Price" }, 0);
            
        tabReceiptDetailData = new JTable(tableModel);
            tabReceiptDetailData.setBackground(Color.white);
            tabReceiptDetailData.getTableHeader().setOpaque(false);
            tabReceiptDetailData.getTableHeader().setBackground(Color.BLACK);
            tabReceiptDetailData.getTableHeader().setForeground(Color.WHITE);
            tabReceiptDetailData.setEnabled(false);
            
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
        
            tabReceiptDetailData.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = tabReceiptDetailData.getSelectedRow();
                if (row >= 0 ){
                    int ID = Integer.parseInt((String)tabReceiptDetailData.getValueAt(row, 0));
                    ProductManagerLogic logic = new ProductManagerLogic();
                        for (ProductDTO Pdto : logic.list){
                            if(Pdto.ProductID == ID)
                            {   
                                int Price = Pdto.getProductPrice();
                                float Sale;
                                txtProductID.setText(Integer.toString(Pdto.getProductID()));
                                txtProductName.setText(Pdto.getProductName());
                                txtProductCategory.setText(Integer.toString(Pdto.getCategoryID()));
                                txtProductPrice.setText(Integer.toString(Price));
                                txtProductSale.setText("0");
//                                txtProductAmount.setText(Integer.toString((int)tabReceiptDetailData.getValueAt(row, 2)));
//                                txtProductTotalPrice.setText(Float.toString((float)tabReceiptDetailData.getValueAt(row, 3))); 
                                txtStorage.setText(Integer.toString(Pdto.getProductStorage()));
                                
                                String filename = null;
                                    filename = Pdto.ProductImage;                
                                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(labPicture.getWidth(), labPicture.getHeight(), Image.SCALE_SMOOTH));
                                    labPicture.setIcon(imageIcon);
                                    
                                SaleManagerLogic Slogic = new SaleManagerLogic();
                                for (SaleDTO Sdto : Slogic.Slist){
                                    String TID = Integer.toString(Sdto.ProductID);          
                                    if (txtProductID.getText().trim().equalsIgnoreCase(TID)){
                                        Sale = Sdto.getSaleRate();
                                        txtProductSale.setText(Float.toString(Sale));
                                    }
                                }
                            }
                        }                        
                    }
                }
            });
        
            txtPaymentPrice.addActionListener (new ActionListener () {
                public void actionPerformed(ActionEvent e) {
                    int PaymentPrice = 0;                    
                        for (int j = 0; j < tabReceiptDetailData.getRowCount(); j++){
                            int Price; 
                                Price = (int)tableModel.getValueAt(j, 3);
                            PaymentPrice = PaymentPrice + Price;
                            txtTotalPrice.setText(Integer.toString(PaymentPrice));
                        }
                    int Change = Integer.parseInt(txtPaymentPrice.getText()); 
                    int  Final = Change - PaymentPrice;
                    txtChange.setText(Float.toString(Final));        
                }
            });
        
            txtProductAmount.addActionListener (new ActionListener () {
                public void actionPerformed(ActionEvent e) {
                    int TotalPrice = 0;
                    int Price = Integer.parseInt(txtProductPrice.getText());
                    int Sale = Integer.parseInt(txtProductSale.getText());
                    int Number = Integer.parseInt(txtProductAmount.getText());
                    TotalPrice = Number * (Price - (Price * Sale));
                    txtProductTotalPrice.setText(Integer.toString(TotalPrice));
                }
            });
            
            cbbFindProduct.addActionListener (new ActionListener () {
                public void actionPerformed(ActionEvent e) {
                    int ID = Integer.parseInt(cbbFindProduct.getSelectedItem().toString());
                    ProductManagerLogic logic = new ProductManagerLogic();
                        for (ProductDTO Pdto : logic.list){
                            if(Pdto.ProductID == ID)
                            {   
                                int Price = Pdto.getProductPrice();
                                int Sale;
                                txtProductID.setText(Integer.toString(Pdto.getProductID()));
                                txtProductName.setText(Pdto.getProductName());
                                txtProductCategory.setText(Integer.toString(Pdto.getCategoryID()));
                                txtProductPrice.setText(Integer.toString(Price));
                                txtProductSale.setText("0");
                                txtProductAmount.setText("1");
                                txtProductTotalPrice.setText((Integer.toString(Price))); 
                                txtStorage.setText(Integer.toString(Pdto.getProductStorage()));
                                
                                String filename = null;
                                    filename = Pdto.ProductImage;                
                                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(labPicture.getWidth(), labPicture.getHeight(), Image.SCALE_SMOOTH));
                                    labPicture.setIcon(imageIcon);
                                    
                                SaleManagerLogic Slogic = new SaleManagerLogic();
                                for (SaleDTO Sdto : Slogic.Slist){
                                    String TID = Integer.toString(Sdto.ProductID);          
                                    if (txtProductID.getText().trim().equalsIgnoreCase(TID)){
                                        Sale = Sdto.getSaleRate();
                                        txtProductSale.setText(Integer.toString(Sale));
                                        int Total = Price -( Price * Sale / 100);
                                        txtProductTotalPrice.setText(Integer.toString(Total)); 
                                        break;
                                    }
                                }
                            }
                        }
                }
            });
        
            btnAdd.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Add products to the invoice?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        // Kiểm tra xem có thông tin sản phẩm đang chọn không
                        if (txtProductID.getText().isEmpty() == true ){
                            JOptionPane.showMessageDialog(rootPane, "Please choose the product!" , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        // Kiểm tra số lượng sản phẩm 
                        DataValidator.validateTextEmpty(txtProductAmount, sb, "Please enter purchase quantity!" );
                        if ( sb.length() > 0){
                            JOptionPane.showMessageDialog(rootPane, "Make sure you have entered the correct information!", "Information is wrong or missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        String ProductID = txtProductID.getText() ;
                        String ProductName = txtProductName.getText();
                        String ProductQuantity = txtProductAmount.getText();
                        int ProductPrice = Integer.parseInt(txtProductPrice.getText());
                        //String ProductPrice = txtProductTotalPrice.getText();
                        int ProductTotalPrice = Integer.parseInt(txtProductAmount.getText())*ProductPrice;
                        if ( tabReceiptDetailData.getRowCount() != 0){ 
                            int Tflag = 0;
                            for (int i = 0; i < tabReceiptDetailData.getRowCount(); i++){
                                if ( tableModel.getValueAt( i , 0).equals(ProductID)){
                                    int Number = Integer.parseInt(txtProductAmount.getText()) + Integer.parseInt((String)tableModel.getValueAt( i , 2));
                                    int TxtPrice = Integer.parseInt(txtProductTotalPrice.getText());
                                    int TabPrice = Integer.parseInt((String)tableModel.getValueAt( i , 3));
                                    int Total = TxtPrice + TabPrice;
                                    tableModel.removeRow(i);
                                    tableModel.addRow(new Object[]{ProductID, ProductName, Number, Total});
                                    Tflag = 1;
                                    break;
                                    
                                }
                            }
                            
                            if (Tflag == 0){
                                tableModel.addRow(new Object[]{ProductID, ProductName, ProductQuantity, ProductTotalPrice});
                                
                            }
                            Tflag = 0;
                        } else {
                            tableModel.addRow(new Object[]{ProductID, ProductName, ProductQuantity, ProductTotalPrice});
                        }
                        int totalPrice = 0;
                        Vector<Vector> a = tableModel.getDataVector();
                        Iterator<Vector> it = a.iterator();
                        while(it.hasNext()){
                            Vector i = it.next();
                            totalPrice = totalPrice + (int)i.get(3);
                        }
                        txtTotalPrice.setText(Integer.toString(totalPrice));

                        
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
                        StringBuilder sb = new StringBuilder();
                        // Kiểm tra xem có thông tin sản phẩm đang chọn không
                        if (txtProductID.getText().isEmpty() == true ){
                            JOptionPane.showMessageDialog(rootPane, "Please choose the product!" , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        // Kiểm tra số lượng sản phẩm 
//                        DataValidator.validateTextEmpty(txtProductAmount, sb, "Please enter purchase quantity!" );
//                        if ( sb.length() > 0 || Integer.parseInt(txtPaymentPrice.getText()) > 0  ){
//                            JOptionPane.showMessageDialog(rootPane, "Make sure you have entered the correct informatio!", "Information is wrong or missing!",  JOptionPane.INFORMATION_MESSAGE);
//                            return;
//                        }
                        String ProductID = txtProductID.getText() ;
                        Vector<Vector> a = tableModel.getDataVector();
                        int flag = -1;
                        Iterator<Vector> it = a.iterator(); 
                        while(it.hasNext()) {
                            Vector i = it.next();
                            if (i.get(0)==Integer.valueOf(ProductID)){
                                break;
                            }
                            else
                                flag++;
                        }
                        tableModel.removeRow(flag);
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
                        StringBuilder sb = new StringBuilder();
                        // Kiểm tra xem có thông tin sản phẩm đang chọn không
                        if (txtProductID.getText().isEmpty() == true ){
                            JOptionPane.showMessageDialog(rootPane, "Please choose the product!" , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        // Kiểm tra số lượng sản phẩm 
                        DataValidator.validateTextEmpty(txtProductAmount, sb, "Please enter purchase quantity!" );
                        if ( sb.length() > 0 || Integer.parseInt(txtPaymentPrice.getText()) > 0  ){
                            JOptionPane.showMessageDialog(rootPane, "Make sure you have entered the correct informatio!", "Information is wrong or missing!",  JOptionPane.INFORMATION_MESSAGE);
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
                        ProductManagerLogic logic = new ProductManagerLogic();
                        for (ProductDTO Pdto : logic.list){
                            if(Pdto.ProductName.contains(txtFindProduct.getText().trim()))
                            {   
                                int Price = Pdto.getProductPrice();
                                int Sale;
                                txtProductID.setText(Integer.toString(Pdto.getProductID()));
                                txtProductName.setText(Pdto.getProductName());
                                txtProductCategory.setText(Integer.toString(Pdto.getCategoryID()));
                                txtProductPrice.setText(Integer.toString(Price));
                                txtProductSale.setText("0");
                                txtProductAmount.setText("1");
                                txtProductTotalPrice.setText((Integer.toString(Price))); 
                                txtStorage.setText(Integer.toString(Pdto.getProductStorage()));
                                
                                String filename;
                                    filename = Pdto.ProductImage;                
                                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(labPicture.getWidth(), labPicture.getHeight(), Image.SCALE_SMOOTH));
                                    labPicture.setIcon(imageIcon);
                                    
                                txtProductAmount.setText("1");
                                SaleManagerLogic Slogic = new SaleManagerLogic();
                                for (SaleDTO Sdto : Slogic.Slist){
                                    String ID = Integer.toString(Sdto.ProductID);          
                                    if (txtProductID.getText().trim().equalsIgnoreCase(ID)){
                                        Sale = Sdto.getSaleRate();
                                        txtProductSale.setText(Float.toString(Sale));
                                        int Total = Price -( Price * Sale );
                                        txtProductTotalPrice.setText(Float.toString(Total));
                                        break;
                                    }
                                }
                           }
                        }
                    }
            });
            
            
            btnPayment.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        if ( JOptionPane.showConfirmDialog(rootPane,"Complete payment?","Confirm",JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
                            return;
                        }
                        // Kiểm tra có nhập tiền trả chưa ko
                        StringBuilder sb = new StringBuilder();
                        DataValidator.validateTextEmpty(txtPaymentPrice, sb, "Please enter the amount the customer paid!" );
                        if ( sb.length() > 0 || Integer.parseInt(txtPaymentPrice.getText()) < 0  ){
                            JOptionPane.showMessageDialog(rootPane, sb.toString() , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        // Kiểm tra bảng có sản phẩm ko
                        if ( tabReceiptDetailData.getRowCount() <= 0 ){
                            JOptionPane.showMessageDialog(rootPane, "No product!" , "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        ReceiptManagerLogic logic = new ReceiptManagerLogic();
                        logic.dto.ReceiptID = Integer.parseInt(txtReceiptID.getText());
                        logic.dto.ReceiptDate = txtDate.getText();
                        logic.dto.ReceiptCustomerPhone = txtCustomerPhone.getText();
                        logic.dto.ReceiptPayment = (String)cbbPayment.getSelectedItem();
                        logic.dto.ReceiptTotalPrice = Integer.parseInt(txtTotalPrice.getText());;
                        logic.dto.EmployeeID = Integer.parseInt(txtEmployeeID.getText());;

                        logic.Edit();
                        JOptionPane.showMessageDialog(rootPane, "Done!" , "Done!",  JOptionPane.INFORMATION_MESSAGE);   
                        
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
        labPicture.setIcon(null);
        txtStorage.setText("");
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
            
        txtEmployeeID = new JTextField();
            txtEmployeeID.setText(Integer.toString(Screen.EmployeeID));
            txtEmployeeID.setBounds( 10 , 35 , 230 , 30 );
            txtEmployeeID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtEmployeeID.setForeground(Color.black);
            txtEmployeeID.setBorder(null);
            txtEmployeeID.setEnabled(false);
            
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
            txtReceiptID.setBounds( 10 , 235 , 230 , 30 );
            txtReceiptID.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtReceiptID.setForeground(Color.black);
            txtReceiptID.setBorder(null);    

            
        btnCreate = new JButton("Create");  
            btnCreate.setBackground(Color.white);
            btnCreate.setForeground(Color.black);
            btnCreate.setBorder(null);
            btnCreate.setFocusable(false);
            btnCreate.setBounds( 10 , 280 , 230 , 30 );
            btnCreate.setFont(new Font( "Jaldi" , Font.BOLD ,16 )); 
            
            btnCreate.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        StringBuilder sb = new StringBuilder();
                        // Kiểm tra các thông tin hóa đơn đã được nhập vào chưa
                        DataValidator.validateTextEmpty(txtCustomerPhone , sb, "The customer's phone number cannot be left blank!");
                        DataValidator.validateTextEmpty(txtDate, sb, "Date cannot be blank!");
                        if (sb.length()>0){
                            JOptionPane.showMessageDialog(rootPane,sb.toString(), "Information is missing!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }

                        ReceiptManagerLogic logic = new ReceiptManagerLogic();
                        int idEmployee, idReceipt;
                        idEmployee = Integer.parseInt(txtEmployeeID.getText());
                        String number = txtCustomerPhone.getText().trim();
                        String date = txtDate.getText().trim();
                        idReceipt = Integer.parseInt(txtReceiptID.getText());
                        logic.dto.EmployeeID = idEmployee;
                        logic.dto.ReceiptCustomerPhone = number;
                        logic.dto.ReceiptDate = date;
                        logic.dto.ReceiptID = idReceipt;
                        logic.dto.ReceiptPayment = "None";
                        logic.dto.ReceiptTotalPrice = 0;
                        
                        int Tflag = 1;
                        for (ReceiptDTO Edto : logic.list){
                            String ID = Integer.toString(Edto.ReceiptID);          
                            if (txtReceiptID.getText().trim().equalsIgnoreCase(ID)){
                                Tflag = 0;
                                break;
                            }
                        }
                        if(Tflag == 1) {
                            logic.Add();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "The ID matches the product already in the database!" , "Information is wrong!",  JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        
                        JOptionPane.showMessageDialog(rootPane, "New invoice created successfully!", "Success!",  JOptionPane.INFORMATION_MESSAGE);
                        flag = 1;
                        
                        txtDate.setEnabled(false);
                        txtCustomerPhone.setEnabled(false);
                        btnCreate.setEnabled(false);
                        txtEmployeeID.setEnabled(false);
                        txtProductAmount.setEnabled(true);
                        txtFindProduct.setEnabled(true);
                        txtPaymentPrice.setEnabled(true);
                        btnFindProduct.setEnabled(true);
                        btnAdd.setEnabled(true);
                        btnDelete.setEnabled(true);
                        btnEdit.setEnabled(true);
                        btnClear.setEnabled(true);
                        btnPayment.setEnabled(true);
                        cbbFindProduct.setEnabled(true);
                        cbbPayment.setEnabled(true);
                        tabReceiptDetailData.setEnabled(true);
                        txtReceiptID.setEnabled(false);
                        
                    }
                });  
            
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
                        if ( flag == 1 ){
                            ReceiptManagerLogic logic = new ReceiptManagerLogic();
                            logic.dto.ReceiptID = Integer.parseInt(txtReceiptID.getText());
                            logic.Remove();
                            JOptionPane.showMessageDialog(rootPane, "Delete invoice successfully!", "Success!",  JOptionPane.INFORMATION_MESSAGE);
                        }
                        flag = 0;
                        new CashierScreen();
                        dispose();
                    }
                });  
            
        pnlLeft.add(labCustomerPhone);
        pnlLeft.add(labEmployeeName);
        pnlLeft.add(labDate);
        pnlLeft.add(btnCreate);
        pnlLeft.add(txtDate);
        pnlLeft.add(txtEmployeeID);
        pnlLeft.add(txtCustomerPhone);
        pnlLeft.add(txtReceiptID);
        pnlLeft.add(labReceiptID);
        pnlLeft.add(btnCancel);
        this.add(pnlLeft);
        Screen.dispose();
    }
    
}
