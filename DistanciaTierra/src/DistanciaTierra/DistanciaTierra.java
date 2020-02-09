package DistanciaTierra;

import java.util.Scanner;

public class DistanciaTierra {
    public static void main(String[] args) {
        float lat1 = 41.3879169f;
        float lon1 = 2.1699187f;
        float lat2 = 40.4167413f;
        float lon2 = -3.7032498f;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingresa las siguientes Coordenadas de cada ciudad");

        System.out.println("Introduce Latitud 1:");
        lat1 = reader.nextFloat();

        System.out.println("Introduce Longitud 1:");
        lon1 = reader.nextFloat();

        System.out.println("Introduce Latitud 2:");
        lat2 = reader.nextFloat();

        System.out.println("Introduce Longitud 2:");
        lon2 = reader.nextFloat();

        float distancia = Distancia(lat1, lon1, lat2, lon2);   //Retorna numero en Km
        System.out.println("La distancia entre las dos ciudades es de: " + distancia + "KM");

    }

    public static float radianes (float data)
    {
        return (float) (data * Math.PI/180);
    }

    public static float Distancia(float lat1, float lon1, float lat2, float lon2)
    {
        float dis = 6378.137f;                     //Radio de la tierra en km
        float dLat  = radianes( lat2 - lat1 );
        float dLong = radianes( lon2 - lon1 );

        float a = (float)(Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(radianes(lat1)) * Math.cos(radianes(lat2)) * Math.sin(dLong/2) * Math.sin(dLong/2));
        float c = (float) (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)));
        float d = dis * c;

        return d;
    }
}
