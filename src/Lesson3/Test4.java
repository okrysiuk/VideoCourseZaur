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
public class Test4 {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        
        int c = a + b;
        
        
        double x = 11;
        double y = 3;
        double z = x / y;
        
        int celayaChast =a / b;
        int ostatokOtDeleniya = a % b;
        
        int u1 = 12;
        int u2 = 15;
        
        int u3 = u2 - u1++; // Постфикс ++ увеличивает значение переменной на 1 ПОСЛЕ математическими операциями с ней
        int u4 = u2 - ++u1; // Префикс ++ сначала увеличивает значение переменной на 1 а потом дает провести с ней математические операции
        
        
        
        System.out.println(u3);
        System.out.println(u4);
        
        
        
    }
    
}
