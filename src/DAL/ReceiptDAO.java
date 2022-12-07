/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DTO;
import DTO.ReceiptDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ReceiptDAO extends DAO{
    public ReceiptDAO(){
        getAllSQL = "select *" +
                    "from RECEIPT_BILL ";
        insertSQL = "insert into RECEIPT (ReceiptID, EmployeeID, CustomPhone, ReceiptDay , ReceiptTotalPrice, ReceiptPayment) " +
                    "values (?, ?, ?, ?, ?, ?)";
        updateSQL = "update RECEIPT_BILL"   +
                    "set EmployeeID = ?, " +  
                    "    CustomPhone = ? , " +
                    "    ReceiptDay = ?, " +
                    "    ReceiptTotalPrice = ? , " +
                    "    ReceiptPayment = ?, " +
                    "where ReceiptID = ?";
        deleteSQL = "delete RECEIPT_BILL" +
                    "where ReceiptID_BILL = ?";
    }

    @Override
    public ArrayList<ReceiptDTO> getAllData() {
        ArrayList<ReceiptDTO> list = new ArrayList<>();
        try {
            pstm = DAO.con.prepareStatement(getAllSQL);
            pstm.execute();
            rs = pstm.getResultSet();
            while (super.rs.next()){
                ReceiptDTO dto = new ReceiptDTO();
                dto.retriveData(super.rs);
                list.add(dto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public boolean insertItem(DTO dto) {
        boolean flag;
        try {
            pstm = DAO.con.prepareStatement(insertSQL);
            pstm.setInt(1,((ReceiptDTO) dto).getReceiptID());
            pstm.setInt(2,((ReceiptDTO) dto).getEmployeeID());
            pstm.setString(3,((ReceiptDTO) dto).getReceiptCustomerPhone());
            pstm.setString(4,((ReceiptDTO) dto).getReceiptDate());
            pstm.setInt(5,((ReceiptDTO) dto).getReceiptTotalPrice());
            pstm.setString(6,((ReceiptDTO) dto).getReceiptPayment());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    @Override
    public boolean updateItem(DTO dto) {
        boolean flag;
        try {
            pstm = DAO.con.prepareStatement(updateSQL);

            pstm.setInt(1,((ReceiptDTO) dto).getEmployeeID());
            pstm.setString(2,((ReceiptDTO) dto).getReceiptCustomerPhone());
            pstm.setString(3,((ReceiptDTO) dto).getReceiptDate());
            pstm.setInt(4,((ReceiptDTO) dto).getReceiptTotalPrice());
            pstm.setString(5,((ReceiptDTO) dto).getReceiptPayment());            
            pstm.setInt(6,((ReceiptDTO) dto).getReceiptID());
            flag = pstm.execute();pstm.setInt(1,((ReceiptDTO) dto).getReceiptID());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return flag;
    }

    @Override
    public boolean deleteItem(DTO dto) {
        boolean flag;
        try {
            pstm = DAO.con.prepareStatement(deleteSQL);
            pstm.setInt(1,((ReceiptDTO) dto).getReceiptID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
