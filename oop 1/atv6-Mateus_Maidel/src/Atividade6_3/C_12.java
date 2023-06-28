/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_3;

public class C_12 extends C {

    private float atributo3;

    public C_12(float atributo3) {
        this.atributo3 = atributo3;
    }

    C_12(String xpto, float f) {
        int twoDm[][] = new int[3][3];
        int i, j, k = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                twoDm[i][j] = 1;
                k++;
            }

        }

        for (int[] row : twoDm) {
            for (int r : row) {
                System.out.print(r);
                System.out.print("\t");
            }
            System.out.println();
        }

    }

    C_12() {
        int twoDm[][] = new int[2][2];
        int i, j, k = 0;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                twoDm[i][j] = 0;
                k++;
            }

        }

        for (int[] row : twoDm) {
            for (int r : row) {
                System.out.print(r);
                System.out.print("\t");
            }
            System.out.println();
        }

    }

    void operacao1() {
        System.out.println("Passou pela operação 1 ");
        System.out.println(this.atributo3);

    }

    void operacao2() {
        System.out.println("Passou pela operação 2 ");

    }

}
