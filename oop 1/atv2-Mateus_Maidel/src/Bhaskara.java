/*Construa um programa que leia os coeficientes de uma equação
*do segundo grau do teclado e mostre os valores de x da equação;*/

/**
 *
 * @author Mateus Maidel -  
*/

import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
    public static void main(String[] args){

    	Scanner input = new Scanner(System.in);

    	//input do usuário.
    	System.out.println("\nDigite os valores de A, B e C: ");
    	System.out.print("A: ");
        float coA = input.nextFloat();
        System.out.print("B: ");
        float coB = input.nextFloat();  
        System.out.print("C: ");
        float coC = input.nextFloat();

    	//calculo do delta
    	float delta = (float)Math.pow(coB, 2) - 4 * coA * coC;

        //verifica se delta é negativo
        if (delta < 0) {
            System.out.println("Não há soluções reais para a equação.");
            return;
        }

        delta = (float)Math.sqrt(delta);

        //calculo do x'
        float xUm = (-coB + delta) / (2 * coA);

        //calculo do x"
        float xDois = (-coB - delta) / (2 * coA);

    	//output com duas casas decimais
        System.out.println("\n O resultado eh: ");
    	System.out.printf("%s%.2f\n%s%.2f\n", "x'=  ", xUm , "x'' = ", xDois);
    }
}
