/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.UsuarioHelper;
import Model.Usuario;
import View.UsuarioView;
import Model.DAO.UsuarioDAO;

/**
 *
 * @author skees
 */
public class UsuarioController {
 
    private final UsuarioView View;
    private final UsuarioHelper Helper;

    public UsuarioController(UsuarioView View) {
        this.View = View;
        this.Helper = new UsuarioHelper(View);
    }
    
    public void CadastrarUsuario(){
        //buscar objeto na tela
        Usuario usuario = (Usuario) Helper.ObterModelo();
        //adicionar o objeto no BD
        new UsuarioDAO().insert(usuario);
    }
    
    
}
