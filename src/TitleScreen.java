import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class TitleScreen {

    private JFrame frame;

    public TitleScreen(){
        frame = new JFrame("Menu");
    }

    public void init(){
        this.frame.setSize(600,600);
        this.frame.setLayout(new BorderLayout());
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Menu", JLabel.CENTER);
        this.frame.add(label, BorderLayout.CENTER);

        JButton button = new JButton("Start");
        StartingButton.changeStyle(button);
        this.frame.add(button, BorderLayout.SOUTH);


        button.addActionListener(e ->{
            this.frame.dispose();

        });




        this.frame.setVisible(true);
    }



}
