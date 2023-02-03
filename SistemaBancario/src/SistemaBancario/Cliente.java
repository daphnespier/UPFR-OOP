/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @authors GRR2019 ...
 */
public class Cliente extends Pessoa implements Comparable<Cliente>{
    private int id;
    private EnderecoCliente endereco;
    private ContaI conta;
    
    public Cliente(String nome, String sobrenome, double renda, String rg, String cpf, int id) {
        super(nome, sobrenome, renda, rg, cpf);
        this.id = id;
        endereco = new EnderecoCliente();
        
    }

    public Cliente() {
        
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnderecoCliente getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCliente endereco) {
        this.endereco = endereco;
    }

    public ContaI getConta() {
        return conta;
    }

    public void setConta(ContaI conta) {
        this.conta = conta;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public int compareTo(Cliente outro) {
        int result = 0;
        if (this.id > outro.id) {
            result = 1;
        }else if(this.id < outro.id){
            result = -1;
        }
        return result;
    
    }
   
}
