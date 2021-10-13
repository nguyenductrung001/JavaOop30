/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class B5 {
      public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi họ tên: ");
        str = scanner.nextLine();
        hoanDoi(str);
    }

    static void hoanDoi(String s){
        StringTokenizer s1 = new StringTokenizer(s);
        StringBuffer kq = new StringBuffer();
        String a[] = new String[10];        
        int i = 1;                          
        while ((s1.hasMoreTokens())){       
            a[i] = s1.nextToken();           
            i++;                               
        }
        kq.append(a[3]).append(" ");
        kq.append(a[1]).append(" ");
        kq.append(a[2]).append(" ");
        System.out.println(kq);
    }
}
