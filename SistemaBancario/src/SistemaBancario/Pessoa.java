/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @authors GRR2019 ...
 */
public abstract class Pessoa{
    
    private String nome;
    private String sobrenome;
    double renda;
    private String rg;
    private String cpf;

    public Pessoa(String nome, String sobrenome, double renda, String rg, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.renda = renda;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
