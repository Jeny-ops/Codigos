import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        //Faça um programa que peça as 4 notas bimestrais de um estudante e mostre a média aritmética entre elas
        float bim1;
        float bim2;
        float bim3;
        float bim4;
        float media;

        Scanner ler= new Scanner (System.in);
        System.out.println("Digite as notas dos seus 4 bimestres:");
        System.out.println("1bim:");
        bim1=ler.nextFloat();
        System.out.println("2bim:");
        bim2=ler.nextFloat();
        System.out.println("3bim:");
        bim3=ler.nextFloat();
        System.out.println("4bim:");
        bim4=ler.nextFloat();
        media= (bim1 + bim2 + bim3 + bim4)/4;
        System.out.println("Media das notas:");
        System.out.println(media);1
          
        
    }
}

