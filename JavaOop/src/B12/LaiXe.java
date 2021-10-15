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
public class LaiXe {
    	private static int number  =10000;
	private int maLaiXe;
	private String hoTen;
	private String diaChi;
	private String sdt;
	private String trinhDo;

    public LaiXe() {
        super();
        this.maLaiXe = number++;
    }

    public LaiXe(int maLaiXe, String hoTen, String diaChi, String sdt, String trinhDo) {
        this.maLaiXe = maLaiXe;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.trinhDo = trinhDo;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        LaiXe.number = number;
    }

    public int getMaLaiXe() {
        return maLaiXe;
    }

    public void setMaLaiXe(int maLaiXe) {
        this.maLaiXe = maLaiXe;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "LaiXe{" + "maLaiXe=" + maLaiXe + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + ", trinhDo=" + trinhDo + '}';
    }
    public void inputdataLaixe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên người lái xe");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ:");
		this.diaChi = sc.nextLine();
		System.out.println("Nhập số điện thoại");
		this.sdt = sc.nextLine();
        do {
       	 System.out.println("Nhập nhóm khách hàng :\n 1. Loại A,\n 2. Loại B ,\n3. Loại C, \n 4. Loại D,\n 5. Loại E,\n 6. Loại F");
			String chon = sc.nextLine();
			boolean check = false; 
			switch (chon.charAt(0)) {
			case '1': 
				trinhDo = "Loại A";
				check  = true ;
				break;
			
			case '2' :
				
				trinhDo = "Loại B";
				check  = true ;
				break;
			
			
			case '3' :				
				trinhDo = "Loại C";
				check  = true ;
				break;
			case '4' :				
				trinhDo = "Loại D";
				check  = true ;
				break;
			case '5' :				
				trinhDo = "Loại E";
				check  = true ;
				break;
			case '6' :				
				trinhDo = "Loại F";
				check  = true ;
				break;
			}	
			if (check ) {
			
				break;
			}
		
		} while (true);
        
	}
    public void xemThongTinLaixe() {
		System.out.println("Id Lái xe: "+maLaiXe+" "+"Ten Lái xe : "+hoTen+"  "+"Dia chi : "+diaChi+" "+"So dien thoai :"+sdt+" "+"Trình độ : " +trinhDo);
	}
	
	public String ViewData() {
		return "Id Lái xe: "+maLaiXe+" "+"Ten Lái xe : "+hoTen+"  "+"Dia chi : "+diaChi+" "+"So dien thoai :"+sdt+" "+"Trình độ : " +trinhDo;
	}
        
}
