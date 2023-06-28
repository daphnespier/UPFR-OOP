/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_1;

import java.time.LocalDate;

abstract class Funcionario extends Pessoa {

    private String matricula;
    private String cargo;
    private Funcionario gestor;
    private Departamento area;
    private double salario;
    private double bonus;

    public Funcionario(String matricula, String cargo, Funcionario gestor, 
            double salario, String nome, LocalDate nascimento, String cpf, 
            String genero, String endereco, Departamento area) {
        super(nome, nascimento, cpf, genero, endereco);
        this.matricula = matricula;
        this.cargo = cargo;
        this.gestor = gestor;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario getGestor() {
        return gestor;
    }

    public void setGestor(Funcionario gestor) {
        this.gestor = gestor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getArea() {
        return area;
    }

    public void setArea(Departamento area) {
        this.area = area;
    }

    public abstract double getBonus();

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



}