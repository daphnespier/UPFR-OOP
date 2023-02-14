/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Mateus Maidel -  
 */
public class Conversao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Temperatura.imprimeMenu();
        System.out.println(">>>Digite o número escolhido<<<");
        int menu = input.nextInt();

        System.out.println(">>>Agora digite a temperatura a ser convertida<<<");
        double temp = input.nextDouble();
        switch (menu) {
            case 1:
                Double conversao = Temperatura.cToF(temp);
                System.out.println("A temperatura em Farenheit é : " + conversao);
                break;

            case 2:
                conversao = Temperatura.fToC(temp);
                System.out.println("A temperatura em Celcius é : " + conversao);
                break;

            case 3:
                conversao = Temperatura.cToK(temp);
                System.out.println("A temperatura em Kelvin é : " + conversao);
                break;

            case 4:
               conversao = Temperatura.kToC(temp);
                System.out.println("A temperatura em Celcius é : " + conversao);
                break;

            case 5:
                conversao = Temperatura.fToK(temp);
                System.out.println("A temperatura em Farenheit é : " + conversao);
                break;

            case 6:
                conversao = Temperatura.kToF(temp);
                System.out.println("A temperatura em Kelvin é : " + conversao);
                break;

            default:
                System.out.println("Digite uma opção válida");
        }
    }
    
}
