package main;

import data.Jewelry;
import data.ScriptOptions;
import org.rspeer.ui.Log;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private JLabel typeLabel;
    private JButton initiate;
    private Jewelry jewelry;

    Gui() {
        super("Config");

        setLayout(new FlowLayout());

        JComboBox<Jewelry> typeComboBox = new JComboBox<>(Jewelry.values());
        typeLabel = new JLabel("Type: ");
        initiate = new JButton("Start");

        initiate.addActionListener(e -> {
            Log.info("Gui: setting jewelry");
            jewelry = (Jewelry) typeComboBox.getSelectedItem();
            Log.info("Gui: " + jewelry.getJewelryName());
            setVisible(false);
        });

        add(typeLabel);
        add(typeComboBox);
        add(initiate);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        pack();
    }

    public static void main(String... args) {
        new Gui().setVisible(true);
    }

    public ScriptOptions getOptions() {
        if (jewelry != null) {
            Log.info("Gui: returned script options");
            return new ScriptOptions(jewelry);
        }
        Log.info("Gui: returned null options");
        return null;
    }
}
