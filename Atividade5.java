import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contagem e soma
        int contadorMaior50 = 0;
        double somaAltura10a20 = 0;
        int contadorPesoMenor40 = 0;

        // Solicitar dados de 25 pessoas
        for (int i = 1; i <= 25; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura da " + i + "ª pessoa: ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso da " + i + "ª pessoa: ");
            double peso = scanner.nextDouble();

            // a) Pessoas com idade superior a 50 anos
            if (idade > 50) {
                contadorMaior50++;
            }

            // b) Média de altura entre 10 e 20 anos
            if (10 <= idade && idade <= 20) {
                somaAltura10a20 += altura;
            }

            // c) Porcentagem de pessoas com peso inferior a 40 kg
            if (peso < 40) {
                contadorPesoMenor40++;
            }
        }

        // Exibir resultados
        System.out.println("a) Pessoas com mais de 50 anos: " + contadorMaior50);
        System.out.println("b) Média de altura (10 a 20 anos): " + (somaAltura10a20 / (contadorPesoMenor40 == 0 ? 1 : contadorPesoMenor40)));
        System.out.println("c) Porcentagem com peso inferior a 40 kg: " + (contadorPesoMenor40 * 100.0 / 25) + "%");

        scanner.close();
    }
}
