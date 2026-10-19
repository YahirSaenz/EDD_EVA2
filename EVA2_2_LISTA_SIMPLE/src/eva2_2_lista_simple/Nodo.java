/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Yahir Sáenz
 */
public class Nodo {
    
    //Dos atributos
    private int valor;
    private Nodo siguiente;

    //Constructores:
    public Nodo() {
        siguiente = null; //ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
    }
    
    public Nodo (int valor) { //Poner el valor a guardar, al momento de crar el nodo
        this.valor = valor;
        siguiente = null;
    }
    
    //get y set
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }    
}
