package ru.gb.homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindowAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        MyWindow window = new MyWindow();
    }


}