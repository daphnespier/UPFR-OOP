

public class Aluno {

    private String nome = "", curso = "", endereco = "", matricula = "";
    private int periodo = 0, idade = 0, qtdDisciplinasPermitidas = 0;
    private String[] disciplinasMatriculadas;

    public Aluno(String nome, String matricula, String curso, int periodo, int idade, int qtdDisciplinasPermitidas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.qtdDisciplinasPermitidas = qtdDisciplinasPermitidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        this.disciplinasMatriculadas = new String[qtdDisciplinasPermitidas];
    }

    public String[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;

    }

    public String fazMatricula(String disciplina) {
        int qtdPermitidas = getQtdDisciplinasPermitidas();
        String[] disciplinas = getDisciplinasMatriculadas();
        String a = "";
        int i = 0;

        if (disciplinas.length == 0) {
            a = "Este aluno não pode ser matriculado em nenhuma disciplina. Por favor, fale com a secretaria";
        } else {
            while (disciplinas[i] != null && i < (qtdPermitidas - 1)) {
                i++;
            }

            if (disciplinas[i] == null) {
                disciplinas[i] = disciplina;
                setDisciplinasMatriculadas(disciplinas);
                a = "Matricula na disciplina " + disciplina + " realizada";
            } else if (disciplinas[i] != null) {
                a = "Quantidade de disciplinas excedida. O limite de disciplinas para esse aluno é de "
                        + qtdPermitidas + " disciplinas. Se desejar, cancele a matricula de uma das disciplinas e"
                        + " faça a nova matricula";
            }

        }

        return a;
    }

    public String cancelaMatricula(String disciplina) {

        String a = "";

        int i = 0;

        for (i = 0; i < disciplinasMatriculadas.length; i++) {

            if (disciplina.equals(disciplinasMatriculadas[i])) {
                disciplinasMatriculadas[i] = null;
                a = "Cancelamento da disciplina " + disciplina + " realizado com sucesso.";
            } else {
                a = "Aluno nao esta matriculado na disciplina " + disciplina + ", portanto nao eh possivel cancelar esta matricula";
            }
        }

        return a;
    }

    public String imprime() {
        String a = "-----------------------------------------------------------------\n"
                + "Nome do Aluno: " + getNome() + "\n"
                + "Matricula: " + getMatricula() + "\n"
                + "Curso: " + getCurso() + "\n"
                + "Periodo: " + getPeriodo() + "\n"
                + "Disciplinas Matriculadas:" + "\n";
        String b = "";

        for (int i = 0; i < disciplinasMatriculadas.length; i++) {
            b = "- " + disciplinasMatriculadas[i] + "\n";
            a = a.concat(b);
        }

        a = a.concat("-----------------------------------------------------------------\n");

        return a;
    }

}
