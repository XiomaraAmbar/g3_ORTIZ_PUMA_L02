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

    //Interfaz Iterator que permite recorrer colecciones de datos
    //como listas (ArrayList)
    public Iterator<Caja <T>> iterator(){
        return lista.iterator();
    }
}
