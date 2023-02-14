/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Mateus Maidel -  
 */
public class Temperatura {



    public static double cToF(double temp) {
        double F = (temp * 1.8) + 32;       
        return F;

    }

    public static double fToC(double temp) {
        double C = (temp - 32) / 1.8;
        return C;

    }

    public static double cToK(double temp) {
        double K = temp + 273;
        return K;

    }

    public static double kToC(double temp) {
        double C = temp - 273;
        return C;

    }

    public static double fToK(double temp) {
        double K = (temp - 32)*(5/9) + 273;
        return K;

    }

    public static double kToF(double temp) {
        double F = (temp - 273) * 1.8 + 32;
        return F;

    }
    
    public static void imprimeMenu(){
        String menu = "------------------------------------\n" + 
                      " ESCOLHA A CONVERSÃO DE TEMPERATURA:\n" +
                      "1 - CELCIUS PARA FARENHEIT;\n" +
                      "2 - FARENHEIT PARA CELCIUS;\n" + 
                      "3 - CELCIUS PARA KELVIN;\n" + 
                      "4 - KELVIN PARA CELCIUS;\n" + 
                      "5 - FARENHEIT PARA KELVIN;\n" + 
                      "6 - KELVIN PARA FARENHEIT;\n" + 
                      "------------------------------------\n";
        
        System.out.print(menu);
       
    }

}
