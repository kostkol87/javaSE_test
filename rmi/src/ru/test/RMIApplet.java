package ru.test;

import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 * Created by Константин on 17.08.2014.
 */
public class RMIApplet extends JApplet implements ActionListener {
    String message = null;
    String date = "";
    JButton cButton = new JButton("Connect to server");
    JEditorPane msgText;
    JavaPro obj = null;
    String sName = null;

    public RMIApplet(){
        if (System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
            sName = "TeachPro";
            init();
        }
    }
    private void getMessage(){
        String name = (sName == null)?getCodeBase().getHost():sName;
        message = "";
        try{
            if (obj == null){
                obj = (JavaPro) Naming.lookup("//" + name + "/JavaProServer");
            }
            message+=obj.handShaking();
            date = obj.getDate();
        }catch (Exception e){
            System.out.println("RMIApplet exception: " + e.getMessage());
            e.printStackTrace();
        }
    }


    @Override
    public void init() {
        if (message == null){
            getMessage();
        }
        Container contentPane = getContentPane();
        cButton.addActionListener(this);
        msgText = new JEditorPane();
        msgText.setEditorKit(new HTMLEditorKit());

        try{
            msgText.setText(message);
        }catch (Exception e){
            JScrollPane htnlView = new JScrollPane(msgText);
            htnlView.setPreferredSize(new Dimension(400, 200));
            htnlView.setMaximumSize(new Dimension(10, 10));
            contentPane.add(htnlView, BorderLayout.CENTER);
            contentPane.add(cButton, BorderLayout.NORTH);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
