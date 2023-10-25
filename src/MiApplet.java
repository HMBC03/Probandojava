import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MiApplet {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");

        JLabel etiqueta = new JLabel("Presiona el botón");
        frame.add(etiqueta);

        JButton boton = new JButton("Presionar");
        frame.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("El botón ha sido presionado");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



    

