/*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina e calcule a
sua média aritmética. O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a situação. A atribuição de conceitos e situações obedece à tabela abaixo:*/

import java.util.Scanner;
public class q12{
  public static void main (String [] args){

    Scanner ler= new Scanner(System.in);
    double n1;
    double n2;
    double media;
    char conceito = ' ';
    String situacao = " ";

    System.out.println("digite sua 1 nota parical:");
    n1=ler.nextDouble();
    
    System.out.println("agora digite sua 2 nota parical:");
    n2=ler.nextDouble();

    media=(n1+n2)/2;
    
    System.out.println("1 nota parical: " + n1);
    System.out.println("2 nota parical: " + n2);
    System.out.println("media: " + media);
    
    if(media>=9 && media<=10){
        conceito='A';
        situacao="Aprovado com distincao";
    }
    
    else if(media>=7.5 && media<9.0){
        conceito='B';
        situacao="Aprovado";
    }
    
    else if(media>=6.0 && media<7.5){
        conceito='C';
        situacao="Aprovado";

    }

    else if(media>=4.0 && media<6.0){
        conceito='D';
        situacao="Reprovado";

    }

    else if (media>=0.0 && media<4){
        conceito='E';
        situacao="Reprovado";

    }

    System.out.println("Conceito: " + conceito);
    System.out.println("Situacao: " + situacao);

  }
}
