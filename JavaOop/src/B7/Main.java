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
    private static double g;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            int chon;
            for (;;) {
                System.out.println("-------------------CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN---------------");
                System.out.println("1. Nhập danh sách giao vien: ");
                System.out.println("2. Xuất danh sach giao vien:");
                System.out.println("3. Nhập mon hoc:.");
                System.out.println("4. Xuất mon hoc:.");
                System.out.println("5. Quản lý giao vien");
                System.out.println("6. Sap xep theo ten: ");
                System.out.println("7. Bang luong cua tung  giao vien: ");
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
                        sapxepTheoTen();
                        break;
                    case 7:
                        bangLuongGiaoVien();
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

    private static void sapxepTheoTen() {
        kkdd.xapSepTheoTen();
    }

    private static void bangLuongGiaoVien() {
        for (BangKeKhaiGiangDay bang : BangKeKhaiGiangDay.listKeKhai) {
            System.out.println(bang.getGiangvien().getHoTen());
            double tongLuong = 0;
            for (int i = 0; i < bang.getMonhoc().size(); i++) {

                System.out.println("Ten mon hoc : " + bang.getMonhoc().get(i));
                int soTieThucHanh = bang.getMonhoc().get(i).getTongSoTiet() - bang.getMonhoc().get(i).getSoTietLyThuyet();
                System.out.println("So tiet thc hanh: " + soTieThucHanh);
                System.out.println("So tiet ly thuyet: " + bang.getMonhoc().get(i).getSoTietLyThuyet());
                System.out.println("Kinh phi cho moi tiet: " + bang.getMonhoc().get(i).getKinhPhi());
                System.out.println("So lop  giang vin day la : " + bang.getLop().get(i));
                double soTienLuong = (bang.getMonhoc().get(i).getSoTietLyThuyet() * bang.getMonhoc().get(i).getKinhPhi()
                        + soTieThucHanh * bang.getMonhoc().get(i).getKinhPhi() * 0.7) * bang.getLop().get(i);
                tongLuong += soTienLuong;
            }
            System.out.println("Tong luong: " +tongLuong);
        }
        

    }

}
