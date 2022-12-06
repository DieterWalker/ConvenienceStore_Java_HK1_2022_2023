package BUS;

import DAL.CategoryDAO;
import DTO.CategoryDTO;
import DTO.DTO;
import java.util.List;

public class CategoryManagerLogic extends ManagerLogic {
    private CategoryDTO dto;
    private boolean edited;

    public CategoryManagerLogic() {
          list = new CategoryDAO().getAllData();
          System.out.println(list.size());
    }

    @Override
    public void Add() {
       new CategoryDAO().insertItem(dto);
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
    
}
