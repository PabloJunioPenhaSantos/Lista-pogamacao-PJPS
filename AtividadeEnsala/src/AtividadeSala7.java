import java.util.Scanner;

public class AtividadeSala7 {

    public static void main(String[] args) {
        //Exemplo com o SE(IF)

        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0) {
            System.out.println("Todos os valores são negativos.");
        } else if (a < 0 || b < 0 || x < 0 || y < 0) {
            System.out.println("Pelo menos um valor é negativo.");
        } else {
            System.out.println("Todos os valores são positivos");
        }
            //Exemplo com o Escolha (Switch/Case)
            char opcao = 'S';
            switch (opcao) {
                case 'S':
                    System.out.println("A opção 'S' foi escolhida");
                    break;
                case 'N':
                    System.out.println("A opção 'S' foi escolhida");
                    break;
                default:
                    System.out.println("A opção escolhida é inválida");
                    break;
            }
//--------------------------------------------------------------------------------
                    Scanner leia = new Scanner(System.in);
                    int idade = 0; // variavel nome tipo "texto"

                    System.out.println("favor ensira sua idade");
                    idade = leia.nextInt();

                    if (idade < 18) {
                        System.out.println("menor de idade ");
                    } else {
                        System.out.println("maior de idade ");
                    }

                    //-------------------------

                    System.out.println("digite o seu sexo m ou f:");
                    char sexo = leia.next().toLowerCase().charAt(0);
                    switch (sexo) {
                        case 'm':
                            System.out.println("usuario se considera do sexo masculino  ");
                            break;

                        case 'f':
                            System.out.println("suario se considera do sexo Feminino");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }




    }
}