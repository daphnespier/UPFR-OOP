


public class Pessoa {
    private String nome, endereco;
    private int idade;
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    
    public  void setIdade(int idade){
        this.idade=idade;
    }
    
    
    public String imprime(){
        String dados="Nome: " +  getNome() +"\n"
                    +"Endereço: " + getEndereco() + "\n"
                    +"Idade: " + getIdade();
        return dados;
    }
    
    public int fazAniversario(){
        idade +=1;
        return idade;
    }
       
}
