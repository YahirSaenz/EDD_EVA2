/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author Yahir Sáenz
 */

public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public ListaDoble() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    // Imprimir la lista de inicio a fin: O(N)
    public void imprimir() {
        Nodo temp = inicio;

        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }

        System.out.println("");
    }

    // Imprimir la lista de fin a inicio: O(N)
    public void imprimirInv() {
        Nodo temp = fin;

        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }

        System.out.println("");
    }

    // Obtener el tamaño: O(1)
    public int longitud() {
        return tama;
    }

    // Saber si la lista está vacía: O(1)
    public boolean listaVacia() {
        return inicio == null;
    }

    // Vaciar la lista: O(1)
    public void vaciarLista() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    // Agregar al final: O(1)
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

    // Obtener el valor de una posición: O(N)
    public int valorEn(int posicion) {
        if (posicion < 0 || posicion >= tama) {
            throw new IndexOutOfBoundsException(
                "La posicion " + posicion + " no es valida"
            );
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
}
