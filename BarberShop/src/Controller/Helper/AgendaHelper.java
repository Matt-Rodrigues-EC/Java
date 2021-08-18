/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author skees
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda View;

    public AgendaHelper(Agenda View) {
        this.View = View;
    }

    public void preencgerTabela(ArrayList<Agendamento> Agendamentos) {
        
       DefaultTableModel tableModel =  (DefaultTableModel) View.getTabelaAgendamentos().getModel();
       tableModel.setNumRows(0);
       
       //percorrer a lista preenchendo o tbleModel
        for (Agendamento Agendamento : Agendamentos) {
            
            tableModel.addRow(new Object[]{
                Agendamento.getID(),
                Agendamento.getCliente().getNome(),
                Agendamento.getServico().getDescricao(),
                Agendamento.getValor(),
                Agendamento.getDataFormatada(),
                Agendamento.getHoraFormatada(),
                Agendamento.getObservacao()
            });
            
        }
        
    }

    public void preencherClientes(ArrayList<Cliente> Clientes) {
        
        DefaultComboBoxModel BoxModel = (DefaultComboBoxModel) View.getBoxCliente().getModel();
        
        for (Cliente Cliente : Clientes) {
            BoxModel.addElement(Cliente);   
        } 
    }

    public void preencherServicos(ArrayList<Servico> Servicos) {
        DefaultComboBoxModel BoxModel = (DefaultComboBoxModel) View.getBoxServico().getModel();
        
        for (Servico Servico : Servicos) {
            BoxModel.addElement(Servico);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) View.getBoxCliente().getSelectedItem();
    }
    
    public Servico obterServico() {
        return (Servico) View.getBoxServico().getSelectedItem();
    }

    public void setarValor(double valor) {
        View.getTextValor().setText(valor+"");
    }

    @Override
    public Object ObterModelo() {
        
        String IDString = View.getTexteID().getText();
        int ID = Integer.parseInt(IDString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String floatString = View.getTextValor().getText();
        float Valor = Float.parseFloat(floatString);
        String Data = View.getTextData().getText();
        String Hora = View.getTextHora().getText();
        String dataHora = Data + " " + Hora;
        String Observacao = View.getTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(ID, cliente, servico, Valor, dataHora, Observacao);
        
        return agendamento;
        
    }

    @Override
    public void limparTela() {
        View.getTexteID().setText("0");
        View.getTextData().setText("");
        View.getTextHora().setText("");
        View.getTextObservacao().setText("");
    }
    
    
    
    
    
}
