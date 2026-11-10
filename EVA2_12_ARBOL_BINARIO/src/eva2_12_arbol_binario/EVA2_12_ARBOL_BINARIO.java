/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_12_ARBOL_BINARIO {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.agregar(5);
        arbol.agregar(3);
        arbol.agregar(7);
        arbol.agregar(2);
        arbol.agregar(4);
        arbol.agregar(6);
        arbol.agregar(8);
        arbol.agregar(1);
        arbol.preOrder();
        System.out.println("");
        arbol.inOrder();
        System.out.println("");
        arbol.postOrder();
    }
}
