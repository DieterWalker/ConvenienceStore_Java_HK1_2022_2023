package GUI.Table;

import DAL.EmployeeDAO;
import DTO.EmployeeDTO;

public class CategoryTable {

public class EmployeeTable extends MyTable  {
    public EmployeeTable(){
        super();
        initGUI();
    }

    private void initGUI() {
        this.addColumn("ID");
        this.addColumn("Name");
    }

    @Override
    public void show() {
        while(getRowCount()>0){
            removeRow(0);
        }
        for(EmployeeDTO dto : new CateDAO().getAllData()){
            //DateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            addRow(new String[]{
                    String.valueOf(dto.getEmployeeID()),
                    dto.getEmployeeName(),
                    dto.getEmployeeGender(),
                    dto.getEmployeeAddress(),
                    dto.getEmployeePhone(),
                    dto.getEmployeeWage()
                });
        }
    }
}


}
