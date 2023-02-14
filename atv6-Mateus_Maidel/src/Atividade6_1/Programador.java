/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_1;

import java.time.LocalDate;
public class Programador extends Funcionario {
    
    public Programador(String matricula, String cargo, Funcionario gestor, 
            double salario, String nome, LocalDate nascimento, String cpf, 
            String genero, String endereco, Departamento area) {
        super(matricula, cargo, gestor, salario, nome, nascimento, cpf, genero, endereco, area);
    }
    
    @Override
    public double getBonus(){
       double bonus = this.getSalario() * 0.8;
       return bonus; 
    }

    
}
