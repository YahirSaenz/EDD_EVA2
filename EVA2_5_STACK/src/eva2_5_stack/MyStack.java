/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author Yahir Sáenz
 */

public class MyStack {
    private Nodo inicio;
    private Nodo fin;
    public int longitud;

    public MyStack() {
        inicio = null; //al crear la lista se crea vacia
        fin = null;
        longitud = 0;
    }

    //O(N)
    public void imprimir() {
        Nodo temp = inicio;
        while(temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    public int longitud() {
        return this.longitud;
    }

    //O(1)
    public boolean listaVacia() {
        return inicio == null; //LISTA VACIA
        //LISTA CON NODOS
    }

    //O(1)
    public void vaciarLista() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if(listaVacia()) { //LISTA VACIA
            inicio = nuevo;
            fin = nuevo;
        } else { //LISTA CON NODOS
            fin.setSiguiente(nuevo); //conecto nuevo al final de la lista
            nuevo.setPrevio(fin); //conecto el nodo anterior del nuevo al fin de la lista
            fin = nuevo; //actualizo el fin de la lista
        }
        longitud++;
    }

    public void inversa() {
        Nodo temp = fin;
        while(temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }

    public int valorEn(int posicion) {
        if(posicion < 0 || posicion >= this.longitud) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo temp = inicio;
            for( int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }
    }

    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > (longitud-1)) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        Nodo nuevo = new Nodo(valor);
        if(posicion == 0) { //insertar al inicio
            nuevo.setSiguiente(inicio);
            if(inicio != null) {
                inicio.setPrevio(nuevo);
            }
            inicio = nuevo;
            if(fin == null) { //la lista estaba vacía
                fin = nuevo;
            }
        } else if(posicion == (longitud-1)) { //insertar al final
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        } else { //insertar en medio
            Nodo temp = inicio;
            for(int i = 0; i < (posicion-1); i++) {
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp.getSiguiente());
            nuevo.setPrevio(temp);
            temp.getSiguiente().setPrevio(nuevo);
            temp.setSiguiente(nuevo);
        }
        longitud++;
    }

    public void borrarEn(int posicion) {
        if(posicion < 0 || posicion > (longitud-1)) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        if(posicion == 0) { //borrar el primer nodo
            inicio = inicio.getSiguiente();
            if(inicio != null) {
                inicio.setPrevio(null);
            } else {
                fin = null; //la lista queda vacía
            }
        } else if(posicion == (longitud-1)) { //borrar el último nodo
            fin = fin.getPrevio();
            fin.setSiguiente(null);
        } else { //borrar un nodo en medio
            Nodo temp = inicio;
            for(int i = 0; i < (posicion-1); i++) {
                temp = temp.getSiguiente();
            }
            /*Nodo anterior = temp.getAnterior();
            Nodo siguiente = temp.getSiguiente();
            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(anterior);*/
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            temp.setPrevio(temp.getPrevio().getPrevio());
        }
        longitud--;
    }

    //QUEUE --> FIFO (PRIMERO EN LLEGAR PRIMERO EN SALIR)
    //AGREGA UN VALOR AL FINAL DE LA LISTA
    public void push(int valor) {
        agregar(valor);
    }

    //LEE EL VALOR DIRECAMENTE ACCESIBLE, SIN BORRARLO
    public int peek() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return valorEn(longitud - 1); //devuelve el valor del último nodo de la lista
    }

    //LEE EL VALOR DIRECAMENTE ACCESIBLE, Y LO BORRA
    public int pop() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = valorEn(longitud - 1);
        borrarEn(longitud - 1);
        return valor;
    }
}