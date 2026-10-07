package Iniciante;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        b = scan.nextInt();
        scan.close();
        c=a+b;
        System.out.println(c);
    }
}
