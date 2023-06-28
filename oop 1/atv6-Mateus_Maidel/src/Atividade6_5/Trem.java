/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_5;

public class Trem extends Terrestre{
    
    int vagoes;

    public Trem(int vagoes, int rodas, String tipo, String combustivel, int quilometragem, int ano, int qtdPassageiros) {
        super(rodas, tipo, combustivel, quilometragem, ano, qtdPassageiros);
        this.vagoes = vagoes;
    }

    public int getVagoes() {
        return vagoes;
    }

    public void setVagoes(int vagoes) {
        this.vagoes = vagoes;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
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
    
    
}
