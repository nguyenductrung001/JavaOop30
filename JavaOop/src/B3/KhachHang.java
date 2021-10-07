/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class KhachHang {

    private ArrayList<KhachHang> list = new ArrayList<>();
    private static int number = 100000;
    private int maKhachHang;
    private String tenKhachHang;
    private String diaChi;
    private String soDienThoai;
   
    private String LoaiKhachHang;

    public KhachHang(int maKhachHang, String tenKhachHang, String diaChi, String soDienThoai, String LoaiKhachHang) {
        
        this.maKhachHang = number++;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.LoaiKhachHang = LoaiKhachHang;
    }

    public KhachHang() {
        super();
        this.maKhachHang = number++;
    }

    public ArrayList<KhachHang> getList() {
        return list;
    }

    public void setList(ArrayList<KhachHang> list) {
        this.list = list;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        KhachHang.number = number;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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

    public String getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    public void setLoaiKhachHang(String LoaiKhachHang) {
        this.LoaiKhachHang = LoaiKhachHang;
    }

    @Override
    public String toString() {
        return "KhachHang{"  + ", maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", LoaiKhachHang=" + LoaiKhachHang + '}';
    }
   

    
    

    public void nhapKhachHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong: ");
        int sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {  
            System.out.print("MOi ban nhap ten: ");
             tenKhachHang  = sc.nextLine();
            sc.nextLine();
            System.out.print("MOi ban nhap dia chi: ");
             diaChi  = sc.nextLine();
            System.out.print("MOi ban nhap sdt: ");
             soDienThoai  = sc.nextLine();
             LoaiKhachHang= "";
            do {
                System.out.println("Moi ban nhap Loaikhach hang (1 ban buon. 2.ban le): ");
                String nhap =sc.nextLine();
                boolean nhapoke = false;
                switch (nhap.charAt(0)) {
                    case '1':
                        LoaiKhachHang = "ban buon";
                        nhapoke = true;
                        break;
                    case '2':
                        LoaiKhachHang = "ban le";
                        nhapoke = true;
                        break;
                    
                }
                if(nhapoke){
                break;
                }
            } while (true);
            
            list.add(new KhachHang(maKhachHang, tenKhachHang, diaChi, soDienThoai, LoaiKhachHang));
        }
       

    }
    public void xuatKh(){
        System.out.println(list);
    }
}
