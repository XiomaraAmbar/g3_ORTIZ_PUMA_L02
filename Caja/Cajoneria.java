package Caja;

import java.util.ArrayList;
import java.util.Iterator;
public class Cajoneria<T> implements Iterable <Caja<T>>{ //Se define la clase genérica
    private ArrayList<Caja <T>> lista = new ArrayList<> (); //Arraylist donde se almacenaran los elementos
    private int tope; //Numero máximo de elementos de la bolsa

    //Constructor
    public Cajoneria(int tope){
        this.tope = tope;
    }

    //Método para agregar elementos

    public void add (Caja<T> caja){
        if (lista.size() < tope){
            lista.add(caja);
        }else{
            throw new RuntimeException("No caben más");
        }
    }



    /*//Método para buscar un elemento en las cajas
    public String search(T elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getContenido().equals(elemento)) {
                return "Elemento encontrado en la posición " + i + ", dentro de la caja de color " + lista.get(i).getColor();

            }

        }

        return "Elemento no existe";

    }

     */



    // Método para buscar una caja que contenga el elemento

    public Caja<T> search(T elemento) {

        for (Caja<T> caja : lista) {

            if (caja.getContenido().contains(elemento)) {

                return caja; //Retorna la caja donde se encontró el elemento

            }

        }

        return null; //Retorna null si el elemento no se encuentra

    }



    // Método para eliminar un objeto dentro de una caja sin eliminar la caja

    public T delete(T elemento) {

        Caja<T> cajaEncontrada = search(elemento);// Busca la caja que contiene el elemento

        if (cajaEncontrada != null) {

            cajaEncontrada.getContenido().remove(elemento); //Elimina el objeto de la caja

            return elemento; //Retorna el objeto eliminado

        }

        return null; //Si no se encuentra, retorna null

    }

    public String toString() {
        StringBuilder resultado = new StringBuilder();

        //Cabecera de la impresión
        resultado.append("Posición\t\tColor de Caja\t\tContenido\n");
        resultado.append("----------------------------------------------------\n");

        //Recorrido de las cajas almacenadas y la impresión de cada una
        for (int i = 0; i < lista.size(); i++) {
            Caja<T> caja = lista.get(i);
            resultado.append(i + 1).append("\t\t\t")
                    .append(caja.getColor()).append("\t\t")
                    .append(caja.getContenido()).append("\n");
        }
        return resultado.toString();
    }


    //Interfaz Iterator que permite recorrer colecciones de datos
    //como listas (ArrayList)
    public Iterator<Caja <T>> iterator(){
        return lista.iterator();
    }
}

