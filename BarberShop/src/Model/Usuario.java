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
public class Usuario extends Pessoa {
    
//    private int ID;
//    private String Nome;
//    private char Sexo;
//    private Date Nascimento;
//    private String Telefone;
//    private String Email;
//    private String RG;

    private String Senha;
    private String NivelAcesso;

    public Usuario(int ID, String Nome, String Senha) {
        super(ID, Nome);
        this.Senha = Senha;
    }

    public Usuario(int ID, String Nome, String Senha, String NivelAcesso, char Sexo, String Nascimento, String Numero, String Email, String RG) {
        super(ID, Nome, Sexo, Nascimento, Numero, Email, RG);
        this.Senha = Senha;
        this.NivelAcesso = NivelAcesso;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(String NivelAcesso) {
        this.NivelAcesso = NivelAcesso;
    }
    
    
    
}
