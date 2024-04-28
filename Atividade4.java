import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contagem
        int contadorAcima90kg = 0;

        // Solicitar dados de 7 pessoas
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso da " + i + "ª pessoa: ");
            double peso = scanner.nextDouble();

            // Verificar se o peso é superior a 90 kg e atualizar a contagem
            if (peso > 90) {
                contadorAcima90kg++;
            }
        }

        // Exibir a quantidade de pessoas com mais de 90 kg
        System.out.println("Número de pessoas com mais de 90 kg: " + contadorAcima90kg);

        scanner.close();
    }
}
