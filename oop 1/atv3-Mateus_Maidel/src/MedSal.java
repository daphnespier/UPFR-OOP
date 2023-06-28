/*TAREFA 03
Escreva um programa com os seguintes passos: 
* 1) Peça ao usuário que informe quantos funcionários existem na empresa. 
* 2) Instancie um array de strings e um array de doubles com o tamanho informado. 
* 3) Peça ao usuário que informe o nome e o salário de cada funcionário e armazene o 
* nome no array de strings e o salário no array de doubles. 
* 4) Calcule a média salarial da empresa. 
* 5) Imprima a lista de nomes/salários que estão acima da média salarial. 
* Obs.: Faça o tratamento das entradas de dados. Se o usuário informar um
salário inválido, peça para ele informar novamente. Imprima os salários com duas casas
decimais. Os nomes devem conter ao menos 3 caracteres. */ 
/**
 *
 * @author Mateus Maidel  
 */
import java.util.Scanner;

public class MedSal{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
  		Double sal[] = new Double[80];
  		String nome[] = new String[80];
  		int i;
  		String str;

        System.out.println("\nDigite a quantidade de funcionarios: \n");
        int qtd = input.nextInt();

        for (i = 0; i < qtd; i++) {

        		System.out.println("\nNome: ");
        		nome[i] = input.next();

        		System.out.println("\nSalario: ");
           	 	str = input.next();
           	 	
           try{	
                
                sal[i] = Double.parseDouble(str);

               
            }

            catch(NumberFormatException e){

                    System.out.println("Digite um numero valido");

            }
        }

        for (i = 0; i < qtd; i++) {
            System.out.println(nome[i]);
            System.out.printf("Salario: \n%.2f ", sal[i]);
        }
    }    
}
