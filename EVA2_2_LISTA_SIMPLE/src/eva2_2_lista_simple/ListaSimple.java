/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Yahir Sáenz
 */
public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    private int tama;
    
    public ListaSimple(){
        inicio = null;
        fin = null;
    }
    //SIEMPRE SE AGREGA AL FINAL DE LA LISTA
    //O
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);//crear el nodo para el valor a insertar
        //Y LUEGO??
        if(inicio == null){//LISTA VACIA? VERDADERO
            inicio = nuevo; //nuevo es el primer nodo de la lista
            fin = nuevo;
        }else{//Lista con nodos
            //movernos al final
            /* Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();   
            }
            temp.setSiguiente(nuevo);*/
           fin.setSiguiente(nuevo);
           fin = nuevo;
        }
    }
    //O(N)
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public void imprimirInverso() {
        int tama = longitud();
        for (int i = tama - 1; i >= 0; i--) {
            System.out.print("[" + valorEn(i) + "]");
        }
        System.out.println("");
    }
    
        public int longitud1(){
        return tama;
    }
    
    //O(N)
    public int longitud(){
        int cont = 0;
        Nodo temp = inicio;
        while (temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    
    //O(1)
    public boolean listaVacia(){
        if(inicio == null){//LISTA VACIA? VERDADERO
            return true;
        }else{
            return false;
        }
    }
    
    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
    }
    //Validar: posicion tenga un valor Valido
                                        //throws
    public int valorEn (int posicion) throws RuntimeException{
        //excepción
        //Validar posicion
        int tama = longitud();
        if(posicion >=0 && posicion < tama){ //Posición válida
        //1 que posiciones son válidas? de 0 (cero) a N - 1 (N es la cantidad de nodos)
        Nodo temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
            }
        return temp.getValor();
        }else{
            throw new RuntimeException("la posicion " + posicion + " no es válida"); 
        }
    }
    
    public int encontrar(int valor) {
        Nodo temp = inicio;
        int pos = 0;
        while(temp != null) {
            if(temp.getValor() == valor) {
                return pos;
            }
            pos++;
            temp = temp.getSiguiente();
        }
        throw new IndexOutOfBoundsException("Valor no encontrado"); //NO SE ENCONTRO EL VALOR
    }
     
    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > longitud()) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0) { //INSERTAR AL INICIO
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null) { //LISTA VACIA
                    fin = nuevo;
                }
            } else if(posicion == longitud()) { //INSERTAR AL FINAL
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else{ //INSERTAR EN EL MEDIO
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }    

}
