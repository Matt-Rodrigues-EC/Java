/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

/**
 *
 * @author skees
 */
public class LoginController {

    private final Login View;
    private LoginHelper Helper;

    public LoginController(Login View) {
        this.View = View;
        this.Helper = new LoginHelper(View);
    }
    
    public void entrarNoSistema(){
        //Pegar um usuario an View
        Usuario user = Helper.obterModelo();
        
        //Pesquisar um usuário no Banco
        //Se o usuaario da View existir no banco, redireciona pro Menu
        //Senão, mostrar mensagem de Usuario ou senha invalidos.
    }
    
    public void FizTarefa(){
        System.err.println("Busquei algo no  banco de dados.");
        
        this.View.ExibeMensagem("Executei o Fiz Tarefa.");
    }
    
    
    
}
