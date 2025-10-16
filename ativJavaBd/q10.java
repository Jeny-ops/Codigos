/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de
um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo
usando este link (em minutos).*/
import java.util.Scanner;
public class q10{
  public static void main (String [] args){
    
    Scanner ler= new Scanner(System.in);
    double tamArquivo;
    double velLinkMbps;
    double velLinkMBPS;
    double tempAproxDowload;
    double tempAproxDowloadEmMin;

    System.out.println("tamanho de um arquivo para download em MB:");
    tamArquivo=ler.nextDouble();
    
    System.out.println("velocidade de um link de Internet (em Mbps):");
    velLinkMbps=ler.nextDouble();
    
    velLinkMBPS= velLinkMbps / 8;
   
   
    tempAproxDowload= tamArquivo/velLinkMBPS;
    
    tempAproxDowloadEmMin= tempAproxDowload / 60;
    

 
    System.out.println("tempo aproximado de download do arquivo usando este link (em minutos): " +   tempAproxDowloadEmMin);

    
  }
  
}
