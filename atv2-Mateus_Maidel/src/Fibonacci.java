/*Escreva um programa que tenha como entrada do usuário, através do
teclado, um número inteiro positivo. Imprima a série de Fibonacci (0, 1 , 1, 2, 3, 5,
8, 13, 21, ...) até que o número da série seja maior que o número fornecido pelo
usuário.*/
/**
 *
 * @author Mateus Maidel -  
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

    	Scanner input = new Scanner(System.in);

    	//input do usuário
    	System.out.println("\nDigite um numero inteiro: ");
    	int fn = input.nextInt();

        //imprime em tela os primeiros valores da sequencia
        int f1=0, f2=1, f3=0;
        System.out.printf("%d %d", f1, f2);

        //faz o laço para que os valores sejam substituídos e somados para completar a sequência
        while (f3 <= fn) {
            f3 = f1 + f2;
            System.out.printf(" %d", f3);
            f1 = f2;
            f2 = f3;
        }
    System.out.println();

    }
}