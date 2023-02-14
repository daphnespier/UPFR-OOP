/**
 *
 * @author Mateus Maidel -  
*/
package Atividade6_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos veículos você quer cadastrar?");
        int veiculos = input.nextInt();
        List<Veiculo> listaVeiculos = new ArrayList();

        for (int v = 1; v <= veiculos; v++) {

            System.out.println("Digite a opção desejada:\n"
                    + "------------------------\n"
                    + "---Cadastrar veículo----\n"
                    + "------------------------\n"
                    + "1 - Carro\n"
                    + "2 - Trem\n"
                    + "3 - Barco\n"
                    + "4 - Avião\n");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("----- CADASTRO CARRO ------");
                    System.out.println("Quantos?");
                    int qtd = input.nextInt();

                    for (int i = 1; i <= qtd; i++) {

                        int rodas = 4;
                        String tipo = "Carro";
                        System.out.println("Combustível:");
                        String combustivel = input.next();
                        System.out.println("Quilometragem rodada:");
                        int km = input.nextInt();
                        System.out.println("Ano:");
                        int ano = input.nextInt();
                        System.out.println("Quantidade de Passageiros:");
                        int qtdPassageiros = input.nextInt();

                        Terrestre t1 = new Terrestre(rodas, tipo, combustivel, km, ano, qtdPassageiros);
                        listaVeiculos.add(t1);

                    }
                    break;

                case 2:

                    System.out.println("----- CADASTRO TREM ------");
                    System.out.println("Quantos?");
                    qtd = input.nextInt();

                    for (int i = 1; i <= qtd; i++) {

                        System.out.println("Quantidade de rodas por vagão:");
                        int rodas = input.nextInt();
                        String tipo = "Trem";
                        System.out.println("Combustível:");
                        String combustivel = input.next();
                        System.out.println("Quilometragem rodada:");
                        int km = input.nextInt();
                        System.out.println("Ano:");
                        int ano = input.nextInt();
                        System.out.println("Quantidade de Passageiros:");
                        int qtdPassageiros = input.nextInt();

                        Terrestre t1 = new Terrestre(rodas, tipo, combustivel, km, ano, qtdPassageiros);
                        listaVeiculos.add(t1);

                    }
                    break;

                case 3:

                    System.out.println("----- CADASTRO BARCO ------");
                    System.out.println("Quantos?");
                    qtd = input.nextInt();

                    for (int i = 1; i <= qtd; i++) {

                        System.out.println("Altitude Máxima em KM");
                        int altMax = input.nextInt();
                        String tipo = "Barco";
                        System.out.println("Combustível:");
                        String combustivel = input.next();
                        System.out.println("Quilometragem rodada:");
                        int km = input.nextInt();
                        System.out.println("Ano:");
                        int ano = input.nextInt();
                        System.out.println("Quantidade de Passageiros:");
                        int qtdPassageiros = input.nextInt();

                        Aereo a2 = new Aereo(altMax, tipo, combustivel, km, ano, qtdPassageiros);
                        listaVeiculos.add(a2);

                    }
                    break;

                case 4:

                    System.out.println("----- CADASTRO AVIÃO ------");
                    System.out.println("Quantos?");
                    qtd = input.nextInt();

                    for (int i = 1; i <= qtd; i++) {

                        System.out.println("Tamanho em M²");
                        int dimensao = input.nextInt();
                        String tipo = "Avião";
                        System.out.println("Combustível:");
                        String combustivel = input.next();
                        System.out.println("Quilometragem rodada:");
                        int km = input.nextInt();
                        System.out.println("Ano:");
                        int ano = input.nextInt();
                        System.out.println("Quantidade de Passageiros:");
                        int qtdPassageiros = input.nextInt();

                        Aquatico a1 = new Aquatico(dimensao, tipo, combustivel, km, ano, qtdPassageiros);
                        listaVeiculos.add(a1);

                    }
                    break;

                default:
                    System.out.println("Digite uma opção válida");
                    break;

            }
        }

        String lista = "TIPO - COMBUSTÍVEL - PASSAGEIROS - ANO - QUILOMETRAGEM - \n";

        for (Veiculo v : listaVeiculos) {
            lista += v.tipo + " --- " + v.combustivel + " ---- " + v.qtdPassageiros
                    + " ------ " + v.ano + "-------" + v.quilometragem + "\n";
            
        }
        

        for (Veiculo v : listaVeiculos) {
            v.andar();
            lista += "\n" + v.tipo + " --- " + v.combustivel + " ---- " + v.qtdPassageiros
                    + " ------ " + v.ano + "-------" + v.quilometragem + "\n";
        }
        
        System.out.println(lista);

    }

    
}
