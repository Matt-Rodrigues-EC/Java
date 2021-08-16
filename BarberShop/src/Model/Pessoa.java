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
abstract public class Pessoa {
    
    protected int ID;
    protected String Nome;
    protected char Sexo;
    protected Date Nascimento;
    protected String Numero;
    protected String Email;
    protected String RG; // Ou CPF

    public Pessoa(int ID, String Nome) {
        this.ID = ID;
        this.Nome = Nome;
    }

    public Pessoa(int ID, String Nome, char Sexo, String Nascimento, String Numero, String Email, String RG) {
        this.ID = ID;
        this.Nome = Nome;
        this.Sexo = Sexo;
        try {
            this.Nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(Nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.Numero = Numero;
        this.Email = Email;
        this.RG = RG;
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
    
    
    
}
