package co.edu.uptc.view.infoPage;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ButtonsPanelGeo extends JPanel{
    private OptionButton stateButton;
    private OptionButton countyButton;
    private OptionButton cityButton;


    public ButtonsPanelGeo() {
        super(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(740, 40));
        

        stateButton = new OptionButton("Registro por Estados", "state");
        countyButton = new OptionButton("Registro por Condado", "county");
        cityButton = new OptionButton("Registro por ciudad", "city");

        add(stateButton);
        add(countyButton);
        add(cityButton);
    }

    public OptionButton getStateButton() {
        return stateButton;
    }

    public OptionButton getCountyButton() {
        return countyButton;
    }

    public OptionButton getCityButton() {
        return cityButton;
    }

    

    
    
}
