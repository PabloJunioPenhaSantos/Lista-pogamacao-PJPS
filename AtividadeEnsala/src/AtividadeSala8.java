import java.util.Scanner;

public class AtividadeSala8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = ""; // variavel nome tipo "texto"
        int idade = 0; //variavel idade tipo inteiro

        System.out.println("digite o seu nome :");
        nome = leia.nextLine();

        System.out.println(" Digite sua idade:");
        idade = leia.nextInt();

        System.out.println("seu nome e : " + nome);
        System.out.println("voce tem " + idade + " anos de idade ");
    }
}
