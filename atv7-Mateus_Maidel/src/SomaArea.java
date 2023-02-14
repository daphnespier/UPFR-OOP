/*
*  
*   @author Mateus Maidel -  
*/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SomaArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circunferencia c = new Circunferencia(5.0);
        Triangulo t = new Triangulo(10.0, 15.0);
        Retangulo r = new Retangulo(20.0, 30.0);

        System.out.println(c.nomeFigura());
        System.out.println(c.area());
        System.out.println(t.nomeFigura());
        System.out.println(t.area());
        System.out.println(r.nomeFigura());
        System.out.println(r.area());
        
        
        List<Object> formas = new ArrayList();
        formas.add(r);
        formas.add(t);
        formas.add(c);
        
        
        System.out.println("Soma do Array: ");
        System.out.println(Soma.soma(formas));
        
        System.out.println("Digite o valor dos lados do Retânculo");
        Scanner input = new Scanner(System.in);
        System.out.println("Lado 1: ");
        Double lado1 = input.nextDouble();
        System.out.println("Lado 2: ");
        Double lado2 = input.nextDouble();
        
        Retangulo r2 = new Retangulo(lado1, lado2);
        r2.area();   
 
     
        
    }

}
