/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_3_LISTA_DOBLE {

    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble lista = new ListaDoble();
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
        lista.borrarEn(1);
        lista.imprimir();
        lista.imprimirInv();
    }
}
