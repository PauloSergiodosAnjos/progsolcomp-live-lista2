/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
    Data: 24/04/2023
*/

public class task_5 {
    public static void main(String[] args) throws Exception{
        double fatorial = 1;
        double n = 5;

        for (int i = 1; i <= n; i = i + 1) {
            fatorial = fatorial * i; // 100
        }

        System.out.println(fatorial);
    }
}
