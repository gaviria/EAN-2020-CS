package Empleados;

import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Ingrese la Información del empleado:");
            System.out.println("Nombre: ");
            String name = in.nextLine();
            System.out.println("Departamento: ");
            String department = in.nextLine();
            System.out.println("Posición: ");
            String position = in.nextLine();
            System.out.println("Salario: ");
            String salary = in.nextLine();
            Empleados emp = new Empleados(name, department, position, Double.valueOf(salary));
            System.out.print("Empleado : ");
            //Imprime empleados
            emp.toString();
            System.out.println("Fue guardado en la base de datos.");

            System.out.println("Presione x para salir o cualquier otra tecla para continuar: ");
            String abort = in.nextLine();

            loop = !"x".equals(abort);
        }
    }

}