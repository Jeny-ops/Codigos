import java.util.Scanner;

public class SaltoEmDistancia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Atleta: ");
            String nome = scanner.nextLine();

            if (nome.isEmpty()) {
                break; // Encerra o programa se o nome estiver vazio
            }

            double[] saltos = new double[5];
            String[] ordem = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};

            for (int i = 0; i < 5; i++) {
                System.out.print(ordem[i] + " Salto: ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Valor inválido. Digite novamente: ");
                    scanner.next(); // Descarta valor inválido
                }
                saltos[i] = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer (Enter)
            }

            // Calcular a média
            double soma = 0;
            for (double salto : saltos) {
                soma += salto;
            }
            double media = soma / 5;

            // Exibir os resultados
            System.out.println("\nAtleta: " + nome);
            for (int i = 0; i < 5; i++) {
                System.out.println(ordem[i] + " Salto: " + saltos[i] + " m");
            }

            System.out.println("\nResultado:");
            System.out.println("Atleta: " + nome);
            System.out.println("Média dos saltos: " + String.format("%.1f", media) + " m\n");
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
