package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        int n=0;
        double somaNotas=0,m=0;
        double a[];
        Scanner scan = new Scanner(System.in);
        scan.useLocale(new Locale("pt","BR"));
        System.out.println("Digite a quantidade de notas:");
        n=scan.nextInt();
        a = new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite a "+(i+1)+" nota:");
                a[i]=scan.nextDouble();



            somaNotas+=a[i];
        }
        m=(somaNotas/n);
        System.out.printf("A media das notas é %.2f",m);

    }

}
