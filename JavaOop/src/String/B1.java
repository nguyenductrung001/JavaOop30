/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Administrator
 */
public class B1 {
    public static void main(String[] args) {
        for (int i = 100000; i < 999999; i++) {
           if(soThuanNghich(i)){
               System.out.println(i);
              
           }
//            System.out.println(count);
            
        }
       
    }
    public  static  boolean soThuanNghich(int n){
        String s =  String.valueOf(n);
        int length = s.length();
        for (int i = 0; i <(length)/2; i++) {
           if(s.charAt(i) != s.charAt(length-i-1)){
           return false;
           }
            
        }
    return true;
    }
 
}
