import java.util.ArrayList;
import java.util.Iterator;
public class Bolsa <T> implements Iterable <T>{ //Se define la clase genérica
    private ArrayList <T> lista = new ArrayList <T> (); //Arraylist donde se almacenaran los elementos
    private int tope; //Numero máximo de elementos de la bolsa

    //Constructor
    public Bolsa(int tope){
        super();
        this.tope = tope;
    }

    //Método para agregar elementos
    public void add (T objeto){
        if (lista.size() <= tope){
            lista.add(objeto);
        }else{
            throw new RuntimeException("No caben más");
        }
    }

    //Interfaz Iterator que permite recorrer colecciones de datos
    //como listas (ArrayList)
    public Iterator <T> iterator(){
        return lista.iterator();
    }
}