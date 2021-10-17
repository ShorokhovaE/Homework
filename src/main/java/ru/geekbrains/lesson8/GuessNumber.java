package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame{
    private int randomNumber;
    private int count = 1;

    private JTextField textField;

    public GuessNumber(){
        randomNumber = (int)(Math.random() * 10) + 1;

        setTitle("Guess the number");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Игра началась! Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        JButton restartButton = new JButton("Перезагрузить игру");
        restartButton.setFont(font);
        add(restartButton, BorderLayout.SOUTH);

        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restart();
            }
        });

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            final JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex, button);
                    count++;
                    if(tryToAnswer(buttonIndex, button)){
                        buttonsPanel.setVisible(false);
                        add(restartButton, BorderLayout.CENTER);
                    }else if (count > 3){
                        textField.setText("Вы не угадали. Игра окончена.\nЗагаданное число: " + randomNumber);
                        buttonsPanel.setVisible(false);
                        add(restartButton, BorderLayout.CENTER);
                    }
                }
            });
        }


        setVisible(true);
    }

    public boolean tryToAnswer(int answer, JButton button) {
        if(answer == randomNumber) {
            textField.setText("Вы угадали! Ответ: " + randomNumber);
            return true;
        } else if(answer > randomNumber) {
            textField.setText("Не угадали! Загадонное число меньше");
            return false;
        } else {
            textField.setText("Не угадали! Загадонное число больше");
            return false;
        }
    }

    public void restart(){
        new GuessNumber();
    }

}
