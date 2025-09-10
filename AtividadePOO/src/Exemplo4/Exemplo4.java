package Exemplo4;

import java.util.Scanner;

public class Exemplo4 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Usuario user = new Usuario("Pablo", 22,"Pabrin","40028922");
        user.falar();
    }
}
