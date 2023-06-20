package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double gallons, litters;
        int counter = 0;
/*
      System.out.print("Informe a quantidade de galões: ");
      gallons = sc.nextDouble();
      litters = gallons * 3.7854;
      System.out.printf("Em estoque temos %.1f Galões de aguá, totalizando %.3f Litros %n", gallons, litters);
*/
        for(gallons = 1; gallons <= 100; gallons++){
            litters = gallons * 3.7854;
            System.out.printf("%.1f Gallons is %.4f Liters. %n", gallons, litters);

            counter +=1;
            if (counter == 10){
                System.out.println();
                counter = 0;
            };
        };

        sc.close();
    }
}
