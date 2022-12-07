package BUS;

import DAL.CategoryDAO;
import DTO.CategoryDTO;
import java.util.ArrayList;

public class CategoryManagerLogic implements ManagerLogic {
    public ArrayList<CategoryDTO> list = new ArrayList<CategoryDTO>();
    public CategoryDTO dto = new CategoryDTO();
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
        new CategoryDAO().updateItem(dto);
    }

    @Override
    public void Remove () {
        new CategoryDAO().deleteItem(dto);
    }

    
}
