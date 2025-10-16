/* As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe
contrataram para desenvolver o programa que calculará os reajustes. Assim, faça um programa
que recebe o salário de um colaborador e calcule o reajuste segundo o seguinte critério:
- Salários até R$ 280,00 (incluindo): aumento de 20%;
- Salários entre R$ 280,00 e R$ 700,00 (incluindo): aumento de 15%;
- Salários entre R$ 700,00 e R$ 1500,00 (incluindo): aumento de 10%;
- Salários acima de R$ 1500,00: aumento de 5%
Após o aumento ser realizado, informe na tela:
- O salário antes do reajuste;
- O percentual de aumento aplicado;
- O valor do aumento;
- O novo salário, após o aumento. */

import java.util.Scanner;
public class q11{
  public static void main (String [] args){
    
    Scanner ler = new Scanner (System.in);
    double salarioA;
    double salarioD;
    int aumento;
    double percentAumento;
  

    System.out.println("Digite seu salario:");
    salarioA= ler.nextDouble();
    
    // Salários até R$ 280,00 (incluindo): aumento de 20%;
    if(salarioA=<280){
      percentAumento=20/100;
      aumento= 20/100 * salario;
      salarioD= salarioA + aumento;
    }

    //Salários entre R$ 280,00 e R$ 700,00 (incluindo): aumento de 15%;
    else if (salarioA>280 && salarioA<700){
      percentAumento=15/100;
      aumento= 15/100 * salario;
      salarioD= salarioA + aumento;
    }

    //Salários entre R$ 700,00 e R$ 1500,00 (incluindo): aumento de 10%;
    else if(salarioA>=700 && salarioA=<1500){
      percentAumento=10/100;
      aumento= 10/100 * salario;
      salarioD= salarioA + aumento;
    }

    //Salários acima de R$ 1500,00: aumento de 5%
    else if(salarioA>1500){
      percentAumento=5/100;
      aumento= 5/100 * salario;
      salarioD= salarioA + aumento;
    }
    
    System.out.println("O salário antes do reajuste: " + salarioA);
    
    System.out.println("O percentual de aumento aplicado: " + percentAumento);
    
    System.out.println("O valor do aumento: " + aumento);
    
    System.out.println("O novo salário, após o aumento: " + salarioD);
  }
  
}
