/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author Yahir Sáenz
 */
public class Nodo {
    
    //Tres atributos
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;

    //Constructores:
    public Nodo() {
        this.izquierda = null; //ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
        this.derecha = null;
    }
    
    public Nodo (int valor) { //Poner el valor a guardar, al momento de crar el nodo
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }
    
    //get y set
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }    

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
