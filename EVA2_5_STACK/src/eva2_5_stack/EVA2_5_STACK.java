/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_5_STACK {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        System.out.println("Pila:");
        stack.imprimir();
        // Obtener el valor del último elemento sin eliminarlo
        System.out.println("Ultimo elemento: " + stack.peek());
        // Eliminar el último elemento y mostrar su valor
        System.out.println("Elemento eliminado: " + stack.pop());
        // Mostrar la lista después de eliminar un elemento
        System.out.println("Lista despues de eliminar un elemento:");
        stack.imprimir();
    }
}

