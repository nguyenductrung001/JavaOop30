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
public class GiangVien {

    ArrayList<GiangVien> listGv = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
   public  static int number = 10;
    private int maGV;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String trinhDo;

    public GiangVien() {
        super();
        this.maGV = number++;
    }

    public GiangVien( String hoTen, String diaChi, String soDienThoai, String trinhDo) {
        this.maGV = number++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.trinhDo = trinhDo;
    }

    public ArrayList<GiangVien> getListGv() {
        return listGv;
    }

    public void setListGv(ArrayList<GiangVien> listGv) {
        this.listGv = listGv;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
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

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", trinhDo=" + trinhDo + '}';
    }

   

    public void nhapGV() {
        System.out.println("moi ban nhap so luong giao vien muon nhap: ");
        int sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {
            sc.nextLine();
            System.out.print("moi ban nhap ho ten: ");
            String ht = sc.nextLine();
            System.out.print("moi ban nhap dia chi: ");
            String dc = sc.nextLine();
            System.out.print("moi ban nhap so dien thoai: ");
            String sdt = sc.nextLine();
            trinhDo = "";

            do {

                System.out.print("moi ban chon trinh do(1.GS-TS,2.PGS-TS,3.GIANG VIEN CHINH,4.TH.S): ");
                String nhap = sc.nextLine();
                boolean nhapGvOke = false;
                switch (nhap.charAt(0)) {
                    case '1':
                        trinhDo = "GS-TS";
                        nhapGvOke = true;
                        break;
                    case '2':
                        trinhDo = "PGS-TS";
                        nhapGvOke = true;
                        break;
                    case '3':
                        trinhDo = "GIANG VIEN CHINH";
                        nhapGvOke = true;
                        break;
                    case 4:
                        trinhDo = "TH.S";
                        nhapGvOke = true;
                        break;
                }
                if (nhapGvOke) {
                    break;
                }
            } while (true);
            listGv.add(new GiangVien(ht, dc, sdt, trinhDo));
        }
       

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     public void xuatGv(){
          for (int i = 0; i < listGv.size()-1; i++) {
              System.out.println(listGv);
             System.out.println( );
                      
             
         }
        }
}
