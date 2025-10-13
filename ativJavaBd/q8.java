import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
      
      /*Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no
mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11%
para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a. Salário bruto;
b. Quanto pagou ao INSS;
c. Quanto pagou ao sindicato;
d. O salário líquido.*/
        
        Scanner ler= new Scanner(System.in);
        double salarioH;
        double horasPorMes;
        double salarioBruto;
        double IR;
        double INSS;
        double sindi;
        double salarioLiqui;

        System.out.println("Quanto voce ganha por hora?");
        salarioH=ler.nextDouble();
        
        System.out.println("Digite o numero de horas trabalhadas no mes:");
        horasPorMes=ler.nextDouble();
        
        salarioBruto=salarioH*horasPorMes;
        System.out.println("Salario bruto: " + salarioBruto);
        
        INSS= 0.08 * salarioBruto;
        System.out.println("Quanto pagou ao INSS: " + INSS);
        
        sindi = 0.05 * salarioBruto;
        System.out.println("Quanto pagou ao sindicato: " + sindi);
        
        IR= 0.11 * salarioBruto;
        
        salarioLiqui= salarioBruto -  (IR + INSS + sindi);
        System.out.println("O salário líquido " + salarioLiqui);
    
        
    }
}
