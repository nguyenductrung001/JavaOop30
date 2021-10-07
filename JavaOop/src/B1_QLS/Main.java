/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_QLS;

import static B1_QLS.BangQuanLyMuonSach.list;
import java.util.ArrayList;
import java.util.Collections;
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
        Scanner sc = new Scanner(System.in);
        try {
            int chon;
            for (;;) {
                System.out.println("-------------------CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN---------------");
                System.out.println("1. Nhập danh sách ban doc");
                System.out.println("2. Xuất danh sách ban doc ra màn hình");
                System.out.println("3. Nhập sách.");
                System.out.println("4. Xuất Sách.");
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
                    case 6:
                        sapxepTheoTen();
                        break;
                    case 7:
                        timBanDocTheoTen();
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

    private static void sapxepTheoTen() {
        System.out.println("***********DANH SACH KHI SAP XEP THEO TEN");
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                BangQuanLyMuonSach bj = list.get(j);
                BangQuanLyMuonSach bjj = list.get(j - 1);
                String ten1[] = bj.getBandoc().getHoTen().split(" ");
                String ten2[] = bjj.getBandoc().getHoTen().split(" ");
                if (ten1[ten1.length - 1].compareTo(ten2[ten2.length - 1]) < 0) {

                    list.set(j, bjj);
                    list.set(j - 1, bj);
                }

            }

        }
        list.forEach(e -> {
            System.out.println(e);
        });
//        System.out.println(list);
    }

    private static void timBanDocTheoTen() {
        ArrayList<BangQuanLyMuonSach> timTheoTen = new ArrayList<>();
        System.out.print("MOi ban nhap ten can tim: ");
        String name = sc.nextLine();
        for (BangQuanLyMuonSach qlsm : list) {
            if (qlsm.getBandoc().getHoTen().equals(name)) {
                System.out.println("Da tim thay ban doc: ");
                System.out.println(qlsm.getBandoc().getHoTen());
                timTheoTen.add(qlsm);
                
                break;
            } else {
                System.out.println("Khong tim thay ten ban doc! Vui long nhap lai: ");

            }
            
        }
        for (BangQuanLyMuonSach bangQuanLyMuonSach : timTheoTen) {
                System.out.println(bangQuanLyMuonSach.getBandoc());
                
            }
    }
}
