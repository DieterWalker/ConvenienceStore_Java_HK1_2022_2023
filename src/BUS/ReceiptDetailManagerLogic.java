package BUS;

import DAL.ReceiptDetailDAO;
import DTO.ReceiptDetailDTO;
import java.util.ArrayList;


public class ReceiptDetailManagerLogic implements ManagerLogic {
    public ArrayList<ReceiptDetailDTO> list = new ArrayList<ReceiptDetailDTO>();
    public ReceiptDetailDTO dto = new ReceiptDetailDTO();

    public ReceiptDetailManagerLogic() {
          list = new ReceiptDetailDAO().getAllData();
          System.out.println(list.size());
    }

    @Override
    public void Add() {
       new ReceiptDetailDAO().insertItem(dto);
    }

    @Override
    public void Edit() {
        new ReceiptDetailDAO().updateItem(dto);
    }

    @Override
    public void Remove () {
        new ReceiptDetailDAO().deleteItem(dto);
    }
}


