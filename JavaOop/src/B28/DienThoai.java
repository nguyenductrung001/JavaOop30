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
public class DienThoai {

    Scanner sc = new Scanner(System.in);
    private int maSp;
    private String HangSx;
    private String model;
    private Double donGia;
    private static int number = 1000;

    public DienThoai() {
        super();
        this.maSp = number++;
    }

    public DienThoai(String maSp, String HangSx, String model, Double donGia) {
        this.maSp = number++;
        this.HangSx = HangSx;
        this.model = model;
        this.donGia = donGia;
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getHangSx() {
        return HangSx;
    }

    public void setHangSx(String HangSx) {
        this.HangSx = HangSx;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "maSp=" + maSp + ", HangSx=" + HangSx + ", model=" + model + ", donGia=" + donGia + '}';
    }

    public void nhap() {
        this.setMaSp(maSp);
        System.out.println("nhap hang sx: ");
        this.setHangSx(sc.nextLine());
        System.out.println("nhap model: ");
        this.setModel(sc.nextLine());
        System.out.println("nhap don gia: ");
        this.setDonGia(sc.nextDouble());

    }
}
