/*Faça um programa que faça cinco perguntas para uma pessoa sobre um crime. As perguntas são:
- Telefonou para a vítima?
- Esteve no local do crime?
- Mora perto da vítima?
- Devia para a vítima?
- Já trabalhou com a vítima?
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a
pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e
4 como “Cúmplice” e 5 como “Assassino”. Caso contrário, será classificado como “Inocente”.*/

import java.util.Scanner;
public class q13{
  public static void main (String [] args){
    
    String p1;
    String p2;
    String p3;
    String p4;
    String p5;
    String classificacao;
    int contp1=0;
    int contp2=0;
    int contp3=0;
    int contp4=0;
    int contp5=0;
    int contadorDeSim=0;
    int perguntas=5;


    Scanner ler= new Scanner(System.in);

    System.out.println("Telefonou para a vítima?");
    p1=ler.nextLine();
    if(p1=="sim"){
    contp1=1;
    }
    
    System.out.println("Esteve no local do crime?");
    p2=ler.nextLine();
    if(p2=="sim"){
    contp2=1;
    }
    
    System.out.println("Mora perto da vítima?");
    p3=ler.nextLine();
    if(p3=="sim"){
    contp3=1;
    }

    System.out.println("Devia para a vítima?");
    p4=ler.nextLine();
    if(p4=="sim"){
    contp4=1;
    }

    System.out.println("Já trabalhou com a vítima?");
    p5=ler.nextLine();
    if(p5=="sim"){
    contp5=1;
    }
    
    
   contadorDeSim = contp1 + contp2 + contp3 +  contp4 + contp5;
   
   
   if (contadorDeSim==2){
       classificacao= "Suspeita";
   }
   
   else if(contadorDeSim>=3 && contadorDeSim<=4){
       classificacao= "Cumplice";
   }
   
   else if (contadorDeSim==5){
        classificacao= "Assassino";
   }
   
   else{
       classificacao= "inocente";
   }
    System.out.println(classificacao);
  }
}
