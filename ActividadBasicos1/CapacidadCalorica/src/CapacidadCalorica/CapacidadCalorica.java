package CapacidadCalorica;

import java.util.Scanner;

public class CapacidadCalorica {
    public static void main(String[] args) {
        double calor_especifico_agua_liquida = 4186;
        double agua;
        double temperatura;
        Scanner reader = new Scanner(System.in);

        System.out.println("Capacidad Calórica Específica.");

        System.out.println("Ingresar Cantidad de Agua");
        agua = reader.nextDouble();

        System.out.println("Ingresar Temperatura");
        temperatura = reader.nextDouble();

        double cantidad_energia = calor_especifico_agua_liquida * agua * temperatura;

        System.out.println("La cantidad total de energia que se necesita para alcanzar la temperatura deseada es de: " + cantidad_energia + ("J"));

    }
}
