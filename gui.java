import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class gui {
    private JPanel panel1;
    JTextArea textArea1;


    public static gui Start() {
        JFrame frame = new JFrame("gui");
        gui g=new gui();
        frame.setContentPane(g.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        return g;
    }
}
