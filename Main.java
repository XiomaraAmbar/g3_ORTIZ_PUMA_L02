public class Main {
    public static void main(String[] args) {
        //Crear una instancia de Caja de tipoInteger
        Caja<Integer> cajaEnteros = new Caja<>(10,"Azul");
        System.out.println("Contenido de la caja " + cajaEnteros.getColor() + " de Enteros: " + cajaEnteros.getContenido());

        //Crear una instancia de Caja tipo String
        Caja<String> cajaCadenas = new Caja<>("Hola mundo","Naranja");
        System.out.println("Contenido de la caja " + cajaCadenas.getColor() + " de Cadenas: " + cajaCadenas.getContenido());
    }
}
