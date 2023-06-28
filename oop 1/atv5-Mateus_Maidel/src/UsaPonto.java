/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateus Maidel -  
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaPonto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira as coordenadas do ponto A: ");
        System.out.print("X :");
        double Ax = input.nextDouble();
        System.out.print("Y :");
        double Ay = input.nextDouble();
        System.out.print("Z :");
        double Az = input.nextDouble();
        Ponto a = new Ponto(Ax, Ay, Az);

        System.out.println("Insira as coordenadas do ponto B: ");
        System.out.print("X :");
        double Bx = input.nextDouble();
        System.out.print("Y :");
        double By = input.nextDouble();
        System.out.print("Z :");
        double Bz = input.nextDouble();
        Ponto b = new Ponto(Bx, By, Bz);

        System.out.println("A distancia entre "
                + "os pontos é: " + a.CalculaPonto(b));

    }

}