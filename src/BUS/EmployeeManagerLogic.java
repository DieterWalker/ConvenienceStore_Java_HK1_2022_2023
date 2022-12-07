package BUS;

import DAL.EmployeeDAO;
import DTO.DTO;
import DTO.EmployeeDTO;
import java.io.IOException;
import java.util.ArrayList;



public class EmployeeManagerLogic implements ManagerLogic{
    public ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
    private EmployeeDTO currentEmployee;
    private boolean edited;

    public EmployeeManagerLogic() {
          //list = new CustomerDAO().getAllData();
//        System.out.println(list.size());
    }

    public void createNewEmployee(){
    };

    @Override
    public void Add() {
        edited = false;
    }

    @Override
    public void Edit() {

    }

    @Override
    public void Remove () {
;
    }
    public void setCurrentEmployee(EmployeeDTO dto){
        this.currentEmployee = dto;
        if(edited){
            new EmployeeDAO().updateItem(dto);

        }else{
            new EmployeeDAO().insertItem(dto);
        }
    }
}        

