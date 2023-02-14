/**
 *
 * @author Mateus Maidel  
 */


import java.util.Scanner;

public class SomaMatriz2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o tamanho da Matriz");
        int tamanho = input.nextInt();
        int[][] mat = new int[tamanho][tamanho];
        leMatriz(mat);
        int res = somaDiagonal(mat);
        System.out.printf("O resultado da Soma é: %d\n", 
                        res);
        
        
    }
    
    public static void leMatriz(int mat[][]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int c = 0; c < mat[i].length; c++) {

                System.out.printf("Informe %do valor da %da linha : ", 
                        c + 1, i + 1);
                mat[i][c] = input.nextInt();
            }
        }
    }
    
    public static int somaDiagonal(int mat[][]) {
        int soma = 0;
        int c = 0;
        for (int i = 0; i < mat.length; i++) {
            soma += mat[i][c];
            c++;
        }
        return soma;
    }
}