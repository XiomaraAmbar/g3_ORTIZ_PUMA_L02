package Bolsa;

public class TestGen {

    //Método genérico para buscar un elemento en un array
    public static <T> boolean exist(T[] array, T elemento) {
        for (T item : array) {
            if (item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public static void main( String args[] ){
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println("******************Pruebas con String e Integer******************");
        System.out.println("Prueba con búsqueda String en un array String: " + exist(v, "Sanchez")); //true
        System.out.println("Prueba con búsqueda Integer en un array Integer: " + exist(w, 34));        //true
        System.out.println("Prueba con búsqueda String en un array Integer " + exist(w, "Salas"));   //Error de compilación

        //PRUEBAS CON GOLOSINAS Y CHOCOLATINAS
        Golosina g1 = new Golosina("Caramelo", 10.5);
        Golosina g2 = new Golosina("Chicle", 5.0);
        Golosina g3 = new Golosina("Gomita", 7.5);

        Golosina[] golosinas = {g1, g2, g3};

        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");

        Chocolatina[] chocolatinas = {c1, c2};

        System.out.println("\n******************Pruebas con Bolsa.Chocolatina y Bolsa.Golosina******************");

        System.out.println("Prueba con búsqueda en Bolsa.Golosina: " + exist(golosinas, new Golosina("Chicle", 5.0))); //false
        System.out.println("Prueba con búsqueda en Chocolatinas: " + exist(chocolatinas, c1)); //true
    }
}
