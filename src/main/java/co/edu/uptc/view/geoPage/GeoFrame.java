package co.edu.uptc.view.geoPage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class GeoFrame extends JFrame { 
    private Header headerPanel;
    private Body bodyPanel;

    public GeoFrame() throws HeadlessException {
        super("Informe");
        this.setSize(960, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(new Color(0xF5F5F5));
        setLayout(new BorderLayout(50, 20));

        headerPanel = new Header();
        headerPanel.setVisible(true);
        headerPanel.setOpaque(true);
        
        
        bodyPanel = new Body();
        bodyPanel.setVisible(true);
        bodyPanel.setOpaque(true);
        
        add(bodyPanel, BorderLayout.CENTER);
        add(headerPanel, BorderLayout.NORTH);

    
    }

    
    
    
}
