/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.ClienteHelper;
import Model.Cliente;
import static Model.DAO.Banco.cliente;
import View.ClienteView;
import Model.DAO.ClienteDAO;
import java.sql.SQLException;

/**
 *
 * @author skees
 */
public class ClienteController {
 
    private final ClienteView View;
    private final ClienteHelper Helper;
    private final ClienteDAO clienteDAO;

    public ClienteController(ClienteView View) {
        this.View = View;
        this.Helper = new ClienteHelper(View);
        this.clienteDAO = new ClienteDAO(null);
    }

    
    
    public void CadastrarCliente() throws SQLException{
        //buscar o objeto na tela
        Cliente cliente = (Cliente) Helper.ObterModelo();
        //adicionar o objeto no BD
        clienteDAO.insert(cliente);
    }
    
    
}
