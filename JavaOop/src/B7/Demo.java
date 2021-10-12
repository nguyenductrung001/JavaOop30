/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B7;

/**
 *
 * @author Administrator
 */
public class Demo {
    public static void divise(int a, int b){
        
             if(b==0)
        {
            throw new ArithmeticException();
        }
        System.out.println(a/b);
      
           
        }
        
    
    public static void main(String[] args) {
        try {
            divise(5, 0);
        } catch (Exception e) {
          System.out.println("loi");
        }
        System.out.println("fdf");
        
    }
}
