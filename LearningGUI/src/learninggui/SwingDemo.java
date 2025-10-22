package learninggui;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button;
    Container contentPane;
    
    void launchFrame() {
        /* initialization */
        frame = new JFrame("My First Swing Application");
        panel = new JPanel();
        textField = new JTextField("Default text");
        button = new JButton("Click me!");
        contentPane = frame.getContentPane();
        
        /* add components to panel - uses FlowLayout by default */
        panel.add(textField);
        panel.add(button);
        
        /* add components to contentPane - uses BorderLayout */
        contentPane.add(panel, BorderLayout.CENTER);
        frame.pack();
        // Causes size of frame to be based on the components
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingDemo sd = new SwingDemo();
        sd.launchFrame();
    }
}