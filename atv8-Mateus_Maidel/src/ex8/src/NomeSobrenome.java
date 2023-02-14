/**
 *
 * @author Mateus Maidel -  
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NomeSobrenome extends JFrame {

    public NomeSobrenome() {
        super("Nome e Sobrenome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);

        // Crie os campos de texto
        JTextField nomeField = new JTextField();
        JTextField sobrenomeField = new JTextField();

        // Crie o rótulo para mostrar o nome completo
        JLabel nomeCompletoLabel = new JLabel("");

        // Adicione um KeyListener a cada campo de texto
        nomeField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Obtenha o texto atual de ambos os campos de texto
                String nome = nomeField.getText();
                String sobrenome = sobrenomeField.getText();

                // Concatene os textos em uma String
                String nomeCompleto = nome + " " + sobrenome;

                // Atualize o rótulo com a String concatenada
                nomeCompletoLabel.setText(nomeCompleto);
            }
        });
        sobrenomeField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Obtenha o texto atual de ambos os campos de texto
                String nome = nomeField.getText();
                String sobrenome = sobrenomeField.getText();

                // Concatene os textos em uma String
                String nomeCompleto = nome + " " + sobrenome;

                // Atualize o rótulo com a String concatenada
                nomeCompletoLabel.setText(nomeCompleto);
            }
        });

        // Adicione os componentes à janela
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(nomeField, BorderLayout.NORTH);
        contentPane.add(sobrenomeField, BorderLayout.CENTER);
        contentPane.add(nomeCompletoLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new NomeSobrenome();
    }
}
