package DTO;


public class KeyDTO{
    String OldKey, NewKey;

    public KeyDTO() {
    }

    public KeyDTO(String OldKey, String NewKey) {
        this.OldKey = OldKey;
        this.NewKey = NewKey;
    }

    public String getOldKey() {
        return OldKey;
    }

    public void setOldKey(String OldKey) {
        this.OldKey = OldKey;
    }

    public String getNewKey() {
        return NewKey;
    }

    public void setNewKey(String NewKey) {
        this.NewKey = NewKey;
    }
    
}
