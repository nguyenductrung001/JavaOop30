/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B28;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class MuaHang {
    public KhachHang khachHang ;
    public DienThoai [] dienThoais ;
    public int [] soLuong ; 

    public MuaHang() {
    }

    public MuaHang(KhachHang khachHang, DienThoai[] dienThoais, int[] soLuong) {
        this.khachHang = khachHang;
        this.dienThoais = dienThoais;
        this.soLuong = soLuong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DienThoai[] getDienThoais() {
        return dienThoais;
    }

    public void setDienThoais(DienThoai[] dienThoais) {
        this.dienThoais = dienThoais;
    }

    public int[] getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int[] soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MuaHang{" + "khachHang=" + khachHang + ", dienThoais=" + Arrays.toString(dienThoais) + ", soLuong=" + Arrays.toString(soLuong) + '}';
    }
    
    
}
