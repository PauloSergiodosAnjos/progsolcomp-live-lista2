/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
    Data: 28/05/2023
*/
import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número positivo: ");
        double num = input.nextDouble();

        for (int i = 1; i < num; i++) {
            double soma = (i + i);
            if (soma > num) {
                break;
            }
            System.out.println(soma);
        }
        input.close();
    }
}
