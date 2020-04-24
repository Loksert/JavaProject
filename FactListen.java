package com.company.JavaProject;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactListen extends BListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event){
        inPut.setText(foo());
    }

   public static String foo(){
        String s = null;
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result;
        try {
            result = engine.eval(inPut.getText());
            System.out.println(result);
            s=result.toString();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return s;
    }

}
