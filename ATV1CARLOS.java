// Pasta: ATV1CARLOS
import java.util.Scanner;

public class ATV1CARLOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número inteiro:");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 números é: " + soma);
        
        scanner.close(); // Feche o scanner após o uso
    }
}
