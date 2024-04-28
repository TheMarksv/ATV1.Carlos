import java.util.Scanner;

public class Atividade10Carlos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        // Validar se o número é maior que 1
        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
            return;
        }

        // Verificar se o número é primo
        boolean primo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        // Exibir o resultado
        System.out.println(numero + (primo ? " é um número primo." : " não é um número primo."));

        scanner.close();
    }
}
