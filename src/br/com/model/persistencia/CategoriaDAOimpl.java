package br.com.model.persistencia;

import br.com.model.persistencia.dao.CategoriaDAO;
import br.com.modelo.negocio.Categoria;
import br.com.modelo.negocio.Marca;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Rosicléia Frasson
 */
public class CategoriaDAOimpl extends DAOImpl<Categoria, Integer> implements CategoriaDAO {

     public List<Categoria> getByDescricao (String nome){
        return getEntityManager().createQuery("select m from Categoria m where m.nome like '%" + nome + "%'").getResultList();
    }
     
    public Categoria getCategoriaByDescricao(String nome) {
        Query q = getEntityManager().createQuery("select m from Categoria m where m.nome like '" + nome + "'", Categoria.class);
        List<Categoria> categorias = q.getResultList();
        Categoria ma = new Categoria();
        for (Categoria m : categorias) {
            ma = m;
        }
        return ma;

    }
}
