public class Main {
    public static void main(String[] args) {
        //Crear una instancia de Caja de tipoInteger
        Caja<Integer> cajaEnteros = new Caja<>(10);
        System.out.println("Contenido de la caja Enteros: " + cajaEnteros.getContenido());

        //Crear una instancia de Caja tipo String
        Caja<String> cajaCadenas = new Caja<>("Hola mundo");
        System.out.println("Contenido de la caja Cadenas: " + cajaCadenas.getContenido());
    }
}
