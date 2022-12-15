/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Manager.Panel;

import BUS.ReceiptManagerLogic;
import DAL.ReceiptDAO;
import DTO.ReceiptDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ReceiptPanel extends MyPanel{
    JTable tabReceipt;
    DefaultTableModel tableModel; 
    JScrollPane pnlTable;
    JLabel labReceipt;
    JButton btnSearch;
    JTextField txtSearch;
    
    public ReceiptPanel(){
        super();
        GUI();
        Show();
    }
   
    public void GUI(){ 
        this.setBounds(0,0,1350,800);
        this.setVisible(true);
        this.setLayout(null);
        
        labReceipt = new JLabel("RECEIPT DETAIL");
            labReceipt.setForeground(Color.black);
            labReceipt.setBounds( 5 , 5 , 240 , 30 );
            labReceipt.setFont(new Font( "Jaldi" , Font.BOLD , 20 ));
        
        btnSearch = new JButton("Search");
            btnSearch.setBackground(Color.black);
            btnSearch.setForeground(Color.WHITE);
            btnSearch.setBorder(null);
            btnSearch.setFocusable(false);
            btnSearch.setBounds( 1220 , 5 , 100 , 29 );
            btnSearch.setFont(new Font( "Jaldi" , Font.BOLD ,20 ));     
            
        txtSearch = new JTextField();
            txtSearch.setBounds( 700 , 5 , 515 , 30 );
            txtSearch.setFont(new Font( "Jaldi" , Font.BOLD , 16 ));
            txtSearch.setForeground(Color.black);
            
        tableModel = new DefaultTableModel(new Object[] {"Receipt ID", "Employee ID", "Customer Phone" ,"Date", "Total Price", "Payment" }, 0); 
            
        tabReceipt= new JTable(tableModel);
            tabReceipt.setBackground(Color.white);
            tabReceipt.getTableHeader().setOpaque(false);
            tabReceipt.getTableHeader().setBackground(Color.BLACK);
            tabReceipt.getTableHeader().setForeground(Color.WHITE);
            
        pnlTable = new JScrollPane(tabReceipt);
            pnlTable.setBounds( 5 , 35 , 1325 , 720);
            
        this.add(pnlTable);
        this.add(labReceipt);
        this.add(txtSearch);
        this.add(btnSearch);
        
        btnSearch.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent e) {
                        ReceiptManagerLogic logic = new ReceiptManagerLogic();
                        ArrayList<ReceiptDTO> list = new ArrayList<ReceiptDTO>();
                        for (ReceiptDTO Pdto : logic.list){
                            int ID = Integer.parseInt(txtSearch.getText());
                            if(Pdto.EmployeeID == ID)
                                list.add(Pdto);
                        }
                        tableModel.setRowCount(0);
                        for(ReceiptDTO dto : list){
                            tableModel.addRow(new Object[]{dto.getReceiptID(), dto.getEmployeeID(), dto.getReceiptCustomerPhone()
                                , dto.getReceiptDate(), dto.getReceiptTotalPrice(), dto.getReceiptPayment()});
                        }
                        ReturnWhite();
                    }
            });
    }
    
    @Override
    public void Show(){
        tableModel.setRowCount(0);
        for(ReceiptDTO dto :new ReceiptDAO().getAllData()){
            tableModel.addRow(new Object[]{dto.getReceiptID(), dto.getEmployeeID(), dto.getReceiptCustomerPhone()
                                , dto.getReceiptDate(), dto.getReceiptTotalPrice(), dto.getReceiptPayment()});
        }  
    }
}
