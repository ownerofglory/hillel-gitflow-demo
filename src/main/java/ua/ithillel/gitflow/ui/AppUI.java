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

    private JLabel strUpperLabel = new JLabel("To upper case");
    private JTextField strUpperField = new JTextField();
    private JButton strUpperBtn = new JButton("To upper");
    private JLabel strUpperResultLabel = new JLabel("");

    {
        setSize(400, 200);
        setTitle("Gitflow Demo");
        setLayout(new GridLayout(4, 3));

        add(strLenLabel);
        add(new JLabel(""));
        add(new JLabel(""));

        add(strLenField);
        add(strLenBtn);
        add(strLenResultLabel);

        add(strUpperLabel);
        add(new JLabel(""));
        add(new JLabel(""));

        add(strUpperField);
        add(strUpperBtn);
        add(strUpperResultLabel);


        strLenBtn.addActionListener(this::onStrLenBtnClicked);
        strUpperBtn.addActionListener(this::onStrUpperBtnClicked);

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

    private void onStrUpperBtnClicked(ActionEvent e) {
        String text = strUpperField.getText();
        String s = stringManager.stringUpper(text);
        strUpperResultLabel.setText(s);
    }
}
