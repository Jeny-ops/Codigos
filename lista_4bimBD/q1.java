/*1. Faça um programa que seja capaz de armazenar dados de alunos em um banco de dados.
Quando seu programa executar, o usuário será solicitado a digitar os dados de um aluno
composto por: número (inteiro e único), nome (texto), curso (texto), nota1 (real), nota2
(real), nota3 (real) e nota4 (real). Após ler os dados que o usuário digitou, seu programa
deve: (i) inserir o aluno informado na tabela específica do banco de dados, (ii) informar ao
usuário se o aluno foi cadastrado com sucesso ou não e (iii) perguntar ao usuário se ele
deseja inserir outro aluno ou encerrar o programa. Caso o usuário escolha inserir outro aluno
o procedimento começa novamente desde o início, caso ele escolha encerrar o programa
seu programa deve terminar a execução. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class bancoAluno {

    public static void main(String[] args) {
        String url = " ";
        String usuario = " ";
        String senha = " ";
        Scanner ler= new Scanner(System.in);

        int numero=0;
        String nome= " ";
        String curso=" ";
        double nota1=0.0;
        double nota2=0.0;
        double nota3=0.0;
        double nota4=0.0;

        String sql = "INSERT INTO dadosAluno (numero, nome, curso, nota1, nota2, nota3, nota4) VALUES (?,?,?,?,?,?,?)";
        
        try(Connection conexao=DriverManager.getConnection(url, usuario, senha)){
            System.out.println("Digite os dados do aluno");

            System.out.println("Numero:");
            numero=ler.nextInt();
            
            System.out.println("Nome:");
            nome=ler.nextLine();

            System.out.println("Nota1:");
            nota1=ler.nextDouble();

            System.out.println("Nota2:");
            nota2=ler.nextDouble();

            System.out.println("Nota3:");
            nota3=ler.nextDouble();

            System.out.println("Nota4:");
            nota4=ler.nextDouble();

            try(PreparedStatement stmt = conexao.PreparedStatement(sql)){
                stmt.setInt(1,numero);
                stmt.setString(2,nome);
                stmt.setString(3,curso);
                stmt.setDouble(4,nota1);
                stmt.setDouble(5,nota2);
                stmt.setDouble(6,nota3);
                stmt.setDouble(7,nota4);
                stmt.executeUpdate();
                System.out.println("Inserção realizada com sucesso");
            }

        } catch(SQLException e){
            System.out.println("Erro ao realizar inserção.")

        }




    }
}
