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
public class CoNguoiyeu extends Hoivien {

    private String tennguoiyeu, sodienthoaiNguoiyeu;

    @Override
    public void hien() {
        super.hien(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ten nguoi yeu: " + tennguoiyeu);
        System.out.println("So dien thoai: " + sodienthoaiNguoiyeu);
    }

    public CoNguoiyeu(String tenNguoiyeu, String sodienthoaiNguoiyeu, String hoten, String diachi) {
        super(hoten, diachi);
        this.tennguoiyeu = tenNguoiyeu;
        this.sodienthoaiNguoiyeu = sodienthoaiNguoiyeu;
    }

    public String getTenNguoiyeu() {
        return tennguoiyeu;
    }

    public void setTenNguoiyeu(String tenNguoiyeu) {
        this.tennguoiyeu = tenNguoiyeu;
    }

    public String getSodienthoaiNguoiyeu() {
        return sodienthoaiNguoiyeu;
    }

    public void setSodienthoaiNguoiyeu(String sodienthoaiNguoiyeu) {
        this.sodienthoaiNguoiyeu = sodienthoaiNguoiyeu;
    }

}
