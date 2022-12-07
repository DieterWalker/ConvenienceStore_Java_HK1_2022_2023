/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;


import DTO.DTO;
import DTO.SaleDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SaleDAO extends DAO {
       public SaleDAO(){
            getAllSQL = "select SaleID, ProductID, SaleName, SaleRate" +
                        "from SALE";

            insertSQL = "insert into SALE (SaleID, ProductID, SaleName, SaleRate) " +
                        "values (?,?,?,?) ";

            deleteSQL = "delete from SALE" +
                        "where SaleID = ? ";

            updateSQL = "update SALE " +
                        "set ProductID = ?, " + 
                        "    SaleName = ?, " +
                        "    SaleRate = ?, " +
                        "where SaleID = ? ";
    }

    @Override
    public ArrayList<SaleDTO> getAllData() {
        ArrayList<SaleDTO> list = new ArrayList<>();
        try {
            pstm = DAO.con.prepareStatement(getAllSQL);
            pstm.execute();
            rs = pstm.getResultSet();
            while (super.rs.next()){
                SaleDTO dto = new SaleDTO();
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
            pstm.setInt(1,((SaleDTO) dto).getSaleID());
            pstm.setInt(2,((SaleDTO) dto).getProductID());
            pstm.setString(3,((SaleDTO) dto).getSaleName());
            pstm.setFloat(4,((SaleDTO) dto).getSaleRate());
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
            pstm.setInt(1,((SaleDTO) dto).getProductID());
            pstm.setString(2,((SaleDTO) dto).getSaleName());
            pstm.setFloat(3,((SaleDTO) dto).getSaleRate());
            pstm.setInt(4,((SaleDTO) dto).getSaleID());
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
            pstm.setInt(1,((SaleDTO) dto).getSaleID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
