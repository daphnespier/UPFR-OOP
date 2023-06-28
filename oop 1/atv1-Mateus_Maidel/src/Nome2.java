/* 
*Crie um programa Nome que leia um nome completo na linha de comando e 
*imprima-o ao contrário.
*/
/**
 *
 * @author Mateus Maidel -  
*/

import java.util.Scanner;

public class Nome2{
    public static void main(String[] args){

    	Scanner input = new Scanner(System.in);
    	String nome[];

    	//input do usuário.
    	System.out.println("\nDigite seu nome completo: ");
    	String a = input.nextLine();

    	//separa o input por espaço
    	nome = a.split(" ");

    	//faz a exibição do vetor invertido.
    	for(int i = nome.length-1; i >= 0; i--){
            System.out.print("\n" + nome[i] + " ");
        }
    }
}


