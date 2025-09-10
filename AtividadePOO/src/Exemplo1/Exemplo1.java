package Exemplo1;
import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Pessoa Pessoa = new  Pessoa();
        Pessoa.nome="João";
        Pessoa.idade = 16;
        System.out.println("nome:" + Pessoa.nome);
        System.out.println("idade:" + Pessoa.idade);
    }

}