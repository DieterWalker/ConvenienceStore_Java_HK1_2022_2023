/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.ProductDAO;
import DTO.ProductDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
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

    }

    @Override
    public void Remove () {
    }
}
