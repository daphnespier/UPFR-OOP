

import java.util.Scanner;


public class ProgramaNome {

    public static void main(String args[]) {

        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        String str;
        int i;
        boolean flag = false;

        System.out.println("Digite o nome:");
        str = sc.nextLine();
        pessoa.setNome(str);

        System.out.println("Digite o endereco: ");
        str = sc.nextLine();
        pessoa.setEndereco(str);

        System.out.println("Digite a idade: ");

        while (!flag) {
            try {
                str = sc.next();
                i = Integer.parseInt(str);
                pessoa.setIdade(i);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite uma idade valida!");
            }
        }
        System.out.println(pessoa.imprime());

        System.out.println("Fez um aniversario");
        pessoa.fazAniversario();
        System.out.println("Fez um aniversario");
        pessoa.fazAniversario();
        System.out.println("Fez um aniversario");
        pessoa.fazAniversario();
        System.out.println("Fez um aniversario");
        pessoa.fazAniversario();

        System.out.println(pessoa.imprime());

    }

}
