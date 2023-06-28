/**
 *
 * @author Mateus Maidel -  
*/
import java.util.Scanner;

public class testaBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bicicleta b = new Bicicleta();

        b.printStates();

        while (b.getFlag() == false) {
            System.out.println("Digite a Cadencia: ");
            int cad = input.nextInt();
            b.setCadencia(cad);

        }

        b.setFlag(false);
        while (b.getFlag() == false) {
            System.out.println("Digite a Velocidade: ");
            int vel = input.nextInt();
            b.setVelocidade(vel);

        }
        
        b.setFlag(false);
        while (b.getFlag() == false) {
            System.out.println("Digite o RPM: ");
            int rpm = input.nextInt();
            b.setRpm(rpm);

        }
        
        b.setFlag(false);
        while (b.getFlag() == false) {
            System.out.println("Digite a Marcha: ");
            int marcha = input.nextInt();
            b.setMarcha(marcha);
        }

        b.printStates();
    }

}
