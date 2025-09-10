package Exemplo4;

// edclaraçãlo de um objeto
public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //ação são os ,metodos

    public void falar() {
        System.out.println("oi eu sou " + this.nome + " eu tenho " + this.idade + " anos de idade ");
        System.out.println("meu nick é: ");
    }
}
