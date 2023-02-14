/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateus Maidel -  
 */
public class GerenciaBicicleta {

    public static void main(String[] args) {

        Bicicleta bicicletaDoRafael = new Bicicleta(18);
        
        bicicletaDoRafael.printStates();
        bicicletaDoRafael.mudarMarcha(3);
        bicicletaDoRafael.printStates();
        bicicletaDoRafael.mudarMarcha(5);
        bicicletaDoRafael.printStates();
        bicicletaDoRafael.mudarMarcha(10);
        bicicletaDoRafael.printStates();
        bicicletaDoRafael.mudarMarcha(1);
        bicicletaDoRafael.printStates();

    }

}
