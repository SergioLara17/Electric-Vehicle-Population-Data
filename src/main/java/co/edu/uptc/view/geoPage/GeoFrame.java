package co.edu.uptc.view.geoPage;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GeoFrame extends JFrame { 
    private JPanel headerPanel;
    private Body bodyPanel;

    public GeoFrame() throws HeadlessException {
        super("Informe");
        this.setSize(669, 466);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0xF5F5F5));

        bodyPanel = new Body();
        bodyPanel.setVisible(true);
        bodyPanel.setOpaque(true);
        
        
        bodyPanel.setBackground(Color.GREEN);

        add(bodyPanel);
    }

    
    
    
}
