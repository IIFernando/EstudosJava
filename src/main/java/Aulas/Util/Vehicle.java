package Aulas.Util;

public class Vehicle {

    public int passengers; //número de passageiros
    public int fuelcap; // capacidade de armazenamento do combustivel
    public int mpg; // consumo de combustivel, milhas por galoes

    //Calculo da autonomia.
    public void range(){
        System.out.println(" Range is " + fuelcap * mpg);
    }
}
