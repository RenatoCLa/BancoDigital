package bancodigital;

public class Cliente {
    
    //Variáveis
    private String nome;

    private String CPF;

    //Construtores
    public Cliente(){
    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    //Getters e Setters
    public String getNome(){

        return nome;
    }

    public void setNome(String nome){
        
        this.nome = nome;
    }

    public int getCPF(){

        return CPF;
    }

    public void setCPF(String CPF){

        this.CPF = CPF;
    }
}
