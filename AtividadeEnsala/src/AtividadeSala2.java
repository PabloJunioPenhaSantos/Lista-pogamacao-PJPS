public class AtividadeSala2 {
    public static void main(String args[]) {
        String nome = "Pablo";
        String sobrenome = "Santos";
        int idade = 22;
        double peso = 70;
        double altura = 1.79;
        double imc = 0;
        int anonasc = 0;
        String texto = "peso" + peso + "altura" + altura;
        System.out.println("nome e sobrenome: " + nome + " " + sobrenome);
        System.out.println("Ano Nscimento:" + (idade - anonasc));
        System.out.println("Peso:" + peso + " altura:" + altura);
        imc = peso / (altura * altura);
        System.out.println("IMC:" + imc);

    }
        }

