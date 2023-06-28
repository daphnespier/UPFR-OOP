/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_1;

import java.time.LocalDate;
import java.util.List;

public class Diretor extends Funcionario {

    private List<Departamento> direcao;

    public Diretor(List<Departamento> direcao, String matricula,
            String cargo, Funcionario gestor, double salario, String nome,
            LocalDate nascimento, String cpf, String genero, String endereco,
            Departamento area) {
        super(matricula, cargo, gestor, salario, nome, nascimento, cpf, genero, endereco, area);
        this.direcao = direcao;
    }

    public List<Departamento> getDirecao() {
        return direcao;
    }

    public void setDirecao(List<Departamento> direcao) {
        this.direcao = direcao;
    }

    @Override
    public double getBonus() {
        double bonus = (4 * this.getSalario()) + (300.0 * this.direcao.size());
        return bonus;
    }

}
