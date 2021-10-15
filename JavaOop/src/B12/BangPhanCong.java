/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B12;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class BangPhanCong {

    private LaiXe laixe;
    private Tuyen tuyen;
    private int sl; 

    public BangPhanCong() {
    }

    public BangPhanCong(LaiXe laixe, Tuyen tuyen, int sl) {
        this.laixe = laixe;
        this.tuyen = tuyen;
        this.sl = sl;
    }

    public LaiXe getLaixe() {
        return laixe;
    }

    public void setLaixe(LaiXe laixe) {
        this.laixe = laixe;
    }

    public Tuyen getTuyen() {
        return tuyen;
    }

    public void setTuyen(Tuyen tuyen) {
        this.tuyen = tuyen;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

   

    

    @Override
    public String toString() {
        return "BangPhanCong{" + "laixe=" + laixe + ", tuyen=" + tuyen + ", sl=" + sl + '}';
    }
}
