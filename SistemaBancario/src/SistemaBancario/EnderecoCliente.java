/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @authors GRR2019 ...
 */
public class EnderecoCliente extends Endereco{
    private int numero;
    private String complemento;
    
        public EnderecoCliente() {
        super("", "", "", "", "");
        this.numero = numero;
        this.complemento = complemento;
    }

    public EnderecoCliente(String cep, String logradouro, String bairro, String cidade, String uf, int numero, String complemento) {
        super(cep, logradouro, bairro, cidade, uf);
        this.numero = numero;
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
}
