package Bolsa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //********************BOLSA CHOCOLATINAS**********************

        System.out.print(">>>>>>>>>>>>Ingrese el número máximo de chocolatinas: ");
        int topeC = scanner.nextInt();
        scanner.nextLine();

        //Se crea una bolsa que almacena chocolatinas máximo es el tope
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(topeC);

        // Se ingresan chocolatinas
        for (int i = 0; i < topeC; i++) {
            System.out.print("Marca de la chocolatina " + (i + 1) + ": " );
            String marca = scanner.nextLine();
            Chocolatina chocolatina = new Chocolatina(marca);
            bolsaCho.add(chocolatina);
        }

        //********************BOLSA GOLOSINAS**********************

        System.out.print(">>>>>>>>>>>>Ingrese el número máximo de golosinas: ");
        int topeG = scanner.nextInt();
        scanner.nextLine();

        //Se crea una bolsa que almacena golosinas máximo es el tope
        Bolsa<Golosina> bolsaGolo = new Bolsa<Golosina>(topeG);

        // Ingresar golosinas
        for (int i = 0; i < topeG; i++) {
            System.out.print("Nombre de la golosina " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Peso de la golosina " + (i + 1) + " (en gramos): ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            Golosina golosina = new Golosina(nombre, peso);
            bolsaGolo.add(golosina);
        }

        //Se muestra el contenido de la bolsa de chocolatinas
        System.out.println("\n***********CONTENIDO DE LA BOLSA DE CHOCOLATINAS************");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        //Se muestra el contenido de la bolsa de golosinas
        System.out.println("\n***********CONTENIDO DE LA BOLSA DE GOLOSINAS************");
        for (Golosina golosina : bolsaGolo) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso() + "g");
        }

        //Se muestra el contenido usando método genérico
        System.out.println("\n***********PROBANDO MÉTODO GENÉRICO MOSTRARCONTENIDO************");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>CONTENIDO DE LA BOLSA DE CHOCOLATINAS: ");
        mostrarContenido(bolsaCho);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>CONTENIDO DE LA BOLSA DE GOLOSINAS: ");
        mostrarContenido(bolsaGolo);
    }

    // Método genérico para mostrar el contenido de cualquier bolsa
    public static <T extends Describible> void mostrarContenido(Bolsa<T> bolsa) {
        for (T item : bolsa) {
            System.out.println(item.descripcion());
        }
    }
}