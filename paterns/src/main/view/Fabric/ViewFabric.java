package main.view.Fabric;

import main.factory.Beer;
import main.factory.BeerFactory;
import main.factory.BeerTypes;
import main.view.MainView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewFabric {
    private static JFrame jFabric = new JFrame("Фабрика пива");
    private static JFrame jFabric2 = new JFrame("Фабрика пива");
    private static boolean wasOpened = false;
    private static JLabel fabricLabel = null;
    private static JLabel drinkingLabel = null;

    public static void createViewFabcir() {
        jFabric.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFabric.setPreferredSize(new Dimension(200, 110));
        jFabric.setLayout(new FlowLayout());
        jFabric.pack();
        jFabric.setLocationRelativeTo(null);
        jFabric.setResizable(false);
        jFabric.setVisible(true);

        if (!wasOpened) {
            wasOpened = true;
            JLabel jLabel = new JLabel("Выберите пиво");
            jLabel.setVisible(true);
            jFabric.getContentPane().add(jLabel);

            JComboBox<String> beerBox = new JComboBox<>();
            beerBox.addItem("Bud");
            beerBox.addItem("Garage");
            beerBox.addItem("Jiguli");
            beerBox.setVisible(true);
            jFabric.getContentPane().add(beerBox);

            JButton okButton = new JButton("Ок");
            okButton.setVisible(true);
            jFabric.getContentPane().add(okButton);

            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    createFabricChooser(beerBox.getSelectedItem());
                }
            });
        }
    }

    public static void createFabricChooser(Object beer) {
        jFabric.dispose();

        jFabric2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFabric2.setPreferredSize(new Dimension(350, 200));
        jFabric2.setLayout(new FlowLayout());
        jFabric2.pack();
        jFabric2.setLocationRelativeTo(null);
        jFabric2.setResizable(false);
        jFabric2.setVisible(true);


        BeerFactory beerFactory = new BeerFactory();
        Beer choosedBeer = null;

        switch (beer.toString()) {
            case "Bud":
                choosedBeer = beerFactory.getBeer(BeerTypes.BUD);
                break;
            case "Garage":
                choosedBeer = beerFactory.getBeer(BeerTypes.GARAGE);
                break;
            case "Jiguli":
                choosedBeer = beerFactory.getBeer(BeerTypes.Jiguli);
                break;
        }

        fabricLabel = new JLabel();
        fabricLabel.setText("You choosed " + choosedBeer.getClass().getSimpleName() + ": ");
        fabricLabel.setVisible(true);
        jFabric2.getContentPane().add(fabricLabel);

        drinkingLabel = new JLabel();
        drinkingLabel.setText(choosedBeer.drink());
        drinkingLabel.setVisible(true);
        jFabric2.getContentPane().add(drinkingLabel);
    }
}
