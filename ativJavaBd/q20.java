import java.util.Scanner;

public class q20 {

    // Função que imprime o triângulo de números até N
    public static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("\nSaída:");
        imprimirTriangulo(n); // Chama a função

        scanner.close();
    }
}
