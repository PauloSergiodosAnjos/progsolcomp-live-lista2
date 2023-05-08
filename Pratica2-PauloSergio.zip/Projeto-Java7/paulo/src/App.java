/* 
* Nome do Aluno: Paulo Sérgio
* RA: 722310346
* Nome do Programa:  Crie um programa que lê um número entre 1 e 12, correspondendo
* a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
* Ao final, o programa deve imprimir uma mensagem identificando,
* com base no número digitado, o nome do mês e a estação. 
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um mês, sendo 1-Janeiro, 2-fevereiro, 3-março... ");

        String resposta = input.nextLine();

        if (resposta.equalsIgnoreCase("1")) {
            System.out.println("Janeiro, Verão");
        } else if (resposta.equalsIgnoreCase("2")) {
            System.out.println("Fevereiro, Verão");
        } else if (resposta.equalsIgnoreCase("3")) {
            System.out.println("Março, Outono");
        } else if (resposta.equalsIgnoreCase("4")) {
            System.out.println("Abril, Outono");
        } else if (resposta.equalsIgnoreCase("5")) {
            System.out.println("Maio, Outono");
        } else if (resposta.equalsIgnoreCase("6")) {
            System.out.println("Junho, Inverno");
        } else if (resposta.equalsIgnoreCase("7")) {
            System.out.println("Julho, Inverno");
        } else if (resposta.equalsIgnoreCase("8")) {
            System.out.println("Agosto, Inverno");
        } else if (resposta.equalsIgnoreCase("9")) {
            System.out.println("Setembro, Primavera");
        } else if (resposta.equalsIgnoreCase("10")) {
            System.out.println("Outubro, Primavera");
        } else if (resposta.equalsIgnoreCase("11")) {
            System.out.println("Novembro, Primavera");
        } else if (resposta.equalsIgnoreCase("12")) {
            System.out.println("Dezembro, Verão");
        } else {
            System.out.println("Digite um mês válido!");
        }
        input.close();
    }
}
