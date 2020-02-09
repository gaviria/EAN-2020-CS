package ViajeSasaima;

import java.util.Scanner;

public class ViajeSasaima {
    public static void main(String[] args) {

        int costo_galon = 10000;
        int km_bg_sasaima;
        int kg_maximo_soportado;
        int kg_carga;
        int galon_x_km;

        Scanner reader = new Scanner(System.in);

        System.out.println("Viaje a Sasaima.");

        System.out.println("Ingrese Kilómetros de Bogotá a Sasaima");
        km_bg_sasaima = reader.nextInt();

        System.out.println("Ingrese peso en kg maximo soportado");
        kg_maximo_soportado = reader.nextInt();

        System.out.println("Ingrese peso en kg de la carga");
        kg_carga = reader.nextInt();

        System.out.println("Ingrese galones por KM");
        galon_x_km = reader.nextInt();

        int viajes_necesarios = kg_maximo_soportado / kg_carga;

        System.out.println("Viajes necesarios: " + viajes_necesarios);

        int galones_x_viajes =  (galon_x_km * km_bg_sasaima) * viajes_necesarios;

        System.out.println("Galones necesarios para el total de viajes: " + galones_x_viajes);

        int costo_gasolina =  galones_x_viajes * costo_galon;

        System.out.println("Cuanto va a costar la gasolina: " + costo_gasolina);


    }
}
