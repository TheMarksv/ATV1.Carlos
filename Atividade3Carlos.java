import java.util.Scanner;

public class Atividade3Carlos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variável para contar números pares
        int contadorPares = 0;

        // Laço para solicitar 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Verificar se o número é par e atualizar o contador
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        // Exibir a quantidade de números pares
        System.out.println("Foram digitados " + contadorPares + " números pares.");

        scanner.close();
    }
}
