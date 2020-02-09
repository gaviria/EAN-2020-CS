package Aritmetica;

import java.util.Scanner;

public class Aritmetica {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero_a = 0;
        int numero_b = 0;

        System.out.println("Introduce el primer número:");
        numero_a = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        numero_b = reader.nextInt();

        /*Suma*/
        int suma = numero_a + numero_b;
        System.out.println("El resultado de la suma es: " + suma);

        /*Resta*/
        int resta = numero_b - numero_a;
        System.out.println("El resultado de la resta es: " + resta);

        /*Producto*/
        int producto = numero_a * numero_b;
        System.out.println("El resultado del producto es: " + producto);

        /*Cociente*/
        int cociente = numero_a / numero_b;
        System.out.println("El resultado del cociente es: " + cociente);

        /*Residuo*/
        int residuo = numero_a % numero_b;
        System.out.println("El resultado del residuo es: " + residuo);

        /*Logaritmo*/
        double logaritmo = Math.log(numero_a);
        System.out.println("El resultado del logaritmo es: " + logaritmo);

        /*Exponencial*/
        double exponencial = Math.pow(numero_a, numero_b);
        System.out.println("El resultado del exponencial es: " + exponencial);

    }


}
