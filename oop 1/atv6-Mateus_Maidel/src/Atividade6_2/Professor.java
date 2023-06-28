/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_2;

import java.util.List;

public class Professor extends Pessoa {

    private double salario;
    public List<Disciplinas> disc;

    public Professor(double salario, List<Disciplinas> disc, String nome, int idade, String endereco) {
        super(nome, idade, endereco);
        this.salario = salario;
        this.disc = disc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisc() {
        String retorno = "";
        
        for (Disciplinas d: this.disc){
        retorno += d.getNome() + " ";    
        
        }
        return retorno;
    }

    public void setDisc(List<Disciplinas> disc) {
        this.disc = disc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
