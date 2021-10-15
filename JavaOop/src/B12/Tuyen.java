/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B12;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Tuyen {
        private static int number = 100;
	private int maTuyen ;
	private String khoangCach;
	private String diemDung;

    public Tuyen() {
        super();
        this.maTuyen = number++;
    }

    public Tuyen(int maTuyen, String khoangCach, String diemDung) {
        this.maTuyen = maTuyen;
        this.khoangCach = khoangCach;
        this.diemDung = diemDung;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Tuyen.number = number;
    }

    public int getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(int maTuyen) {
        this.maTuyen = maTuyen;
    }

    public String getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(String khoangCach) {
        this.khoangCach = khoangCach;
    }

    public String getDiemDung() {
        return diemDung;
    }

    public void setDiemDung(String diemDung) {
        this.diemDung = diemDung;
    }

    @Override
    public String toString() {
        return "Tuyen{" + "maTuyen=" + maTuyen + ", khoangCach=" + khoangCach + ", diemDung=" + diemDung + '}';
    }
    public  void xemThongTinTuyen() {
		System.out.println("Mã Tuyến :"+maTuyen+" "+"Khoảng cách :"+khoangCach+" "+ "Điểm dừng :"+diemDung);
	}
	
	public String viewData() {
		return "Mã Tuyến :"+maTuyen+" "+"Khoảng cách :"+khoangCach+" "+ "Điểm dừng :"+diemDung;
	}
        public void nhapTuyen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Khoảng cách :");
		this.khoangCach = sc.nextLine();
		System.out.println("Nhập điểm dừng:");
		this.diemDung = sc.nextLine();
		
	}
        
}
