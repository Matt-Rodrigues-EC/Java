/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author skees
 */
public class LoginHelper implements IHelper{
    
    private final Login View;

    public LoginHelper(Login View) {
        this.View = View;
    }
    
    public void setarUsuario(Usuario Modelo){
        
        String Nome = Modelo.getNome();
        String Senha = Modelo.getSenha();
        
        View.getTextUsuario().setText(Nome);
        View.getTextSenha().setText(Senha);
    }
    
    @Override
    public void limparTela(){
        View.getTextUsuario().setText("");
        View.getTextSenha().setText("");
    }

    @Override
    public Usuario ObterModelo() {
        String Nome = View.getTextUsuario().getText();
        String Senha = View.getTextSenha().getText();
        Usuario Modelo =  new Usuario(Nome, Senha);
        
        return Modelo;
    }
    
}
