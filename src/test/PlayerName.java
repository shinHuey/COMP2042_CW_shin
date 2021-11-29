package test;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;

public class PlayerName extends JFrame{
    protected JTextField textField;
    protected JTextArea textArea;
    private final static String newline = "\n";
    private JTextField tf;
    String pname="Player1";
    public PlayerName() {


        setLayout(new BorderLayout());
        tf = new JTextField(pname);
        tf.setSize(50,20);
        tf.setLocation(0,0);
        tf.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                pname=tf.getText();
            }
            public void removeUpdate(DocumentEvent e) {
                pname=tf.getText();
            }
            public void insertUpdate(DocumentEvent e) {
                pname=tf.getText();
            }

        });




        add(tf,BorderLayout.CENTER);

        setSize(200, 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int x = ((size.width) / 2)-100;
        int y = ((size.height ) / 2)+38;
        setLocation(x,y);

        setUndecorated(true);


        setAlwaysOnTop(true);




    }

    class RoundedJTextField extends JTextField {
        private Shape shape;

        public RoundedJTextField(int size) {




        }



    }
}
