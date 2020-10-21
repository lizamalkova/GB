package ru.gb.homework;
import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame{
    public MyWindow()
    {
        super.setVisible(true);

        setLocation(650,250);
        setSize(500, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton btn1 = new JButton("Выход");
        panel.add(btn1);
        ExitAction exitAction = new ExitAction();
        btn1.addActionListener(exitAction);

        JButton btn2 = new JButton("Новое окно");
        panel.add(btn2);
        NewWindowAction newWindowAction = new NewWindowAction();
        btn2.addActionListener(newWindowAction);

        add(panel, BorderLayout.SOUTH);



    }
}
