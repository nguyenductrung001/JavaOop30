/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3;

import B1_QLS.BanDoc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BangDanhSachMuaHang {
     static List<BangDanhSachMuaHang> list = new ArrayList<>();
//    Object[][] sachDaMuon = new Object[5][2];
    Map<Integer, Integer>hangDaMua = new HashMap<>();
    private KhachHang khachhang;
    private int soLuong = 0;
    Scanner sc = new Scanner(System.in);


    public Map<Integer, Integer> getHangDaMua() {
        return hangDaMua;
    }

    public void setHangDaMua(Map<Integer, Integer> hangDaMua) {
        this.hangDaMua = hangDaMua;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "BangDanhSachMuaHang{" + "hangDaMua=" + hangDaMua + ", khachhang=" + khachhang + ", soLuong=" + soLuong +  '}';
    }

    

    void quanLyDanhSachMuaHang(List<MatHang> listMatHangs, List<KhachHang> listKhs) {
        System.out.println("nhap so luong");
        int sl = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sl; i++) {
            BangDanhSachMuaHang dsmh = new BangDanhSachMuaHang();
            sc.nextLine();
            System.out.println("Danh sach ma khach hang: ");
            for (KhachHang khachhang : listKhs) {
                System.out.println(khachhang.getMaKhachHang());
            }
            System.out.println("Moi ban chon Ma khach hang: ");
            String maKhachHang = sc.nextLine();

            
            // kiem tra ma ban doc co trong list ban doc ko
//                boolean checkBanDoc = false;
            for (KhachHang khachHang : listKhs) {
                if (maKhachHang.equals(String.valueOf(khachHang.getMaKhachHang()))) {
                    dsmh.setKhachhang(khachHang);
                }
            }
//                if (!checkBanDoc) {
//                    System.out.println("Ban doc khong dung moi chon lai");
//                    nhapoke = true;
//                }
            int soLuong = 0;
            do {

                System.out.println("Danh sach ma mat hang: ");
                for (MatHang mh : listMatHangs) {
                    System.out.println(mh.getMaHang());
                }
                System.out.println("Moi ban chon Ma mat hang: ");
                String maMH = sc.nextLine();

                if(hangDaMua.containsKey(maMH)){
                    System.out.println("mat hang nay da mua roi! ");   
                    continue;
                }
                 int checkSoLuong;
                 do {                    
                     System.out.printf("Moi ban nhap so luong mat hang  muon mua cho ma mat hang %s: \n", maMH);
                     checkSoLuong = Integer.parseInt(sc.nextLine());
                     if(checkSoLuong<=0 || checkSoLuong>3){
                         System.out.println("K duoc đc muon qua 3 san pham  moi mat hang");
                     }
                     break;
                } while (checkSoLuong<=3 && checkSoLuong>0);
               dsmh.hangDaMua.put(Integer.parseInt(maMH), checkSoLuong);
                System.out.println("Ban co muon mua tiep khong(1.yes, 2.No) : ");
                int checkMuonTiep = Integer.parseInt(sc.nextLine());
                if(checkMuonTiep!=1){
                    break;
                }
            } while (sl<=5);
            list.add(dsmh);
//            } while (true);

        }
        list.forEach(e ->{System.out.println(e);});
//        System.out.println(list.forEach(action));
    }

    private boolean kiemTraMaBanDoc(String maBanDoc, List<BanDoc> listBd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
