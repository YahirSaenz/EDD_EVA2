/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_4_QUEUE {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        // Agregar elementos a la lista
        queue.push(100);
        queue.push(200);
        queue.push(300);
        queue.push(400);
        queue.push(500);

        System.out.println("Cola:");
        queue.imprimir();
        // Obtener el valor del primer elemento sin eliminarlo
        System.out.println("Primer elemento: " + queue.peek());
        // Eliminar el primer elemento y mostrar su valor
        System.out.println("Elemento eliminado: " + queue.pop());
        // Mostrar la cola después de eliminar un elemento
        System.out.println("Lista despuos de eliminar un elemento:");
        queue.imprimir();
    }
}
