import java.util.Scanner;
public class Atividade19 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int idade= 0;
        System.out.println("digite sua idade :");
        idade=leia.nextInt();
        if (idade>=18){
            System.out.println("maior de idade !");
        }
        else{
            System.out.println("menor de idade ");
        }
    }
}


