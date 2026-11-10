/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Yahir Sáenz
 */
public class EVA2_14_ITERATOR {

    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();
        /*lista.add(100);//0
        lista.add(200);//1
        lista.add(300);//2
        lista.add(400);//3
        lista.add(500);//4*/
        
        for (int i = 0; i < 1000000; i++) {
            lista.add((int)(Math.random() * 1000));
        }
        System.out.println("Cantidad de nodos" + lista.size());
        
        /*int promedio = 0;
        for (int i = 0; i < 1000000; i++) {
            promedio += lista.get(i);
        }
        System.out.println("Sumatoria: " + promedio);*/
        
        //ITERATOE: PROPORCIONA UN MECANISMO PARA ACCEDER A TODOS LOS VALORES ALMACENADOS EN NUESTRA LISTA
        Iterator<Integer> iterador = lista.iterator();
        int promedio = 0;
        while(iterador.hasNext()){
            promedio += iterador.next();
        }
        System.out.println("Sumatoria: " + promedio);
        System.out.println("promedio : " + (promedio / 1000000.0));
        
    }
}
