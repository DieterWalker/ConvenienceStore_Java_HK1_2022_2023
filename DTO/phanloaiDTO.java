/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;

/**
 *
 * @author ACER
 */
public class phanloaiDTO extends DTO{
    int PLTen;
    String PLName;
    
      public phanloaiDTO(String PLName,int PLTen) {
          this.PLTen = PLTen;
          this.PLName= PLName;
    }
        public phanloaiDTO() {
    }

    public String getPLName() {
        return PLName;
    }

    public int getPLTen() {
        return PLTen;
    }

    public void setPLName(String PLName) {
        this.PLName = PLName;
    }

    public void setPLTen(int PLTen) {
        this.PLTen = PLTen;
    }
        


}
