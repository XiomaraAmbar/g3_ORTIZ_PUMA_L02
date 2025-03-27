public class Chocolatina implements Describible {
    private String marca; //Marca de la chocolatina

    //Constructor
    public Chocolatina(String marca){
        this.marca = marca;
    }

    //Métodos getters and setters
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String descripcion() {
        return "Chocolatina: " + marca;
    }
}