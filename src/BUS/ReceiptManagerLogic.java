package BUS;

import DAL.ReceiptDAO;
import DTO.ReceiptDTO;
import java.util.ArrayList;

public class ReceiptManagerLogic implements ManagerLogic {
    public ArrayList<ReceiptDTO> list = new ArrayList<ReceiptDTO>();
    public ReceiptDTO dto = new ReceiptDTO();
    private boolean edited;

    public ReceiptManagerLogic() {
          list = new ReceiptDAO().getAllData();
          System.out.println(list.size());
    }

    @Override
    public void Add() {
       new ReceiptDAO().insertItem(dto);
    }

    @Override
    public void Edit() {
        new ReceiptDAO().updateItem(dto);
    }

    @Override
    public void Remove () {
        new ReceiptDAO().deleteItem(dto);
    }
}

