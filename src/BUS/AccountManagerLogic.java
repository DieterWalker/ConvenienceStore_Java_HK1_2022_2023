package BUS;

import DAL.AccountDAO;
import DTO.AccountDTO;
import java.util.ArrayList;

public class AccountManagerLogic implements ManagerLogic {
    public ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();
    public AccountDTO dto = new AccountDTO();

    public AccountManagerLogic() {
        list = new AccountDAO().getAllData();
        System.out.println(list.size());
        
    }

    @Override
    public void Add() {
       new AccountDAO().insertItem(dto);
    }

    @Override
    public void Edit() {
        new AccountDAO().updateItem(dto);
    }

    @Override
    public void Remove () {
        new AccountDAO().deleteItem(dto);
    }

}
