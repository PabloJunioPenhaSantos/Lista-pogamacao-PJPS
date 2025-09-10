package Exemplo4;

public class Usuario extends Pessoa {
    private String userNome;
    private String password;

    public Usuario() {
        super();
    }

    public Usuario(String nome, int idade, String userNome, String password) {
        super(idade, nome);
        this.userNome = userNome;
        this.password = password;
    }

    public void falar() {
        System.out.println("oi eu sou" + this.nome + "eu tenho " + this.idade + "de idade");
        System.out.println("Meu Nick é: "+ this.userNome);
    }
}
