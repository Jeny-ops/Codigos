/* Faça um programa que leia e valide as seguintes informações, mantendo o usuário preso até que
digite um valor válido:
- Nome: maior que 3 caracteres;
- Idade: entre 0 e 150;
- Salário: maior que zero;
- Sexo: “f” ou “m”;
- Estado Civil: “s”, “c”, “v”, “d”.*/

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        String nome= " ";
        int idade=0;
        double salario=0.0;
        char sexo;
        char estadoCivil= ' ';

        do{
            System.out.println("Digite seu nome:");
            nome=ler.nextLine();


        } while(nome.length()<=3);

        do{
        System.out.println("Digite sua idade:");
        idade=ler.nextInt();


        } while(idade<0 || idade>150);

        do{
            System.out.println("Digite seu salario:");
            salario=ler.nextDouble();

        } while(salario<=0);

        do{
            System.out.println("Digite seu sexo (M para masculino e F para feminino):");
            sexo=ler.next().charAt(0);
        } while(!(sexo=='M' || sexo=='F'));

        do{
            System.out.println("Digite a primeira letra do seu estado civil:");
            estadoCivil=ler.next().charAt(0);

        } while(!(estadoCivil=='s' || estadoCivil=='c' || estadoCivil=='v' || estadoCivil == 'd'));

    }    
}
