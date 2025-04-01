package Caja;

import Bolsa.Chocolatina;
import Bolsa.Golosina;
import java.util.ArrayList;
import java.util.Scanner;

public class TestGen {
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);

        System.out.println("Ingrese la capacidad máxima de cada caja:");
        int capacidadCaja = nuevo.nextInt();
        nuevo.nextLine();

        System.out.println("Elija el tipo de caja que desea crear:");
        System.out.println("1. Chocolatinas");
        System.out.println("2. Golosinas");
        int tipoCaja = nuevo.nextInt();
        nuevo.nextLine();

        if (tipoCaja == 1) {
            System.out.println(">>>>>>>>>>>>>>>>>> CAJONERÍA DE CHOCOLATINAS <<<<<<<<<<<<<<<<<<<<<<<<<");

            Cajoneria<Chocolatina> cajoneriaC = new Cajoneria<>();

            System.out.print("Ingrese el color de la caja de chocolatinas: ");
            String colorCajaC = nuevo.nextLine();

            Caja<Chocolatina> cajaC = new Caja<>(new ArrayList<>(), colorCajaC, capacidadCaja);

            for (int j = 0; j < capacidadCaja; j++) {
                System.out.print("Marca de la chocolatina " + (j + 1) + ": ");
                String marca = nuevo.nextLine();
                Chocolatina chocolatina = new Chocolatina(marca);
                cajaC.addElemento(chocolatina);
            }

            cajoneriaC.add(cajaC);

            System.out.println("\n*********** CONTENIDO DE LA CAJONERÍA DE CHOCOLATINAS ************");
            System.out.println(cajoneriaC);
        } else if (tipoCaja == 2) {
            System.out.println(">>>>>>>>>>>>>>>>>> CAJONERÍA DE GOLOSINAS <<<<<<<<<<<<<<<<<<<<<<<<<");

            Cajoneria<Golosina> cajoneriaG = new Cajoneria<>();

            System.out.print("Ingrese el color de la caja de golosinas: ");
            String colorCajaG = nuevo.nextLine();

            Caja<Golosina> cajaG = new Caja<>(new ArrayList<>(), colorCajaG, capacidadCaja);

            for (int j = 0; j < capacidadCaja; j++) {
                System.out.print("Ingrese nombre de la golosina " + (j + 1) + ": ");
                String nombre = nuevo.nextLine();
                System.out.print("Ingrese peso de la golosina " + (j + 1) + " en gramos: ");
                double peso = nuevo.nextDouble();
                nuevo.nextLine();
                Golosina golosina = new Golosina(nombre, peso);
                cajaG.addElemento(golosina);
            }

            cajoneriaG.add(cajaG);

            System.out.println("\n*********** CONTENIDO DE LA CAJONERÍA DE GOLOSINAS ************");
            System.out.println(cajoneriaG);
        } else {
            System.out.println("Opción inválida. Saliendo del programa.");
        }
    }
}
