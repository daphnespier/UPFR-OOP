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
public class RendaComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente cliente, Cliente outro) {
        double rendaCliente = cliente.getRenda();
        double rendaOutro = outro.getRenda();
        int result = 0;
        if (rendaCliente > rendaOutro) {
            result = 1;
        }else if(rendaCliente < rendaOutro){
            result = -1;
        }
        return result;

    }

}
