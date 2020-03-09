package Ascensor;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int flag = 0;
        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        Ascensor ascensor1 = new Ascensor();

        System.out.println("Digite el piso actual");
        ascensor1.setpisoActual(leer.nextInt());
        System.out.println("Digite el numero de pisos");
        ascensor1.settotalPisos(leer.nextInt());
        System.out.println("Digite el numero de sotanos");
        ascensor1.settotalSotanos(leer.nextInt());

        do {
            System.out.println(" Presione 1 para subir \n Presione 2 para bajar \n Presione 3 para mostrar la cantidad de pisos \n Presione 4 para salir");
            Scanner leer1 = new Scanner(System.in);
            opcion = leer.nextInt();
            switch(opcion) {
                case 1:

                    ascensor1.subir();

                    break;

                case 2:

                    ascensor1.bajar();

                    break;

                case 3:

                    System.out.println(ascensor1.calcularPisos());

                    break;

                default:

                    flag = 5;

                    break;
            }

        }while(flag == 0);


    }

}