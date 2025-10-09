import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
      /*Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no
        mês. Calcule e mostre o total do seu salário no referido mês.*/
        Scanner ler= new Scanner(System.in);
        double salarioH;
        double horasPorM;
        double salarioNoMes;

        System.out.println("Quanto voce ganha por hora?");
        salarioH=ler.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mes:");
        horasPorM=ler.nextDouble();
        salarioNoMes=salarioH*horasPorM;
        System.out.println("total do seu salário no mes:");
        System.out.println(salarioNoMes);
    }
}
