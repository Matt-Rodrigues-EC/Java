/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author skees
 */
public class Main {
    
    public static void main(String[] args){
        
        Servico barba = new Servico(1, "Barba", 10.75);
        
        //System.err.println(barba.getValor());
        
        Cliente cliente = new Cliente(1, "Stefane", 'F', "000000", "stef@gmail.com", "Madalena");
        
//        System.err.println(cliente.getID());
//        System.err.println(cliente.getNome());
//        System.err.println(cliente.getSexo());
//        System.err.println(cliente.getNumero());
//        System.err.println(cliente.getEmail());
//        System.err.println(cliente.getEndereco());

        Usuario user = new Usuario(1, "Stefane", "abacate");
        
        System.err.println(user.getNome());
        System.err.println(user.getSenha());
        
        
    }
}
