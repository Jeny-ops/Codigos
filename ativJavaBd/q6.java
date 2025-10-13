import java.util.Scanner;

public class q6 {
  public static void main(String args[]) {
     
    /*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule e mostre
seu peso ideal. Use a fórmula:
PesoIdeal = 72.7 ∙ altura − 58*/  
    
    double altura;
    double pesoIdeal;
    Scanner ler= new Scanner(System.in);
    
    System.out.println("Digite sua altura:");
    altura=ler.nextDouble();
    
    System.out.println("Seu peso ideal:");
    pesoIdeal= (72.7 * altura) - 58;
    System.out.println(pesoIdeal);
    
  }
}
