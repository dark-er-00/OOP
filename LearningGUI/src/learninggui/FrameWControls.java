package learninggui;

import java.awt.*;

public class FrameWControls extends Frame {
    public static void main(String[] args) {
        FrameWControls frame = new FrameWControls();
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 600);
        frame.add(new Button("Test Me!"));
        frame.add(new Label("Label"));
        frame.add(new TextField());
        CheckboxGroup checkBox = new CheckboxGroup();
        frame.add(new Checkbox("chk1", checkBox, true));
        frame.add(new Checkbox("chk2", checkBox, false));
        frame.add(new Checkbox("chk3", checkBox, false));
        List list = new List(3, false);
        list.add("MTV");
        list.add("V");
        frame.add(list);
        Choice chooser = new Choice();
        chooser.add("Avril");
        chooser.add("Monica");
        chooser.add("Britney");
        frame.add(chooser);
        frame.add(new Scrollbar());
        frame.setVisible(true);
    }

}
