
package Atividade6_1;

import java.util.List;

/**
 *
 * @author Mateus Maidel -  
*/
public class Relatorio {

    static String getRelatorio(List<Funcionario> funcionarios) {

        String relatorio = "NOME;CARGO;SALÁRIO;GERENTE;BONUS\n";

        for (Funcionario f : funcionarios) {
            String func = " ";

            if (f instanceof Gerente || f instanceof Diretor ) {
                func = f.getNome() + ";" + f.getCargo() + ";" + f.getSalario()
                        + ";" + ";" + f.getBonus();
            } else {
                func = f.getNome() + ";" + f.getCargo() + ";" + f.getSalario()
                        + ";" + f.getGestor().getNome() + ";" + f.getBonus();
            }
            relatorio += func + "\n";
        }
        return relatorio;
    }
}