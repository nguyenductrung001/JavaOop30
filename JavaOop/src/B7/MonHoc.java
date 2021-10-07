 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MonHoc {
    ArrayList<MonHoc> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private String tenMonHoc;
    private int maMonHoc,tongSoTiet,soTietLyThuyet, number = 100;
    private Double kinhPhi;

    public MonHoc() {
        super();
        this.maMonHoc = number++;
    }

    public MonHoc(String tenMonHoc, int maMonHoc, int tongSoTiet, int soTietLyThuyet, Double kinhPhi) {
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = number++;
        this.tongSoTiet = tongSoTiet;
        this.soTietLyThuyet = soTietLyThuyet;
        this.kinhPhi = kinhPhi;
    }

    public ArrayList<MonHoc> getList() {
        return list;
    }

    public void setList(ArrayList<MonHoc> list) {
        this.list = list;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public int getSoTietLyThuyet() {
        return soTietLyThuyet;
    }

    public void setSoTietLyThuyet(int soTietLyThuyet) {
        this.soTietLyThuyet = soTietLyThuyet;
    }

    public Double getKinhPhi() {
        return kinhPhi;
    }

    public void setKinhPhi(Double kinhPhi) {
        this.kinhPhi = kinhPhi;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "tenMonHoc=" + tenMonHoc  + ", tongSoTiet=" + tongSoTiet + ", soTietLyThuyet=" + soTietLyThuyet + ", kinhPhi=" + kinhPhi + '}';
    }
    public void nhapMonHoc(){
        System.out.println("moi ban nhap so luong: ");
        int sl = sc.nextInt();
        for (int i = 0; i <sl; i++) {
            System.out.println("Moi ban nhap ten mon hoc: ");
            tenMonHoc = sc.nextLine();
            sc.nextLine();
            System.out.println("Moi ban nhap tong so tiet: ");
            tongSoTiet = sc.nextInt();
            System.out.println("Moi ban nhap  so tiet ly thuyet : ");
            soTietLyThuyet = sc.nextInt();
            System.out.println("Moi ban nhap kinh phi: ");
            kinhPhi = sc.nextDouble();
            list.add(new MonHoc(tenMonHoc, maMonHoc, tongSoTiet, soTietLyThuyet, kinhPhi));
            
        }
    
    }
    public void xuatMonHoc(){
        list.forEach((s) -> {
            System.out.println(s);
        });
    
    }
    
}
