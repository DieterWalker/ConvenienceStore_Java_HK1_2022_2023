package BLL;

import DAL.EmployeeDAO;
import DTO.DTO;
import DTO.EmployeeDTO;
import GUI.InputFrom.EmployeeInput;
import GUI.ManagerScreen;


import java.util.List;

public class EmployeeManagerLogic extends ManagerLogic{
    EmployeeInput inputForm;
   
    private EmployeeDTO currentEmployee;
    private boolean edited;

    public EmployeeManagerLogic() {
          //list = new CustomerDAO().getAllData();
//        System.out.println(list.size());
    }

    public void createNewEmployee(){
       currentEmployee = inputForm.getData();
    };

    @Override
    public void createNew() {
        inputForm = new EmployeeInput(this);
        edited = false;
    }

    @Override
    public void edit(int index) {
        inputForm = new EmployeeInput(this);
        System.out.println(list.size());
        inputForm.setData( new EmployeeDAO().getAllData().get(index));
        edited = true;
    }

    public void setCurrentEmployee(EmployeeDTO dto){
        this.currentEmployee = dto;
        if(edited){
            new EmployeeDAO().updateItem(dto);
        }else{
            new EmployeeDAO().insertItem(dto);
        }
    }

    @Override
    public void remove(int index) {
        list = new EmployeeDAO().getAllData();
        new EmployeeDAO().deleteItem(list.remove(index));
    }

    @Override
    public List<? extends DTO> getList() {
        return null;
    }
}        

