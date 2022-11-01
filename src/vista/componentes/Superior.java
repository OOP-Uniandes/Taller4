package vista.componentes;

import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Superior extends JPanel {

    String[] sizeStrings = { "5x5", "6x6", "7x7" };

    public Superior() {

        this.setBackground(new Color(71, 135, 218));

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        // this.setPreferredSize(new Dimension(0, 50));

        JLabel sizeLabel = new JLabel();
        JLabel difficultyLabel = new JLabel();
        JLabel hardLabel = new JLabel();
        JLabel mediumLabel = new JLabel();
        JLabel easyLabel = new JLabel();

        sizeLabel.setText("Tamaño");
        difficultyLabel.setText("Dificultad: ");

        hardLabel.setText("Dificil");
        mediumLabel.setText("Medio");
        easyLabel.setText("Facil");

        JComboBox sizeDropdown = new JComboBox(sizeStrings);
        sizeDropdown.setSelectedIndex(0);

        JRadioButton hardRadioBtn = new JRadioButton();
        JRadioButton mediumRadioBtn = new JRadioButton();
        JRadioButton easyRadioBtn = new JRadioButton();

        ButtonGroup grupoBotonesDificultad = new ButtonGroup();

        grupoBotonesDificultad.add(hardRadioBtn);
        grupoBotonesDificultad.add(mediumRadioBtn);
        grupoBotonesDificultad.add(easyRadioBtn);

        this.add(sizeLabel);
        this.add(sizeDropdown);

        this.add(difficultyLabel);

        this.add(easyRadioBtn);
        this.add(easyLabel);

        this.add(mediumRadioBtn);
        this.add(mediumLabel);

        this.add(hardRadioBtn);
        this.add(hardLabel);
    }

}
