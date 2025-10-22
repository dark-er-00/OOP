package learninggui;

import java.awt.*;

public class GraphicsPanel extends Panel{
    GraphicsPanel(){
        setBackground(Color.black);
    }
    
    public void paint(Graphics g){
        g.setColor(new Color(0, 255, 0)); //green
        g.setFont(new Font("Helvetica", Font.BOLD, 16));
        g.drawString("Hello GUI World", 30, 100);
        g.setColor(new Color(1.0f, 0, 0)); //red
        g.fillRect(30, 100, 150, 10);
    }
    
    public static void main(String[] args) {
        Frame mainFrame = new Frame("Testing Graphics Panel");
        GraphicsPanel gp = new GraphicsPanel();
        mainFrame.add(gp);
        mainFrame.setSize(600, 300);
        mainFrame.setVisible(true);
    }
}
