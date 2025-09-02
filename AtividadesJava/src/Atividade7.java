import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0, a=0, b=0 ;

        System.out.println(" digite dois numeros ");
        a = leia.nextInt();
        b = leia.nextInt();

        soma = a+b;
        System.out.println(soma);
    }
}
