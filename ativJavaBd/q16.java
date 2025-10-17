/*Faça um programa que peça para N pessoas a sua idade, ao final o programa deverá verificar se a
média de idade do grupo varia entre 0 e 25, 26 e 60 ou maior que 60; e então, dizer se o grupo se
classifica com jovem, adulto ou idoso, conforme as variações indicadas.*/ 

import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade=0;
        int media=0;
        int numPessoas=0;
        int contador=0;
        String classificacao=" ";

        System.out.println("Quantas idade serao cadastradas?");
        numPessoas=ler.nextInt();


        
        
        while (contador<numPessoas) {
            
        System.out.println("Digite sua idade:");
        idade+=ler.nextInt();
        contador++;
        
        }
        media=idade/numPessoas;
        
        if (media>0 && media<=25){
            classificacao   = "Jovem";
        }

        else if (media>25 && media<=60){
            classificacao   = "adulto";
        }

       else{
        classificacao   = "adulto";
       }

       System.out.println(classificacao);

       ler.close();

    }
}
