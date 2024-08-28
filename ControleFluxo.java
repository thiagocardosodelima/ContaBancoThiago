
import java.util.Scanner;



public class ControleFluxo {
   

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = terminal.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = terminal.nextInt();

        try {
            contar(numero1, numero2);
        } catch ( ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 1; i <= (numero2 - numero1); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

