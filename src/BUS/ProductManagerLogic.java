package BUS;

import DAL.ProductDAO;
import DTO.ProductDTO;
import java.util.ArrayList;


public class ProductManagerLogic implements ManagerLogic {
    public ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
    public ProductDTO dto = new ProductDTO();
    private boolean edited;

    public ProductManagerLogic() {
          list = new ProductDAO().getAllData();
          System.out.println(list.size());
    }

    @Override
    public void Add() {
       new ProductDAO().insertItem(dto);
    }

    @Override
    public void Edit() {
        new ProductDAO().updateItem(dto);
    }

    @Override
    public void Remove () {
        new ProductDAO().deleteItem(dto);
    }
}
