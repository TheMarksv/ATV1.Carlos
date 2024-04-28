import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para somas
        int somaPares = 0;
        int somaImpares = 0;
        int somaDivisivel3 = 0;

        // Solicitar e somar 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Verificar paridade e somar
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }

            // Verificar divisibilidade por 3 e somar
            if (numero % 3 == 0) {
                somaDivisivel3 += numero;
            }
        }

        // Exibir resultados
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);
        System.out.println("Soma dos divisíveis por 3: " + somaDivisivel3);

        scanner.close();
    }
}
