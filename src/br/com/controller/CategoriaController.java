/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.persistencia.CategoriaDAOimpl;
import br.com.model.persistencia.dao.CategoriaDAO;
import br.com.modelo.negocio.Categoria;

import java.util.List;



/**
 *
 * @author guilherme_gustavo
 */
public class CategoriaController {
     public boolean cadastrar(Categoria categoria) {
        CategoriaDAO dao = new CategoriaDAOimpl();
        return dao.save(categoria);

    }

    public boolean atualizar(Categoria categoria) {
        CategoriaDAO dao = new CategoriaDAOimpl();
        return dao.save(categoria);

    }

    public boolean excluir(int id) {
        CategoriaDAO dao = new CategoriaDAOimpl();
        return dao.remove(Categoria.class,id);

    }
    
    public List<Categoria> listarCategoria() {
        CategoriaDAO dao = new CategoriaDAOimpl();
        return dao.getAll(Categoria.class);
    }
    
    public Categoria listarCategoriaById (int id){
        CategoriaDAO dao = new CategoriaDAOimpl();
        return dao.getById(Categoria.class,id);
    }
    public List<Categoria> listarCategoriasByDescricao (String descricao){
         CategoriaDAO dao = new CategoriaDAOimpl();
        return dao.getByDescricao(descricao);
    }
    
    
}
