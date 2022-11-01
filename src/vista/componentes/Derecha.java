package vista.componentes;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Derecha extends JPanel {

    public Derecha() {
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(160, 0));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel upperGap = new JPanel();
        upperGap.setPreferredSize(new Dimension(160, 100));
        upperGap.setBackground(Color.white);

        JButton button = new JButton("Nuevo");

        JButton button2 = new JButton("Reiniciar");

        JButton button3 = new JButton("Top 10");

        JButton button4 = new JButton("Cambiar jugador");

        button.setPreferredSize(new Dimension(160, 30));
        button2.setPreferredSize(new Dimension(160, 30));
        button3.setPreferredSize(new Dimension(160, 30));
        button4.setPreferredSize(new Dimension(160, 30));

        this.add(upperGap);
        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(button4);

    }

}
