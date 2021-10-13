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
public class B3 {
    
    public static void main(String[] args) {
        nhap();
    }
     static void chuyenVeChuThuong(String s){
        s = s.toLowerCase();
        String [] s1 ; 
        String s3 =" ";
        s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String s2 = " ";
            if(s1[i].length()!=0){
            s2+=Character.toUpperCase(s1[i].charAt(0));
            if(s1[i].length()>1) s2+=s1[i].substring(1);
            s3+=s2;
            if(i<s1.length) s2+=" ";
        }
            
        }
    if(s3.charAt(s3.length()-1) == ' ') s3 += "\b";
        System.out.println("\nString sau khi da chuyen hoa la: " + s3);
    }
    static void nhap(){
        Scanner sc = new Scanner(System.in);
        String str ;
        str = sc.nextLine();
        System.out.println("chuyen tat ca ve chu thuong: ");
        chuyenVeChuThuong(str);
    }
}
