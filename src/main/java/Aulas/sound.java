package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class sound {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double p = 1.100;
        double s = 7.2;

        double result = s * p;

        System.out.println(result);



        sc.close();
    }
}
