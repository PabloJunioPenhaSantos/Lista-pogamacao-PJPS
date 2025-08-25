import java.util.Scanner;
public class AtividadeSala10 {

public static void main(String[] args) {
       Scanner S =new Scanner(System.in);
       System.out.println("Digite o valor a ser multiplicado");
       int y = S.nextInt();
       int cont = 0 ;
       while (cont<=10){
           System.out.println(cont +"*" + y + "="+ cont * y );
       cont++;
       }


}
}