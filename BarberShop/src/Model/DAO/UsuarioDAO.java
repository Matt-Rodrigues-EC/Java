/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class UsuarioDAO {
    
    private final Connection Connection;

    public UsuarioDAO(Connection connection) {
        this.Connection = connection;
    }
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     * @throws java.lang.Exception
     */
    public void insert(Usuario usuario) throws Exception{
      
        try (Connection) {
            
            String sql  = "INSERT INTO usuario (nome, sexo, data_nascimento, numero, email, RG, Senha, Nivel_Acesso) "
                    + "   VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            //insert into Usuario
            PreparedStatement std = Connection.prepareStatement(sql);
            std.setString(1, usuario.getNome());
            std.setString(2, usuario.getSexo());
            std.setString(3, usuario.getNascimento());
            std.setString(4, usuario.getNumero());
            std.setString(5, usuario.getEmail());
            std.setString(6, usuario.getRG());
            std.setString(7, usuario.getSenha());
            std.setString(8, usuario.getNivelAcesso());
            
            std.executeQuery();
        }
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return 
     */
    public boolean update(Usuario usuario){
        
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param usuario
     * @return 
     */
    public boolean delete(Usuario usuario){
        
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Usuario> selectAll(){
        return Banco.usuario;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuario
     * @return Usuario encontrado no banco de dados
     */
    public Usuario selectPorNomeESenha(Usuario usuario){
        
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) {
        return usuario.getNome().equals(usuarioAPesquisar.getNome()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Usuario usuario, Usuario usuarioAComparar) {
        return usuario.getID() ==  usuarioAComparar.getID();
    }
    
    
    
}
