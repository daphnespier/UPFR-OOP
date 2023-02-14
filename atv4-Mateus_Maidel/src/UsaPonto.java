

import java.util.Scanner;

public class UsaPonto {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira as coordenadas do primeiro ponto:");
        System.out.print("X: ");
        double aX=sc.nextDouble();
        System.out.print("Y: ");
        double aY=sc.nextDouble();
        System.out.print("Z: ");
        double aZ=sc.nextDouble();
        
        Ponto a = new Ponto(aX,aY,aZ);
   
        
        System.out.println("Insira as coordenadas do segundo ponto:\nX: ");
        double bX=sc.nextDouble();
        System.out.print("Y: ");
        double bY=sc.nextDouble();
        System.out.print("Z: ");
        double bZ=sc.nextDouble();
        
        Ponto b = new Ponto(bX,bY,bZ);
        
        
        System.out.format("A distancia entre os pontos A e B é de %.2f \n", a.CalculaPonto(b));
   
    }
    
    
}
