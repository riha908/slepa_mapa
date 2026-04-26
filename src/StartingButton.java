import javax.swing.*;
import java.awt.*;

public class StartingButton {

        public static void changeStyle(JButton button){
            button.setBackground(new Color(70, 132, 180));
            button.setForeground(Color.WHITE);

            button.setFont(new Font("", Font.BOLD,14));

            button.setFocusPainted(false);
            button.setBorderPainted(false);

            button.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        }


        public static void changeButton(JButton button){
            button.setBackground(new Color(205, 43, 216));
            button.setForeground(Color.WHITE);

            button.setFont(new Font("", Font.BOLD,14));

            button.setFocusPainted(false);
            button.setBorderPainted(false);
        }


    }


