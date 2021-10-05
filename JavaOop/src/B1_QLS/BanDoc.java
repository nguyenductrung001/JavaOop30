/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_QLS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BanDoc {

    private ArrayList<BanDoc> list = new ArrayList<>();
    private static int number = 100000;
    private int MaBanDoc;
    private String HoTen;
    private String DiaChi;
    private String SDT;
    private String LoaiBanDoc;
    Scanner sc = new Scanner(System.in);

    public BanDoc() {
        super();
        this.MaBanDoc = number++;
    }

    public BanDoc(String HoTen, String DiaChi, String SDT, String LoaiBanDoc) {
        this.MaBanDoc = number++;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.LoaiBanDoc = LoaiBanDoc;
    }

    public ArrayList<BanDoc> getList() {
        return list;
    }

    public void setList(ArrayList<BanDoc> list) {
        this.list = list;
    }

    public int getMaBanDoc() {
        return MaBanDoc;
    }

    public void setMaBanDoc(int MaBanDoc) {
        this.MaBanDoc = MaBanDoc;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getLoaiBanDoc() {
        return LoaiBanDoc;
    }

    public void setLoaiBanDoc(String LoaiBanDoc) {
        this.LoaiBanDoc = LoaiBanDoc;
    }

    public void nhapBanDoc() {
        System.out.print("nhap so luong: ");
        int sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {
//            System.out.println("Moi ban nhap ma ban doc: ");
//            MaBanDoc = sc.nextInt();
            sc.nextLine();
            System.out.println("Moi ban nhap Ho Ten: ");
            String ht = sc.nextLine();
            System.out.println("Moi ban nhap dia chi: ");
            String dc = sc.nextLine();
            System.out.println("Moi ban nhap SDT: ");
            String sdt = sc.nextLine();
            String lbd= "";
            do {
                System.out.println("Moi ban nhap Loai ban doc(1 Sinh vien. 2.Hoc vien cao hoc, 3.Giao vien): ");
                String nhap = sc.nextLine();
                boolean nhapoke = false;
                switch (nhap.charAt(0)) {
                    case '1':
                        lbd = "Sinh vien";
                        nhapoke = true;
                        break;
                    case '2':
                        lbd = "Hoc vien cao hoc";
                        nhapoke = true;
                        break;
                    case '3':
                        lbd = "Giao Vien";
                        nhapoke = true;
                        break;
                }
                if(nhapoke){
                break;
                }
            } while (true);

            list.add(new BanDoc(ht, dc, sdt, lbd));

        }

    }

    @Override
    public String toString() {
        return "BanDoc{" + "MaBanDoc=" + MaBanDoc + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", SDT=" + SDT + ", LoaiBanDoc=" + LoaiBanDoc + '}';
    }

    public void xuatBanDoc() {

        list.forEach((bd) -> {
            System.out.println(bd);
        });
    }

}
