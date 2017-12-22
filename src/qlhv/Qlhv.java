/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pham Khanh Ha
 */
public class Qlhv {

    /**
     * @param args the command line arguments
     */
    ArrayList<Hoivien> arrHoivien = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        Qlhv qlhv = new Qlhv();
        int tieptuc = 1;
        while (tieptuc != 0) {
            int luachon = qlhv.menu();
            switch (luachon) {
                case 0://thoat khoi chuong trinh
                    return;
                case 1:
                    qlhv.nhapMotHoivien();
                    break;
                case 2:
                    qlhv.hienDanhsachHoivienConguoiyeu();
                    break;
                case 3:
                    qlhv.timkiem();
                    break;
                case 4:
                    qlhv.hienDanhsachHoivien();
                    break;
                default:
                    System.out.println("Bạn đã sai thao tác");
            }//switch
            System.out.println("\n++++++++++\nTiếp tục(0/1)?");
            tieptuc = new Scanner(System.in).nextInt();
        }//while
    }

    public int menu() {
        System.out.println("\n-----o0o-----");
        System.out.println("0.Thoat");
        System.out.println("1.Nhap hoi vien");
        System.out.println("2.Danh sach hoi vien co nguoi yeu");
        System.out.println("3.Danh sach hoi vien co ngay cuoi '11.11.2011'");
        System.out.println("4.Danh sach hoi vien");
        System.out.print("Hay chon: ");
        int luachon = new Scanner(System.in).nextInt();
        return luachon;
    }//menu

    public void nhapMotHoivien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------\nNhap thong tin hoi vien");
        System.out.println("Ho ten: ");
        String hoten = sc.nextLine();
        System.out.println("Dia chi: ");
        String diachi = sc.nextLine();
        System.out.println("Hay chon: 1.Co gia dinh, 2. co nguoi yeu, 3. Khac");
        int luachon = new Scanner(System.in).nextInt();
        Hoivien hoivien = null;
        switch (luachon) {
            case 1:
                System.out.println("Nhap ten vo: ");
                String tenvo = sc.nextLine();
                System.out.println("Ngay cuoi: ");
                String ngaycuoi = sc.nextLine();
                hoivien = new CoGiadinh(tenvo, ngaycuoi, hoten, diachi);
                break;
            case 2:
                System.out.println("Nhap ten nguoi yeu: ");
                String tennguoiyeu = sc.nextLine();
                System.out.println("So dien thoai nguoi yeu: ");
                String sodienthoainguoiyeu = sc.nextLine();
                hoivien = new CoNguoiyeu(tennguoiyeu, sodienthoainguoiyeu, hoten, diachi);
                break;
            default:
                hoivien = new Hoivien(hoten, diachi);
        }//switch
        arrHoivien.add(hoivien);
    }//nhapMotHoivien

    public void hienDanhsachHoivienConguoiyeu() {
        if (arrHoivien.size() < 1) {
            System.out.println("Không có hội viên nào trong danh sách");
            return;
        }
        System.out.println("\n************Danh sach hoi vien co nguoi yeu***********");
        for (int i = 0; i < arrHoivien.size(); i++) {
            if (arrHoivien.get(i) instanceof CoNguoiyeu) {
                arrHoivien.get(i).hien();
            }
        }//for
    }//hienDanhsachHoivienConguoiyeu

    public void hienDanhsachHoivien() {
        if (arrHoivien.size() < 1) {
            System.out.println("Không có hội viên nào trong danh sách");
            return;
        }
        System.out.println("\n************Danh sach hoi vien***********");
        for (int i = 0; i < arrHoivien.size(); i++) {
            arrHoivien.get(i).hien();
        }//for
    }//hienDanhsachHoivien

    public void timkiem() {
        System.out.println("\n*************danh sach hoi vien co ngay cuoi '11.11.2011'*************");
        for (int i = 0; i < arrHoivien.size(); i++) {
            if (arrHoivien.get(i) instanceof CoGiadinh && ((CoGiadinh) arrHoivien.get(i)).getNgaycuoi().equals("11.11.2011")) {
                arrHoivien.get(i).hien();
            }
        }
    }//timkiem
}
