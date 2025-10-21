import java.util.ArrayList;
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        Double [] notas = new double [];
        double nota;

      
        
        do {
            
            System.out.println("Digite as notas (digite -1 para encerrar):");
            nota = ler.nextDouble();
            
        }

        // Quantidade de valores lidos
        int quantidade = notas.size();
        System.out.println("\nQuantidade de notas lidas: " + quantidade);

        // Valores na ordem informada
        System.out.print("Notas na ordem digitada: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Valores na ordem inversa
        System.out.println(" Notas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        //  Média aritmética
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        double media = soma / quantidade;
        System.out.printf("d) Média das notas: %.2f\n", media);

        // Quantidade de valores acima da média
        int acimaMedia = 0;
        int abaixoMedia = 0;
        for (double n : notas) {
            if (n > media) {
                acimaMedia++;
            } else if (n < media) {
                abaixoMedia++;
            }
        }while(nota!=-1 && nota>0);


        System.out.println("Notas acima da média: " + acimaMedia);
        System.out.println("Notas abaixo da média: " + abaixoMedia);

        ler.close();
    }
}
