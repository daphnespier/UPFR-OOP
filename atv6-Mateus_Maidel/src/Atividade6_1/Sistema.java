package Atividade6_1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateus Maidel -  
*/
public class Sistema {


    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList();
        List<Funcionario> subordinados = new ArrayList();
        List<Departamento> departamentosGerenciados = new ArrayList();

        Departamento d1 = new Departamento("ADM");
        Departamento d2 = new Departamento("RH");
        Departamento d3 = new Departamento("T.I");

        departamentosGerenciados.add(d1);
        departamentosGerenciados.add(d2);

        Diretor d = new Diretor(departamentosGerenciados, "2", "Diretor", null, 30000.00, "Joao",
                LocalDate.of(1985, Month.MARCH, 15), "123", "F", "Rua Z, 25", d1);

        Gerente g = new Gerente(subordinados, "1", "Gerente", d, 15000.0,
                "Mario", LocalDate.of(1998, Month.FEBRUARY, 25), "123", "M", "Rua X, 10", d1);

        Analista a1 = new Analista("3", "Desenvolvedor", g, 10000.0,
                "Pedro", LocalDate.of(1990, Month.FEBRUARY, 10), "444", "M", "Rua y, 20", d2);
        Analista a2 = new Analista("4", "Negócio", g, 12000.0,
                "Gustavo", LocalDate.of(1995, Month.FEBRUARY, 20), "555", "M", "Rua z, 10", d1);

        AuxiliarLimpeza al1 = new AuxiliarLimpeza("5", "Limpeza", g, 2000.0,
                "Roberval", LocalDate.of(1995, Month.FEBRUARY, 20), "333", "M", "Rua xyz, 10", d3);

        subordinados.add(a1);
        subordinados.add(a2);
        subordinados.add(al1);

        funcionarios.add(a1);
        funcionarios.add(a2);
        funcionarios.add(g);
        funcionarios.add(d);
        funcionarios.add(al1);

        g.setEquipe(subordinados);
        System.out.println(Relatorio.getRelatorio(funcionarios));

    }

}
