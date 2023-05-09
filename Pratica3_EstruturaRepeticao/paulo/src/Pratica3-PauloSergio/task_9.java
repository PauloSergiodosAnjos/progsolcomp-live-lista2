/* Nome do Aluno: Paulo Sérgio dos Anjos
    RA: 722310346
    Nome do Programa: Faça um programa que preencha com zeros todas as posições de
uma matriz com 10 linha e 10 colunas
    Data: 24/04/2023
*/

public class task_9 {
    public static void main(String[] args) throws Exception {
        int vetor_Matriz[][] = new int[10][10];
        
        for (int i = 0; i < vetor_Matriz.length; i++) {
            for (int j = 0; j < vetor_Matriz.length; j++) {
                vetor_Matriz[i][j] = 0;
            }
        }
        
        for (int i = 0; i < vetor_Matriz.length; i++) {
            for (int j = 0; j < vetor_Matriz.length; j++) {
                System.out.println(vetor_Matriz[i][j]);
            }
        }
    }
}
