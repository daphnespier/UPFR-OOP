/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_4_e_6_6;

import java.util.List;

public class Soma implements Superficie{
    
    List<Object> formas;

    public Soma(List<Object> formas) {
        this.formas = formas;
    }
    
    public static double soma(List<Object> formas){
        double somaArea = 0;
        
        for (Object f: formas) {
          
            if (f.getClass() == Circunferencia.class){
                Circunferencia c = (Circunferencia)f;
                somaArea += c.area();
                
            }
            if (f.getClass() == Triangulo.class){
                Triangulo t = (Triangulo)f;
                somaArea += t.area();
                
            }
            if (f.getClass() == Retangulo.class){
                Retangulo r = (Retangulo)f;
                somaArea += r.area();
                
            }   
                        
        }
        return somaArea;
    }

    public static double soma(Circunferencia c, Triangulo t) {
        double soma = c.area() + t.area();
        return soma;
    }

    public static double soma(Circunferencia c, Retangulo r) {
        double soma = c.area() + r.area();
        return soma;
    }

    public static double soma(Retangulo r, Triangulo t) {
        double soma = r.area() + t.area();
        return soma;
    }

    @Override
    public String nomeFigura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area() {
        
        return 0;
    }
}
