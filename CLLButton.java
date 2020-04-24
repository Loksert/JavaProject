package com.company.JavaProject;

import java.awt.*;

public class CLLButton extends Main {
    public static void main() {


        //кнопки
        window.add(nullButton, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(OneButton, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(TwoButton, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(TreeButton, new GridBagConstraints(2, 0, 0, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(FourButton, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(FiveButton, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(SixButton, new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(SevenButton, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(EightButton, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        window.add(NineButton, new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        //знаки
        window.add(plus, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(minus, new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(umn, new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(del, new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        window.add(rvn, new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        //поля ввода

        window.add(inPut, new GridBagConstraints(0, 5, 4, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        //слушатели
        nullButton.addActionListener(new BListener());

        OneButton.addActionListener(new BListener());
        TwoButton.addActionListener(new BListener());
        TreeButton.addActionListener(new BListener());
        FourButton.addActionListener(new BListener());
        FiveButton.addActionListener(new BListener());
        SixButton.addActionListener(new BListener());
        SevenButton.addActionListener(new BListener());
        EightButton.addActionListener(new BListener());
        NineButton.addActionListener(new BListener());

        plus.addActionListener(new BListener());
        minus.addActionListener(new BListener());
        umn.addActionListener(new BListener());
        del.addActionListener(new BListener());
        rvn.addActionListener(new FactListen());


        window.pack();
    }
}