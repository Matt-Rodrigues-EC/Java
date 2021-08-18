/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Cliente;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author skees
 */
public class ClienteDAO {
    
    private final Connection Connection;

    public ClienteDAO(Connection Connection) {
        this.Connection = Connection;
    }

    public ClienteDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insert(Cliente cliente) throws SQLException{
        
        String sql = "INSERT INTO cliente (nome, sexo, data_nascimento, contato, email, cpf, endereco, cep) "
                + "   VALUES (?, ?, ?, ?, ?, ?, ?, ?);";	
	//insert into Cliente
	PreparedStatement std = Connection.prepareStatement(sql);
    }
    
    public boolean update(Cliente cliente){
        
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if(idSaoIguais(Banco.cliente.get(i),cliente)){
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;      

    }
    
    public boolean delete(Cliente cliente){
        for (Cliente clienteLista : Banco.cliente) {
            if(idSaoIguais(clienteLista,cliente)){
                Banco.cliente.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Cliente> selectAll(){
        return Banco.cliente;
    }
    
    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getID() ==  clienteAComparar.getID();
    }
    
    
    
}
