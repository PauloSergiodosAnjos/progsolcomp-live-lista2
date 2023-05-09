/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Faça um programa que imprima todos os números pares de 1
a 100 na ordem inversa
    Data: 24/04/2023
*/

public class task_10 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 100; i++) {
            num = num + i;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + num);
    }
}
