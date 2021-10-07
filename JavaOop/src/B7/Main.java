/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B7;


import B3.KhachHang;
import B3.MatHang;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    private static ArrayList<GiangVien> listGv = new ArrayList<>();
    static GiangVien gv = new GiangVien();
    static MonHoc mh = new MonHoc();
    static BangKeKhaiGiangDay kkdd = new BangKeKhaiGiangDay();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int chon;
            for (;;) {
                System.out.println("-------------------CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN---------------");
                System.out.println("1. Nhập danh sách giao vien: ");
                System.out.println("2. Xuất danh sach giao vien:");
                System.out.println("3. Nhập mat hang:.");
                System.out.println("4. Xuất mat hang:.");
                System.out.println("5. Quản lý mượn sách");
                System.out.println("6. Sap xep theo ten: ");
                System.out.println("7. Tim ban doc theo ten: ");
                System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
                System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
                System.out.println("10. exit");
                System.out.print("mời chọn chương trình: ");
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        nhapGV();
                        break;
                    case 2:
                        xuatDanhSachGiaoVien();
                        break;
                    case 3:
                        nhapMonHoc();
                        break;
                    case 4:
                        xuatDanhSachMonHoc();
                        break;
                    case 5:
                        quanLyKeKhaiGiangDay(gv.getListGv(), mh.getList());
                        break;
                    case 6:
//                        sapxepTheoTen();
                        break;
                    case 7:
//                        timBanDocTheoTen();
                        break;
//                    case 8:
//                        SxTheoLuong();
//                        break;
//                    case 9:
//                        top5();
//                        break;
                    case 10:
                        System.exit(0);

                }
            }

        } catch (Exception e) {
            System.out.println("lỗi" + e);
        }
    }

    public static void nhapGV() {
        gv.nhapGV();
    }

    public static void xuatDanhSachGiaoVien() {
        gv.xuatGv();

    }

    public static void nhapMonHoc() {
        mh.nhapMonHoc();

    }

    public static void xuatDanhSachMonHoc() {
                mh.xuatMonHoc();

    }

    private static void quanLyKeKhaiGiangDay(ArrayList<GiangVien> listGv, ArrayList<MonHoc> list) {
       kkdd.quanLyGiaoVien(listGv, list);
    }

 
}
