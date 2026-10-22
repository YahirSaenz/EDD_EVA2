/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author Yahir Sáenz
 */
public class Nodo {
    
    //Tres atributos
    private int valor;
    private Nodo siguiente;
    private Nodo previo;

    //Constructores:
    public Nodo() {
        this.siguiente = null; //ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
        this.previo = null;
    }
    
    public Nodo (int valor) { //Poner el valor a guardar, al momento de crar el nodo
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
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

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
}
