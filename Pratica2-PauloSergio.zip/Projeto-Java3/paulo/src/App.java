/* 
* Nome do Aluno: Paulo Sérgio
* RA: 722310346
* Faça um programa que leia um número inteiro e mostre uma
* mensagem indicando se este número é par ou ímpar e se é
* positivo ou negativo.
* Data: 14/04/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Seu número é Par!");
        } else {
            System.out.println("Seu número é Ímpar!");
        }

        if (num >= 0) {
            System.out.println("Seu número é Positivo!");
        } else {
            System.out.println("Seu número é Negativo!");
        }
        input.close();
    }
}
