import java.util.Scanner;
public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner( System.in);
        System.out.println("digite a primeira nota :");
       double n1 = scanner.nextDouble();
        System.out.println("digite a segunda nota :(0-9)");
        double n2 = scanner.nextDouble ();
        if (n1 >= 6 && n2 >= 6 ) {
            System.out.println("aprovado!");
        }else if (n1 >= 4 || n2 >=4 ) {
            System.out.println("recuperação!");
        }else {
                System.out.println("reprovado");
            }
        }


    }


