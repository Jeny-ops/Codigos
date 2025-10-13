import java.util.Scanner;
public class q5 {
  public static void main(String args[]) {
     
      /* Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a. O produto do dobro do primeiro com metade do segundo.
b. A soma do triplo do primeiro com o terceiro.
c. O terceiro elevado ao cubo.*/
    
    int num1;
    int num2;
    double numReal;
    int a;
    double b;
    double c;
    
    Scanner ler= new Scanner(System.in);
    
    System.out.println("Digite um numero inteiro");
    num1=ler.nextInt();
    
    System.out.println("Digite outro numero inteiro");
    num2=ler.nextInt();
    
    System.out.println("Agora digite um numero real");
    numReal=ler.nextDouble();
    
    System.out.println(" O produto do dobro do primeiro com metade do segundo:");
    a=(num1*2) * (num2/2);
    System.out.println(a);
    
    System.out.println("A soma do triplo do primeiro com o terceiro:");
    b=(num1*3) + numReal;
    System.out.println(b);
    
    System.out.println(" O terceiro elevado ao cubo.");
    c=numReal*numReal*numReal;
    System.out.println(c);
  
  }

}

