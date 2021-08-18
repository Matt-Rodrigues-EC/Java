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

/**
 *
 * @author skees
 */
public class ServicoController {
    
    private final ServicoView View;
    private final ServicoHelper Helper;

    public ServicoController(ServicoView View) {
        this.View = View;
        this.Helper = new ServicoHelper(View);
    }
    
    public void CdastrarServico(){
        //Buscar Servico na tela
        Servico servico = (Servico) Helper.ObterModelo();
        //Adicionar servico no BD
        new ServicoDAO().insert(servico);
    }
    
    
    
}
