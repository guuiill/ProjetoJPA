/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.persistencia.MarcaDAOImpl;
import br.com.model.persistencia.dao.MarcaDAO;
import br.com.modelo.negocio.Marca;

import java.util.List;

/**
 *
 * @author guilherme_gustavo
 */
public class MarcaController {
     public boolean cadastrar(Marca marca) {
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.save(marca);

    }

    public boolean atualizar(Marca marca) {
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.save(marca);

    }

    public boolean excluir(int id) {
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.remove(Marca.class,id);

    }
    
    public List<Marca> listarMarca() {
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.getAll(Marca.class);
    }
    
    public Marca listarMarcaById (int id){
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.getById(Marca.class, id);
    }
    
   public List<Marca> listarMarcasByNome (String nome){
        MarcaDAO dao = new MarcaDAOImpl();
        return dao.getByNome(nome);
    }
     
   public Marca listarMarcaByNome (String nome){
       MarcaDAO dao = new MarcaDAOImpl();
       return dao.getMarcaByNome(nome);
   }
        
    
}
