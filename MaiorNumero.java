import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar o maior número
        float maiorNumero = Float.MIN_VALUE;

        // Laço para solicitar 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            float numero = scanner.nextFloat();

            // Atualizar o maior número se necessário
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        // Exibir o maior número encontrado
        System.out.println("O maior número digitado é: " + maiorNumero);

        scanner.close();
    }
}
