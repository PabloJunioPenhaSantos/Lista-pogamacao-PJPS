import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Digite um numero: ");
        int k = s.nextInt();
        if (k % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println( "impa" );
        }
    }
}