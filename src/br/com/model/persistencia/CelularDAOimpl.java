/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia;

import br.com.model.persistencia.dao.CelularDAO;
import br.com.modelo.negocio.Celular;
import java.util.List;

/**
 *
 * @author guilherme_gustavo
 */
public class CelularDAOimpl extends DAOImpl<Celular, Integer> implements CelularDAO{

    @Override
    public List<Celular> getByNome(String nome) {
         return getEntityManager().createQuery("select m from Celular m where m.descricao like '%" + nome + "%'").getResultList();
    }

    @Override
    public Celular listarCelularByNome(String nome) {
      return getEntityManager().createQuery("select m from Celular m where m.descricao like '%" + nome + "%'").getResultList();
       
    }
    
}
