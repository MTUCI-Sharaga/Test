package main.view;

import javax.swing.*;
import java.awt.*;

public class MainView {
    private static JFrame jFrame = new JFrame("Pattern test");

    public void createGui(){
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(700, 400));
        jFrame.setLayout(new FlowLayout());

        CreateButtons.addButtons();

        jFrame.pack();
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public static void addComponent(JComponent component) {
        jFrame.getContentPane().add(component);
    }
}
