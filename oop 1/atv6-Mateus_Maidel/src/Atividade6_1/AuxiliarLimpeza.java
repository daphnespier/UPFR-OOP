/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_1;

import java.time.LocalDate;


public class AuxiliarLimpeza extends Funcionario {

    public AuxiliarLimpeza(String matricula, String cargo, Funcionario gestor,
            double salario, String nome, LocalDate nascimento, String cpf,
            String genero, String endereco, Departamento area) {
        super(matricula, cargo, gestor, salario, nome, nascimento, cpf, genero, endereco, area);
    }
    
    @Override
    public double getBonus() {
        double bonus = this.getSalario() * 0.5;
        return bonus;
    }
}
