package Iniciante;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        double pi=3.14;
        double r=0;
        double area=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o raio do Circulo:");
        r=sc.nextDouble();
        r*=r;
        area = r*pi;
        System.out.println("A area do circulo é "+area);
    }
}
