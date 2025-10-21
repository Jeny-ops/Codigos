import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double nota;

        // Leitura das notas
        System.out.println("Digite as notas (digite -1 para encerrar):");
        while (true) {
            nota = ler.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
        }

        // Quantidade de valores lidos
        int quantidade = notas.size();
        System.out.println("\n Quantidade de notas lidas: " + quantidade);

        // Valores na ordem informada
        System.out.print("Notas na ordem digitada: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Valores na ordem inversa
        System.out.println("Notas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // Média aritmética
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        double media = soma / quantidade;
        System.out.printf("Média das notas: ", media);

        // Quantidade de valores acima da média
        int acimaMedia = 0;
        int abaixoMedia = 0;
        for (double n : notas) {
            if (n > media) {
                acimaMedia++;
            } else if (n < media) {
                abaixoMedia++;
            }
        }

        System.out.println("Notas acima da média: " + acimaMedia);
        System.out.println("Notas abaixo da média: " + abaixoMedia);

        ler.close();
    }
}
