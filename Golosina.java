public class Golosina {
    private String nombre; //Nombre de la golosina
    private double peso; //Peso de la golosina

    //Constructor
    public Golosina (String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    //Getter del nombre
    public String getNombre(){
        return this.nombre;
    }

    //Setter del nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Getter del peso
    public double getPeso(){
        return this.peso;
    }

    //Setter del peso
    public void setPeso(double peso){
        this.peso = peso;
    }
}