public class Principal {
    public static void main(String[] args) {
        //********************BOLSA CHOCOLATINAS**********************
        //Se crea una bolsa que almacena chocolatinas máximo 2
        Bolsa <Chocolatina> bolsaCho = new Bolsa <Chocolatina>(3);

        //Se crean tres objetos de tipo Chocolatina
        Chocolatina c = new Chocolatina("Milka");
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");

        //Se agregan las chocolatinas a la bolsa
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        //Bucle for-each que usa el iterator() de Bolsa<T>
        // Devuelve un iterador sobre la lista interna
        //El bucle imprime las marcas de las chocolatinas dentro de la bolsa
        // Imprimir contenido de la bolsa de chocolatinas
        System.out.println("***********CONTENIDO DE LA BOLSA DE CHOCOLATINAS************");
        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        //********************BOLSA GOLOSINAS**********************
        //Se crea una bolsa que almacena golosinas, máximo 3
        Bolsa<Golosina> bolsaGolo = new Bolsa<>(3);

        //Se crean objetos de tipo Golosina
        Golosina g1 = new Golosina("Caramelo", 10.5);
        Golosina g2 = new Golosina("Gomita", 15.2);
        Golosina g3 = new Golosina("Chicle", 5.8);

        //Se agregan las golosinas a la bolsa
        bolsaGolo.add(g1);
        bolsaGolo.add(g2);
        bolsaGolo.add(g3);

        //Imprimir contenido de la bolsa de golosinas
        System.out.println("***********CONTENIDO DE LA BOLSA DE GOLOSINAS************");
        for (Golosina golosina : bolsaGolo) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso() + "g");
        }

        System.out.println("***********PROBANDO MÉTODO GENÉRICO MOSTRARCONTENIDO************");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>CONTENIDO DE LA BOLSA DE GOLOSINAS: ");
        mostrarContenido(bolsaCho);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>CONTENIDO DE LA BOLSA DE GOLOSINAS: ");
        mostrarContenido(bolsaGolo);
    }

    //Método genérico para mostrar el contenido de cualquier bolsa
    public static <T extends Describible> void mostrarContenido(Bolsa<T> bolsa) {
        for (T item : bolsa) {
            System.out.println(item.descripcion());
        }
    }
}