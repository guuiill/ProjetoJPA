/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.modelo.negocio.Celular;
import java.util.List;

/**
 *
 * @author guilherme_gustavo
 */
public interface CelularDAO extends DAO<Celular, Integer>{

    public List<Celular> getByNome(String nome);
    public Celular listarCelularByNome (String nome);
    
    
}
