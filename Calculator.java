import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends Frame implements ActionListener, WindowListener{
    private TextField studNameField;
    private TextField lecUnitsField;
    private TextField labUnitsField;
    private TextField totalUnitsField = new TextField(33);
    private TextField lecFeeField = new TextField(33);
    private TextField labFeeField = new TextField(30);
    private TextField totalFeesField = new TextField(30);
    
    private Button compute;
    private Button clear;
    
    private Choice courses = new Choice();
    
    private double BSIT = 350;
    private double BSDS = 400;
    private double BSED = 300;
    private double BSBA = 300;
    private double perLabFee = 500;
    private double lecUnits;
    private double labUnits;
    private double lecFee;
    private double labFee;
    private double totalFee;
    private double totalUnits;
    
    public Calculator(){
        setTitle("Student Tuition Fee Calculator");
        setVisible(true);
        FlowLayout flow = new FlowLayout();
        flow.setAlignment(FlowLayout.LEFT);
        setLayout(flow);
        addWindowListener(this);
        setSize(400, 350);
        
        add(new Label("Student Name:"));
        studNameField = new TextField(30);
        add(studNameField);
        
        add(new Label("Course: "));
        courses.add("BSIT");
        courses.add("BSDS");
        courses.add("BSED");
        courses.add("BSBA");
        add(courses);
        
        add(new Label("                                                   "));
        add(new Label("Lecture Units:"));
        lecUnitsField = new TextField(30);
        add(lecUnitsField);
        
        add(new Label("Laboratory Units:"));
        labUnitsField = new TextField(30);
        add(labUnitsField);
        
        compute = new Button("                                                 COMPUTE                                               ");
        compute.addActionListener(e -> {
        lecUnits = Integer.parseInt(lecUnitsField.getText());
        labUnits = Integer.parseInt(labUnitsField.getText());
        totalUnits = labUnits + lecUnits;
        
        totalUnitsField.setText(String.valueOf(totalUnits));
        
        labFee = labUnits*perLabFee;
        
        labFeeField.setText(String.valueOf(labFee));
        
        String selected = courses.getSelectedItem();
        
        switch(selected){
            case "BSIT":
                lecFee = lecUnits*BSIT;
                break;
                
            case "BSDS":
                lecFee = lecUnits*BSDS;
                break;
                
            case "BSED":
                lecFee = lecUnits*BSED;
                break;
                
            case "BSBA":
                lecFee = lecUnits*BSBA;
                break;
        }
        lecFeeField.setText(String.valueOf(lecFee));
        
        totalFee = labFee + lecFee;
        
        totalFeesField.setText(String.valueOf(totalFee));
        });
        add(compute);
        
        add(new Label("Total Units:"));
        totalUnitsField.setEditable(false);
        add(totalUnitsField);
        
        add(new Label("Lecture Fee:"));
        lecFeeField.setEditable(false);
        add(lecFeeField);
        
        add(new Label("Laboratory Fee:"));
        labFeeField.setEditable(false);
        add(labFeeField);
        
        add(new Label("Total Fees:"));
        totalFeesField.setEditable(false);
        add(totalFeesField);
        
        clear = new Button("                                                 CLEAR                                               ");
        clear.addActionListener(e -> {
            studNameField.setText("");
            lecUnitsField.setText("");
            labUnitsField.setText("");
            totalUnitsField.setText("");
            lecFeeField.setText("");
            labFeeField.setText("");
            totalFeesField.setText("");
        });
        add(clear);
    }
    
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }


    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.setVisible(false);
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
