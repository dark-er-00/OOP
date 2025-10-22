package learninggui;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(new Button("NORTH"), BorderLayout.NORTH);
        frame.add(new Button("SOUTH"), BorderLayout.SOUTH);
        frame.add(new Button("EAST"), BorderLayout.EAST);
        frame.add(new Button("WEST"), BorderLayout.WEST);
        frame.add(new Button("CENTER"), BorderLayout.CENTER);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
