import java.util.Scanner;
public class Atividade20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade= 0;
        boolean temCNH = true;

        System.out.println("digite sua idade :");
        idade=leia.nextInt();

        System.out.println("tem carteira? true = sim // false == não :");
        temCNH=leia.nextBoolean();





        if (idade>=18 && temCNH == true){
            System.out.println("voce ja pode dirigir");
        }
        else{
            System.out.println("voce nao pode dirigir ");
        }
    }
}

