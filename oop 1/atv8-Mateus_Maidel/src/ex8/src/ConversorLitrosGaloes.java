import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorLitrosGaloes extends JFrame {

    public ConversorLitrosGaloes() {
        super("Conversor Litros-Galões");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);

        // Crie o campo de texto para entrada de litros
        JTextField litrosField = new JTextField();

        // Crie o botão de conversão
        JButton converterButton = new JButton("Converter");

        // Crie o rótulo para exibição do resultado
        JLabel resultadoLabel = new JLabel("");

        // Adicione um ActionListener ao botão de conversão
        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenha o valor em litros do campo de texto
                double litros = Double.parseDouble(litrosField.getText());

                // Converta para galões
                double galoes = litros / 3.785;

                // Atualize o rótulo com o resultado
                resultadoLabel.setText(String.format("%.2f galões", galoes));
            }
        });

        // Adicione os componentes à janela
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(litrosField, BorderLayout.NORTH);
        contentPane.add(converterButton, BorderLayout.CENTER);
        contentPane.add(resultadoLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorLitrosGaloes();
    }
}
