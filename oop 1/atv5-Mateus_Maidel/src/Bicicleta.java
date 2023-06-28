/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mateus Maidel -  
 */
public class Bicicleta {

    private int cadencia = 0;
    private int velocidade = 0;
    private int marcha;
    private int marchaMax;
    private boolean parada;

    public Bicicleta(int maximo) {
        marcha = 0;
        marchaMax = maximo;
        parada();
    }

    public Bicicleta() {
        marchaMax = 18;
        parada();
    }

    boolean parada() {
        return true;
    }

    void mudarCadencia(int novoValor) {
        cadencia = novoValor;
    }

    void mudarMarcha(int novoValor) {
        if (this.getMarcha() >= this.getMarchaMax()) {
            System.out.println("Não é possível alterar a marcha");
        } else {
            this.setMarcha(this.getMarcha() + novoValor);
        }
    }

    void aumentarVelocidade(int incremento) {
        velocidade = velocidade + incremento;
    }

    void aplicarFreios(int decremento) {
        velocidade = velocidade - decremento;
    }

    void printStates() {
        System.out.println("cadencia = " + cadencia + " velocidade = "
                + velocidade + " marcha =" + marcha);
    }

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getMarchaMax() {
        return marchaMax;
    }

    public void setMarchaMax(int marchaMax) {
        this.marchaMax = marchaMax;
    }

}
