public class Caja<T>{
    private T contenido;
    private String color;

    //Constructor para inicializar el contenido
    public Caja(T contenido, String color){
        this.contenido = contenido;
        this.color = color;
    }

    //Getters
    public T getContenido(){
        return contenido;
    }

    public String getColor(){
        return color;
    }

    //Setters
    public void setContenido(T contenido){
        this.contenido = contenido;
    }

    public void setColor(String color){
        this.color = color;
    }
}
