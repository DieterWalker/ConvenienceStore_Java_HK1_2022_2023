package DAL;

import DTO.DTO;
import DTO.EmployeeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO extends DAO{
    public EmployeeDAO(){
        getAllSQL = "select * " +
                    "from EMPLOYEE ";
        insertSQL = "insert into EMPLOYEE (EmployeeID, EmployeeName,  EmployeeImage, EmployeeGender, EmployeeAddress, EmployeePhone, EmployeeWage) " +
                    "values (?, ?, ?, ?, ?, ?, ?)";
        updateSQL = "update EMPLOYEE " +
                    "set EmployeeName = ?, " +
                        "EmployeeImage = ?, " +
                        "EmployeeGender = ?, " +
                        "EmployeeAddress = ?," +
                        "EmployeePhone = ?, " +
                        "EmployeeWage = ? " +
                    "where EmployeeID = ?";
        deleteSQL = "delete EMPLOYEE " +
                    "where EmployeeID = ?";
    }

    @Override
    public ArrayList<EmployeeDTO> getAllData() {
        ArrayList<EmployeeDTO> list = new ArrayList<>();
        try {
            pstm = DAO.con.prepareStatement(getAllSQL);
            pstm.execute();
            rs = pstm.getResultSet();
            while (super.rs.next()){
                EmployeeDTO Employeedto = new EmployeeDTO();
                Employeedto.retriveData(super.rs);
                list.add(Employeedto);
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
            pstm.setInt(1,((EmployeeDTO) dto).getEmployeeID());
            pstm.setString(2,((EmployeeDTO) dto).getEmployeeName());
            pstm.setString(3,((EmployeeDTO) dto).getEmployeeImage());
            pstm.setString(4,((EmployeeDTO) dto).getEmployeeGender());
            pstm.setString(5,((EmployeeDTO) dto).getEmployeeAddress());
            pstm.setString(6,((EmployeeDTO) dto).getEmployeePhone());
            pstm.setInt(7,((EmployeeDTO) dto).getEmployeeWage());
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
            pstm.setString(1,((EmployeeDTO) dto).getEmployeeName());
            pstm.setString(2,((EmployeeDTO) dto).getEmployeeImage());
            pstm.setString(3,((EmployeeDTO) dto).getEmployeeGender());
            pstm.setString(4,((EmployeeDTO) dto).getEmployeeAddress());
            pstm.setString(5,((EmployeeDTO) dto).getEmployeePhone());
            pstm.setInt(6,((EmployeeDTO) dto).getEmployeeWage());
            pstm.setInt(7,((EmployeeDTO) dto).getEmployeeID());
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
            pstm.setInt(1,((EmployeeDTO) dto).getEmployeeID());
            flag = pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}

