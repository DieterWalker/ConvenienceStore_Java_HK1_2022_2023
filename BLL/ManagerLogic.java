package BLL;

import DTO.DTO;
import GUI.ManagerScreen;
import java.util.List;

public abstract class ManagerLogic {
    protected List<? extends DTO> list;
    
    public abstract void createNew();
    
    public abstract void edit(int index);

    public abstract void remove(int index);

    public abstract List<? extends DTO> getList();
}
