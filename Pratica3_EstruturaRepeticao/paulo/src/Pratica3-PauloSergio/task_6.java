/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)

    Data: 24/04/2023
*/

import java.util.Scanner;

public class task_6 {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número em cm cúbicos");
        double num = input.nextDouble();

        double i = 0;

        while (num <= 1000) {
            num = num * 2;
            
            i++;
        }
        System.out.printf("O tempo necessário são de %.2f segundos para ultrapassar 1000", i);

        input.close();
    }
}
