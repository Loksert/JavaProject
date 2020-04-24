package com.company.JavaProject;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.script.ScriptEngineManager;

public class BListener extends CLLButton implements ActionListener {
    public String f;
    @Override
    public void actionPerformed(ActionEvent event) {
        f = ((JButton) event.getSource()).getText();
        inPut.setText(inPut.getText()+f);
    }

}
