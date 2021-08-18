/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Cliente;
import View.ClienteView;

/**
 *
 * @author skees
 */
public class ClienteHelper implements IHelper{

    private final ClienteView View;

    public ClienteHelper(ClienteView View) {
        this.View = View;
    }
    
    @Override
    public Object ObterModelo() {
        
        String Nome = View.getTextNome().getText();
        String Sexo = (String) View.getBoxSexo().getSelectedItem();
        String Nascimento = View.getTextNascimento().getText();
        String Numero = View.getTextNumero().getText();
        String Email = View.getTextEmail().getText();
        String RG = View.getTextRG().getText();
        String Endereco = View.getTextEndereco().getText();
        String Cep = View.getTextCep().getText();
        
        Cliente cliente = new Cliente( Nome, Sexo, Nascimento, Numero, Email, RG, Endereco, Cep);
        return cliente;
        
    }

    @Override
    public void limparTela() {
        View.getTextNome().setText("");
        View.getTextNumero().setText("");
        View.getTextNascimento().setText("");
        View.getTextRG().setText("");
        View.getTextEmail().setText("");
        View.getTextCep().setText("");
        View.getTextEndereco().setText("");
    }
    
    
}
