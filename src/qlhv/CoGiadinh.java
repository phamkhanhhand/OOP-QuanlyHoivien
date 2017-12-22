/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv;

/**
 *
 * @author Pham Khanh Ha
 */
public class CoGiadinh extends Hoivien {

    private String tenvo, ngaycuoi;

    @Override
    public void hien() {
        super.hien(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ho ten vo:" + tenvo);
        System.out.println("Ngay cuoi:" + ngaycuoi);
    }

    public CoGiadinh(String tenvo, String ngaycuoi, String hoten, String diachi) {
        super(hoten, diachi);
        this.tenvo = tenvo;
        this.ngaycuoi = ngaycuoi;
    }

    public String getTenvo() {
        return tenvo;
    }

    public void setTenVo(String tenvo) {
        this.tenvo = tenvo;
    }

    public String getNgaycuoi() {
        return ngaycuoi;
    }

    public void setNgaycuoi(String ngaycuoi) {
        this.ngaycuoi = ngaycuoi;
    }

}
