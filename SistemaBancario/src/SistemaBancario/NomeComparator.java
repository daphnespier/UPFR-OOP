/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

import java.util.Comparator;

/**
 *
 * @authors GRR2019 ...
 */
public class NomeComparator implements Comparator<Cliente>{

    
    @Override
    public int compare(Cliente cliente, Cliente outro) {
        
        return cliente.getNome().compareToIgnoreCase(outro.getNome());
        
    }
    
}
