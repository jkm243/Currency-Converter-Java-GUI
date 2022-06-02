package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JLabel lblTitle;
    private JLabel lblAmount;
    private JLabel lblFrom;
    private JLabel lblTo;
    private JButton convertButton;
    private JButton closeButton;
    private JTextField textField1;
    private JComboBox comboBox2;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JLabel lblRes;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Main");
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Closing
                dispose();
            }
        });
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String amount = textField1.getText();
                String result = textField2.getText();

                textField2.setText("Bonjour");
            }
        });
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
    }
}
