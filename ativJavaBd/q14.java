/*Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre o total. Escreva um programa para ler a quantidade
(em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago
pelo cliente.*/ 

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
       Scanner ler= new Scanner(System.in); 
       double kgMoran=0.0;
       double kgMaca=0.0;
       double valor1=0.0;
       double valor2=0.0;
       double valorTotal=0.0;
       double totalkg=0.0;
       
      
       System.out.println("quantidade (em Kg) de morango:");
       kgMoran=ler.nextDouble();
       
       System.out.println("quantidade (em Kg) de maca:");
       kgMaca=ler.nextDouble();

       if(kgMoran<=5){

        valor1=2.50;

       }
       
       else {

        valor1=2.20;

       }

       if(kgMaca<=5){

        valor2=1.80;

       }

       else{

        valor2=1.50;

       }

       valorTotal = (valor1 * kgMoran) + (valor2 * kgMaca);
       totalkg = kgMoran + kgMaca;
       
       if(totalkg>=8 || valorTotal>25.00 ){
            valorTotal = valorTotal - valorTotal*(10/100);
       }

       System.out.println("valor total: " + valorTotal);
       
       

    
    }
}
