package learninggui;

import java.awt.*;

public class GridLayoutDemo extends Frame {
    public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
        frame.setLayout(new GridLayout(2, 3, 4, 4));
        frame.add(new Button("ONE"));
        frame.add(new Button("TWO"));
        frame.add(new Button("THREE"));
        frame.add(new Button("FOUR"));
        frame.add(new Button("FIVE"));
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}
