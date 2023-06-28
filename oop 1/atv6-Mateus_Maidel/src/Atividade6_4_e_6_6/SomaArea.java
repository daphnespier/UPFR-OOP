/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_4_e_6_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SomaArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circunferencia c = new Circunferencia(1);
        Triangulo t = new Triangulo(10.0, 5.0);
        Retangulo r = new Retangulo(20.0, 8.0);

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
        
 
     
        
    }

}
