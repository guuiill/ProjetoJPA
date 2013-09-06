package br.com.model.persistencia.dao;

import br.com.modelo.negocio.Marca;
import java.util.List;

/**
 *
 * @author Rosicléia Frasson
 */
public interface MarcaDAO extends DAO<Marca, Integer>{
      
    List<Marca> getByNome (String nome);
    Marca getMarcaByNome(String nome);
}
