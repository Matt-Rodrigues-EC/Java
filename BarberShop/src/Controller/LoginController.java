/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.*;

/**
 *
 * @author skees
 */
public class LoginController {

    private final Login View;
    private final LoginHelper Helper;

    public LoginController(Login View) {
        this.View = View;
        this.Helper = new LoginHelper(View);
    }
    
    public void entrarNoSistema(){
        //Pegar um usuario an View
        Usuario user = Helper.ObterModelo();
        
        //Pesquisar um usuário no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(user);
        
        //Se o usuaario da View existir no banco, redireciona pro Menu
        if(usuarioAutenticado != null){
            //navegar para o menu principal
            MenuPrincipal Menu = new MenuPrincipal();
            Menu.setVisible(true);
            this.View.dispose();
        //Senão, mostrar mensagem de Usuario ou senha invalidos.
        }else{
            Helper.limparTela();
            View.ExibeMensagem("Usuário ou Senha inválidos.");
        }
        
    }
    
    public void FizTarefa(){
        System.err.println("Busquei algo no  banco de dados.");
        
        this.View.ExibeMensagem("Executei o Fiz Tarefa.");
    }
    
    
    
}
