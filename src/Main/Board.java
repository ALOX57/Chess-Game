package Main;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public int tileSize = 85;

    private int cols = 8;
    private int rows = 8;

    public Board() {
        this.setPreferredSize(new Dimension(cols * tileSize, rows *tileSize));
        this.setBackground(Color.green);
    }
}
