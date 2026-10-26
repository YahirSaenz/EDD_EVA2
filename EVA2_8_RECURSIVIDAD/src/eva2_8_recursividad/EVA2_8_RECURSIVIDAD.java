/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_recursividad;

/**
 *
 * @author Yahir Sáemz
 */
public class EVA2_8_RECURSIVIDAD {

    public static void main(String[] args) {

        imprimirCiclo(5);
        imprimirRecu(5);
    }
    
    public static void imprimirCiclo(int numero){
        for (int i = numero; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
    }
    
    public static void imprimirRecu(int numero){
        //RESUELVA UNA PARTE DEL PROBLEMA
        System.out.print(numero + " - ");
        //SE LLAME A SÍ MISMO
        if (numero > 1) 
            imprimirRecu(numero - 1);   
    }
}
