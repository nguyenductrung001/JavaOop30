/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B28;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class KhachHang{
    private static int number = 1000;
    private int maKh;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String loaiKH;
    
    public KhachHang() {
        this.maKh = number++;
    }

    public KhachHang(String hoTen, String diaChi, String soDienThoai, String loaiKH) {
        
        this.maKh = number++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.loaiKH = loaiKH;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        KhachHang.number = number;
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }
    
    
    
        

//    private String nhomKhachHang;
//
//    public String getNhomKhachHang() {
//        return nhomKhachHang;
//    }
//
//    public void setNhomKhachHang(String nhomKhachHang) {
//        this.nhomKhachHang = nhomKhachHang;
//    }
//
//    public KhachHang(String nhomKhachHang) {
//        this.nhomKhachHang = nhomKhachHang;
//    }
//
//    public KhachHang(String nhomKhachHang, int maKh, String hoTen, String diaChi, String soDienThoai) {
//        super(maKh, hoTen, diaChi, soDienThoai);
//        this.nhomKhachHang = nhomKhachHang;
//    }
//
//    
//
//    public void nhap() {
//        super.nhap();
//        String loaiKH[] = {"Mua le", "Mua buon", "Mua qua mang"};
//        int theloai;
//        String loaiKHs;
//        Scanner scaner = new Scanner(System.in);
//        do {
//            System.out.println("moi ban nhap loai khach hang(1.mua le, 2.Mua buon, 3.Mua qua mang): ");
//            theloai = scaner.nextInt();
//        } while (theloai < 1 || theloai > 3);
//        loaiKHs = loaiKH[theloai-1];
//    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKh=" + maKh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", loaiKH=" + loaiKH + '}';
    }

    void nhapKH() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
  

}
