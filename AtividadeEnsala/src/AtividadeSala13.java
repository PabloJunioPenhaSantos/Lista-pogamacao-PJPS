import java.util.Scanner;

public class AtividadeSala13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //MATRIZES
        //double[][] boletim = new double[3][3];
        double[][] boletim = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        String[] materias = {"Matemática", "Português", "Física"};
        for (int linha = 0; linha < 3; linha++) {
            System.out.println("digite as notas  de " + materias[linha]);
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("digite a nota do: " + (coluna + 1) + " trimestre:");
                boletim[linha][coluna] = leia.nextDouble();
            }
        }
        System.out.println("boletim");
        // 1° etapa: 10 pontos
        // 2° etapa  10 pontos
        // 3° etapa  10 pontos
        // media final
        for (int linha = 0; linha < 3; linha++) {
            System.out.println(materias[linha]);
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println((coluna + 1) + "etapa:"
                        + boletim[linha][coluna] + "pontos");
            }
        }
    }
}