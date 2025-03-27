public class Principal {
    public static void main(String[] args) {
        //Se crea una bolsa que almacena chocolatinas máximo 2
        Bolsa <Chocolatina> bolsaCho = new Bolsa <Chocolatina>(2);

        //Se crean tres objetos de tipo Chocolatina
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");

        //Se agregan las chocolatinas a la bolsa
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        //Bucle for-each que usa el iterator() de Bolsa<T>
        // Devuelve un iterador sobre la lista interna
        //El bucle imprime las marcas de las chocolatinas dentro de la bolsa
        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }
    }
}