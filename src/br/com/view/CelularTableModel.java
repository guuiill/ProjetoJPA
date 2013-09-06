package br.com.view;

import br.com.modelo.negocio.Celular;
import br.com.modelo.negocio.Celular;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rosicléia Frasson
 */
public class CelularTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_DESCRICAO = 1;
    private static final int COL_PRECO = 2;
    private List<Celular> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Descrição", "Preço"};

    //Cria uma CelularTableModel sem nenhuma linha
    public CelularTableModel() {
        linhas = new ArrayList<Celular>();
    }

    //Cria uma CelularTableModel contendo a lista recebida por parâmetro.
    public CelularTableModel(List<Celular> celular) {
        this.linhas = new ArrayList<Celular>(celular);
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
        Celular c = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return c.getId();
        } else if (column == COL_DESCRICAO) {
            return c.getDescricao();
        }else if (column == COL_PRECO){
                return c.getPreco();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Celular c = linhas.get(row);
        if (column == COL_ID) {
            c.setId((Integer) aValue);
        } else if (column == COL_DESCRICAO) {
            c.setDescricao(aValue.toString());
        } else if (column == COL_PRECO){
            
        }

    }

    // Retorna a marca referente a linha especificada
    public Celular getCelular(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


// Adiciona a marca especificada ao modelo
    public void addCelular(Celular marca) {
        // Adiciona o registro.
        linhas.add(marca);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarPorNome();

    }
    
        public void updateCelular(int indiceLinha, Celular marca) {
            linhas.set(indiceLinha, marca);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarPorNome();
    }
    
    //Remove o sócio da linha especificada.
    public void removeCelular(int indiceLinha) {
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
        Collections.sort(linhas, new Comparator<Celular>() {

            public int compare(Celular o1, Celular o2) {
                return o1.getDescricao().compareTo(o2.getDescricao());
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
}
