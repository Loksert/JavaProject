package com.company.JavaProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logic extends Main implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event){
       String result = inPut.getText();
       Character a = result.charAt(result.length());
    }

}
