package Pendulo;
import java.util.Scanner;

public class Pendulo {

    public static void main(String[] args) {

        int flag = 0;
        do {
            double l, g = 0;
            Scanner leer = new Scanner(System.in);
            System.out.println("Digite la longitud de la cuerda");
            l = Double.parseDouble(leer.nextLine());

            System.out.println("Digite la aceleracion gravitacional");
            g = Double.parseDouble(leer.nextLine());


            pen pen1 = new pen(l,g);
            pen1.calcularUno();
            System.out.println("Si desea salir, digite 1, de lo contrario digite 0");
            flag = Integer.parseInt(leer.nextLine());
        }while(flag != 0);

    }
}