package learninggui;

import java.awt.*;
import java.awt.event.*;

public class CloseFrame extends Frame implements WindowListener{
    Label label;
    
    CloseFrame(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(this);
    }
    
    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    public static void main(String[] args) {
        CloseFrame cf = new CloseFrame("Close Window Example");
        cf.launchFrame();
    }
}