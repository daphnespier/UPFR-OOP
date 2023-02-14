/* 
* Implemente um programa que receba da linha de comando 3 argumentos. O
* primeiro e o segundo argumento são números reais e o terceiro argumento é a
* operação. Teste o seu programa com os seguintes casos de testes:
*
*  * @author Mateus Maidel -  
*/ 

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double numUm, numDois; 
        String vetor[];

        //input do usuário.
        System.out.println("\nDigite os numeros a serem calculados: ");
        String a = input.nextLine();

        //Separa o operador.
        int index = a.indexOf(" ");
        char operador = a.charAt(index + 1);
        double resultado;
         
        //separa o input por espaço
        vetor = a.split(" ");

        //converte a string para int e aloca as posições do vetor em variáveis 
        numUm = Double.parseDouble(vetor[0]);
        numDois = Double.parseDouble(vetor[2]);

        switch(operador)
        {
            case '+':
                resultado = numUm + numDois;
                System.out.print("\nO Resultado de " + numUm + " " + operador + " " + numDois + " = " + resultado + "\n");
                break;

            case '-':
                resultado = numUm - numDois;
                System.out.print("\nO Resultado de " + numUm + " " + operador + " " + numDois + " = " + resultado + "\n");
                break;

            case '*':
                resultado = numUm * numDois;
                System.out.print("\nO Resultado de " + numUm + " " + operador + " " + numDois + " = " + resultado + "\n");
                break;

            case '/':
                resultado = numUm / numDois;
                System.out.print("\nO Resultado de " + numUm + " " + operador + " " + numDois + " = " + resultado + "\n");
                break;
        }

    }
}
