/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author rafae
 */
public class BancoDadosLivros {

    public void conectaBanco() {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/Banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            JOptionPane.showMessageDialog(null, "Conexão com o banco de dados estabelecida!\n");
            connection.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n"
                    + ex.toString(), "ERRO NO DRIVER", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insereLivroParticular(String isbn, String titulo, String autor, String genero, String editora) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/Banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "INSERT INTO banco.livro_particular values (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbn);
            statement.setString(2, titulo);
            statement.setString(3, autor);
            statement.setString(4, genero);
            statement.setString(5, editora);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "Cadastro do livro particular efetuado!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n"
                    + ex.toString(), "ERRO NO DRIVER", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insereLivroEstudos(String isbn, String titulo, String autor, String materia, String editora) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/Banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "INSERT INTO banco.livro_estudos values (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbn);
            statement.setString(2, titulo);
            statement.setString(3, autor);
            statement.setString(4, materia);
            statement.setString(5, editora);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "Cadastro do livro de estudos efetuado!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n"
                    + ex.toString(), "ERRO NO DRIVER", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insereLivroProfissional(String isbn, String titulo, String autor, String assunto, String editora) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/Banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "INSERT INTO banco.livro_profissional values (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbn);
            statement.setString(2, titulo);
            statement.setString(3, autor);
            statement.setString(4, assunto);
            statement.setString(5, editora);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "Cadastro do livro profissional efetuado!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n"
                    + ex.toString(), "ERRO NO DRIVER", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluiLivroParticular(String isbn) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "DELETE FROM banco.livro_particular WHERE isbn_part = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbn);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "O registro foi excluído!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluiLivroEstudos(String isbn) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "DELETE FROM banco.livro_estudos WHERE isbn_est = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbn);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "O registro foi excluído!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluiLivroProfissional(String isbn) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "DELETE FROM banco.livro_profissional WHERE isbn_prof = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbn);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "O registro foi excluído!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizaLivroParticular(String isbn, String isbnNovo, String titulo, String autor, String genero, String editora) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "UPDATE banco.livro_particular SET isbn_part = ?, titulo = ?, autor = ?, genero = ?, editora = ? WHERE isbn_part = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbnNovo);
            statement.setString(2, titulo);
            statement.setString(3, autor);
            statement.setString(4, genero);
            statement.setString(5, editora);
            statement.setString(6, isbn);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "O registro foi alterado!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizaLivroEstudos(String isbn, String isbnNovo, String titulo, String autor, String materia, String editora) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "UPDATE banco.livro_estudos SET isbn_est = ?, titulo = ?, autor = ?, materia = ?, editora = ? WHERE isbn_est = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbnNovo);
            statement.setString(2, titulo);
            statement.setString(3, autor);
            statement.setString(4, materia);
            statement.setString(5, editora);
            statement.setString(6, isbn);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "O registro foi alterado!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizaLivroProfissional(String isbn, String isbnNovo, String titulo, String autor, String assunto, String editora) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "UPDATE banco.livro_profissional SET isbn_prof = ?, titulo = ?, autor = ?, assunto = ?, editora = ? WHERE isbn_prof = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, isbnNovo);
            statement.setString(2, titulo);
            statement.setString(3, autor);
            statement.setString(4, assunto);
            statement.setString(5, editora);
            statement.setString(6, isbn);
            statement.executeUpdate();
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "O registro foi alterado!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscaTituloLivroParticular(String titulo) {
        String tituloExibe, autor, genero, editora, isbn;
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT * FROM banco.livro_particular WHERE titulo = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, titulo);
            ResultSet resultset = statement.executeQuery();
            System.out.println("Livros encontrados com o título " + titulo);
            System.out.println("--------------------------------");
            while (resultset.next()) {
                isbn = resultset.getString("isbn_part");
                tituloExibe = resultset.getString("titulo");
                autor = resultset.getString("autor");
                genero = resultset.getString("genero");
                editora = resultset.getString("editora");
                System.out.println("Título: " + tituloExibe
                        + "\nISBN: " + isbn
                        + "\nAutor: " + autor
                        + "\nGênero: " + genero
                        + "\nEditora: " + editora);
                System.out.println("--------------------------------\n");
            }
            resultset.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscaTituloLivroEstudos(String titulo) {
        String tituloExibe, autor, materia, editora, isbn;
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT * FROM banco.livro_estudos WHERE titulo = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, titulo);
            ResultSet resultset = statement.executeQuery();
            System.out.println("Livros encontrados com o título " + titulo);
            System.out.println("--------------------------------");
            while (resultset.next()) {
                isbn = resultset.getString("isbn_est");
                tituloExibe = resultset.getString("titulo");
                autor = resultset.getString("autor");
                materia = resultset.getString("materia");
                editora = resultset.getString("editora");
                System.out.println("Título: " + tituloExibe
                        + "\nISBN: " + isbn
                        + "\nAutor: " + autor
                        + "\nMatéria: " + materia
                        + "\nEditora: " + editora);
                System.out.println("--------------------------------\n");
            }
            resultset.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscaTituloLivroProfissional(String titulo) {
        String tituloExibe, autor, assunto, editora, isbn;
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT * FROM banco.livro_profissional WHERE titulo = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, titulo);
            ResultSet resultset = statement.executeQuery();
            System.out.println("Livros encontrados com o título " + titulo);
            System.out.println("--------------------------------");
            while (resultset.next()) {
                isbn = resultset.getString("isbn_prof");
                tituloExibe = resultset.getString("titulo");
                autor = resultset.getString("autor");
                assunto = resultset.getString("assunto");
                editora = resultset.getString("editora");
                System.out.println("Título: " + tituloExibe
                        + "\nISBN: " + isbn
                        + "\nAutor: " + autor
                        + "\nAssunto: " + assunto
                        + "\nEditora: " + editora);
                System.out.println("--------------------------------\n");
            }
            resultset.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscaAutorLivroParticular(String autor) {
        String titulo, autorExibe, genero, editora, isbn;
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT * FROM banco.livro_particular WHERE autor = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, autor);
            ResultSet resultset = statement.executeQuery();
            System.out.println("Livros escritos pelo autor " + autor);
            System.out.println("---------------------------");
            while (resultset.next()) {
                isbn = resultset.getString("isbn_part");
                titulo = resultset.getString("titulo");
                autorExibe = resultset.getString("autor");
                genero = resultset.getString("genero");
                editora = resultset.getString("editora");
                System.out.println("ISBN: " + isbn
                        + "\nTítulo: " + titulo
                        + "\nAutor: " + autorExibe
                        + "\nGênero: " + genero
                        + "\nEditora: " + editora);
                System.out.println("---------------------------\n");
            }
            resultset.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscaAutorLivroEstudos(String autor) {
        String titulo, autorExibe, materia, editora, isbn;
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT * FROM banco.livro_estudos WHERE autor = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, autor);
            ResultSet resultset = statement.executeQuery();
            System.out.println("Livros escritos pelo autor " + autor);
            System.out.println("---------------------------");
            while (resultset.next()) {
                isbn = resultset.getString("isbn_est");
                titulo = resultset.getString("titulo");
                autorExibe = resultset.getString("autor");
                materia = resultset.getString("materia");
                editora = resultset.getString("editora");
                System.out.println("ISBN: " + isbn
                        + "\nTítulo: " + titulo
                        + "\nAutor: " + autorExibe
                        + "\nAssunto: " + materia
                        + "\nEditora: " + editora);
                System.out.println("---------------------------\n");
            }
            resultset.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscaAutorLivroProfissional(String autor) {
        String titulo, autorExibe, assunto, editora, isbn;
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT * FROM banco.livro_profissional WHERE autor = ?";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, autor);
            ResultSet resultset = statement.executeQuery();
            System.out.println("Livros escritos pelo autor " + autor);
            System.out.println("---------------------------");
            while (resultset.next()) {
                isbn = resultset.getString("isbn_prof");
                titulo = resultset.getString("titulo");
                autorExibe = resultset.getString("autor");
                assunto = resultset.getString("assunto");
                editora = resultset.getString("editora");
                System.out.println("ISBN: " + isbn
                        + "\nTítulo: " + titulo
                        + "\nAutor: " + autorExibe
                        + "\nAssunto: " + assunto
                        + "\nEditora: " + editora);
                System.out.println("---------------------------\n");
            }
            resultset.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado!\n" + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!\n"
                    + ex.toString(), "ERRO NO SQL", JOptionPane.ERROR_MESSAGE);
        }
    }
}
