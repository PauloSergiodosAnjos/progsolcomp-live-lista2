/* 
* Nome do Aluno: Paulo Sérgio
* RA: 722310346
* Nome do Programa:  Faça um programa que receba o valor da venda, escolha a
* condição de pagamento no menu e mostre o total da venda final
* conforme condições a seguir:
* Venda a Vista - desconto de 10%
* Venda a Prazo 30 dias - desconto de 5%
* Venda a Prazo 60 dias - mesmo preço
* Venda a Prazo 90 dias - acréscimo de 5%
* Venda com cartão de débito - desconto de 8%
* Venda com cartão de crédito - desconto de 7%
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor do produto? ");
        double valor = input.nextDouble();

        input.nextLine();

        System.out.println("Qual a forma de pagamento? (a Vista-1, a Prazo 30dias-2, a Prazo 60dias-3, a Prazo 90dias-4, Débito-5, Crédito-6)");
        String pagamento = input.nextLine();

        double desconto1 = (valor * 10) / 100;
        double desconto2 = (valor * 5) / 100;
        double desconto3 = (valor * 5) / 100;
        double desconto4 = (valor * 8) / 100;
        double desconto5 = (valor * 7) / 100;

        if (pagamento.equalsIgnoreCase("1")) {
            System.out.print("O valor total é de: " + (valor - desconto1) + " " + "R$" );
        } else if (pagamento.equalsIgnoreCase("2")) {
            System.out.print("O valor total é de: " + (valor - desconto2) + " " + "R$" );
        } else if (pagamento.equalsIgnoreCase("3")) {
            System.out.print("O valor total é de: " + valor + " " + "R$" );
        } else if (pagamento.equalsIgnoreCase("4")) {
            System.out.print("O valor total é de: " + (valor + desconto3) + " " + "R$" );
        } else if (pagamento.equalsIgnoreCase("5")) {
            System.out.print("O valor total é de: " + (valor - desconto4) + " " + "R$" );
        } else if (pagamento.equalsIgnoreCase("6")) {
            System.out.print("O valor total é de: " + (valor - desconto5) + " " + "R$" );
        }
        input.close();
    }
}


