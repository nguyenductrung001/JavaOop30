/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_QLS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BangQuanLyMuonSach {

    static List<BangQuanLyMuonSach> list = new ArrayList<>();
//    Object[][] sachDaMuon = new Object[5][2];
    Map<Integer, Integer> sachDaMuon = new HashMap<>();
    private BanDoc bandoc;
    private int soLuong = 0;
    Scanner sc = new Scanner(System.in);

    public BangQuanLyMuonSach() {
    }

//    public BangQuanLyMuonSach(BanDoc bandoc, List<Sach> sachs) {
////        this.bandoc = bandoc;
////        this.sachs = sachs;
//    }
    public BanDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }

//    public List<Sach> getSachs() {
//        return sachs;
//    }
//
//    public void setSachs(List<Sach> sachs) {
//        this.sachs = sachs;
//    }
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "BangQuanLyMuonSach{" + "bandoc=" + bandoc + ", sachs=" + sachDaMuon + '}';
    }

    void quanLyMuonSach(List<Sach> listSach, List<BanDoc> listBd) {
        System.out.println("nhap so luong");
        int sl = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sl; i++) {
            BangQuanLyMuonSach qlms = new BangQuanLyMuonSach();
            sc.nextLine();



            System.out.println("Danh sach ban doc: ");
            for (BanDoc banDoc : listBd) {
                System.out.println(banDoc.getMaBanDoc());
            }
            System.out.println("Moi ban chon Ma ban doc: ");
            String maBanDoc = sc.nextLine();

            
            // kiem tra ma ban doc co trong list ban doc ko
//                boolean checkBanDoc = false;
            for (BanDoc banDoc : listBd) {
                if (maBanDoc.equals(String.valueOf(banDoc.getMaBanDoc()))) {
                    qlms.setBandoc(banDoc);
                }
            }
//                if (!checkBanDoc) {
//                    System.out.println("Ban doc khong dung moi chon lai");
//                    nhapoke = true;
//                }
            int soLuong = 0;
            do {

                System.out.println("Danh sach ma sach: ");
                for (Sach sach : listSach) {
                    System.out.println(sach.getMaSach());
                }
                System.out.println("Moi ban chon Ma sach: ");
                String maSach = sc.nextLine();

                if(sachDaMuon.containsKey(maSach)){
                    System.out.println("Sach nay da muon roi! ");   
                    continue;
                }
                 int checkSoLuong;
                 do {                    
                     System.out.printf("Moi ban nhap so luong sach muon cho ma sach %s: \n", maSach);
                     checkSoLuong = Integer.parseInt(sc.nextLine());
                     if(checkSoLuong<=0 || checkSoLuong>3){
                         System.out.println("K duoc muon qua 3 quyen moi dau sach");
                     }
                     break;
                } while (checkSoLuong<=3 && checkSoLuong>0);
               qlms.sachDaMuon.put(Integer.parseInt(maSach), checkSoLuong);
                System.out.println("Ban co muon muon tiep sach khong(1.yes, 2.No) : ");
                int checkMuonTiep = Integer.parseInt(sc.nextLine());
                if(checkMuonTiep!=1){
                    break;
                }
            } while (sl<=5);
            list.add(qlms);
//            } while (true);

        }
        list.forEach(e ->{System.out.println(e);});
//        System.out.println(list.forEach(action));
    }

    private boolean kiemTraMaBanDoc(String maBanDoc, List<BanDoc> listBd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

}
