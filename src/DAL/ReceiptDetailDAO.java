/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DTO;
import DTO.ReceiptDetailDTO;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class ReceiptDetailDAO extends DAO{
    public ReceiptDetailDAO(){
        getAllSQL = "select ReceiptID, ProductID, ReceiptProductNum , ReceiptPrice" +
                    "from RECEIPT_DETAIL ";
        insertSQL = "insert into RECEIPT_DETAIL(ReceiptID, ProductID, ReceiptProductNum , ReceiptPrice) " +
                    "values (?, ?, ?, ?)";
        updateSQL = "update RECEIPT_DETAIL "   +
                    "set ProductName = ? ," +  
                    "    ReceiptProductNum = ? , " +
                    "    ReceiptPrice = ?" +
                    "where ProductID = ?";
        deleteSQL = "delete RECEIPT_DETAIL" +
                    "where ProductID = ?";
    }

    @Override
    public ArrayList<ReceiptDetailDTO> getAllData() {
        ArrayList<ReceiptDetailDTO> list = new ArrayList<>();
        try {
            pstm = DAO.con.prepareStatement(getAllSQL);
            pstm.execute();
            rs = pstm.getResultSet();
            while (super.rs.next()){
                ReceiptDetailDTO dto = new ReceiptDetailDTO();
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
            pstm.setInt(1,((ReceiptDetailDTO) dto).getReceiptID());
            pstm.setInt(2,((ReceiptDetailDTO) dto).getProductID());
            pstm.setInt(3,((ReceiptDetailDTO) dto).getReceiptDetailAmount());
            pstm.setInt(4,((ReceiptDetailDTO) dto).getReceiptDetailPrice());
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
            pstm.setInt(3,((ReceiptDetailDTO) dto).getReceiptDetailAmount());
            pstm.setInt(4,((ReceiptDetailDTO) dto).getReceiptDetailPrice());
            pstm.setInt(2,((ReceiptDetailDTO) dto).getProductID());
            flag = pstm.execute();
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
            pstm.setInt(1,((ReceiptDetailDTO) dto).getProductID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}


