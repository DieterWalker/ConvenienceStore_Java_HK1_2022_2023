package DAL;

import DTO.AccountDTO;
import DTO.CategoryDTO;
import DTO.DTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDAO extends DAO {
    public AccountDAO(){
        getAllSQL = "select AccountID, EmployeeID, AccountUsername, AccountPassword, AccountPosition" +
                    "from ACCOUNT";
        
        insertSQL = "insert into ACCOUNT ([AccountID],[EmployeeID][AccountUsername][AccountPassword][AccountPosition]) " +
                    "values (?,?,?,?,?) ";
        
        deleteSQL = "delete from ACCOUNT " +
                    "where AccountID = ? ";
        
        updateSQL = "update ACCOUNT " +
                    "set EmployeeID  = ?, " + 
                    "    AccountUsername = ?, " +
                    "    AccountPassword = ?, " +
                    "    AccountPosition = ?, " +
                    "where CategoryID = ? ";
    }

    @Override
    public ArrayList<AccountDTO> getAllData() {
        ArrayList<AccountDTO> list = new ArrayList<>();
        try {
            pstm = DAO.con.prepareStatement(getAllSQL);
            pstm.execute();
            rs = pstm.getResultSet();
            while (super.rs.next()){
                AccountDTO accountDTO = new AccountDTO();
                accountDTO.retriveData(super.rs);
                list.add(accountDTO);
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
            pstm.setInt(1,((AccountDTO) dto).getAccountID());
            pstm.setInt(2,((AccountDTO) dto).getEmployeeID());
            pstm.setString(3,((AccountDTO) dto).getUsername());
            pstm.setString(4,((AccountDTO) dto).getPassword());
            pstm.setString(5,((AccountDTO) dto).getPosition());
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
            pstm.setInt(1,((AccountDTO) dto).getAccountID());
            pstm.setInt(2,((AccountDTO) dto).getEmployeeID());
            pstm.setString(3,((AccountDTO) dto).getUsername());
            pstm.setString(4,((AccountDTO) dto).getPassword());
            pstm.setString(5,((AccountDTO) dto).getPosition());
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
            pstm.setInt(1,((AccountDTO) dto).getAccountID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
