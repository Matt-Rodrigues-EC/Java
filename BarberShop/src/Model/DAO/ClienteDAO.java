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
    

    
    public void insert(Cliente cliente) throws SQLException{
        
        
        try (Connection) {
            String sql  = "INSERT INTO cliente (nome, sexo, data_nascimento, numero, email, RG, endereco, cep) "
                    + "   VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            //insert into Cliente
            PreparedStatement std = Connection.prepareStatement(sql);
            std.setString(1, cliente.getNome());
            std.setString(2, cliente.getSexo());
            std.setString(3, cliente.getNascimento());
            std.setString(4, cliente.getNumero());
            std.setString(5, cliente.getEmail());
            std.setString(6, cliente.getRG());
            std.setString(7, cliente.getEndereco());
            std.setString(8, cliente.getCep());
            
            std.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public boolean update(Cliente cliente){
        
        return false;      

    }
    
    public boolean delete(Cliente cliente){
        
        return false;
    }
    
    public ArrayList<Cliente> selectAll(){
        return Banco.cliente;
    }
    
    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getID() ==  clienteAComparar.getID();
    }
    
    
    
}
