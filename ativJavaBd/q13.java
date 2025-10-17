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
    int contadorDeSim=0;
    
    

    Scanner ler= new Scanner(System.in);

    System.out.println("Telefonou para a vítima?");
    p1=ler.nextLine();
    if(p1.equalsIgnoreCase("sim")){
    contadorDeSim+=1;
    }
    
    System.out.println("Esteve no local do crime?");
    p2=ler.nextLine();
    if(p2.equalsIgnoreCase("sim")){
    contadorDeSim+=1;
    }
    
    System.out.println("Mora perto da vítima?");
    p3=ler.nextLine();
    if(p3.equalsIgnoreCase("sim")){
    contadorDeSim+=1;
    }

    System.out.println("Devia para a vítima?");
    p4=ler.nextLine();
    if(p4.equalsIgnoreCase("sim")){
    contadorDeSim+=1;
    }

    System.out.println("Já trabalhou com a vítima?");
    p5=ler.nextLine();
    if(p5.equalsIgnoreCase("sim")){
    contadorDeSim+=1;
    }
    

   
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
