/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static List<Aluno> listaAlunos;
    private static List<Professor> listaProfessor;
    private static List<Disciplinas> listaDisciplinas;

    public static void primeiraEntrada() {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 para Menu Professor ou 2 para Menu Aluno");
        System.out.println("Digite a opção desejada:");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                Menu.imprimirMenuP();
                Menu.escolheOpcaoP();
                break;
            case 2:
                Menu.imprimirMenuA();
                Menu.escolheOpcao();
                break;
            default:
                System.out.println("Digite uma opção válida");
                break;
        }

    }

    public static void imprimirMenuP() {
        String menu = "------------------------------------ \n"
                + "------------- MENU PROFESSOR ----------------- \n"
                + "------------------------------------ \n"
                + "1 – Cadastrar Professor \n"
                + "2 – Cadastrar Disciplina para Professor \n"
                + "3 – Imprimir Lista Professor/Disciplina \n"
                + "------------------------------------ \n";

        System.out.println(menu);

    }

    public static void escolheOpcaoP() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a opção desejada:");
        int opcao = input.nextInt();
        List<Professor> professores = new ArrayList();
        List<Disciplinas> materias = new ArrayList();

        switch (opcao) {
            case 1:

                System.out.println("----- CADASTRO DE PROFESSOR ------");
                System.out.println("Quantos Professores?");
                int qtd = input.nextInt();

                for (int i = 1; i <= qtd; i++) {
                    System.out.println("Nome:");
                    String nome = input.next();
                    System.out.println("Endereço:");
                    String endereco = input.next();
                    System.out.println("Salario:");
                    double salario = input.nextDouble();
                    System.out.println("Idade");
                    int idade = input.nextInt();

                    Professor p = new Professor(salario, null, nome, idade, endereco);
                    professores.add(p);
                    Menu.setListaProfessor(professores);

                }

                System.out.println("----- PROFESSOR(ES) CADASTRADO(S) COM SUCESSO ------");
                break;

            case 2:

                System.out.println("----- CADASTRAR DISCIPLINAS ------");
                System.out.println("Quantas Materias?");
                qtd = input.nextInt();

                for (int i = 1; i <= qtd; i++) {
                    System.out.println("Digite o nome da Disciplina");
                    String disciplina = input.next();
                    System.out.println("Digite o nome do Professor");
                    String professor = input.next();
                    Menu.setListaDisciplinas(materias);
                    String retorno = Menu.professorDisciplina(professor, disciplina);
                    System.out.println(retorno);

                }
                break;

            case 3:
                System.out.println(Menu.imprimirListaProfessorDisciplinas(listaProfessor));

            default:
                System.out.println("Digite uma opção válida");
                break;

        }
    }

    public static String imprimirListaProfessorDisciplinas(List<Professor> professor) {
        String lista = "PROFESSOR ---- MATERIAS \n";

        for (Professor p : professor) {
            lista += p.getNome() + " - " + p.getDisc() + "\n";
        }
        System.out.println(lista);
        return lista;

    }

    public static void imprimirMenuA() {
        String menu = "------------------------------------ \n"
                + "------------- MENU ALUNO ----------------- \n"
                + "------------------------------------ \n"
                + "1 – Cadastrar Aluno \n"
                + "2 – Excluir aluno por nome \n"
                + "3 – Listar Alunos \n"
                + "4 – Matricular Aluno em Disciplina \n"
                + "5 – Cancelar Matrícula \n"
                + "6 – Imprimir lista Alunos e Disciplinas Matriculadas \n"
                + "------------------------------------ \n";

        System.out.println(menu);

    }

    public static void escolheOpcao() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a opção desejada:");
        int opcao = input.nextInt();
        List<Aluno> alunos = new ArrayList();

        switch (opcao) {
            case 1:

                System.out.println("----- CADASTRO DE ALUNO ------");
                System.out.println("Quantos Alunos?");
                int qtd = input.nextInt();

                for (int i = 1; i <= qtd; i++) {
                    System.out.println("Nome:");
                    String nome = input.next();
                    System.out.println("Endereço:");
                    String endereco = input.next();
                    System.out.println("Matricula:");
                    String matricula = input.next();
                    System.out.println("Curso:");
                    String curso = input.next();
                    System.out.println("Período");
                    int periodo = input.nextInt();
                    System.out.println("Idade");
                    int idade = input.nextInt();
                    System.out.println("Quantidade de Disciplinas Permitidas:");
                    int qtdDisciplinasPermitidas = input.nextInt();

                    Aluno a = new Aluno(matricula, curso, periodo,
                            qtdDisciplinasPermitidas, nome, idade, endereco);
                    alunos.add(a);
                }

                Menu.cadastrarAluno(alunos);
                System.out.println("----- ALUNO(S) CADASTRADO(S) COM SUCESSO ------");
                break;

            case 2: {
                System.out.println("----- EXCLUIR ALUNO ------");
                System.out.println("Digite o nome do Aluno a ser excluído");
                String nomeAluno = input.next();
                Menu.excluirAlunoPorNome(nomeAluno);
                System.out.println("----- ALUNO EXCLUÍDO COM SUCESSO ------");

            }
            break;

            case 3:
                System.out.println("----- LISTA DE ALUNOS ------");
                Menu.listarAlunos(listaAlunos);
                System.out.println("----------------------------");
                break;

            case 4:
                System.out.println("----- MATRICULA ------");
                System.out.println("Informe o Aluno: ");
                String a1uno = input.next();
                System.out.println("Informe a matéria ");
                String disciplina = input.next();
                String retorno = Menu.matricularAlunoEmDisciplina(a1uno, disciplina);
                System.out.println(retorno);

                break;

            case 5:
                System.out.println("----- CANCELAR MATRICULA ------");
                System.out.println("Informe o Aluno: ");
                String aluno = input.next();
                System.out.println("Informe a matéria ");
                disciplina = input.next();
                Menu.cancelarMatricula(aluno, disciplina);
                break;

            case 6:
                Menu.imprimirListaDeAlunoseDisciplinas(listaAlunos);
                break;

            default:
                break;

        }

    }

    public static void cadastrarAluno(List<Aluno> aluno) {
        Menu.listaAlunos = aluno;
    }

    public static void excluirAlunoPorNome(String nomeAluno) {

        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno a = listaAlunos.get(i);

            if (a.getNome().equals(nomeAluno)) {
                listaAlunos.remove(a);
            }
        }

    }

    public static void listarAlunos(List<Aluno> alunos) {
        String lista = " ";

        for (Aluno a : alunos) {
            lista += a.getNome() + ";" + "\n";
        }
        System.out.println(lista);

    }

    public static String matricularAlunoEmDisciplina(String nomeAluno, String disciplina) {
        List<String> materias = new ArrayList();
        String retorno = " ";

        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno a = listaAlunos.get(i);

            if (a.getNome().equals(nomeAluno)) {
                a.getDisciplinasMatriculadas();
                materias.add(disciplina);
                retorno += a.fazMatricula(materias);

            }
        }
        return retorno;

    }

    public static String professorDisciplina(String nomeProfessor, String disciplina) {
        List<Disciplinas> materias = new ArrayList();
        String retorno = " ";

        for (int i = 0; i < listaProfessor.size(); i++) {
            Professor p = listaProfessor.get(i);

            if (p.getNome().equals(nomeProfessor)) {
                Disciplinas d = new Disciplinas(disciplina);
                materias.add(d);
                p.setDisc(materias);
                retorno = "Materia cadastrada com sucesso! ";

            }
        }
        return retorno;

    }

    public static String cancelarMatricula(String nomeAluno, String disciplina) {
        List<String> materias = new ArrayList();
        materias.add(disciplina);
        String retorno = " ";

        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno a = listaAlunos.get(i);

            if (a.getNome().equals(nomeAluno)) {
                a.getDisciplinasMatriculadas().remove(disciplina);
                retorno = a.fazMatricula(materias);
            }
        }
        return null;

    }

    public static String imprimirListaDeAlunoseDisciplinas(List<Aluno> alunos) {
        String lista = "ALUNO ---- MATERIAS \n";

        for (Aluno a : alunos) {
            lista += a.getNome() + " - " + a.getDisciplinasMatriculadas() + "\n";
        }
        System.out.println(lista);
        return lista;

    }

    public static List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public static void setListaProfessor(List<Professor> listaProfessor) {
        Menu.listaProfessor = listaProfessor;
    }

    public static List<Disciplinas> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public static void setListaDisciplinas(List<Disciplinas> listaDisciplinas) {
        Menu.listaDisciplinas = listaDisciplinas;
    }

}

