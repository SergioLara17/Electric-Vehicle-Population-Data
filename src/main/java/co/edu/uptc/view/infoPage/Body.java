package co.edu.uptc.view.infoPage;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class Body extends JPanel{
    private JPanel buttonsPanel;
    private ContainerPanel containerPanel;

    public Body(JPanel buttonsPanel) {
        
        super(new FlowLayout());
        this.buttonsPanel = buttonsPanel;
        containerPanel = new ContainerPanel();


        add(buttonsPanel);
        add(containerPanel);
        


    }

    

    


    
}
