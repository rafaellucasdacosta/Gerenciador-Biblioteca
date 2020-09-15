/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class LivroProfissional extends Livro {

    private String assunto;

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void cadastrar(BancoDadosLivros bd) {
        int opc = 0;

        do {
            try {
                setIsbn(JOptionPane.showInputDialog("Digite o ISBN"));
                setTitulo(JOptionPane.showInputDialog("Digite o título"));
                setAutor(JOptionPane.showInputDialog("Digite o autor"));
                setAssunto(JOptionPane.showInputDialog("Digite o assunto"));
                setEditora(JOptionPane.showInputDialog("Digite a editora"));
                bd.insereLivroProfissional(getIsbn(), getTitulo(), getAutor(), getAssunto(), getEditora());
                opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outro cadastro?\n1 - Sim\n2 - Não"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Formato inserido inválido, insira apenas números!\n"
                        + ex.toString(), "ERRO DE FORMATO", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Falha no cadastro, tente novamente!\n" + ex.toString());
            }
        } while (opc != 2);
    }

    public void excluir(BancoDadosLivros bd) {
        try {
            setIsbn(JOptionPane.showInputDialog("Qual o isbn do livro que deseja excluir?"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato inserido inválido, insira apenas números!\n"
                    + ex.toString(), "ERRO DE FORMATO", JOptionPane.ERROR_MESSAGE);
        }
        bd.excluiLivroProfissional(getIsbn());
    }

    public void atualizar(BancoDadosLivros bd) {
        String isbnNovo = "";
        try {
            setIsbn(JOptionPane.showInputDialog("Qual o isbn do livro que deseja atualizar?"));
            isbnNovo = JOptionPane.showInputDialog("Qual o novo ISBN?");
            setTitulo(JOptionPane.showInputDialog("Qual o novo título?"));
            setAutor(JOptionPane.showInputDialog("Qual o novo autor?"));
            setAssunto(JOptionPane.showInputDialog("Qual o novo assunto?"));
            setEditora(JOptionPane.showInputDialog("Qual a nova editora?"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato inserido inválido, insira apenas números!\n"
                    + ex.toString(), "ERRO DE FORMATO", JOptionPane.ERROR_MESSAGE);
        }
        bd.atualizaLivroProfissional(getIsbn(), isbnNovo, getTitulo(), getAutor(), getAssunto(), getEditora());
    }

    public void buscarTitulo(BancoDadosLivros bd) {
        setTitulo(JOptionPane.showInputDialog("Qual o título do livro que deseja buscar?"));

        bd.buscaTituloLivroProfissional(getTitulo());
    }

    public void buscarAutor(BancoDadosLivros bd) {
        setAutor(JOptionPane.showInputDialog("Qual o autor deseja buscar?"));

        bd.buscaAutorLivroProfissional(getAutor());
    }
}
