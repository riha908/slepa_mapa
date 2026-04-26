import javax.swing.*;
import java.awt.*;

public class Mapa {
    private JFrame frame;
    public Mapa() {
        this.frame = new JFrame("Mapa");
    }

    public void init(){
        this.frame.setSize(600,600);
        this.frame.setLayout(new BorderLayout());
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> todoList = new JList<>(model);
        this.frame.add(new JScrollPane(todoList), BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());

        JTextField field = new JTextField();
        panel.add(field, BorderLayout.CENTER);



        this.frame.add(panel, BorderLayout.SOUTH);

        this.frame.setVisible(true);
        }
}
