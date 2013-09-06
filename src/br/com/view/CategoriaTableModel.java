package br.com.view;

import br.com.modelo.negocio.Categoria;
import br.com.modelo.negocio.Marca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rosicléia Frasson
 */
public class CategoriaTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_DESCRICAO = 1;
    private List<Categoria> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Descrição"};

    //Cria uma MarcaTableModel sem nenhuma linha
    public CategoriaTableModel() {
        linhas = new ArrayList<Categoria>();
    }

    //Cria uma MarcaTableModel contendo a lista recebida por parâmetro.
    public CategoriaTableModel(List<Categoria> categoria) {
        this.linhas = new ArrayList<Categoria>(categoria);
    }

    public int getRowCount() {
        return linhas.size();
    }

    /*
     * Retorna a quantidade de colunas
     * 2 colunas: uma para id e a outra para nome.
     */
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? A coluna 1 é inteira, as outras string.  
        if (columnIndex == COL_ID) {
            return Integer.class;
        }
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a marca da linha
        Categoria c = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return c.getId();
        } else if (column == COL_DESCRICAO) {
            return c.getDescricao();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Categoria c = linhas.get(row);
        if (column == COL_ID) {
            c.setId((Integer) aValue);
        } else if (column == COL_DESCRICAO) {
            c.setDescricao(aValue.toString());
        }

    }

    // Retorna a marca referente a linha especificada
    public Categoria getCategoria(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


// Adiciona a marca especificada ao modelo
    public void addCategoria(Categoria categoria) {
        // Adiciona o registro.
        linhas.add(categoria);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarPorNome();

    }
    
        public void updateCategoria(int indiceLinha, Categoria categoria) {
            linhas.set(indiceLinha, categoria);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarPorNome();
    }
    
    //Remove o sócio da linha especificada.
    public void removeCategoria(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarPorNome();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
    
    public void ordenarPorNome() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Categoria>() {

            public int compare(Categoria o1, Categoria o2) {
                return o1.getDescricao().compareTo(o2.getDescricao());
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
}
