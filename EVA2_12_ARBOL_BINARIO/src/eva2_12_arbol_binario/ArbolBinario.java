/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author Yahir Sáenz
 */
public class ArbolBinario {
    private Nodo root;
    
    public ArbolBinario(){
        root = null;
    }
    
    public void agregar(int valor){
        //ESTÁ VACIO EL ARBOL?
        if(root == null){//ARBOL VACÍO
            root = new Nodo(valor);
        }else{
            agregarRecu(root, valor);
        }
    }
    
    //MÉTODO RECURSIVO PARA AGREGAR UN NODO
    private void agregarRecu(Nodo actual, int valor){
        if(valor > actual.getValor()){//A LA DERECHA
            if(actual.getDerecha()!= null){//OCUPADO
                agregarRecu(actual.getDerecha(), valor);
            }else{//DISPONIBLE
                actual.setDerecha(new Nodo(valor));
            }

        }else if(valor < actual.getValor()){//A LA IZQUIERDA{
            if(actual.getIzquierda()!= null){//OCUPADO
                agregarRecu(actual.getIzquierda(), valor);
            }else{//DISPONIBLE
                actual.setIzquierda(new Nodo(valor));
            }        
        }//ELSE ---> EL VALOR ESTÁ REPETIDO
    }
    
    public void preOrder() {
        preOrderRecu(root);
    }

    public void inOrder() {
        inOrderRecu(root);
    }

    public void postOrder() {
        postOrderRecu(root);
    }

    private void preOrderRecu(Nodo actual) {
        System.out.print("[" + actual.getValor() + "]");
        if(actual.getIzquierda() != null) {
            preOrderRecu(actual.getIzquierda());
        }
        if(actual.getDerecha() != null) {
            preOrderRecu(actual.getDerecha());
        }
    }

    private void inOrderRecu(Nodo actual) {
        if(actual.getIzquierda() != null) {
            inOrderRecu(actual.getIzquierda());
        }
        System.out.print("[" + actual.getValor() + "]");
        if(actual.getDerecha() != null) {
            inOrderRecu(actual.getDerecha());
        }
    }

    private void postOrderRecu(Nodo actual) {
        if(actual.getIzquierda() != null) {
            postOrderRecu(actual.getIzquierda());
        }
        if(actual.getDerecha() != null) {
            postOrderRecu(actual.getDerecha());
        }
        System.out.print("[" + actual.getValor() + "]");
    }
}
