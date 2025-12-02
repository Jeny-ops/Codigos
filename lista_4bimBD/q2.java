/*2. Já que isto está tão divertido, vamos continuar trabalhando com base na questão anterior.
Escreva um programa que consulte os alunos cadastrados como resultado da execução da
questão anterior e liste todos os alunos, mostrando as seguintes informações para cada um
deles:
Aluno <número do aluno>: <nome do aluno>
Curso: <curso do aluno>
Notas: <nota1> <nota2> <nota3> <nota4>
Situação: <situação do aluno> com média <média do aluno> */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class consultarAluno {

    public static void main(String[] args) {

        String url = "";
        String usuario = "";
        String senha = "";

        String sql = "select * from dadosAluno";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    var numero = rs.getInt("numero");
                    var nome = rs.getString("nome");
                    var curso = rs.getString("curso");
                    var nota1 = rs.getDouble("nota1");
                    var nota2 = rs.getDouble("nota2");
                    var nota3 = rs.getDouble("nota3");
                    var nota4 = rs.getDouble("nota4");
                    var media = (nota1 + nota2 + nota3 + nota4)/4;
                    var situacao;

                    if(media>=7){
                        situacao="aprovado";
                    }

                    else if(media<3){
                        situacao="reprovado";
                    } else{
                        situacao="recuperação";
                    }


                    System.out.println("Aluno: " + numero " :" + nome);
                    System.out.println("curso: " + curso);
                    System.out.println("notas: " + nota1 ", " + nota2 + ", " + nota3 + ", " + nota4);
                    System.out.println("situação do aluno: " + situacao + "com média:" + media );

                    System.out.println("------------------------");
                }
            } else {
                System.out.println("Nenhum aluno cadastrado!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
