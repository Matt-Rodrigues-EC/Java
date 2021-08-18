/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import View.UsuarioView;
import Model.Usuario;

/**
 *
 * @author skees
 */
public class UsuarioHelper implements IHelper{
    
    private final UsuarioView View;

    public UsuarioHelper(UsuarioView View) {
        this.View = View;
    }

    @Override
    public Object ObterModelo() {
        String Nome = View.getTextNome().getText();
        char Sexo = (char) View.getBoxSexo().getSelectedItem();
        String Nascimento = View.getTextNascimento().getText();
        String Numero = View.getTextNumero().getText();
        String Email = View.getTextEmail().getText();
        String RG = View.getTextRG().getText();
        String Senha = View.getTextSenha().getText();
        String NivelAcesso = View.getTextNivelAcesso().getText();
        
        Usuario usuario = new Usuario(Nome, Sexo, Nascimento, Numero, Email, RG, Senha, NivelAcesso);
        return usuario;
    }

    @Override
    public void limparTela() {
        
        View.getTextNome().setText("");
        View.getTextNumero().setText("");
        View.getTextNascimento().setText("");
        View.getTextRG().setText("");
        View.getTextEmail().setText("");
        View.getTextSenha().setText("");
        View.getTextNivelAcesso().setText("");
        
    }
    
    
    
}
