/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus Maidel  
 */

import java.util.Scanner;

public class DesvioPadrao1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Insira a quantidade de amostras: ");
        int qtd = input.nextInt();
        double[] dados = new double[qtd];
        leDados(dados);
        double res = calculaDesvio(qtd,dados);
        System.out.printf("O Desvio Padrão é: %.2f\n", res);

    }

    public static void leDados(double dados[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < dados.length; i++) {
            System.out.printf("Informe %do valor da amostra : ", i + 1);
            dados[i] = input.nextDouble();
        }
    }

    public static double calculaDesvio(int qtd, double dados[]) {

        //calcula a média dos valores
        double media = 0;

        for (int i = 0; i < dados.length; i++) {
            media += dados[i];
        }
        media = media / qtd;
        
        //calcula a soma do quadrado da distancia entre o dado e a média
        
        double dis = 0, exp = 0, soma = 0;
        for(int i = 0; i <dados.length; i++){
            dis = dados[i] - media;
            exp = Math.pow(Math.abs(dis), 2);
            soma += exp;
        }
        
        //divide a soma pelo número de dados imputados
        
        double div = soma / qtd;
        
        // tira a raiz quadrada da divisão para calcular o desvio
        
        double desvio = Math.sqrt(div);
        
        return desvio;
    }
}
