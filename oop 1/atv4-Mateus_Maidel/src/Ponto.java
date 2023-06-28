

public class Ponto {

    private Double x, y, z;

    public Ponto(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    
    public Double getZ(){
        return z;
    }
    
    public void setZ(Double z){
        this.z=z;
    }
    
    public Double CalculaPonto(Ponto p){
        double dAB = 0;
        double aX = this.x, aY = this.y, aZ= this.z;
        
        double bX = p.getX(), bY = p.getY(), bZ= p.getZ();
        
        dAB=  Math.sqrt((Math.pow((bX - aX), 2) + Math.pow((bY - aY), 2) + Math.pow((bZ - aZ), 2)));        
        
        return dAB;
    
    }

}
