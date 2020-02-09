package VolumenTroncoCono;

import java.util.Scanner;

public class VolumenTroncoCono {
    public static void main(String[] args) {

        double r1, r2;
        double h1, h2;
        double volumen_tronco;
        double h;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese radio del cono:");
        r1 = reader.nextDouble();

        System.out.println("Ingrese altura del cono:");
        h1 = reader.nextDouble();

        System.out.println("Ingrese radio del cono deficiente:");
        r2 = reader.nextDouble();

        System.out.println("Ingrese altura del cono deficiente:");
        h2 = reader.nextDouble();

        if (h1>h2){
            h = h1 - h2;
        }else{
            h = h2 - h1;
        }
        volumen_tronco = ((h * Math.PI)/3) * ((r1*r1) + (r2*r2) + (r1*r2));

        System.out.println("El volumen del tronco es igual a: " + volumen_tronco + "cm^3");

    }
}
