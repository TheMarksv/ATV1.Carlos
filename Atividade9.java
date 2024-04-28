import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Validar o número (não pode ser negativo)
        if (numero < 0) {
            System.out.println("Erro: O número não pode ser negativo!");
            return; // Encerra o programa se for negativo
        }

        // Calcular e exibir o fatorial
        int fatorial = 1; // Fatorial inicia em 1
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numero + ": " + fatorial);

        scanner.close();
    }
}
