import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SistemaAcademicoGUI extends JFrame {
    private JTextField nomeField;
    private JTextField matriculaField;
    private JComboBox<String> disciplinasCombo;
    private JTextField notaField;
    private DefaultListModel<String> modeloList;
    private JList<String> notasList;
    
    public SistemaAcademicoGUI() {
        // Crie a janela principal
        super("Sistema Acadêmico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        // Crie um painel para os campos de entrada
        JPanel camposPanel = new JPanel(new GridLayout(0, 2));
        camposPanel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        camposPanel.add(nomeField);
        camposPanel.add(new JLabel("Matrícula:"));
        matriculaField = new JTextField();
        camposPanel.add(matriculaField);
        camposPanel.add(new JLabel("Disciplina:"));
        disciplinasCombo = new JComboBox<>(new String[]{"Matemática", "Português", "Inglês", "Ciências"});
        camposPanel.add(disciplinasCombo);
        camposPanel.add(new JLabel("Nota:"));
        notaField = new JTextField();
        camposPanel.add(notaField);
        
        // Crie um painel para a lista de notas
        modeloList = new DefaultListModel<>();
        notasList = new JList<>(modeloList);
        JScrollPane notasScroll = new JScrollPane(notasList);
        
        // Crie um botão para adicionar notas
        JButton adicionarButton = new JButton("Adicionar Nota");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenha os valores dos campos de entrada
                String nome = nomeField.getText();
                String matricula = matriculaField.getText();
                String disciplina = (String)disciplinasCombo.getSelectedItem();
                double nota = Double.parseDouble(notaField.getText());
                
                // Adicione a nota ao modelo de lista
                modeloList.addElement(String.format("%s - %s - %s - %.1f", nome, matricula, disciplina, nota));
                
                // Limpe os campos de entrada
                nomeField.setText("");
                matriculaField.setText("");
                notaField.setText("");
            }
        });
        
        // Adicione os componentes à janela
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(camposPanel, BorderLayout.NORTH);
        contentPane.add(notasScroll, BorderLayout.CENTER);
        contentPane.add(adicionarButton, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SistemaAcademicoGUI();
    }
}