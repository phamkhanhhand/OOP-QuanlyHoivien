/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv;

import java.util.Scanner;

/**
 *
 * @author Pham Khanh Ha
 */
public class Hoivien {

    private String hoten, diachi;

    public Hoivien() {
    }

    public Hoivien(String hoten, String diachi) {
        this.hoten = hoten;
        this.diachi = diachi;
    }

    public void hien() {
        System.out.println("\n---------***---------");
        System.out.println("Ten:" + hoten);
        System.out.println("Dia chi:" + diachi);
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
