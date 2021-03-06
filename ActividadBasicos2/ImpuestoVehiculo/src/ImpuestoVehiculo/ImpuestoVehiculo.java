package ImpuestoVehiculo;

import java.util.Scanner;

/**
 *
 * @author fgavi
 */
public class ImpuestoVehiculo {
    public static void main(String[] args) {
        int tipo_vehiculo;
        double precio_total;
        double impuesto;
        double precio_bruto;


        System.out.println("Mostrar Valor de Tipo de vehiculo e impuesto a pagar");
        System.out.println("-------------------------------------------------------");

        Scanner entrada = new Scanner (System.in);

        do{
            System.out.println("Digita el 'número' del tipo de vehiculo: Camioneta (1) o Automovil (2)");
            tipo_vehiculo = entrada.nextInt (); //Invocamos un método sobre un objeto Scanner
        }while(tipo_vehiculo <= 0 || tipo_vehiculo > 2);

        do{
            System.out.println("Digita el precio del vehículo");
            precio_bruto = entrada.nextDouble (); //Invocamos un método sobre un objeto Scanner
        }while(precio_bruto <= 0);

        if (tipo_vehiculo == 1 && precio_bruto < 80){
            impuesto = 0;
            precio_total = precio_bruto + impuesto;
        } else{
            if(tipo_vehiculo == 1 && precio_bruto >= 80){
                impuesto = precio_bruto/2;
                precio_total = precio_bruto + impuesto;
            }else{
                if(tipo_vehiculo == 2 && precio_bruto < 20){
                    impuesto = 5;
                    precio_total = precio_bruto + impuesto;
                }else{
                    if(tipo_vehiculo == 2 && precio_bruto > 40){
                        impuesto = 9;
                        precio_total = precio_bruto + impuesto;
                    }else{
                        impuesto = precio_bruto/5;
                        precio_total = precio_bruto + impuesto;
                    }
                }
            }
        }

        System.out.println("El impuesto a pagar por el vehiculo es de: " + impuesto);
        System.out.println("El precio neto a pagar por el vehiculo es de: " + precio_total);
    }
}
