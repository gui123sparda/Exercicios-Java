package Iniciante;
import java.util.Scanner;

public class Atv2 {

    public static void main(String[] args) {
        String nome="";
        int idade=0;
        System.out.println("Digite o seu nome:");
        Scanner scan = new Scanner(System.in);
        nome = scan.next();

        System.out.println("Digiter sua Idade:");
        idade = scan.nextInt();
        scan.close();

        System.out.println("Olá, "+nome+",você tem "+idade+" anos.");





    }




}
