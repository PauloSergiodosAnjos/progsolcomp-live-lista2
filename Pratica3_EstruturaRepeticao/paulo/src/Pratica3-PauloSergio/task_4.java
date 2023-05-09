/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
    Data: 24/04/2023
*/

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = input.nextInt();

        while (num >= 0) {
            System.out.println("Digite um número válido!");
            num = input.nextInt(); 
        }

        input.close();
    }
}
