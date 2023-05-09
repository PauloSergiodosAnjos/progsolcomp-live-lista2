/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)
    Data: 24/04/2023
*/

public class task_3 {
    public static void main(String[] args) throws Exception{
        
            int num = 0;
    
            do {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
                num++;
            } while (num % 7 != 0);
        }
    }

