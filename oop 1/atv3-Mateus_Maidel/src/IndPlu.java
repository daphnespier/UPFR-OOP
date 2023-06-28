/**
TAREFA 03
*Escreva um programa que leia do teclado 7 valores reais correspondentes ao
*índice pluviométrico diário de uma semana. Após a leitura, o programa deve determinar o
*índice pluviométrico médio, máximo e mínimo com o respectivo dia da ocorrência;
**/
/**
 *
 * @author Mateus Maidel  
 */
import java.util.Scanner;

public class IndPlu {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("\nDigite os indices pluviometricos da semana: \n");
  		double vetor[] = new double[8];
  		int i;

        for (i = 0; i < 7; i++) {

        	System.out.printf("Informe o indice do %2do. dia da semana: ", (i+1));
            vetor[i] = input.nextDouble();

        }
       	double soma = 0.00;
       	double media = 0.00;
	    double menor = vetor[0]; // v[0] = 1o. valor armazenador no vetor "v"
	    double maior = vetor[0];
	    
	    for (i = 0; i < 7; i++) {

	    	soma = soma + vetor[i];
	    	media = soma/7;

	    	if (vetor[i] < menor)
	       		menor = vetor[i];

	    	if (vetor[i] > maior)
	       		maior = vetor[i];
	    }

		// Saída (resultados)
	    System.out.printf("\n");

	    for (i = 0; i < 7; i++) {

	      if (vetor[i] == menor)

	        System.out.printf("%do dia da semana = %.2f <--- menor indice\n", (i+1), vetor[i]);

	      else if (vetor[i] == maior)

	        System.out.printf("%do dia da semana = %.2f <--- maior indice\n", (i+1), vetor[i]);

	      else System.out.printf("%do dia da semana = %.2f\n", (i+1), vetor[i]);
	    }

	    System.out.printf("\nIndice medio = %.2f\n", media);
    }    
}