/* Faça uma classe executável que dados a distância percorrida (em
* Km) e o tempo gasto em uma viagem (em horas), informe a velocidade
* média do carro, sabendo que Velocidade = deltaS / deltaT (variação de distânciância /
* variação do tempo). Imprima o valor com duas casas decimais. */
/**
 *
 * @author Mateus Maidel -  
*/

import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args){

    	Scanner input = new Scanner(System.in);

    	//input do usuário.
    	System.out.println("\nDigite a distancia em KM: ");
    	float distancia = input.nextFloat(); 

    	System.out.println("\nDigite o tempo de viagem em HORAS: ");
    	float tempo = input.nextFloat(); 

    	//calculo da velocidade. 
    	float velocidade = distancia / tempo; 

    	//output com duas casas decimais
    	System.out.printf("%s%.2f%s\n", "A velocidade media eh: ", velocidade , " km/h");
    }
}