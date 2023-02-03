/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @authors GRR2019 ...
 */
public class ClienteTableModel extends AbstractTableModel{
    
    private String[] colunas=new String[]{"Nome", "Sobrenome", "RG", "CPF", "Renda", "Tipo de Conta"};

    private List<Cliente> lista = new ArrayList();

    
    public ClienteTableModel(List<Cliente> lista){
        this.lista=lista;
    }

    public ClienteTableModel(){
    }


    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getNome();
            case 1: return customer.getSobrenome();
            case 2: return customer.getRg();
            case 3: return customer.getCpf();
            case 4: return customer.getRenda();
            case 5: {
                try{
                    return customer.getConta().getTipoConta();
                }catch(Exception ex){
                    return "";
                }
                
            }
            default : return null;
        }
    }

    public void setListaClientes(List<Cliente> contatos) {
        this.lista = contatos;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }
    
    public void atualizaListaClientes() {
        this.fireTableDataChanged();
        
    }
    
    
    public void removeCliente(Cliente customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);
    }
    
    
    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Cliente getCliente(int linha){
        return lista.get(linha);
    }

}
