package AreaPoligonoRegular;

import java.util.Scanner;

public class AreaPoligonoRegular {
    public static void main(String[] args) {

        int longitud_s;
        int lados_n;

        Scanner reader = new Scanner(System.in);

        System.out.println("Area de un polígono regular.");

        System.out.println("Ingrese la cantidad de lados");
        lados_n = reader.nextInt();

        System.out.println("Ingrese la longitud de un lado");
        longitud_s = reader.nextInt();

        double area = (lados_n * Math.pow(longitud_s,2))/(4*(Math.tan(Math.PI/lados_n)));

        System.out.println("El área del poligono regular es de: " + area);
    }
}
