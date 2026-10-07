package Iniciante;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args){
        double tempC=0,tempF=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        tempC=scan.nextDouble();
        tempC*=(9.0 /5);
        tempF=tempC+32;
        System.out.println("A temperatura em Fahrenheit é:"+ tempF+"ºF");
    }
}
