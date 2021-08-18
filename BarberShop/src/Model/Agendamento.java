/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skees
 */
public class Agendamento {
    
    private int ID;
    private Cliente cliente;  //ID_Cliente
    private Servico servico;  //ID_Servico
    private double Valor;
    private Date Data;
    private String Observacao;

    public Agendamento(int ID, Cliente cliente, Servico servico, double valor, String Data) {
        this.ID = ID;
        this.cliente = cliente;
        this.servico = servico;
        this.Valor = valor;
        try {
            this.Data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(Data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Agendamento(int ID, Cliente cliente, Servico servico, double valor, String Data, String Observacao) {
        this(ID, cliente, servico, valor, Data);
        this.Observacao = Observacao;
    }
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        this.Valor = valor;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(Data);
    }
    
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(Data);
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
    
    
    
}
