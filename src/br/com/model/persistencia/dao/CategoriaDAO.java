/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.modelo.negocio.Categoria;
import br.com.modelo.negocio.Marca;
import java.util.List;

/**
 *
 * @author guilherme_gustavo
 */
public interface CategoriaDAO extends DAO<Categoria, Integer> {
      List<Categoria> getByDescricao (String nome);
    Categoria getCategoriaByDescricao(String nome);
}
