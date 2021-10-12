/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B28;

import B7.MonHoc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HoaDon {
    Scanner sc = new Scanner(System.in);
    ArrayList<HoaDon> listHd = new ArrayList<>();
    private KhachHang kh;
    private DienThoai dt;

    public HoaDon() {
    }

    public HoaDon(KhachHang kh, DienThoai dt) {
        this.kh = kh;
        this.dt = dt;
    }

    public ArrayList<HoaDon> getListHd() {
        return listHd;
    }

    public void setListHd(ArrayList<HoaDon> listHd) {
        this.listHd = listHd;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public DienThoai getDt() {
        return dt;
    }

    public void setDt(List<DienThoai> dienthoai) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "HoaDon{" + " kh=" + kh + ", dt=" + dt + '}';
    }
    public void quanLyHoaDon(List<KhachHang> listKh , List<DienThoai> listDt){
        System.out.println("MOi ban nhap so luong hoa din can quan ly: ");
        int sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {
            HoaDon hd = new HoaDon();
            sc.nextLine();
            System.out.println("Danh sach ma khach hang : ");
            for(KhachHang khachHang : listKh){
                System.out.println(khachHang.getMaKh());
            }
            System.out.println("moi ban chon ma khach hang: ");
            int maKh = sc.nextInt();
            for(KhachHang kh : listKh){
                if(maKh == kh.getMaKh())
                     hd.setKh(kh);
            }
            System.out.println("danh sach ma san pham: ");
            for(DienThoai dienThoai : listDt){
                System.out.println(dienThoai.getMaSp());
            }
            System.out.println("Moi ban chon ma san pham: ");
            String maSp = sc.nextLine();
            for(DienThoai dh : listDt){
            if(maSp.equals(String.valueOf(dh.getMaSp()))){
                List<DienThoai> _dt = (List<DienThoai>) hd.getDt();
                _dt.add(dh);
                hd.setDt(_dt);
            
            }
            }
            
            
        }
        
    }

}
