package ua.ithillel.gitflow.ui;

import ua.ithillel.gitflow.manager.StringManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AppUI extends JFrame {
    private final StringManager stringManager;

    private JLabel strLenLabel = new JLabel("String length");
    private JLabel strLenResultLabel = new JLabel();
    private JTextField strLenField = new JTextField();
    private JButton strLenBtn = new JButton("String");

    {
        setSize(400, 120);
        setTitle("Gitflow Demo");
        setLayout(new GridLayout(2, 3));

        add(strLenLabel);
        add(new JLabel(""));
        add(new JLabel(""));

        add(strLenField);
        add(strLenBtn);
        add(strLenResultLabel);

        strLenBtn.addActionListener(this::onStrLenBtnClicked);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public AppUI(StringManager stringManager) throws HeadlessException {
        this.stringManager = stringManager;
    }

    private void onStrLenBtnClicked(ActionEvent e) {
        String text = strLenField.getText();
        int stringLength = stringManager.stringLength(text);
        strLenResultLabel.setText(String.valueOf(stringLength));
    }
}
