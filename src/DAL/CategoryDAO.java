package DAL;

import DTO.CategoryDTO;
import DTO.DTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryDAO extends DAO{

    public CategoryDAO(){
        getAllSQL = "select CategoryID, CategoryName " +
                    "from CATEGORY";
        
        insertSQL = "insert into CATEGORY(CategoryName) " +
                    "values (?) ";
        
        deleteSQL = "delete from CATEGORY " +
                    "where CategoryID = ? ";
        
        updateSQL = "update CATEGORY " +
                    "set CategoryName = ? " +
                    "where CategoryID = ? ";
    }

    @Override
    public ArrayList<CategoryDTO> getAllData() {
        ArrayList<CategoryDTO> list = new ArrayList<>();
        try {
            pstm = DAO.con.prepareStatement(getAllSQL);
            pstm.execute();
            rs = pstm.getResultSet();
            while (super.rs.next()){
                CategoryDTO categoryDTO = new CategoryDTO();
                categoryDTO.retriveData(super.rs);
                list.add(categoryDTO);
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
            pstm.setString(1,((CategoryDTO) dto).getCategoryName());
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
            pstm.setInt(1,((CategoryDTO) dto).getCategoryID());
            pstm.setString(2,((CategoryDTO) dto).getCategoryName());
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
            pstm.setInt(1,((CategoryDTO) dto).getCategoryID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
