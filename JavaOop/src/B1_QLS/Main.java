/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_QLS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Sach> listSach = new ArrayList<>();
    static List<BanDoc> listBd = new ArrayList<>();
    static List<BangQuanLyMuonSach> listQlms = new ArrayList<>();
    static int sl;
//    static String[] manv, tennv;
//    static double[] luong;
//    static DanhSachNhanVien ds = new DanhSachNhanVien();
    static BanDoc bd = new BanDoc();
    static Sach s = new Sach();
    static BangQuanLyMuonSach qlms = new BangQuanLyMuonSach();

    public static void main(String[] args) {
        try {
            int chon;
            for (;;) {
                System.out.println("-------------------CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN---------------");
                System.out.println("1. Nhập danh sách ban doc");
                System.out.println("2. Xuất danh sách ban doc ra màn hình");
                System.out.println("3. Nhập sách.");
                System.out.println("4. Xuất Sách.");
                System.out.println("5. Quản lý mượn sách");
                System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
                System.out.println("7. Sắp xếp nhân viên theo họ và tên");
                System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
                System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
                System.out.println("10. exit");
                System.out.print("mời chọn chương trình: ");
                chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        nhapBanDoc();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        nhapSach();
                        break;
                    case 4:
                        xuatSach();
                        break;
                    case 5:
                        quanLyMuonSach(s.getList(), bd.getList());
                        break;
//                    case 6:
//                        timtheokhoangluong();
//                        break;
//                    case 7:
//                        SxTheoTen();
//                        break;
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

    private static void nhapBanDoc() {
        bd.nhapBanDoc();

    }
//

    private static void xuat() {

        bd.xuatBanDoc();
    }
//

    private static void nhapSach() {
        s.nhapSach();
    }
//

    private static void xuatSach() {

        s.xuatSach();

    }

    private static void quanLyMuonSach(List<Sach> listSach, List<BanDoc> listBd) {
        qlms.quanLyMuonSach(listSach, listBd);
    }
    private static void sapxep(){
        
    }
//    private static void capnhatds() {
//        ds.capnhattheoma();
//    }
//
//    private static void timtheokhoangluong() {
//        ds.timtheokhoangluong();
//    }
//
//    private static void SxTheoTen() {
//        System.out.println("***********DANH SACH KHI SAP XEP THEO TEN");
//        ds.SxTheoTen();
//        ds.xuat();
//         }
//    private static void SxTheoLuong() {
//        System.out.println("***********DANH SACH KHI SAP XEP THEO TEN");
//        ds.SxTheoLuong();
//        ds.xuat();
//         }
//
//    private static void top5() {
//    ds.top5();
//    }

}
