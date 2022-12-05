package BUS;

import DTO.DTO;
import GUI.Manager.ManagerScreen;
import java.util.List;

public abstract class ManagerLogic {
    protected List<? extends DTO> list;
    
    public abstract void Add();
    
    public abstract void Edit();

    public abstract void Remove();

    public abstract List<? extends DTO> getList();
}
