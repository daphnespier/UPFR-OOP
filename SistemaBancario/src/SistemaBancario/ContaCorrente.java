/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @authors GRR2019 ...
 */
public class ContaCorrente extends Conta implements ContaI {
    final String tipoConta = "Conta Corrente";
    public double depositoInicial;
    public double limite;
    
    
    
    public ContaCorrente(int idConta, double depositoInicial, Cliente dono, double limite) {
        super(idConta, depositoInicial, dono);
        this.depositoInicial = depositoInicial;
        this.limite = limite;
    }

    @Override
    public String getTipoConta(){
        return tipoConta;
    }
    
    @Override
    public boolean deposita(double valor) {
        
        double saldoAtual = super.getSaldo();
        boolean status = false;
        try{
            if (valor > 0){
            saldoAtual = (saldoAtual + valor);
            BigDecimal arredonda = BigDecimal.valueOf(saldoAtual);
            saldoAtual = arredonda.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            super.setSaldo(saldoAtual);
            status = true;}
            else{
                showMessageDialog(null, "Não é possivel depositar valores negativos ou nulos");
            }   
        }catch(Exception ex){
            throw new UnsupportedOperationException("Erro ao realizar depósito");
        }
        return status;
    }

    @Override
    public boolean saca(double valor) {
        double saldoAnterior = super.getSaldo();
        double limiteSaque = saldoAnterior + limite;
        boolean status = false;
        try{
            double novoSaldo = (limiteSaque - valor);
            if(novoSaldo >= 0){
                BigDecimal arredonda = BigDecimal.valueOf(novoSaldo);
                novoSaldo = arredonda.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
                super.setSaldo((novoSaldo - limite));
                status = true;
            }
            else{
               showMessageDialog(null, "Não é possível realizar saque para saldos nulos ou negativos");
            }
        }catch(Exception ex){
            throw new UnsupportedOperationException("Erro ao realizar saque");
        }
        return status;
    }

    @Override
    public Cliente getDono() {
        return super.getDono();
    }

    @Override
    public int getNumero() {
        return super.getIdConta();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void remunera(){
        
        double saldoAtual = super.getSaldo();
        if(saldoAtual > 0){
                saldoAtual = (saldoAtual * 1.01);
                BigDecimal arredonda = BigDecimal.valueOf(saldoAtual);
                saldoAtual = arredonda.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
                super.setSaldo(saldoAtual);
        }
        else{
            showMessageDialog(null, "Não é possível remunerar uma conta com saldo negativo");
        }   
    }

    @Override
    public double getLimite() {
        return limite;
    }

    @Override
    public double getDepositoMinimo() {
        throw new UnsupportedOperationException("Conta não possui depósito mínimo.");
    }

    @Override
    public double getMontanteMinimo() {
        throw new UnsupportedOperationException("Conta não possui montante mínimo.");
    }

}
