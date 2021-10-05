/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_QLS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Sach {

    private ArrayList<Sach> list = new ArrayList<>();
    private static int number = 100000;
    private int MaSach;
    private String TenSach;
    private String TacGia;
    private String ChuyenNganh;
    private int NamXuatBan;
    Scanner sc = new Scanner(System.in);

    public Sach() {
        super();
        this.MaSach = number++;

    }

    public ArrayList<Sach> getList() {
        return list;
    }

    public void setList(ArrayList<Sach> list) {
        this.list = list;
    }

  

    public Sach(String TenSach, String TacGia, String ChuyenNganh, int NamXuatBan) {
        this.MaSach = number++;
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TacGia = TacGia;
        this.ChuyenNganh = ChuyenNganh;
        this.NamXuatBan = NamXuatBan;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Sach.number = number;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public String toString() {
        return "Sach{" + "MaSach=" + MaSach + ", TenSach=" + TenSach + ", TacGia=" + TacGia + ", ChuyenNganh=" + ChuyenNganh + ", NamXuatBan=" + NamXuatBan + '}';
    }

    public void nhapSach() {

        System.out.println("nhap so luong");
        int sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {
//                       System.out.println("Moi ban nhap ma sach: ");
//        MaSach = sc.nextInt();
            sc.nextLine();
            System.out.println("Moi ban nhap ten sach: ");
            TenSach = sc.nextLine();
            System.out.println("Moi ban nhap tac gia: ");
            TacGia = sc.nextLine();
            String ChuyenNganh = "";
            do {
                System.out.println("Moi ban nhap chuyen nganh(1 Khoa hoc tu nhien. 2.Van hoc-Nghe Thuat, 3.Dien tu vien thong, 4.CNTT): ");
                String nhap = sc.nextLine();
                boolean nhapLoaiSach = false;
                switch (nhap.charAt(0)) {
                    case '1':
                        ChuyenNganh = "Khoa hoc - Tu Nhien";
                        nhapLoaiSach = true;
                        break;
                      case '2':
                        ChuyenNganh = "Van hoc - Nghe Thuat";
                        nhapLoaiSach = true;
                        break;
                         case '3':
                        ChuyenNganh = "Dien tu - Vien thong";
                        nhapLoaiSach = true;
                        break;
                         case '4':
                        ChuyenNganh = "CNTT";
                        nhapLoaiSach = true;
                        break;
                }
                if(nhapLoaiSach){
                    break;
                }
            } while (true);

            System.out.println("Moi ban nhap nam xuat ban: ");
            NamXuatBan = sc.nextInt();
            list.add(new Sach(TenSach, TacGia, ChuyenNganh, NamXuatBan));

        }

    }

    public void xuatSach() {
        list.forEach((s) -> {
            System.out.println(s);
        });
    }

}
