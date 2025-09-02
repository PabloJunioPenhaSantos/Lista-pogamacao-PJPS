import java.util.Scanner;
public class Atividade18 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
     int p = 0, q = 0;

        System.out.println("digite um valor ");
        p= leia.nextInt();

        System.out.println("digite outro valor ");
        q= leia.nextInt();

     if (p > q){
         System.out.println(p+" e maior que "+q);
     }else if (p < q ){
         System.out.println(p+" e menor que "+q);
        }else {
         System.out.println( p +" é igual a "+q);
     }

    }
}
