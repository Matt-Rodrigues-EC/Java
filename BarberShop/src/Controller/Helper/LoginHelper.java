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
public class LoginHelper {
    
    private final Login View;

    public LoginHelper(Login View) {
        this.View = View;
    }
    
    public Usuario obterModelo(){
        String Nome = View.getTextUsuario().getText();
        String Senha = View.getTextSenha().getText();
        Usuario Modelo =  new Usuario(0, Nome, Senha);
        
        return Modelo;
    }
    
    public void setarUsuario(Usuario Modelo){
        
        String Nome = Modelo.getNome();
        String Senha = Modelo.getSenha();
        
        View.getTextUsuario().setText(Nome);
        View.getTextSenha().setText(Senha);
    }
    
    public void limparTela(){
        View.getTextUsuario().setText("");
        View.getTextSenha().setText("");
    }
    
}
