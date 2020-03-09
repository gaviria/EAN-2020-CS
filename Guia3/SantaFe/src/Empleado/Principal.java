
package Empleado;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Basado en el ejercicio @author lcobo
 */
public class Principal {
    static List<Empleado> cuentas = new LinkedList<>();
    static Scanner kbd = new Scanner(System.in);
    /**
     * Manejador de cuentas
     */
    public static void main(String[] args) throws Exception {
        int opcion;

        do {
            System.out.println("0. Salir");
            System.out.println("1. Crear un empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Buscar un empleado");
            System.out.println("4. Empleados por departamento");
            System.out.print("Opcion=> ");
            opcion = kbd.nextInt();
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    mostrarCuentas();
                    break;
                case 3:
                    mostrarCuentasUsuario();
                    break;
                case 4:
                    mostrarCuentasDepartamento();
                    break;
            }
        } while(opcion != 0);
    }

    private static boolean existeCuenta(int numCuenta) {
        for (Empleado c : cuentas) {
            if (c.getNumero() == numCuenta) {
                return true;
            }
        }
        return false;
    }

    private static Empleado buscarCuenta(int numCuenta) {
        for (Empleado c : cuentas) {
            if (c.getNumero() == numCuenta) {
                return c;
            }
        }
        return null;
    }

    private static void crearCuenta() {
        System.out.print("Id: ");
        int num = kbd.nextInt();
        kbd.nextLine();
        System.out.print("Nombre del usuario: ");
        String nom = kbd.nextLine();
        System.out.print("Departamento: ");
        String departamento = kbd.nextLine();
        System.out.print("Cargo: ");
        String cargo = kbd.nextLine();
        System.out.print("Salario inicial: ");
        int saldo = kbd.nextInt();

        if (existeCuenta(num)) {
            System.out.println("Ya existe un empleado con ese id!");
        }
        else {
            Empleado cuenta = new Empleado(num, nom, saldo, cargo, departamento);
            cuentas.add(cuenta);
            System.out.println("Empleado creado con éxito! Hay " +
                    cuentas.size() + " cuenta(s) de empleados!");
        }


    }

    private static void mostrarCuentas() {
        for (Empleado c : cuentas) {
            System.out.println(c);
        }
    }

    private static void consignarPorcentajeCuenta(int numCuenta) throws Exception {
        Empleado cuenta = buscarCuenta(numCuenta);
        int monto = (int) (cuenta.getSaldo() + (cuenta.getSaldo()*0.10));
        cuenta.consignar(monto);
    }

    private static void mostrarCuentasUsuario() {
        System.out.print("Usuario a buscar: ");
        kbd.nextLine();
        String usuario = kbd.nextLine();
        int cont = 0;

        for (Empleado c : cuentas) {
            if (c.getUsuario().equalsIgnoreCase(usuario)) {
                cont++;
                System.out.println("Cuenta " + cont + " con numero = "+ c.getNumero());
                System.out.println(c); //imprime las cuentas
            }
        }
        if (cont == 0) {
            System.out.println("Este empleado no se encuentra registrado!!");
        }
        else {
            System.out.println("El empleado " + usuario + " tiene " + cont +
                    " cuenta(s)!!");
        }
    }

    private static void mostrarCuentasDepartamento() throws Exception {
        System.out.print("Departamento a buscar: ");
        kbd.nextLine();
        String departamento = kbd.nextLine();
        System.out.print("Desea aplicar el porcentaje 10% (s / n: ");
        String porcentaje = kbd.nextLine();
        String r = "s";
        int cont = 0;
        int salarioTotal = 0;
        int salarioAumento = 0;

        for (Empleado c : cuentas) {
            if (c.getDepartamento().equalsIgnoreCase(departamento)) {
                cont++;
                System.out.println("Cuenta " + cont + " con numero = "+ c.getNumero());
                System.out.println(c); //imprime los departamentos
                salarioTotal += c.getSaldo();
                if("s".equals(porcentaje)) {
                    consignarPorcentajeCuenta(c.getNumero());
                    salarioAumento += c.getSaldo();
                }
            }
        }
        if (cont == 0) {
            System.out.println("Este departamento no se encuentra registrado!!");
        }
        else {
            System.out.println("El Departamento " + departamento + " tiene " + cont +
                    " cuenta(s) de empleados!!");
            System.out.println("El salario total del departamento es $" + salarioTotal);
            System.out.println("El salario total con aumento del 10% es $" + salarioAumento);
        }
    }

}
