package LPK;

import java.util.Scanner;

public class LPK {

    public static void main(String[] args) {
        double lpk = 2.3521;
        double mpg = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce las millas por galon a tranformar en LPK:");
        mpg = reader.nextInt();

        double resultado = lpk/mpg;

        System.out.println(mpg + " MPG es igual a: "+ resultado + " L/KM");
    }

}
