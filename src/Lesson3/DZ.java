/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

/**
 *
 * @author iroot
 */
public class DZ {
    
    public static void main(String[] args) {
        
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2%i1 - l;
        
        System.out.println(result);
        
        int a1 = 5;
        int b1 = 8;
        int u1 = a1-- - --a1 + ++a1 + a1++ + a1;
        int u2 = ++b1 - b1++ + ++b1 - --b1;
        
        System.out.println(u1);
        System.out.println(u2);
        
    }
    
}
