

import java.util.Scanner;

public class UsaCircunferencia {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o raio do circulo: ");
        double a=sc.nextDouble();
        Circunferencia ball = new Circunferencia(a);
        
        
        System.out.format("A area da circunferencia eh de %.2f", ball.Area());
        
        
        
    }
    
    
}
