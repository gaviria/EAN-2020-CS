import java.util.Scanner;

public class Paseo {
    public static void main(String[] args) {
        int est_gordos;
        int est_flacos;
        int dias_paseo;
        int bus_puestos = 60;
        int comida_valor = 10000;
        int habitacion_costo = 25000;
        float total_buses;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese el número de estudiantes gordos:");
        est_gordos = reader.nextInt();

        System.out.println("Ingrese el número de estudiantes flacos:");
        est_flacos = reader.nextInt();

        System.out.println("Ingrese el total de días del paseo:");
        dias_paseo = reader.nextInt();

        int sillas_gordos = est_gordos * 2;
        int sillas_flacos = est_flacos;
        int total_puestos = sillas_gordos+sillas_flacos;

        if (total_puestos > bus_puestos){
            total_buses = (total_puestos)/60f;
        }else{
            total_buses = 1;
        }

        System.out.println("El total de buses es de: " + Math.ceil(total_buses));

        int comida_dia = (est_flacos*3)+(est_gordos*5);
        int comida_paseo = comida_dia * dias_paseo;

        System.out.println("Platos de comida durante el paseo: " + comida_paseo);

        int comida_costo_total = (comida_valor * comida_paseo);

        System.out.println("Costo de los platos de comida durante el paseo: " + comida_costo_total);

        float habitaciones_totales = (est_flacos+est_gordos)/4f;
        float habitacion_costo_diario = (float) (habitacion_costo * Math.ceil(habitaciones_totales));

        System.out.println("Costo total de las habitaciones por un día: " + habitacion_costo_diario);

        int habitacion_costo_paseo = (int) (dias_paseo * habitacion_costo_diario);

        System.out.println("Costo total de las habitaciones por el paseo: " + habitacion_costo_paseo);

    }
}
