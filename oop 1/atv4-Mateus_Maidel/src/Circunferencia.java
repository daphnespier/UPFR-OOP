

public class Circunferencia {
    
    private Double raio=0.00;
    
    public Circunferencia (double raio){
        this.raio=raio;
    }
    
    
    public Double getRaio(){
        return raio;
    }
    
    public void setRaio(Double raio){
        this.raio=raio;
    }
    
    public Double Area(){
        double a=0.00;
        double pi=3.141592;
        
        a=pi*Math.pow(raio, 2);
        
        return a;
        
    }
}
