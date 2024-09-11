package co.edu.uptc.view.geoPage;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class Body extends JPanel{
    private ButtonsPanel buttonsPanel;
    private ContainerPanel containerPanel;
    
    


    public Body() {
        
        super(new FlowLayout());
        buttonsPanel = new ButtonsPanel();
        containerPanel = new ContainerPanel();


        add(buttonsPanel);
        add(containerPanel);
        


        


        

        

    }

    

    


    
}
