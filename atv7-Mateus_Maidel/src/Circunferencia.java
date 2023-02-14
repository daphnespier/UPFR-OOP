/**
 *
 * @author Mateus Maidel -  
*/


public class Circunferencia implements Superficie {

    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String nomeFigura() {
        return "Circunferência";
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(this.raio,2);
        return area;
    }

}
