/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_1;

import java.time.LocalDate;
import java.util.List;

public class Gerente extends Funcionario {

    private List<Funcionario> equipe;

    public Gerente(List<Funcionario> equipe, String matricula, String cargo, Funcionario gestor, 
            double salario, String nome, LocalDate nascimento, String cpf, 
            String genero, String endereco, Departamento area) {
        super(matricula, cargo, gestor, salario, nome, nascimento, cpf, genero, endereco, area);
    }


    public List<Funcionario> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Funcionario> equipe) {
        this.equipe = equipe;
    }
    
    @Override
    public double getBonus() {
        double salario = 2 * this.getSalario();
        double bonusEquipe = (100.0 * this.equipe.size());
        return (salario + bonusEquipe);
    }



}
