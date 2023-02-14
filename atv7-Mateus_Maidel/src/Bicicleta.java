/**
 *
 * @author Mateus Maidel -  
*/

import static java.lang.Double.NaN;
import java.util.InputMismatchException;

public class Bicicleta {

    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;
    int rpm = 0;
    boolean flag = false;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Bicicleta() {
    }

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) {

        try {
            if (cadencia < 0) {
                this.setFlag(false);
                throw new IllegalArgumentException();

            } else {
                this.cadencia = cadencia;
                this.setFlag(true);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Cadência não pode ser negativa");
        }

    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {

        try {
            if (velocidade < 0 || velocidade > 100) {
                this.setFlag(false);
                throw new IllegalArgumentException();
            } else {
                this.velocidade = velocidade;
                this.setFlag(true);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Velocidade não pode ser negativa ou maior que 100");
        }

    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {

        try {
            if (marcha < 0 || marcha > 24) {
                this.setFlag(false);
                throw new IllegalArgumentException();

            } else {
                this.marcha = marcha;
                this.setFlag(true);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Marcha não pode ser negativa ou maior que 24");
        }

    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {

        try {
            if (rpm < 0) {
                this.setFlag(false);
                throw new IllegalArgumentException();

            } else {
                this.rpm = rpm;
                this.setFlag(true);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("RPM não pode ser negativo");
        }
    }

    void mudarCadencia(int novoValor) {
        cadencia += novoValor;
    }

    void mudarMarcha(int novoValor) {
        marcha += novoValor;
    }

    void aumentarVelocidade(int incremento) {
        this.setVelocidade(velocidade + incremento);
      }

    void aplicarFreios(int decremento) {
        velocidade -= decremento;
    }

    void printStates() {
        System.out.println("cadencia = " + cadencia + " velocidade = " + velocidade
                + " marcha = " + marcha);
    }

}
