import java.util.Scanner;

public class q22 {

    public static boolean validarIP(String ip) {
        String[] partes = ip.trim().split("\\.");

        if (partes.length != 4) {
            return false;
        }

        for (String parte : partes) {
            if (parte.isEmpty()) {
                return false; // parte vazia, ex: "192..1.1"
            }
            try {
                int numero = Integer.parseInt(parte);
                if (numero < 0 || numero > 255) {
                    return false;
                }
                // Bloqueia números com zeros à esquerda, exceto "0"
                if (parte.length() > 1 && parte.startsWith("0")) {
                    return false;
                }22
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Digite endereços IP para validar ou 'sair' para encerrar:");

        while (true) {
            System.out.print("IP: ");
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            if (validarIP(entrada)) {
                System.out.println("IP válido.\n");
            } else {
                System.out.println("IP inválido.\n");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
