/*
 * 
 * @author: Mateus Maidel GRR:20193839
 */

 import java.util.Scanner;

 public class Locadora
{
    public static void main (String args[])
    {
        /** inicia a classe scanner */
        Scanner input=new Scanner(System.in);

        /** Solicita a quantidade de DVDs que a locadora possui */
        System.out.println("\nDigite a quantidade de DVDs: ");
        /** atribui o valor digitado a uma variavel */
        float dvd=input.nextFloat();

        /** Solicita o valor do aluguel */
        System.out.println("\nDigite o valor do aluguel: ");
        //* atribui o valor digitado a uma variavel */
        float rent=input.nextFloat();

        /** faturamento anual com loca��o */
        float rentedDvds=(dvd*rent/3)*12;

        /** faturamento com atraso de aluguel */
        float fee=((dvd/3)/10)*(rent/10);

        /** imprime os valores formatados, com duas casas depois da virgula */
        System.out.format("O faturamento anual com locacao e de: R$ %.2f", rentedDvds);
        System.out.format("\nO faturamento mensal com DVDs atrasados é de R$ %.2f", fee);
        System.out.println();
    }
}
