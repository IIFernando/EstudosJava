package Aulas;

import Aulas.Util.Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;

        // Atribui valores a campos
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ", with a range of" + ".");
        minivan.range(); //Exibe a autonomia da Minivan.

        System.out.print("Sportscar can carry " + sportscar.passengers + ", with a range of" + ".");
        sportscar.range(); //Exibe a autonomia da Minivan.
    }
}