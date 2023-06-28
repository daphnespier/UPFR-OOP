/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_1;

import java.time.LocalDate;

public class Analista extends Funcionario {

    private String especialidade;
    private double bonus;

    public Analista(String matricula, String cargo, 
            Funcionario gestor, double salario, String nome,
            LocalDate nascimento, String cpf, String genero, 
            String endereco, Departamento area) {
        super(matricula, cargo, gestor, salario, nome, nascimento, cpf, 
                genero, endereco, area);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public double getBonus() {
        this.bonus = this.getSalario();
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = this.getSalario();
    }

}