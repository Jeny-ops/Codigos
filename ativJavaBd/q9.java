// nao concluida!!
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
      
      /*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros
quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário
a quantidades de latas de tinta a serem compradas e o preço total.*/
        
        Scanner ler = new Scanner (System.in);
        int area;
        int litrosTinta=0;
        int quantLatas;
        double precoTotal;
        
        
        
        System.out.println("Tamanho em metros quadrados da área a ser pintada: " );
        area=ler.nextInt();
        
        litrosTinta = litrosTinta + area/3;
       
        if(area>54){
            litrosTinta++;
        }
        
        quantLatas= litrosTinta/18;
        
        
        if(quantLatas%18==0 || quantLatas%18==1){
            
            quantLatas=1;
            
        }
       
       while(quantLatas%18!=0 || quantLatas%18!=1){
           
           quantLatas=1;
           
           quantLatas=quantLatas+1;
           
       }
        
        System.out.println("Quantidades de latas de tinta a serem compradas: " + quantLatas);
        
        
        
    }
}
