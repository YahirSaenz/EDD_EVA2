/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_2_LISTA_SIMPLE {

    
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        /*int[] arreglo = new int [1000000];
        long ini, fin , tiempo;
        ini = System.nanoTime();//TOMAMOS LA "HORA" ANTES DE EMPEZAR
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        fin = System.nanoTime();//Tomamos la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);
        
        ini = System.nanoTime();//TOMAMOS LA "HORA" ANTES DE EMPEZAR
        for (int i = 0; i < 1000000; i++) {
            /*lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime();//Tomamos la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);*/
        
        System.out.println("Tamaño de la lista: " + lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Tamaño de la lista: " + lista.longitud());
        System.out.println("Valor de la posicion 4: " + lista.valorEn(4));
        System.out.println("El valor 200 esta en la posicion: " + lista.encontrar(200));
        lista.insertarEn(900, 3);
        lista.imprimir();
        lista.imprimirInverso();
        lista.longitud1();
    }
    
 
}
