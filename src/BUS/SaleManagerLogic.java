/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.SaleDAO;
import DTO.SaleDTO;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SaleManagerLogic implements ManagerLogic {
    public ArrayList<SaleDTO> list = new ArrayList<SaleDTO>();
    public SaleDTO dto = new SaleDTO();
    private boolean edited;

    public SaleManagerLogic() {
          list = new SaleDAO().getAllData();
          System.out.println(list.size());
    }

    @Override
    public void Add() {
       new SaleDAO().insertItem(dto);
    }

    @Override
    public void Edit() {
        new SaleDAO().updateItem(dto);
    }

    @Override
    public void Remove () {
        new SaleDAO().deleteItem(dto);
    }
}
