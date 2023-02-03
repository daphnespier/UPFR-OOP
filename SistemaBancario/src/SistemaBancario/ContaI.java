/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @authors GRR2019 ...
 */
public interface ContaI  {
    public boolean deposita(double valor);
    public boolean saca(double valor);
    public Cliente getDono();
    public int getNumero();
    public double getSaldo();
    public void remunera();
    public String getTipoConta();
    public double getLimite();
    public double getDepositoMinimo();
    public double getMontanteMinimo();
}
