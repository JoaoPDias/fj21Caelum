/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.jdbc.teste;


import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import org.joda.time.DateTime;


public class TesteInsere {
    public static void main(String args[]){
        Contato contato = new Contato();
        contato.setNome("Guilherme Dias de Oliveira");
        contato.setEmail("jpdias1997@hotmail.com");
        contato.setEndereco("Rua Hermeto Novais");
        contato.setDataNascimento(new DateTime(2003,9,23,9,0));
        
        ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);
        System.out.println("Contato Gravado");
        
        
    
    }
    
}
