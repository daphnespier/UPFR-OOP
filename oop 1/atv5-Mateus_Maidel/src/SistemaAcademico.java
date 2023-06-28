

import java.util.Scanner;
import java.util.List;

class InvalidMenuOption extends Exception {

    public InvalidMenuOption() {

    }
}

class NameDoesntExist extends Exception {

    public NameDoesntExist() {

    }
}

public class SistemaAcademico {

    static Aluno listaAlunos[];

    public static int callMenu() {
        boolean flag = false;
        String str = "";
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma ação:\n"
                + "1 - Cadastrar Aluno\n"
                + "2 - Excluir Aluno por nome\n"
                + "3 - Listar Alunos\n"
                + "4 - Matricular Aluno em Disciplina\n"
                + "5 - Cancelar matricula\n"
                + "6 - Imprimir Lista de alunos e Disciplinas\n"
                + "7 - Sair");

        flag = false;

        while (!flag) {
            try {
                str = sc.next();
                a = Integer.parseInt(str);
                if (a > 7) {
                    throw new InvalidMenuOption();
                }
                flag = true;
            } catch (NumberFormatException | InvalidMenuOption e) {
                System.out.println("Digite um opçao de menu valida!");
            }
        }

        return a;
    }

    public static void cadastrarAluno(Aluno aluno) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int a = 0;
        boolean flag = false;

        System.out.println("-------Cadastro de Aluno-------");
        System.out.print("Nome: ");
        str = sc.next();
        aluno.setNome(str);

        System.out.print("Matricula: ");
        str = sc.next();
        aluno.setMatricula(str);

        System.out.print("Curso: ");
        str = sc.next();
        aluno.setCurso(str);

        while (!flag) {

            try {
                System.out.print("Periodo: ");
                str = sc.next();
                a = Integer.parseInt(str);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite um Periodo valido!");
            }
            aluno.setPeriodo(a);
        }
        flag = false;

        while (!flag) {

            try {
                System.out.print("Idade: ");
                str = sc.next();
                a = Integer.parseInt(str);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite uma Idade valida!");
            }
            aluno.setIdade(a);
        }
        flag = false;

        while (!flag) {

            try {
                System.out.print("Quantidade de disciplinas permitidas: ");
                str = sc.next();
                a = Integer.parseInt(str);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite uma quantidade valida!");
            }
            aluno.setQtdDisciplinasPermitidas(a);

        }
        flag = false;
        System.out.println("\n Aluno cadastrado com sucesso!");

    }

    public static void excluirAlunoPorNome(String nomeAluno) {
        int j = 0;
        for (j = 0; !nomeAluno.equals(listaAlunos[j].getNome()); j++) {
        }

        listaAlunos[j].setNome("");
        listaAlunos[j].setCurso("");
        listaAlunos[j].setMatricula("");
        listaAlunos[j].setPeriodo(0);
        listaAlunos[j].setIdade(0);
        listaAlunos[j].setQtdDisciplinasPermitidas(0);

    }

    public static Aluno[] listarAlunos() {
        int i;
        System.out.println("LISTA DE ALUNOS: ");
        for (i = 0; i < listaAlunos.length; i++) {
            System.out.println((i + 1) + ") " + listaAlunos[i].getNome());
        }
        System.out.println("------------------------\n\n");

        return listaAlunos;
    }

    public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina) {
        String a = "";

        System.out.println(aluno.fazMatricula(disciplina));

        return a;
    }

    public static String cancelarMatricula(Aluno aluno, String disciplina) {
        String a = "";

        System.out.println(aluno.cancelaMatricula(disciplina));

        return a;
    }

    public static String imprimirListaDeAlunosEDisciplinas() {
        String a = "\nFim da lista de alunos";

        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.println(listaAlunos[i].imprime());
        }

        return a;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = "", nome = "&!#$";
        int qtdAlunos = 0, i = 0, j = 0, opcao = 0;
        boolean flag = false;

        System.out.println("Bem-vindo ao Sistema academico!\n"
                + "Quantos alunos serão cadastrados?");

        while (!flag) {
            try {
                str = sc.next();
                qtdAlunos = Integer.parseInt(str);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero inteiro valido!");
            }
        }
        listaAlunos = new Aluno[qtdAlunos];

        for (i = 0; i < qtdAlunos; i++) {
            listaAlunos[i] = new Aluno("", "", "", 0, 0, 0);
        }
        i = 0;

        while (opcao != 7) {

            opcao = callMenu();

            switch (opcao) {

                case 1:
                    cadastrarAluno(listaAlunos[i]);
                    i++;
                    break;

                case 2:
                    flag = false;
                    while (!flag) {
                        try {
                            System.out.print("Nome do aluno para excluir: (digite \"sair\" para voltar ao menu)");
                            nome = sc.next();
                            for (j = 0; j < i && !nome.equals(listaAlunos[j].getNome()); j++) {
                            }

                            if (nome.equals(listaAlunos[j].getNome())) {
                                excluirAlunoPorNome(nome);
                                i--;
                                System.out.println("O aluno foi excluido com sucesso. Retornando ao menu \n\n");
                                break;
                            } else if (nome.equals("sair")) {
                                System.out.println("\nSaindo da função excluir...\n");
                                break;
                            } else {
                                throw new NameDoesntExist();
                            }
                        } catch (NameDoesntExist e) {
                            System.out.println("O nome não existe. Tente novamente");

                        }

                    }
                case 3:
                    listarAlunos();
                    break;

                case 4:
                    flag = false;
                    while (!flag) {
                        try {
                            System.out.print("Nome do aluno para matricular (digite \"sair\" para voltar ao menu): ");
                            nome = sc.next();
                            for (j = 0; j < i && !nome.equals(listaAlunos[j].getNome()); j++) {
                            }

                            if (nome.equals(listaAlunos[j].getNome())) {
                                System.out.println("Digite a materia para matricular este aluno: ");
                                str = sc.next();
                                matricularAlunoEmDisciplina(listaAlunos[j], str);
                                break;
                            } else if (nome.equals("sair")) {
                                System.out.println("\nSaindo da função Matricular...\n");
                                break;
                            } else {
                                throw new NameDoesntExist();
                            }
                        } catch (NameDoesntExist e) {
                            System.out.println("O nome não existe. Tente novamente");

                        }

                    }
                    break;

                case 5:
                    flag = false;
                    while (!flag) {
                        try {
                            System.out.print("Nome do aluno para cancelar matricula (digite \"sair\" para voltar ao menu): ");
                            nome = sc.next();
                            for (j = 0; j < i && !nome.equals(listaAlunos[j].getNome()); j++) {
                            }

                            if (nome.equals(listaAlunos[j].getNome())) {
                                System.out.println("Digite a materia para matricular este aluno: ");
                                str = sc.next();
                                cancelarMatricula(listaAlunos[j], str);
                                break;
                            } else if (nome.equals("sair")) {
                                System.out.println("\nSaindo da função Matricular...\n");
                                break;
                            } else {
                                throw new NameDoesntExist();
                            }
                        } catch (NameDoesntExist e) {
                            System.out.println("O nome não existe. Tente novamente");

                        }

                    }
                    break;
                case 6:
                    imprimirListaDeAlunosEDisciplinas();

            }
        }

    }
}
