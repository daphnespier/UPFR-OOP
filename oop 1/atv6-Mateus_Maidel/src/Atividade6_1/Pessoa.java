package Atividade6_1;

import java.time.LocalDate;

/**
 *
 * @author Mateus Maidel -  
*/
public abstract class Pessoa {
    
    private String nome;
    private LocalDate nascimento;
    private String cpf;
    private String genero;
    private String endereco;
    

    public Pessoa(String nome, LocalDate nascimento,String cpf, 
            String genero, String endereco) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}

