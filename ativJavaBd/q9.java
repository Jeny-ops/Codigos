// nao concluida!!
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
      
      /*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros
quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário
a quantidades de latas de tinta a serem compradas e o preço total.*/
        Scanner ler = new Scanner (System.in);
        double area;
        int areaPor3;
        int quantintas;
        int quantBaldes;
        double precoTotal;
        
        
        area = ler.nextDouble();
        System.out.println("tamanho em metros quadrados da área a ser pintada: " + area);
        
        areaPor3= area/3;
        quantBaldes= quantintas/3;
        quantintas= area - quantBaldes;
        
        
        
    }
}
