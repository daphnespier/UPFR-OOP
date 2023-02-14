
/** 
TAREFA 03
* Construa um programa que seja capaz de efetuar a média de todos os argumentos
* inteiros ou reais recebidos do teclado e imprimi-los. Argumentos inválidos 
* devem ser desconsiderados (Imprimir uma mensagem para cada valor inválido.), 
* sem provocar a exibição de exceções (Exiba uma mensagem para o usuário 
* pedindo a ele que informe novamente o valor). O usuário deve digitar S 
* quando desejar encerrar a entrada de dados;
**/
/**
 *
 * @author Mateus Maidel  
 */
import java.util.Scanner;

public class media2{

     public static void main(String args[]){

        String str;
        Scanner sc=new Scanner(System.in);
        double n;
        boolean flag=false;
        Double media = 0.00;
        Double res = 0.00;
        int contador = 0;

        System.out.println("Digite 's' para sair ou um numero para calcular a media" );

        while(!flag){
        
            str=sc.nextLine();
            
            try{

                n=Double.parseDouble(str);
                contador++;
                media += n;
                res = media/contador;

                System.out.printf("\n%s%.2f\n", "Soma =  ", media);
                System.out.printf("%s%.2f\n", "Media =  ", res);
                
                System.out.println("\nDigite a Nota:" );

                flag=false;
            }

            catch(NumberFormatException e){

                char end = str.charAt(0);

                if(end == 's'){

                    System.out.println("Voce encerrou o programa. A media total eh " + res);
                    break;

                } else {

                    System.out.println("Digite um numero valido");

                }
            }
        }
    }
}    