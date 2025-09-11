package Lampada;
import java.util.Scanner;

public class Execultavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada(true,12,"amarela");
        Lampada lampada2 = new Lampada(false,12,"branca");
        lampada.falar();
        lampada2.falar();


    }
}

