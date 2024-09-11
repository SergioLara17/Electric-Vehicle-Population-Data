package co.edu.uptc.view.geoPage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header extends JPanel{
    private JLabel titleLabel;

    public Header() {
        super(new FlowLayout(FlowLayout.CENTER));
        setBackground(new Color(0x53788C));
        setPreferredSize(new Dimension(960, 74));

        titleLabel = new JLabel("Anàlisis Geogràfico");
        titleLabel.setFont(new Font("Inria Sans", Font.PLAIN, 30));
        titleLabel.setForeground(Color.white);

        add(titleLabel);


    }
    
    
}
