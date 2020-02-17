package AreaYVolumen;

import java.util.Scanner;

public class AreaYVolumen {
    public static void main(String[] args) {

        double radio = 1;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingresa el valor de un radio para calcular el area de un circulo y el volumen de una esfera.");

        System.out.println("Introduce el radio");
        radio = reader.nextDouble();

        double area_circulo = Math.PI * Math.pow(radio,2);

        System.out.println("El area de un circulo de radio " + radio + " es igual a: " + area_circulo);

        double volumen_esfera = (4d/3d) *Math.PI * Math.pow(radio,3);

        System.out.println("El volumen de una esfera con radio de " + radio + " es de: " + volumen_esfera);

    }
}
