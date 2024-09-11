package co.edu.uptc.view.geoPage;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class ContainerPanel extends JPanel{
    private InfoPanel stateInfoPanel;
    private InfoPanel countyInfoPanel;
    private InfoPanel cityInfoPanel;

    
    public ContainerPanel(){
        super();
        setPreferredSize(new Dimension(740, 368));
        setOpaque(false);
        

        CardLayout cardLayout = new CardLayout();

        setLayout(cardLayout);

        
        stateInfoPanel = new InfoPanel();
        countyInfoPanel = new InfoPanel();
        cityInfoPanel = new InfoPanel();



        
        add(stateInfoPanel, "Tarjeta 1");
        add(countyInfoPanel, "Tarjeta 2");
        add(cityInfoPanel, "Tarjeta 3");

    }
    
}
