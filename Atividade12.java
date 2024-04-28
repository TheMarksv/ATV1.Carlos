import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contagem
        int contadorIdadeSuperior50 = 0;
        int contadorAltura10a20 = 0;
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

            // Pessoas com idade superior a 50 anos
            if (idade > 50) {
                contadorIdadeSuperior50++;
            }

            // Altura entre 10 e 20 anos
            if (10 <= idade && idade <= 20) {
                contadorAltura10a20++;
                somaAltura10a20 += altura;
            }

            // Peso inferior a 40 kg
            if (peso < 40) {
                contadorPesoMenor40++;
            }
        }

        // Calcular médias e porcentagem
        double mediaAltura10a20 = (contadorAltura10a20 > 0) ? somaAltura10a20 / contadorAltura10a20 : 0;
        double porcentagemPesoMenor40 = (contadorPesoMenor40 / 25.0) * 100;

        // Exibir resultados
        System.out.println("Pessoas com idade superior a 50 anos: " + contadorIdadeSuperior50);
        System.out.println("Média de altura entre 10 e 20 anos: " + String.format("%.2f", mediaAltura10a20));
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + String.format("%.2f", porcentagemPesoMenor40) + "%");

        scanner.close();
    }
}
