package AreaSombreada;

import java.util.Scanner;

/**
 *
 * @author fgaviria
 */
public class AreaSombreada {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        double hipotenusa;
        double area_cuadrado;
        double area_circulo;
        double area_sombreada;

        System.out.println("Hallar el area del circulo sombreada indicando su radio");
        System.out.println("-------------------------------------------------------");

        Scanner entrada = new Scanner (System.in);

        do{
            System.out.println("Digita el radio del circulo");
            radio = entrada.nextDouble (); //Invocamos un método sobre un objeto Scanner
        }while(radio <= 0);

        //Hallando hipotenusa para conseguir uno de los lados del cuadrado
        hipotenusa = (Math.pow(radio, 2) + Math.pow(radio, 2));
        hipotenusa = Math.sqrt(hipotenusa);

        //area del cuadrado para restar al area del circulo
        area_cuadrado = hipotenusa * hipotenusa;

        area_circulo = 3.1416 * Math.pow(radio, 2);

        area_sombreada = (area_circulo - area_cuadrado);

        System.out.println("El area total sombreada en el circulo es de: " + area_sombreada);
    }
}
