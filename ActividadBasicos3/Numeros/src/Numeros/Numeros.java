package Numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor ingrese el tamaño del array: ");
        int n = teclado.nextInt();
        int array [] = new int [n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato "+(i+1)+": ");
            array [i] = teclado.nextInt();

        }

        double mayor, menor, promedio = 0;
        mayor = menor = array [0];

        for (int i = 0; i < array.length; i++) {
            if(array [i] > mayor) {
                mayor = array[i];
            }
            if(array[i]<menor) {
                menor = array[i];
            }
            promedio = array[i] + promedio;
        }
        promedio = promedio/array.length;

        System.out.println("El mayor valor es: "+mayor);
        System.out.println("El menor valor es: "+menor);
        System.out.println("El promedio es: " + promedio);
    }
}
