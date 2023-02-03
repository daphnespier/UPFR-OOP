/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @authors GRR2019 ...
 */
public abstract class Conta {

    private int idConta;
    private double saldo;
    private Cliente dono;

    public Conta(int idConta, double saldo, Cliente dono) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.dono = dono;
    }

    abstract String getTipoConta();
    
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
    
}
