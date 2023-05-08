/* 
* Nome do Aluno: Paulo Sérgio
* RA: 722310346
* Nome do Programa: Faça um programa que leia o nome, o sobrenome, a idade, em
* anos, e a naturalidade (cidade de nascimento) de uma pessoa.
* Depois, o programa deve dar a seguinte opção “Deseja
* visualizar dados completos?”. Se o caractere digitado pelo
* usuário for ‘S’ o programa deve imprimir na tela Nome,
* Sobrenome, idade e naturalidade. Se o caractere digitado pelo
* usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
* o caractere não for nenhuma das outras opções acima o programa
* deve imprimir “Digitação errada. Tente Novamente”.
* Data: 14/04/2023
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        input.nextLine();

        System.out.println("Digite a sua naturalidade: ");
        String naturalidade = input.nextLine();

        System.out.println("Deseja visualiza dados completos? (S para sim, N para não)");
        String resposta = input.nextLine();

        if (resposta.equals("S")) {
            System.out.println("Seu nome é " + nome + " " + "Sua idade é " + idade + " " + "Sua naturalidade é " + naturalidade);
        } else if (resposta.equals("N")) {
            System.out.println("Seu nome é " + nome + " " + "Sua idade é " + idade);
        } else {
            System.out.println("Digitação errada!");
        }
        input.close();
    }
}
