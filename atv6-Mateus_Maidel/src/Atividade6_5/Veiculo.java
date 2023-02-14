/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_5;

public abstract class Veiculo {
    String tipo;
    String combustivel;
    int quilometragem;
    int ano;
    int qtdPassageiros;

    public Veiculo(String tipo, String combustivel, int quilometragem, int ano, int qtdPassageiros) {
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.ano = ano;
        this.qtdPassageiros = qtdPassageiros;
    }

    
public abstract void andar();
    
}
