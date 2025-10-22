package learninggui;

import java.awt.*;
import java.awt.event.*;

public class EventProduct extends Frame implements ActionListener, WindowListener{
    private Label lblProdName;
    private Label lblUPrice;
    private Label lblQty;
    private Label lblAmt;
    
    private TextField tfProdName;
    private TextField tfUPrice;
    private TextField tfQty;
    private TextField tfAmt;
    
    private Button bCompute;
    
    private int pQty;
    private double pUPrice, pAmt;
    
    // Constructor to setup the UI
    public EventProduct(){
        setLayout(new FlowLayout(FlowLayout.CENTER)); // Frame sets to center
        
        lblProdName = new Label("Product Name"); // allocate
        add(lblProdName);
        
        lblUPrice = new Label("Unit Price");
        add(lblUPrice);
        
        tfUPrice = new TextField(10);
        add(tfUPrice);
        
        lblQty = new Label("Quantity");
        add(lblQty);
        
        tfQty = new TextField(10);
        add(tfQty);
        
        bCompute = new Button("                 Compute                 ");
        add(bCompute);
        bCompute.addActionListener(this);
        this.addWindowListener(this);
        
        lblAmt = new Label("Amount");
        add(lblAmt);
        
        tfAmt = new TextField(10);
        tfAmt.setEditable(false);
        add(tfAmt);
        
        setTitle("Order Product");
        setSize(250, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new EventProduct();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pQty = Integer.parseInt(tfQty.getText());
        pUPrice = Double.parseDouble(tfUPrice.getText());
        pAmt = pQty * pUPrice;
        
        // tfAmt.setText(" "+ pAmt);
        
        tfAmt.setText(String.valueOf(pAmt));
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
}
