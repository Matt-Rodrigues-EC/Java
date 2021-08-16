/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author skees
 */
public class Servico {
    
    private int ID;
    private String Descricao;
    private double Valor;

    public Servico(int ID, String Descricao, double Valor) {
        this.ID = ID;
        this.Descricao = Descricao;
        this.Valor = Valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    
    
}
