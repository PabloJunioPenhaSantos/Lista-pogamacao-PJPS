import java.util.Scanner;
public class AtividadeSala12     {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //VETORES E MATRIZES

        double [] notas = new double[3];
        double media =0 , soma =0 ;



            //double [] notas = new doble = {0,0,0};
            for (int i = 0 ; i<3 ; i++ ){
                System.out.println(" DIGITE A "+(i+1)+" NOTA");
                notas[i] = leia.nextDouble();
                soma += notas [i];
                if (i==2) media = soma/notas.length;
            }
            System.out.println(" a media das notas e :" +media );
        }
    }



