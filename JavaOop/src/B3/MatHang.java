/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MatHang {

    Scanner sc = new Scanner(System.in);
    ArrayList<MatHang> listMh = new ArrayList<>();
    int number = 1000;
    private int maHang;
    private String tenHang;
    private String nhomHang;
    private Double giaBan;

    public MatHang() {
        super();
        this.maHang = number++;
    }

    public MatHang( String tenHang, String nhomHang, Double giaBan) {
        this.maHang = number++;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaBan = giaBan;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public ArrayList<MatHang> getListMh() {
        return listMh;
    }

    public void setListMh(ArrayList<MatHang> listMh) {
        this.listMh = listMh;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(String nhomHang) {
        this.nhomHang = nhomHang;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "MatHang{" + ", maHang=" + maHang + ", tenHang=" + tenHang + ", nhomHang=" + nhomHang + ", giaBan=" + giaBan + '}';
    }

    public void nhapMatHang() {
        System.out.print("Moi ban nhap so luong mat hang:");
        int sl = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < sl; i++) {
            System.out.print("Moi ban nhap ten mat hang:");
            String ten = sc.nextLine();
//            sc.nextLine();
            System.out.print("Moi ban nhap nhom hang:");
            String nh = sc.nextLine();
            System.out.print("Moi ban nhap gia ban :");
            Double giaban = sc.nextDouble();
//            nhomHang = "";
            do {

                System.out.print("Moi ban chon nhom hang(1.Hang Thoi Trang,2.Hang Tieu Dung,3.Hang Dien May,4.Hang Gia Dung): ");
                String nhap = sc.next();
                boolean nhapNhomHangOk = false;
                switch (nh.charAt(0)) {
                    case '1':
                        nh = "Hang thoi trang";
                        nhapNhomHangOk = true;
                        break;
                    case '2':
                        nh = "Hang tieu dung";
                        nhapNhomHangOk = true;
                        break;
                    case '3':
                        nh = "Hang dien may";
                        nhapNhomHangOk = true;
                        break;
                    case '4':
                        nh = "Hang gia dung";
                        nhapNhomHangOk = true;
                        break;

                }
                if(nhapNhomHangOk){
                break;
                }

            } while (true);
            listMh.add(new MatHang( ten, nh, giaban));
        }
    }
    public void xuatMh(){
        System.out.println(listMh);
    }

}
