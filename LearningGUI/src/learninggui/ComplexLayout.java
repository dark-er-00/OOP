package learninggui;

import java.awt.*;

public class ComplexLayout extends Frame{
    public static void main(String[] args) {
        ComplexLayout frame = new ComplexLayout();
        Panel panelNorth = new Panel();
        Panel panelCenter = new Panel();
        Panel panelSouth = new Panel();
        
        // North Panel
        //Panels use FlowLayout by default
        panelNorth.add(new Button("ONE"));
        panelNorth.add(new Button("TWO"));
        panelNorth.add(new Button("THREE"));
        
        // Center Panel
        panelCenter.setLayout(new GridLayout(4, 4));
        panelCenter.add(new TextField("1st"));
        panelCenter.add(new TextField("2nd"));
        panelCenter.add(new TextField("3rd"));
        panelCenter.add(new TextField("4th"));
        panelCenter.add(new TextField("4th"));
        panelCenter.add(new TextField("4th"));
        panelCenter.add(new TextField("4th"));
        panelCenter.add(new TextField("4th"));
           
        // South Panel
        panelSouth.setLayout(new BorderLayout());
        panelSouth.add(new Checkbox("Choose me!"), BorderLayout.CENTER);
        panelSouth.add(new Checkbox("I'm here!"), BorderLayout.EAST);
        panelSouth.add(new Checkbox("Pick me!"), BorderLayout.WEST);
        
        // Adding the Panels to the Frame container
        // Frames use BorderLayout by default
        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}