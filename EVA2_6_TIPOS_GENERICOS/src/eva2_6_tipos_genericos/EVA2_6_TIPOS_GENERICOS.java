/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_tipos_genericos;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_6_TIPOS_GENERICOS {

    public static void main(String[] args) {
        Ejemplo<Integer> prueba = new Ejemplo<Integer>();
    }
}

class Ejemplo <T> {
    private T dato;

    public Ejemplo() {
    }
    
    public Ejemplo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}