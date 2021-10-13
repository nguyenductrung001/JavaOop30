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
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 câu dưới 20 từ. ");
        String s;
        boolean check = true;
        do {            
             s = sc.nextLine();
            String [] ss = s.split("\\s");
            if(ss.length>20){
                System.out.println("Cau phai nho hon 20 tu : ");
                check = true;
            
            }else{
                int count = 0;
                for (int i = 0; i < ss.length; i++) {
                   if(ss[i].length()>10){
                       count += 1;
                   }
                    
                }
                if(count>0){
                    System.out.println("nhap lai chuoi: ");
                    check = true;
                }else{
                    check = false;
                }
            }
        } while (check);
        tach(s);
    }
    public static  void tach(String str){
        String s1 [] = str.split("\\s");
        String trungGian;
        for(int i=0; i<s1.length-1; i++){
            for (int j=i+1; j<s1.length; j++){
                if(s1[i].compareTo(s1[j])>0){
                    trungGian=s1[i];
                    s1[i]=s1[j];
                    s1[j]=trungGian;
                }
            }
            
        }
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
            
        }
        
    }
            
}
