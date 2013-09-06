/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.persistencia.CelularDAOimpl;
import br.com.model.persistencia.dao.CelularDAO;
import br.com.modelo.negocio.Celular;

import java.util.List;

/**
 *
 * @author guilherme_gustavo
 */
public class CelularController {
    public boolean cadastrar(Celular celular) {
        CelularDAO dao = new CelularDAOimpl();
        return dao.save(celular);
      

    }

    public boolean atualizar(Celular celular) {
        CelularDAO dao = new CelularDAOimpl();
        return dao.save(celular);


    }

    public boolean excluir(int id) {
        CelularDAO dao = new CelularDAOimpl();
        return dao.remove(Celular.class,id);

    }
    
    public List<Celular> listarCelular() {
        CelularDAO dao = new CelularDAOimpl();
        return dao.getAll(Celular.class);
    }
    
    public Celular listarCelularById (int id){
        CelularDAO dao = new CelularDAOimpl();
        return dao.getById(Celular.class,id);
    }
     public List<Celular> listarCelularByNome (String nome){
        CelularDAO dao = new CelularDAOimpl();
        return dao.getByNome(nome);
     }
     public Celular listarCelularByNome (String nome){
        CelularDAO dao = new CelularDAOimpl();
        return dao.getByNome(nome);
     }
    
}
