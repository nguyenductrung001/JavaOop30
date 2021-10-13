/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao chuoi can kiem tra: ");
        String n = sc.nextLine();
        String chuThuong = n.toLowerCase();
        for (int i = 0; i < chuThuong.length(); i+=2) {
            String check = chuThuong.substring(i,i+1);
          chuThuong =  chuThuong.replaceAll(check, check.toUpperCase());  
        }
        System.out.println(chuThuong);
        
    }
}
