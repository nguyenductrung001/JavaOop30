/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    ArrayList<LaiXe> listLx = new ArrayList<>();
    List<Tuyen> listTuyen = new ArrayList<Tuyen>();
    List<BangPhanCong> listBangPhanCong = new ArrayList<BangPhanCong>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main t = new Main();
        do {
            System.out.println("**********************MENU**********************");
            System.out.println("1.Nhập danh sách Lái xe và sẽ in ra danh sách lái xe đã có nếu chạy không lỗi: "
                    + ".");
            System.out.println("2.Nhập danh sách Tuyến và in ra danh sách các tuyến đã có .");
            System.out.println("3.Nhập danh sách phân công cho mỗi lái xe và in danh sách ra màn hình . Chú ý: cùng một lái xe với một tuyến không được xuất hiện quá một lần trong bảng này");
            System.out.println("4.Sắp xếp danh sách phân công \r\n"
                    + "a.Theo Họ tên lái xe   \r\n"
                    + "b.Theo Số lượng tuyến đảm nhận trong ngày (giảm dần)\r\n"
                    + "");
            System.out.println("5.Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe    \r\n"
                    + ". ");
            System.out.println("6. Thoát");
            System.out.println("7.moi ban chon chuong trinh");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1: {
                    t.nhapDanhSachLaixe();
                    t.xemDanhSachLaiXe();
                    break;
                }
                case 2: {
                    t.nhapDanhSachTuyen();
                    t.inDanhSachTuyen();
                    break;
                }
                case 3: {
                    t.bangdanhsach();
                    System.out.println("Bạn có muốn tiếp tục không (1 là có, còn lại là không)");
                    int n = Integer.parseInt(sc.nextLine());
                    if (n != 1) {
                        System.exit(0);
                    }
                    break;
                }
                case 4: {
                    t.sortname();
                    break;
                }
                case 5: {

                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Nhập số từ 1-6");
            }
        } while (true);

    }

    public void nhapDanhSachLaixe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số Tài xế :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            LaiXe laixe = new LaiXe();
            laixe.inputdataLaixe();
            listLx.add(laixe);
        }
    }

    public void xemDanhSachLaiXe() {
        for (LaiXe laixe : listLx) {
            laixe.xemThongTinLaixe();

        }
    }

    public void nhapDanhSachTuyen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tuyến :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Tuyen t = new Tuyen();
            t.nhapTuyen();
            listTuyen.add(t);
        }
    }

    public void inDanhSachTuyen() {
        for (Tuyen t : listTuyen) {
            t.xemThongTinTuyen();
        }
    }

    public void bangdanhsach() {
        Scanner sc = new Scanner(System.in);
        if (listLx.size() <= 0 || listTuyen.size() <= 0) {
            System.out.println("Bạn vui lòng thêm thông tin lái xe và tuyến xe");
        } else {
            System.out.println("Danh sách lái xe");
            int demLaiXe = 0;
            for (LaiXe laixe : listLx) {
                System.out.println("Vị trí lái xe " + demLaiXe + " :" + laixe.ViewData());
                demLaiXe++;
            }

            System.out.println("Lái xe được lựa chọn là: ");
            int laiXeLC = Integer.parseInt(sc.nextLine());
            if (laiXeLC > listLx.size() || laiXeLC < 0) {
                System.out.println("Lái xe không tồn tại!");
            } else {

                System.out.println("Danh sách các tuyến xe");
                int demTuyen = 0;
                for (Tuyen tuyen : listTuyen) {
                    System.out.println("Vị trí tuyến xe " + demTuyen + " :" + tuyen.viewData());
                    demTuyen++;
                }

                while (true) {
                    BangPhanCong bangPhanCong = new BangPhanCong();
                    bangPhanCong.setLaixe(listLx.get(laiXeLC));
                    Tuyen tuyen = new Tuyen();
                    System.out.println("Nhập tuyến xe của lái xe:");
                    int tuyenLC = Integer.parseInt(sc.nextLine());
                    if (tuyenLC > listTuyen.size() || tuyenLC < 0) {
                        System.out.println("Tuyến lái xe không tồn tại!");
                    } else {
                        Tuyen tuyenFind = listTuyen.get(tuyenLC);
                        boolean check = false;
                        for (BangPhanCong bpc : listBangPhanCong) {
                            if (bpc.getTuyen().getMaTuyen() == tuyenFind.getMaTuyen()) {
                                check = true;
                            }
                        }

                        if (check) {
                            System.out.println("Tuyến lái xe đã tồn tại, vui lòng kiểm tra lại!");
                        } else {
                            bangPhanCong.setTuyen(tuyen);

                            do {
                                int soLuot;

                                try {
                                    System.out.println("MOi ban nhap so luot lai của tài xế: ");
                                    soLuot = Integer.parseInt(sc.nextLine());
                                } catch (Exception e) {
                                    System.out.println("So luot phai lon hon khong");
                                    continue;
                                }
                                int sum = 0;
                                for (BangPhanCong bangPhanCong1 : listBangPhanCong) {
                                    if (bangPhanCong1.getLaixe().getMaLaiXe() == bangPhanCong.getLaixe().getMaLaiXe()) {
                                        sum += bangPhanCong1.getSl();
                                    }
                                }
                                if (sum + soLuot > 15) {
                                    System.out.printf("So luot lai xe mot ngay khong duoc vuot qua 15.Con co the them %d luot\n", 15 - sum);
                                } else {
                                    bangPhanCong.setSl(soLuot);
                                    break;
                                }

                            } while (true);

                        }

                    }
                    listBangPhanCong.add(bangPhanCong);
                    System.out.println("Bạn có muốn tiếp tục thêm tuyến cho lái xe không (1 có,còn lại là không)");
                    String LC = sc.nextLine();
                    if (!LC.equals("1") ) {
                        break;
                    }
                }

            }
            danhSachTuyenXeCuaMoiTaiXe();

        }
    }

    

    

    

    

    private void danhSachTuyenXeCuaMoiTaiXe() {
        System.out.println("Hiển thị danh sách tuyến xe của mỗi lái xe đã đăng ký:");
        for (LaiXe laiXe : listLx) {
            System.out.println("Lái xe " + laiXe.ViewData());
            System.out.println("Những tuyến lái xe đi là :");
            for (BangPhanCong bangPhanCong : listBangPhanCong) {
                if(bangPhanCong.getLaixe().getMaLaiXe()== laiXe.getMaLaiXe())
                System.out.println(bangPhanCong.getTuyen().viewData() + " ,so luot: " + String.valueOf(bangPhanCong.getSl()));
            }
        }
    }

    public void sortname() {
        for (int i = 0; i < listBangPhanCong.size(); i++) {
            for (int j = i + 1; j < listBangPhanCong.size(); j++) {
                if (listBangPhanCong.get(i).getLaixe().getHoTen().compareTo(listBangPhanCong.get(j).getLaixe().getHoTen()) > 0) {
                    BangPhanCong temp = listBangPhanCong.get(i);
                    listBangPhanCong.set(i, listBangPhanCong.get(j));
                    listBangPhanCong.set(j, temp);
                }
            }
        }
        for (BangPhanCong listbang : listBangPhanCong) {
            System.out.println(listbang);
        }
    }

}
