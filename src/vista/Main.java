package vista;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.formdev.flatlaf.FlatLightLaf;

import vista.componentes.Centro;
import vista.componentes.Derecha;
import vista.componentes.Superior;

public class Main {
    public static void main(String[] args) {

        FlatLightLaf.install();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout(0, 0));

        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        panel4.setBackground(Color.magenta);

        frame.setAlwaysOnTop(true);

        frame.add(new Superior(), BorderLayout.NORTH);
        frame.add(new Derecha(), BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(new Centro(), BorderLayout.CENTER);

        frame.setVisible(true);

    }
}
