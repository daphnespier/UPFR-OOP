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
public class ContaInvestimento extends Conta implements ContaI {

    final String tipoConta = "Conta Investimento";
    public double depositoInicial;
    public double depositoMinimo;
    public double montanteMinimo;

    public ContaInvestimento(int idConta, Cliente dono, double depositoInicial, double depositoMinimo, double montanteMinimo) {
        super(idConta, depositoInicial, dono);
        this.depositoMinimo = depositoMinimo;
        this.montanteMinimo = montanteMinimo;
    }

    @Override
    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public boolean deposita(double valor) {
        double saldoAtual = super.getSaldo();
        boolean status = false;
        try {
            if (valor < depositoMinimo) {
                showMessageDialog(null, "Valor menor que o deposito minimo permitido");
            }
            saldoAtual = (saldoAtual + valor);
            BigDecimal arredonda = BigDecimal.valueOf(saldoAtual);
            saldoAtual = arredonda.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            super.setSaldo(saldoAtual);
            status = true;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Erro ao realizar depósito");
        }
        return status;
    }

    @Override
    public boolean saca(double valor) {
        double saldoAnterior = super.getSaldo();
        boolean status = false;
        try {
            double novoSaldo = (saldoAnterior - valor);
            BigDecimal arredonda = BigDecimal.valueOf(novoSaldo);
            novoSaldo = arredonda.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            if (novoSaldo >= montanteMinimo) {
                super.setSaldo(novoSaldo);
                status = true;
            } else {
                showMessageDialog(null, "Não é possível realizar saque pois passara do montante minimo");
            }
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Erro ao realizar saque!");
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
    public void remunera() {
        double saldoAtual = super.getSaldo();
        try {
            if (saldoAtual > 0) {
                saldoAtual = (saldoAtual * 1.02);
                BigDecimal arredonda = BigDecimal.valueOf(saldoAtual);
                saldoAtual = arredonda.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
                super.setSaldo(saldoAtual);
            } else {
                showMessageDialog(null, "Não é possível remunerar saldos negativos ou nulos");
            }
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Erro ao remunerar saldo!");
        }
    }

    @Override
    public double getDepositoMinimo() {
        return depositoMinimo;
    }

    @Override
    public double getMontanteMinimo() {
        return montanteMinimo;
    }

    @Override
    public double getLimite() {
        throw new UnsupportedOperationException("Conta não possui Limite");
    }

}
