package main.view;

import main.view.Fabric.ViewFabric;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateButtons {
    public static void addButtons(){
        JButton fabricButton = new JButton("Фабрика пива");
        fabricButton.setVisible(true);

        fabricButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewFabric.createViewFabcir();
            }
        });
        MainView.addComponent(fabricButton);
    }
}
