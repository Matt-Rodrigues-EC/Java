/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.ServicoHelper;
import Model.Servico;
import View.ServicoView;
import Model.DAO.ServicoDAO;
import java.sql.SQLException;

/**
 *
 * @author skees
 */
public class ServicoController {
    
    private final ServicoView View;
    private final ServicoHelper Helper;
    private final ServicoDAO servicoDAO;

    public ServicoController(ServicoView View) {
        this.View = View;
        this.Helper = new ServicoHelper(View);
        this.servicoDAO = new ServicoDAO(null);
    }
    
    public void CadastrarServico() throws SQLException{
        //Buscar Servico na tela
        Servico servico = (Servico) Helper.ObterModelo();
        //Adicionar servico no BD
        servicoDAO.insert(servico);
    }
    
    
    
}
