package vista.componentes;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Centro extends JPanel {

    public Centro() {
        this.setBackground(Color.white);

    }

    public void paint(Graphics g) {
        BufferedImage img;
        try {
            img = ImageIO.read(new File("data/luz.png"));
            Graphics2D g2d = (Graphics2D) g;

            g.drawImage(img, 0, 0, null);
            g.drawImage(img, 100, 0, null);
            g.drawImage(img, 200, 0, null);
            g.drawImage(img, 300, 0, null);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
