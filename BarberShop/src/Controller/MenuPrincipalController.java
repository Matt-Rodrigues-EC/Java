/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;

/**
 *
 * @author skees
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal View;

    public MenuPrincipalController(MenuPrincipal View) {
        this.View = View;
    }
    
    public void NavegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }

    public void NavegarParaCadastroCliente() {
        ClienteView cliente = new ClienteView();
        cliente.setVisible(true);
    }

    public void NavegarParaCadastroUsuario() {
        UsuarioView user = new UsuarioView();
        user.setVisible(true);
    }

    public void NavegarParaCadastroServico() {
        ServicoView servico = new ServicoView();
        servico.setVisible(true);
    }
    
}
