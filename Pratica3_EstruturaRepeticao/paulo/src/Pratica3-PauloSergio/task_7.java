/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).

    Data: 24/04/2023
*/

import java.util.Scanner;

public class task_7 {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double cargaMaxima, pesoNovo;
        double soma = 0;
        double novaSoma = 0;

        System.out.print("Qual a carga máxima permitida: ");
        cargaMaxima = input.nextDouble();

        for (int i = 0; i < 6; i++) {
        System.out.print("Qual o peso das pessoas: " + "pessoa " + (i + 1) + " ");
        double peso = input.nextDouble();
        soma = soma + peso;
        }

        
        do {
            if (soma > cargaMaxima) {
                System.out.print("Limite atingido! Digite novos pesos: ");
                for (int i = 0; i < 6; i++) {
                    System.out.print("Qual o peso das pessoas: " + "pessoa " + (i + 1) + " ");
                    pesoNovo = input.nextDouble();
                    novaSoma = novaSoma + pesoNovo;
                    }

                if (novaSoma <= cargaMaxima) {
                    System.out.printf("Liberado! peso: %.2f carga máxima: %.2f" , novaSoma, cargaMaxima);
                    break;
                }
            } 
        } while(soma > cargaMaxima);

        if (soma <= cargaMaxima) {
            System.out.printf("Liberado! peso: %.2f carga máxima: %.2f" , soma, cargaMaxima);
        }

        input.close();
    }
}
