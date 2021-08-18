/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author skees
 */
public class AgendaController {
    
    private final Agenda View;
    private final AgendaHelper Helper;

    public AgendaController(Agenda View) {
        this.View = View;
        this.Helper = new AgendaHelper(View);
    }
    
    public void atualizaTabela(){
        //buscr lista com os agendamentos no banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> Agendamentos = agendamentoDAO.selectAll();
        
        //exibir a lista na view
        Helper.preencgerTabela(Agendamentos);
    }    
    
    public void atualizaCliente(){
        //buscar no banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> Clientes = clienteDAO.selectAll();
        //exibir no combobox cliente
        Helper.preencherClientes(Clientes);
    }
    
    public void atualizaServico(){
        //buscar no banco de dados
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> Servicos = servicoDAO.selectAll();
        //exibir no combobox seriço
        Helper.preencherServicos(Servicos);
    }
    
    public void atualizaValor(){
        Servico servico = Helper.obterServico();
        Helper.setarValor(servico.getValor());
    }
    
    public void Agendar(){
        //Buscar objeto de agendamento na tela
        Agendamento agendamento = (Agendamento) Helper.ObterModelo();
        //Salvar objeto no baanco de dados
        new AgendamentoDAO().insert(agendamento);
        atualizaTabela();
        Helper.limparTela();
        
        
    }
    
}
