/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package today.ConvenienceStore_Java_HK1_2022_2023.DTO;




/**
 *
 * @author ACER
 */
public class sanphamDTO extends DTO{
    String SPName;
    //Integer SPID, SPPhanLoai,SPSLuong,SPGia ;
    int SPID, SPPhanLoai,SPSLuong,SPGia ;

public sanphamDTO(){

}
 public sanphamDTO(String SPName, Integer SPID, Integer SPPhanLoai, Integer SPSLuong, Integer SPGia){
     this.SPGia= SPGia;
     this.SPID= SPID;
     this.SPName=SPName;
     this.SPPhanLoai=SPPhanLoai;
     this.SPSLuong=SPSLuong;
    }

    public Integer getSPGia() {
        return SPGia;
    }

    public void setSPGia(Integer SPGia) {
        this.SPGia = SPGia;
    }

    public Integer getSPID() {
        return SPID;
    }

    public void setSPID(Integer SPID) {
        this.SPID = SPID;
    }

    public String getSPName() {
        return SPName;
    }

    public void setSPName(String SPName) {
        this.SPName = SPName;
    }

    public Integer getSPPhanLoai() {
        return SPPhanLoai;
    }

    public void setSPPhanLoai(Integer SPPhanLoai) {
        this.SPPhanLoai = SPPhanLoai;
    }

    public Integer getSPSLuong() {
        return SPSLuong;
    }

    public void setSPSLuong(Integer SPSLuong) {
        this.SPSLuong = SPSLuong;
    }
 
}
