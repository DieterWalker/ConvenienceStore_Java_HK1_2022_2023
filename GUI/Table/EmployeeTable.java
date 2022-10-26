package GUI.Table;

import DAL.EmployeeDAO;
import DTO.EmployeeDTO;
import GUI.ManagerScreen;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EmployeeTable extends MyTable  {
    public EmployeeTable(){
        super();
        initGUI();
    }

    private void initGUI() {
        this.addColumn("ID");
        this.addColumn("Name");
        this.addColumn("Gender");
        this.addColumn("Address");
        this.addColumn("Phone");
        this.addColumn("Wage");
    }

    @Override
    public void show() {
        while(getRowCount()>0){
            removeRow(0);
        }
        for(EmployeeDTO dto : new EmployeeDAO().getAllData()){
            //DateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            addRow(new String[]{
                    String.valueOf(dto.getEmployeeID()),
                    dto.getEmployeeName(),
                    dto.getEmployeeGender(),
                    dto.getEmployeeAddress(),
                    dto.getEmployeePhone(),
                    String.valueOf(dto.getEmployeeWage())
                });
        }
    }
}

