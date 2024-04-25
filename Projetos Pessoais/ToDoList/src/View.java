import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panelTitle, taskComponentPanel, taskPanel, panelAddTask;
    private JTextField textField;
    private JButton buttonAdd;
    private JScrollPane scrollPaneTasks;
    private JLabel labelTitle;

    public View() {

        // Inicio do Frame

        frame = new JFrame("ToDo List App"); // Criando um frame
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // Parar a aplicação quando apertar no X
        frame.setSize(400, 800); // Definindo tamanho do frame
        frame.setResizable(false); // Imposibilitando mudaça de tamanho com a aplicação rodando
        frame.setLayout(null); // Implementando o layoutBorder para ter Norte, Sul, Lest, Oeste e Centro
        frame.setLocationRelativeTo(null); // Quando o código rodar a posição inicial será o centro da tela

        /* Fim do Frame

        Inicio do Painel Titulo */

        panelTitle = new JPanel(); // Instanciando um painel para o titulo
        panelTitle.setBounds(0, 0, 400, 80); // Definindo tamanho
        panelTitle.setLayout(null); // Definindo o layout como null para não atrapalhar o setBounds

        /* Fim do Painel Titulo

        Inicio da Label Titulo */

        labelTitle = new JLabel(); // Instanciando label do titulo
        labelTitle.setText("My To Do List"); // Colocando Texto na label
        labelTitle.setOpaque(false); // Deixando a label sem fundo
        labelTitle.setBounds(68, 20, 260, 36); // Definindo a posição e o tamanho
        labelTitle.setHorizontalAlignment(0); // Centralizando horizontalmente o texto da label
        labelTitle.setVerticalAlignment(0); // Centralizando verticalmente o texto da label
        labelTitle.setFont(new Font("Default", Font.PLAIN, 36)); // Definindo a fonte, estilo e tamanho

        /* Fim da Label Titulo

        Inicio do Painel Adicionar Tasks */

        panelAddTask = new JPanel(); // Instanciando um painel para adicionar tasks
        panelAddTask.setBounds(0, 80, 400, 80); // Setando o tamanho do painel
        panelAddTask.setLayout(null); // Definindo o layout como null para não atrapalhar o setBounds

        /* Fim do Painel Adicionar Tasks

        Inicio do TextField Adicionar Tasks */

        textField = new JTextField(); // Instanciando o textField
        textField.setBounds(40, 25, 250, 26); // Definindo a posição e o tamanho
        textField.setMargin(new Insets(2, 6, 2, 6)); // Definindo espaçamento do taxtfield e do texto

        /* FIm do TextField Adicionar Tasks

        Inicio do AddButton */

        buttonAdd = new JButton("Add"); // Instanciando o botão para adicionar as tasks
        buttonAdd.setBounds(295, 25, 61, 26); // Definindo a posição e o tamanho do botão
        buttonAdd.addActionListener(this);

        /* Fim do AddButton */

        taskPanel = new JPanel();

        taskComponentPanel = new JPanel();
        taskComponentPanel.setLayout(new BoxLayout(taskComponentPanel, BoxLayout.Y_AXIS));
        taskPanel.add(taskComponentPanel);



        /*Inicio do ScrollPane */

        scrollPaneTasks = new JScrollPane(taskPanel); // Instanciando o scrollpane para as tasks
        scrollPaneTasks.setBounds(15, 170, 370, 585); // Definindo a posição e o tamanho do scrollpane
        scrollPaneTasks.setMaximumSize(taskPanel.getSize());
        scrollPaneTasks.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // Abilitando o scroll  no scrollpane caso precise
        scrollPaneTasks.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // Desabilitando o scroll horizontal


        /* Fim do ScrollPane

        Adicionando os componentes ao Frame e deixando o Frame visivel */

        frame.add(panelTitle);
        panelTitle.add(labelTitle);
        frame.getContentPane().add(panelAddTask);
        panelAddTask.add(textField);
        panelAddTask.add(buttonAdd);
        frame.getContentPane().add(scrollPaneTasks);



        frame.setVisible(true);
    }

    public static void main(String[] args) {
        View view = new View();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equalsIgnoreCase("Add")) {
            // Cria uma task
            TaskComponents taskComponents = new TaskComponents(taskComponentPanel);
            taskComponentPanel.add(taskComponents);


            // Pegue o texto do outro TextField
            taskComponents.setTaskTextField(textField.getText());
            textField.setText("");

//            taskComponents.getTaskTextField().requestFocus();
            textField.requestFocus();
            repaint();
            revalidate();
        }
    }
}
