package BUS;

import DAL.CategoryDAO;
import DAL.EmployeeDAO;
import DTO.EmployeeDTO;
import java.util.ArrayList;



public class EmployeeManagerLogic implements ManagerLogic{
    public ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
    public EmployeeDTO dto = new EmployeeDTO();

    public EmployeeManagerLogic() {
        list = new EmployeeDAO().getAllData();
        System.out.println(list.size());
    }

    public void createNewEmployee(){
    };

    @Override
    public void Add() {
        new EmployeeDAO().insertItem(dto);
    }

    @Override
    public void Edit() {
        new EmployeeDAO().updateItem(dto);

    }

    @Override
    public void Remove () {
        new EmployeeDAO().deleteItem(dto);
    }
}        

