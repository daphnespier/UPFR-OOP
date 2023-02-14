/* ) Implemente um programa que calcule o bônus anual de um funcionário
* de uma empresa. O programa pede para o usuário os seguintes dados: Cargo do
* funcionário e salário atual. Se o cargo for diretor o sistema pede quantidade de
* departamentos gerenciados. Se o cargo for gerente o sistema pede a quantidade
* de pessoas gerenciadas. Não é necessário fazer tratamento de entrada de dados.
* O cálculo do bônus anual segue as seguintes regras.
* a. Para Diretor:
* i. 4 salários + R$3000,00 por departamento gerenciado
* b. Para Gerente
* i. 2 salários + R$100,00 por pessoa gerenciada
* c. Analista
* i. 1 salário
* d. Programador
* i. 0,8 salário
* e. Auxiliar de Limpeza
* i. 0,5 salário */ 
/**
 *
 * @author Mateus Maidel -  
*/

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double bonus; 

    	//input do usuário.
    	System.out.println("\nCalcule seu bonus. Digite: ");
    	System.out.println("\n 1 - Para Diretor \n 2 - Para Gerente \n 3 - Para Analista \n 4 - Para Programador \n 5 - Para Auxiliar de Limpeza \n");
    	int cargo = input.nextInt();

    	if (cargo > 5 || cargo == 0 ) {

    		System.out.println("\nEntrada invalida. Tente novamente. ");

    	} else {

    	System.out.println("\nDigite seu salario atual: ");
    	double salario = input.nextDouble();


		        switch(cargo)
		        {
		            case 1:

				        System.out.println("Digite a quantidade de departamentos que voce gerencia: ");
				    	int departamentos = input.nextInt();

				    	bonus = (salario * 4) + (3000.00 * departamentos);

				    	System.out.printf("%s%.2f\n", "Seu bonus eh de: R$ ", bonus);
				    	break;

				    case 2:

				        System.out.println("Digite a quantidade de pessoas que voce gerencia: ");
				    	int pessoas = input.nextInt();

				    	bonus = (salario * 2) + (100.00 * pessoas);

				    	System.out.printf("%s%.2f\n", "Seu bonus eh de: R$ ", bonus);
				    	break;

				    case 3:

				    	bonus = salario;

				    	System.out.printf("%s%.2f\n", "Seu bonus eh de: R$ ", bonus);
				    	break;

				    case 4:

				    	bonus = (salario * 0.8);

				    	System.out.printf("%s%.2f\n", "Seu bonus eh de: R$ ", bonus);
				    	break;

					case 5:

				    	bonus = (salario * 0.5);

				    	System.out.printf("%s%.2f\n", "Seu bonus eh de: R$ ", bonus);
				    	break;		  

		  		 }
		  
        }

    }
}
