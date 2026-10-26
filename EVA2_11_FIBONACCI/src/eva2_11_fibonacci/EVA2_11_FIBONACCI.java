/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_11_FIBONACCI {

    public static void main(String[] args) {

        System.out.println("fibonacci(7): " + fibonacci(7));
    }
    
    public static int fibonacci(int posi){
        if (posi > 1) 
            return fibonacci(posi - 2) + fibonacci(posi - 1);
        else
            return 1;
    }
}
