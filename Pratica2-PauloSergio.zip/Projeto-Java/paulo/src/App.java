import java.util.Scanner;

/* Nome do Aluno: Paulo Sérgio
 * RA:722310346
 * Faça um programa que leia dois números A e B e imprima o maior
 * deles.
 * 14/04/2023
 */


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Digite um número");
        num1 = input.nextDouble();

        System.out.println("Digite outro número");
        num2 = input.nextDouble();

        if (num1 > num2) {
        System.out.println(num1);
        } else if (num2 > num1) {
        System.out.println(num2);
        } else {
        System.out.println("iguais");
        }
        
        input.close();
    }
}
