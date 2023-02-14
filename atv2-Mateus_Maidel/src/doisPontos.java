/* Construa um programa que leia do teclado dois pontos em um
*plano (x,y) e informe a distância entre eles. */
/**
 *
 * @author Mateus Maidel -  
*/

import java.util.Scanner;
import java.lang.Math;

public class doisPontos {
    public static void main(String[] args){

    	Scanner input = new Scanner(System.in);

    	//input do usuário.
    	System.out.println("\nDigite o valor do Primeiro Ponto: ");
    	System.out.print("X: ");
        float xUm = input.nextFloat();
        System.out.print("Y: ");
        float yUm = input.nextFloat();  

    	System.out.println("\nDigite o valor do Segundo Ponto: ");
        System.out.print("X: ");
        float xDois = input.nextFloat();
        System.out.print("Y: ");
        float yDois = input.nextFloat();

    	//calculo da distância, trazendo as funções de raiz quadrada e potência da biblioteca Math. 
    	float dAB = (float)Math.sqrt((float)Math.pow(xDois - xUm, 2) + (float)Math.pow(yDois - yUm, 2));

    	//output com duas casas decimais
    	System.out.printf("%s%.2f\n", "A distancia entre os pontos eh: ", dAB);
    }
}