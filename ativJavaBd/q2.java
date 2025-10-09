import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
       //Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
       Scanner ler= new Scanner(System.in);
       double pi=3.14;
       double raio;
       double area;

       System.out.println("Digite o raio do circulo:");
       raio=ler.nextDouble();
       System.out.println("Area do circulo:");
       area=pi*(raio*raio);
       System.out.println(area);
    }
}
