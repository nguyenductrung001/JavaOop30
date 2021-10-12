/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B28;

import B7.GiangVien;
import B7.MonHoc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    public static KhachHang[] khachHangs;
    public static DienThoai[] dienThoais;
    public static MuaHang[] muaHangs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int chon;
            for (;;) {
                System.out.println("-------------------CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN---------------");
                System.out.println("1. Nhập danh sách khach hang: ");
                System.out.println("2. Xuất danh sach khach hang:");
                System.out.println("3. Nhập danh sach dien thoai:.");
                System.out.println("4. Xuất danh sach dien thoai:.");
                System.out.println("5. Quản lý hoa don: ");
                System.out.println("6. Sap xep theo ten: ");
                System.out.println("7. Bang luong cua tung  giao vien: ");
                System.out.println("10. exit");
                System.out.print("mời chọn chương trình: ");
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        nhapKh();
                        break;
                    case 2:
                        xuatDsKh();
                        break;
                    case 3:
                        nhapDienThoai();
                        break;
                    case 4:
                        xuatDsDt();
                        break;
                    case 5:
                        nhapHoaDon();
                        break;
                    case 6:
                        xapSepTheoTen();
                        break;
                    case 7:
//                        bangLuongGiaoVien();
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

    public static void nhapKh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong: ");

        int sl = sc.nextInt();
        khachHangs = new KhachHang[sl];
        for (int i = 0; i < sl; i++) {
            KhachHang khachHang = khachHangs[i];
            int lengthKH = 0;
            Scanner scanner = new Scanner(System.in);
            String hoTen, diaChi, soDienThoai;

            System.out.println("Nhaap ten khach hang:");
            hoTen = scanner.nextLine();

            System.out.println("Nhap dia chi: ");
            diaChi = scanner.nextLine();

            System.out.println("Nhap so dien thoai: ");
            soDienThoai = scanner.nextLine();

            String loaiKH[] = {"Mua le", "Mua buon", "Mua qua mang"};
            int theloai;
            String loaiKHs;
            do {
                System.out.println("moi ban nhap loai khach hang(1.mua le, 2.Mua buon, 3.Mua qua mang): ");
                theloai = scanner.nextInt();
            } while (theloai < 1 || theloai > 3);
            loaiKHs = loaiKH[theloai - 1];
            KhachHang kh = new KhachHang(hoTen, diaChi, soDienThoai, loaiKHs);
            khachHangs[i] = kh;
            lengthKH++;
        }

    }

    public static void xuatDsKh() {
        
        for (int i = 0; i < khachHangs.length; i++) {
            System.out.println(khachHangs[i]);

        }
       

    }

    public static void nhapDienThoai() {
        DienThoai dt = new DienThoai();
        Scanner sc = new Scanner(System.in);
      
        System.out.println("nhap so luong dien thoai: ");
        int sl = sc.nextInt();
        dienThoais = new DienThoai[sl];
        for (int i = 0; i < sl; i++) {
            dt.nhap();
            dienThoais[i] = dt;

        }

    }

    public static void xuatDsDt() {
        for (DienThoai dienThoai : dienThoais) {
            System.out.println(dienThoai);
        }
    }

    public static void nhapHoaDon() {
        System.out.println("Nhap so luong hoa don mua hang: ");
        int sl = sc.nextInt();
        muaHangs = new MuaHang[sl];
        for (int i = 0; i < muaHangs.length; i++) {
            System.out.println("Nhap id khach hang: ");
            int idKh = sc.nextInt();
            KhachHang khachHang;
            khachHang = searchKh(idKh);
            System.out.println("Nhap so luong mat hang muon mua: ");
            int slMh = sc.nextInt();
            DienThoai[] _dienThoais = new DienThoai[slMh];
            int[] soLuong = new int[slMh];
            for (int j = 0; j < slMh; j++) {
                System.out.println("Nhap id san pham:");
                DienThoai dt = searchDT(sc.nextInt());
                _dienThoais[j] = dt;
                System.out.println("Nhap so luong muon mua: ");
                soLuong[j] = sc.nextInt();
                
            }
            MuaHang muaHang =new MuaHang(khachHang, _dienThoais, soLuong);
            muaHangs[i]=muaHang;
        }
        for(MuaHang muaHang : muaHangs){
            System.out.println(muaHang);
        }
    }

    public static KhachHang searchKh(int id) {
        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getMaKh() == id) {
                return khachHang;

            }

        }
        return null;
    }

    public static DienThoai searchDT(int id) {
        for (DienThoai dienThoai : dienThoais) {
            if (dienThoai.getMaSp() == id) {
                return dienThoai;

            }

        }
        return null;
    }
    public static void  xapSepTheoTen(){
         
        Arrays.sort(muaHangs, (MuaHang mh1, MuaHang mh2) -> {
            String tenO1 = mh1.getKhachHang().getHoTen();
            String tenO2 = mh2.getKhachHang().getHoTen();
            return tenO1.compareTo(tenO2);
        });
        
        for (int i = 0; i < muaHangs.length; i++) {
            System.out.println(muaHangs[i]);

        }
    
    }

}
