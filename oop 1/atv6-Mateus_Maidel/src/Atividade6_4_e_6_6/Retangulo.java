/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_4_e_6_6;

public class Retangulo implements Superficie {

    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        try {
            if (lado1 < 0 || lado2 < 0) {
                throw new IllegalArgumentException();
            } else {
                this.lado1 = lado1;
                this.lado2 = lado2;
            }

        } catch (IllegalArgumentException e){
            System.out.println("O lado não pode ser negativo");
        }
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String nomeFigura() {
        return "Retângulo";
    }

    @Override
    public double area() {
        double area = this.lado1 * this.lado2;
        return area;
    }

}
