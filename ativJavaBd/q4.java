import java.util.Scanner;   

public class q4 {
    public static void main(String[] args) {
        /*Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura
          em graus Celsius. */
          Scanner ler= new Scanner(System.in);
          double tempF;
          double tempC;

          System.out.println(" Digite a temperatura em graus Farenheit:");
          tempF=ler.nextDouble();
          tempC=5*(tempF-32)/9;
          System.out.println("Temperatura em graus Celsius:");
          System.out.println(tempC);
    }
}
