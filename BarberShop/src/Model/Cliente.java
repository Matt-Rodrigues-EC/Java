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
public class Cliente {
    
    private int ID;
    private String Nome;
    private char Sexo;
    private Date Nascimento;
    private String Numero;
    private String Email;
    private String RG; // Ou CPF
    private String Endereco;
    private String Cep;

    public Cliente(int ID, String Nome, char Sexo, Date Nascimento, String Numero, String Email, String RG, String Endereco, String Cep) {
        this.ID = ID;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Nascimento = Nascimento;
        this.Numero = Numero;
        this.Email = Email;
        this.RG = RG;
        this.Endereco = Endereco;
        this.Cep = Cep;
    }

    public Cliente(int ID, String Nome, char Sexo, String Numero, String Email, String Endereco) {
        this.ID = ID;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Numero = Numero;
        this.Email = Email;
        this.Endereco = Endereco;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
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
