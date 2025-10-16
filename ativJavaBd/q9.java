import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Área que será pintada(m²):");
        double area = ler.nextDouble();

        ler.close();
        double litros = area/3;
        double latas = litros / 18;

        if((latas - (int)latas) != 0 ){
            latas = (int)latas + 1;
        }

        double valor = latas * 80;

        System.out.println("Quantidade de latas necessárias: "+latas);

        System.out.println("Valor total: "+ valor);



    }
}
