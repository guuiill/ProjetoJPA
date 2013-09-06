package br.com.model.persistencia;

import br.com.model.persistencia.dao.MarcaDAO;
import br.com.modelo.negocio.Marca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Rosicléia Frasson
 */
public class MarcaDAOImpl extends DAOImpl<Marca, Integer> implements MarcaDAO {

     public List<Marca> getByNome (String nome){
        return getEntityManager().createQuery("select m from Marca m where m.nome like '%" + nome + "%'").getResultList();
    }
     
      public Marca getMarcaByNome(String nome) {
        Query q = getEntityManager().createQuery("select m from Marca m where m.nome like '" + nome + "'", Marca.class);
        List<Marca> marcas = q.getResultList();
        Marca ma = new Marca();
        for (Marca m : marcas) {
            ma = m;
        }
        return ma;

    }

   
    
 
   
}
