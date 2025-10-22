package learninggui;

import java.awt.*;

public class FlowLayoutDemo extends Frame{
    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        frame.add(new Button("ONE"));
        frame.add(new Button("TWO"));
        frame.add(new Button("THREE"));
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
