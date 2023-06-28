/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_2;

import java.util.List;

public class Disciplinas {

    private Professor prof;
    public String nome;
    private List<Disciplinas> lista;
    private List<Aluno> alunosMatriculados;

    public Disciplinas(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplinas> getLista() {
        return lista;
    }

    public void setLista(List<Disciplinas> lista) {
        this.lista = lista;
    }

}
