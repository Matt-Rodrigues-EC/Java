/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author skees
 */
public class Cliente extends Pessoa {
    
//    private int ID;
//    private String Nome;
//    private char Sexo;
//    private Date Nascimento;
//    private String Numero;
//    private String Email;
//    private String RG; // Ou CPF
    private String Endereco;
    private String Cep;

    public Cliente(int ID, String Nome, char Sexo, String Nascimento, String Numero, String Email, String RG, String Endereco, String Cep) {
        super(ID, Nome, Sexo, Nascimento, Numero, Email, RG);
        this.Endereco = Endereco;
        this.Cep = Cep;
    }

    public Cliente(int ID, String Nome, String Endereco, String Cep) {
        super(ID, Nome);
        this.Endereco = Endereco;
        this.Cep = Cep;
    }

    
    
    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }
    
    

    
    
    
    
}
