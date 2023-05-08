/* 
* Nome do Aluno: Paulo Sérgio
* RA: 722310346
* Nome do Programa: Faça um programa calcula o total de uma hospedagem em um
* hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
* R$ 5.50 por diária, se o número de diárias for maior que 15;
* R$ 6.00 por diária, se o número de diárias for igual a 15;
* R$ 8.00 por diária, se o número de diárias for menor que 15.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de diárias: ");
        double valor_diaria = 60.00;
        int diarias = input.nextInt();
        double taxas;

        if (diarias >  15) {
            taxas = 5.50;
        } else if (diarias == 15) {
            taxas = 6.00;
        } else {
            taxas = 8.00;
        }

        double total = (diarias * valor_diaria) + (taxas * diarias);

        System.out.print("O valor total da hospedagem é: " + total + " " + "R$");
        input.close();
    }
}
