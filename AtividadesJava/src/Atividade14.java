import java.util.Scanner;
public class Atividade14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe um número A");
        int a = leia.nextInt();
        System.out.println("informe um número B");
        int b = leia.nextInt();
        int soma = a+b;
        int sub = a-b;
        int produto = a*b;
        int quociente = a/b;
        int resto = a%b;
        System.out.println("Soma:"+soma+"\n" +
                "Subtração:"+sub+"\n" +
                "Produto:"+Math.round(produto)+"\n" +
                "Quociente:"+Math.round(quociente)+"\n" +
                "Resto:"+Math.round(resto));
    }
}
