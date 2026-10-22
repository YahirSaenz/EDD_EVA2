/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author Yahir Sáenz
 */

public class MyQueue {
    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public MyQueue() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    public void imprimir() {
        Nodo temp = inicio;

        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }

        System.out.println("");
    }

    public void imprimirInv() {
        Nodo temp = fin;

        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }

        System.out.println("");
    }

    public int longitud() {
        return tama;
    }

    public boolean listaVacia() {
        return inicio == null;
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }

        tama++;
    }

    public int valorEn(int posicion) {
        if (posicion < 0 || posicion >= tama) {
            throw new IndexOutOfBoundsException("La posicion " + posicion + " no es valida");
        }

        Nodo temp;

        // Si está en la primera mitad, recorrer desde inicio.
        if (posicion < tama / 2) {
            temp = inicio;

            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
        } else {
            // Si está en la segunda mitad, recorrer desde fin.
            temp = fin;

            for (int i = tama - 1; i > posicion; i--) {
                temp = temp.getPrevio();
            }
        }

        return temp.getValor();
    }

    // Encontrar la primera posición de un valor: O(N)
    public int encontrar(int valor) {
        Nodo temp = inicio;
        int pos = 0;

        while (temp != null) {
            if (temp.getValor() == valor) {
                return pos;
            }

            pos++;
            temp = temp.getSiguiente();
        }

        throw new IndexOutOfBoundsException("Valor no encontrado");
    }

    // Insertar en una posición: O(N)
    public void insertarEn(int valor, int posicion) {
        if (posicion < 0 || posicion > tama) {
            throw new IndexOutOfBoundsException(
                "Posicion no valida"
            );
        }

        Nodo nuevo = new Nodo(valor);

        // Insertar al inicio
        if (posicion == 0) {
            nuevo.setSiguiente(inicio);

            if (inicio != null) {
                inicio.setPrevio(nuevo);
            } else {
                fin = nuevo;
            }

            inicio = nuevo;
        }
        // Insertar al final
        else if (posicion == tama) {
            nuevo.setPrevio(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        // Insertar en medio
        else {
            Nodo temp = inicio;

            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }

            Nodo anterior = temp.getPrevio();

            nuevo.setPrevio(anterior);
            nuevo.setSiguiente(temp);

            anterior.setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }

        tama++;
    }

    // Borrar un nodo de una posición: O(N)
    public void borrarEn(int posicion) {
        if (posicion < 0 || posicion >= tama) {
            throw new IndexOutOfBoundsException(
                "Posicion no valida"
            );
        }

        Nodo temp;

        // Buscar el nodo desde el extremo más cercano.
        if (posicion < tama / 2) {
            temp = inicio;

            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
        } else {
            temp = fin;

            for (int i = tama - 1; i > posicion; i--) {
                temp = temp.getPrevio();
            }
        }

        // Reconectar el nodo anterior.
        if (temp.getPrevio() != null) {
            temp.getPrevio().setSiguiente(temp.getSiguiente());
        } else {
            inicio = temp.getSiguiente();
        }

        // Reconectar el nodo siguiente.
        if (temp.getSiguiente() != null) {
            temp.getSiguiente().setPrevio(temp.getPrevio());
        } else {
            fin = temp.getPrevio();
        }

        tama--;
    }
    
    //QUEUE --> FIFO (PRIMERO EN LLEGAR PRIMERO EN SALIR)
    //AGREGA UN VALOR AL FINAL DE LA LISTA
    public void push(int valor){
        agregar(valor);
    }
    
    //LEE EL VALOR DIRECAMENTE ACCESIBLE, SIN BORRARLO
    public int peek() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return valorEn(0); //devuelve el valor del primer nodo de la lista
    }
    
    //LEE EL VALOR DIRECAMENTE ACCESIBLE, Y LO BORRA
    public int pop() {
        if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
    }
}
