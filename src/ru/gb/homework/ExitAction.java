package ru.gb.homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.exit(-1);
    }


}
