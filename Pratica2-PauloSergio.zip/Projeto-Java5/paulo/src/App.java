/* 
* Nome do Aluno: Paulo Sérgio
* RA: 722310346
* Nome do Programa: Faça um programa para imprimir o conceito de um aluno. O
* conceito é calculado em função da nota do aluno que varia de 0
* a 100. As faixas da correlação são mostradas abaixo:
* Nota Conceito
* 0 a 49 Insuficiente
* 50 a 64 Regular
* 65 a 84 Bom
* 85 100 Ótimo
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = input.nextInt();
        
        if (nota >= 0 && nota <= 49) {
            System.out.println("Insuficiente");
        } else if (nota >= 50 && nota <= 64) {
            System.out.println("Regular");
        } else if (nota >= 65 && nota <= 84) {
            System.out.println("Bom");
        } else if (nota >= 85 && nota <= 100) {
            System.out.println("Ótimo");
        } else {
            System.out.println("Digite um valor correto!");
        }
        input.close();
    }
}
