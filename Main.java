package com.company.JavaProject;
import com.company.JavaProject.CLLButton;

import java.awt.*;
import java.net.Socket;

import javax.swing.*;

public class Main {
    public static final JFrame window = new JFrame();

    //циферблат
    public static JButton nullButton = new JButton("0");
    public static JButton OneButton = new JButton("1");
    public static JButton TwoButton = new JButton("2");
    public static JButton TreeButton = new JButton("3");
    public static JButton FourButton = new JButton("4");
    public static JButton FiveButton = new JButton("5");
    public static JButton SixButton = new JButton("6");
    public static JButton SevenButton = new JButton("7");
    public static JButton EightButton = new JButton("8");
    public static JButton NineButton = new JButton("9");

    public static JButton plus = new JButton("+");
    public static JButton minus = new JButton("-");
    public static JButton umn = new JButton("*");
    public static JButton del = new JButton("/");
    public static JButton rvn = new JButton("=");


    public static JButton RVN = new JButton();

    //лейблы
    public static JLabel numLabel = new JLabel();
    //
    public static JTextField inPut = new JTextField();

    public static void main(String[] args) {

        //описание окна
        window.setSize(400, 700);
        window.setTitle("File Trash");
        window.setLayout(new GridBagLayout()); // тип Layout
        window.getContentPane().setBackground(Color.WHITE);
        window.setVisible(true);
        window.setResizable(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numLabel.setLayout(new BorderLayout());
        numLabel.add(nullButton,BorderLayout.NORTH);

        CLLButton.main();


    }
}