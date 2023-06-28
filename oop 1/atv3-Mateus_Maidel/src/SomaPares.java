/**
 *
 * @author Mateus Maidel  
 */
/** 
TAREFA 03
Faça uma classe executável que dado um conjunto de 20 elementos numéricos,
informe a soma de todos os números pares. Faça a validação de dados inválidos informando
o usuário, e fazendo-o repetir a digitação.
**/

import java.util.Scanner;

public class SomaPares {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[] numeros = new int[20];
int soma = 0;
String str;
for (int i = 0; i < 20; i++) {
System.out.println("Informe o " + (i + 1) + "º número:");
str = input.nextLine();
try {
numeros[i] = Integer.parseInt(str);
if (numeros[i] % 2 == 0) {
soma += numeros[i];
}
} catch (NumberFormatException e) {
System.out.println("Você digitou um valor inválido, por favor digite um número inteiro.");
i--;
}
}
System.out.println("A soma dos números pares é: " + soma);
input.close();
}
}
            