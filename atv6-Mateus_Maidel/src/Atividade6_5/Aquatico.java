/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_5;

public class Aquatico extends Veiculo{
    
    int dimensao;

    public Aquatico(int dimensao, String tipo, String combustivel, int quilometragem, int ano, int qtdPassageiros) {
        super(tipo, combustivel, quilometragem, ano, qtdPassageiros);
        this.dimensao = dimensao;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

   
    @Override
    public void andar() {
        int andou = this.getQuilometragem() + 50;
        this.setQuilometragem(andou);
    }
    
}
