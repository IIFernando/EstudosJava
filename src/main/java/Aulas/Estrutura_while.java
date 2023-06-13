package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int x = sc.nextInt();

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}