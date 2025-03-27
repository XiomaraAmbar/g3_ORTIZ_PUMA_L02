public class Caja<T>{
    private T contenido;

    //Constructor para inicializar el contenido
    public Caja(T contenido){
        this.contenido = contenido;
    }

    //Getter
    public T getContenido(){
        return contenido;
    }

    //Setter
    public void setContenido(T contenido){
        this.contenido = contenido;
    }
}
