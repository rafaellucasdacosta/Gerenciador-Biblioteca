/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import javax.swing.*;

/**
 *
 * @author rafae
 */
public class GerenciaListaLivros {

    //Menu para simplificar a escolha da ação
    public int menu(int opc) throws Exception {
        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção\n"
                        + "1 - Cadastrar\n2 - Excluir\n3 - Atualizar\n4 - Busca por título\n5 - Busca por autor\n6 - Sair"));
                if (opc < 1 || opc > 6) {
                    throw new Exception("Opção não existe, insira um valor de 1 a 6!\n");
                }
                break;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Formato inserido inválido, insira apenas números!\n"
                        + ex.toString(), "ERRO DE FORMATO", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex2) {
                JOptionPane.showMessageDialog(null, ex2.toString(), "OPÇÃO INEXISTENTE", JOptionPane.ERROR_MESSAGE);
            }
        } while (opc != 6);
        return opc;
    }

    //Função para perguntar ao usuário qual o tipo de livro (objeto) que deseja realizar uma ação
    public int tipoDeLivroCadastro(int tipo, String frase) {
        do {
            try {
                tipo = Integer.parseInt(JOptionPane.showInputDialog(frase
                        + "\n1 - Livro Particular\n2 - Livro de Estudos\n3 - Livro Profissional\n4 - Cancelar"));
                break;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Formato inserido inválido, insira apenas números!\n"
                        + ex.toString(), "ERRO DE FORMATO", JOptionPane.ERROR_MESSAGE);
            }
        } while (tipo != 4);
        return tipo;
    }
}
