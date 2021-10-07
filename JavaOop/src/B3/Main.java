/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3;

import B1_QLS.BanDoc;
import B1_QLS.Sach;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    private static ArrayList<KhachHang> listKh = new ArrayList<>();
    static KhachHang kh = new KhachHang();
    static MatHang mh = new MatHang();
    static BangDanhSachMuaHang dsmh = new BangDanhSachMuaHang();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int chon;
            for (;;) {
                System.out.println("-------------------CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN---------------");
                System.out.println("1. Nhập danh sách khach hang:");
                System.out.println("2. Xuất danh sách khach hang:");
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
                        nhapKhachHang();
                        break;
                    case 2:
                        xuatDanhSachKhachHang();
                        break;
                    case 3:
                     nhapMh();
                        break;
                    case 4:
                       xuatMh();
                        break;
                    case 5:
                      quanLyMuaHang(mh.getListMh(), kh.getList());
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

    public static void nhapKhachHang() {
        kh.nhapKhachHang();

    }

    public static void xuatDanhSachKhachHang() {
        kh.xuatKh();

    }
    public static void nhapMh() {
        mh.nhapMatHang();

    }
     public static void xuatMh() {
        mh.xuatMh();

    }
     private static void quanLyMuaHang(List<MatHang> listMH, List<KhachHang> listKH) {
        dsmh.quanLyDanhSachMuaHang(listMH, listKH);
    }


    private static Scanner Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
