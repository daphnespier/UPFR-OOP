/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_2;

import java.util.List;

public class Aluno extends Pessoa{


    public String matricula;
    public String curso;
    private int periodo;
    private int qtdDisciplinasPermitidas;
    public List<String> disciplinasMatriculadas;

    public Aluno(String matricula, String curso, int periodo, 
            int qtdDisciplinasPermitidas, String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.qtdDisciplinasPermitidas = qtdDisciplinasPermitidas;
    }

    public String fazMatricula(List<String> disciplina) {
        String retorno = " ";
        this.setDisciplinasMatriculadas(disciplina);

        if (disciplinasMatriculadas.size() > qtdDisciplinasPermitidas) {
            retorno = "Quantidade de disciplinas excedida. "
                    + "O limite de disciplinas para este aluno é de 2 disciplina(s). "
                    + "Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula";

            int i = this.qtdDisciplinasPermitidas;
            disciplinasMatriculadas.remove(disciplinasMatriculadas.get(i));

        } else if (disciplinasMatriculadas.size() == 0) {
            retorno = "Este aluno não pode ser matriculado em "
                    + "nenhuma disciplina, por favor, fale com a secretaria.";
        } else {
            retorno = "Matricula " + disciplina + " executada";
        }
        
        return retorno;
    }

    public String imprime() {
        String materias = " ";
        
        if (this.disciplinasMatriculadas == null) {
           materias = "Não possui Disciplinas Vinculadas";
        } else {
           materias = this.disciplinasMatriculadas.toString();
        }
        
        String relatorio = "-----------------------------------------------------------------" + "\n"
                + "Nome do Aluno: " + this.nome + "\n"
                + "Matricula: " + this.matricula + "\n"
                + "Curso: " + this.curso + "\n"
                + "Periodo: " + this.periodo + "\n"
                + "Quantidade de Matérias: " + this.qtdDisciplinasPermitidas + "\n"
                + "Disciplinas: " + materias + "\n" +
                "-----------------------------------------------------------------";
        
        
        return relatorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdDisciplinasPermitidas() {
        return qtdDisciplinasPermitidas;
    }

    public void setQtdDisciplinasPermitidas(int qtdDisciplinasPermitidas) {
        this.qtdDisciplinasPermitidas = qtdDisciplinasPermitidas;
    }

    public List<String> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(List<String> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
