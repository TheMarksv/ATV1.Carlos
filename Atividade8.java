import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número
        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();

        // Exibir a tabuada de 0 a 100
        for (int i = 0; i <= 100; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
