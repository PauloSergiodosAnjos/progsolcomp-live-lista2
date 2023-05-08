/* 
* Nome do Aluno: Paulo Sérgio
* RA: 722310346
* Nome do Programa: Construa um programa que receba como entrada três valores A, B
* e C e os imprima em ordem crescente.
* Data: 14/04/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = input.nextInt();

        int menor = Math.min(Math.min(a, b), c);
        int maior = Math.max(Math.max(a, b), c);
        int medio = (a + b + c) - menor - maior;

        System.out.println("Seus números em ordem crescente: " + menor + ", " + medio + ", " + maior);

        input.close();
    }
}
