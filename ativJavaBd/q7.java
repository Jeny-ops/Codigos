import java.util.Scanner;
public class q7  {
    public static void main(String args[]) {
     
     /*João é um pescador. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
regulamento de pesca do seu estado (50 quilos), ele deve pagar uma multa de R$ 4,00 por quilo
excedente. João precisa que você faça um programa que leia o peso de peixes e diga a quantidade
excedente e o valor da multa para tal quantidade.*/

        double pesoPeixe;
        double kgExcedente = 0;
        double multa;
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Digite o peso do peixe:");
        pesoPeixe= ler.nextDouble();
    
        if (pesoPeixe>50){
        kgExcedente= pesoPeixe - 50;
    
        };
  
        System.out.println("Quantidade excedente:");
        System.out.println(kgExcedente);
    
        System.out.println("Valor da multa para tal quantidade:");
        multa= 4.00 * kgExcedente;
        System.out.println(multa);
  }


}
