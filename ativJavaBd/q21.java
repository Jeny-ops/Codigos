import java.util.Scanner;

public class q21 {

    // Função que converte a data para o formato por extenso
    public static String converterData(String data) {
        String[] partes = data.split("/"); // Divide em [DD, MM, AAAA]
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];

        // Lista de meses por extenso
        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        // Converte MM para índice da lista (0 a 11)
        int indiceMes = Integer.parseInt(mes) - 1;
        String mesPorExtenso = meses[indiceMes];

        return dia + " de " + mesPorExtenso + " de " + ano;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Digite datas no formato DD/MM/AAAA ou 'sair' para encerrar:");

        while (true) {
            System.out.print("Data: ");
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String dataFormatada = converterData(entrada);
            System.out.println("Data por extenso: " + dataFormatada + "\n");
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
