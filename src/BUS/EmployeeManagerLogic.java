package BUS;

import DAL.EmployeeDAO;
import DTO.DTO;
import DTO.EmployeeDTO;
import GUI.Manager.ManagerScreen;
import java.io.IOException;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeManagerLogic extends ManagerLogic{
   
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

    @Override
    public List<? extends DTO> getList() {
        return null;
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

