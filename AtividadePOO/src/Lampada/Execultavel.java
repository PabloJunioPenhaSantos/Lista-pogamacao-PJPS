package Lampada;
import java.util.Scanner;

public class Execultavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada();
        System.out.println("Digite o valor de brilho:");
        lampada.setBrilho(scanner.nextInt());
        System.out.println("valor de brilho é "+ lampada.getBrilho());
    }
}

