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

    public Servico(String Descricao, double Valor) {
        this.Descricao = Descricao;
        this.Valor = Valor;
    }

    public Servico(int i, String corte_Simples, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    @Override
    public String toString(){
        return getDescricao();
    }
    
    
}
