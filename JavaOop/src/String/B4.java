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
public class B4 {
    public static void main(String[] args) {
        nhap();
    }
    static void nhap(){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("xau vua nhap la: " + s +"\n");
        timMax(s);
    }
    static void timMax(String s ){
    int [] leng ;
    String  [] ss ;
    ss = s.split(" ");
    leng = new int [ss.length];
    int max = 0;
        for (int i = 0; i < ss.length; i++) {
            int l = ss[i].length();
           leng[i] = l;
           if(l>max) max = l;
            
        }
        int count  = 0;
        for (int i = 0; i < ss.length; i++) {
           if(leng[i] == max){
           
               System.out.print(ss[i]);
               System.out.println(", vi tri: " + count );
           } 
           count+=leng[i+1];
            
        }
    }
}
