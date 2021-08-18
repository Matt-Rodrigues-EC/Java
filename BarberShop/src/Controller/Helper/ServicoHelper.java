/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import View.ServicoView;
import Model.Servico;

/**
 *
 * @author skees
 */
public class ServicoHelper implements IHelper {

    private final ServicoView View;

    public ServicoHelper(ServicoView View) {
        this.View = View;
    }
    
    @Override
    public Object ObterModelo() {
        String descricao = View.getTextDescricao().getText();
        String valorString = View.getTextValor().getText();
        float valor = Float.parseFloat(valorString+"");
        
        Servico servico = new Servico(descricao, valor);
        return servico;
    }

    @Override
    public void limparTela() {
        View.getTextDescricao().setText("");
        View.getTextValor().setText("");
    }
    
}
