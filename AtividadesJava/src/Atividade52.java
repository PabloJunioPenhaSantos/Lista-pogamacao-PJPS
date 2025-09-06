

import java.util.Scanner;
public class Atividade52 {
    public static double temperatura(double celsius) {

        return (9 * celsius) / 5 + 32 ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double temp = 0;


        System.out.println("Digite um temperatura: ");
        temp = scanner.nextDouble();
        System.out.println("A temperatura é "+ temperatura(temp));
    }
}