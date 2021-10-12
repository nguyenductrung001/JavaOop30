/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BangKeKhaiGiangDay {

   static ArrayList<BangKeKhaiGiangDay> listKeKhai = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private GiangVien giangvien;
    private List<Integer> lop = new ArrayList<>();
    private List<MonHoc> monhoc = new ArrayList<>();
    private int tongSoLop;

    public BangKeKhaiGiangDay() {
    }

    public BangKeKhaiGiangDay(GiangVien giangvien, List<Integer> lop, List<MonHoc> monhoc) {
        this.giangvien = giangvien;
        this.lop = lop;
        this.monhoc = monhoc;
    }

    public ArrayList<BangKeKhaiGiangDay> getListKeKhai() {
        return listKeKhai;
    }

    public void setListKeKhai(ArrayList<BangKeKhaiGiangDay> listKeKhai) {
        this.listKeKhai = listKeKhai;
    }

    public GiangVien getGiangvien() {
        return giangvien;
    }

    public void setGiangvien(GiangVien giangvien) {
        this.giangvien = giangvien;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public List<Integer> getLop() {
        return lop;
    }

    public void setLop(List<Integer> lop) {
        this.lop = lop;
    }

    public List<MonHoc> getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(List<MonHoc> monhoc) {
        this.monhoc = monhoc;
    }

    @Override
    public String toString() {
        return "BangKeKhaiGiangDay{" + "listKeKhai=" + listKeKhai +  ", giangvien=" + giangvien + ", lop=" + lop + ", monhoc=" + monhoc + ", tongSoLop=" + tongSoLop + '}';
    }

    void quanLyGiaoVien(List<GiangVien> listGiangViens, List<MonHoc> listMonHocs) {
        System.out.println("Moi ban nhap so luong giao vien can quan ly: ");
        int slGiaoVien = sc.nextInt();
        for (int i = 0; i < slGiaoVien; i++) {
            BangKeKhaiGiangDay kkgd = new BangKeKhaiGiangDay();
            sc.nextLine();
            System.out.println("Danh sách mã giáo viên: ");
            for (GiangVien giangVien : listGiangViens) {
                System.out.println(giangVien.getMaGV());
            }
            System.out.println("moi ban chon ma giao vien: ");
            int maGV = sc.nextInt();

            for (GiangVien gv : listGiangViens) {
                if (maGV == gv.getMaGV()) {
                    kkgd.setGiangvien(gv);

                }

            }
            System.out.println("moi ban chon so luong mon hoc:");
            int slMonHoc = sc.nextInt();
            for (int j = 0; j < slMonHoc; j++) {
                sc.nextLine();
                System.out.println("Danh sách mã mon hoc: ");
                for (MonHoc monhoc : listMonHocs) {
                    System.out.println(monhoc.getMaMonHoc());
                }
                System.out.println("moi ban chon ma mon hoc: ");
                String maMh = sc.nextLine();

                for (MonHoc mh : listMonHocs) {
                    if (maMh.equals(String.valueOf(mh.getMaMonHoc()))) {
                        List<MonHoc> _mh = kkgd.getMonhoc();
                        _mh.add(mh);
                        kkgd.setMonhoc(_mh);

                    }

                }

                System.out.println("moi ban chon so luong lop: ");
                int slLop = sc.nextInt();
                List<Integer> _lop = kkgd.getLop();
                _lop.add(slLop);
                kkgd.setLop(_lop);
               listKeKhai.add(kkgd);

            }
            System.out.println(listKeKhai);
            
        }
    }
    
    public void xapSepTheoTen(){
        System.out.println("Danh sach giao vien khi sắp xếp theo tên la: ");
        for (int i = 0; i<listKeKhai.size() ; i++) {
            for (int j = listKeKhai.size()-1; j>1 ;j--) {
             BangKeKhaiGiangDay bj = listKeKhai.get(j);
                BangKeKhaiGiangDay bjj = listKeKhai.get(j - 1);
                String ten1[] = bj.getGiangvien().getHoTen().split(" ");
                String ten2[] = bjj.getGiangvien().getHoTen().split(" ");
                
                if (ten1[ten1.length - 1].compareTo(ten2[ten2.length - 1]) < 0) {

                    listKeKhai.set(j, bjj);
                    listKeKhai.set(j - 1, bj);
                }
            }
            
        }listKeKhai.forEach(e -> {
            System.out.println(e);
        });
    
    }

}
