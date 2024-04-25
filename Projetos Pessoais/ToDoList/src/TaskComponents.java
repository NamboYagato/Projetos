import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskComponents extends JPanel implements ActionListener {
    private JCheckBox checkBox;
    private JButton deleteButton;

    private JTextPane taskTextField;

    private JPanel parentPanel;

    public JTextPane getTaskTextField() {
        return taskTextField;
    }

    public void setTaskTextField(String text) {
        taskTextField.setText(text);
    }

    public TaskComponents(JPanel parentPanel) {
        this.parentPanel = parentPanel;

        taskTextField = new JTextPane(); // Instanciando um textfield reserva
        taskTextField.setBounds(32, 13, 238, 24); // Definindo a posição e o tamanho do textfield
        taskTextField.setPreferredSize(new Dimension(238, 24)); // Definindo a posição e o tamanho do textfield
//        taskTextField.setMargin(new Insets(2, 6, 2, 6)); // Definindo espaçamento do taxtfield e do texto
        taskTextField.setContentType("text/html");
        taskTextField.setEditable(false);


        checkBox = new JCheckBox(); // Instanciando o checkbox
        checkBox.setBounds(6, 13, 23, 23); // Definindo a posição e o tamanho do checkbox
        checkBox.setPreferredSize(new Dimension(23, 23)); // Definindo a posição e o tamanho do checkbox
        checkBox.setVerticalAlignment(0); // Centralizando o checkbox verticalmente
        checkBox.setHorizontalAlignment(0); // Centralizando o checkbox horizontalmente
        checkBox.addActionListener(this);

        deleteButton = new JButton("Delete"); // Instanciando o button
        deleteButton.setBounds(276, 13, 81, 23); // Definindo a posição e o tamanho do button
        deleteButton.setPreferredSize(new Dimension(81, 23)); // Definindo a posição e o tamanho do button
        deleteButton.addActionListener(this);

        add(checkBox);
        add(taskTextField);
        add(deleteButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String taskText = taskTextField.getText().replaceAll("<[^>]*>", "");
        if (checkBox.isSelected()){
            taskTextField.setText("<html><s>" + taskText + "</s></html>");
        } else if (!checkBox.isSelected()){
            taskTextField.setText(taskText);
        }
        if (e.getActionCommand().equalsIgnoreCase("Delete")) {
            parentPanel.remove(this);
            parentPanel.repaint();
            parentPanel.revalidate();
        }
    }
}
