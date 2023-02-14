/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateus Maidel -  
 */
public class Ponto {

    private Double x;
    private Double y;
    private Double z;

    public Ponto(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    private Double getX() {
        return x;
    }

    private void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }
    
    public double CalculaPonto(Ponto p){
      
        double dAb = 0;
        double ax = this.x, ay = this.y, az = this.z;
        double bx = p.getX(), by = p.getY() , bz = p.getZ();
        
        dAb = Math.sqrt((Math.pow((bx - ax), 2) + Math.pow((by - ay), 2)
                + Math.pow((bz - az), 2)));        
               
        return dAb;
        
    }
}
