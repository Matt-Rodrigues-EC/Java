/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Servico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class ServicoDAO {
    
    
    private final Connection Connection;

    public ServicoDAO(Connection Connection) {
        this.Connection = Connection;
    }
    
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     */
    public void insert(Servico servico) throws SQLException{
        
        String sql  = "INSERT INTO servico (descricao, valor) "
                + "   VALUES (?, ?);";	
	//insert into Cliente
	PreparedStatement std = Connection.prepareStatement(sql);
        
        std.executeQuery();
        Connection.close();
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servico
     * @return 
     */
    public boolean update(Servico servico){
        
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    public boolean delete(Servico servico){
       
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Servico> selectAll(){
        return Banco.servico;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Servico servico, Servico servicoAComparar) {
        return servico.getID() ==  servicoAComparar.getID();
    }
    
}
