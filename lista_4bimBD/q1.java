import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class bancoAluno {

    public static void main(String[] args) {

        String url = " ";
        String usuario = " ";
        String senha = " ";

        Scanner ler = new Scanner(System.in);

        String sql = "INSERT INTO dadosAluno (numero, nome, curso, nota1, nota2, nota3, nota4) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {

            while (true) {

                System.out.println("Digite os dados do aluno");

                System.out.print("Número: ");
                int numero = ler.nextInt();

                System.out.print("Nome: ");
                String nome = ler.nextLine();

                System.out.print("Curso: ");
                String curso = ler.nextLine();

                System.out.print("Nota 1: ");
                double nota1 = ler.nextDouble();

                System.out.print("Nota 2: ");
                double nota2 = ler.nextDouble();

                System.out.print("Nota 3: ");
                double nota3 = ler.nextDouble();

                System.out.print("Nota 4: ");
                double nota4 = ler.nextDouble();
                ler.nextLine(); 

            
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

                    stmt.setInt(1, numero);
                    stmt.setString(2, nome);
                    stmt.setString(3, curso);
                    stmt.setDouble(4, nota1);
                    stmt.setDouble(5, nota2);
                    stmt.setDouble(6, nota3);
                    stmt.setDouble(7, nota4);

                    stmt.executeUpdate();
                    System.out.println("Inserção realizada com sucesso!");

                } catch (SQLException e) {
                    System.out.println("Erro ao realizar inserção");
                }

                
                System.out.print("Deseja cadastrar outro aluno? (S/N): ");
                String resposta = ler.nextLine();

                if (!resposta.equalsIgnoreCase("s")) {
                    System.out.println("Encerrando.");
                    break;
                }

            } 

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco");
        }

        ler.close();
    }
}
