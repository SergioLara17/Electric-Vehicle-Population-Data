package co.edu.uptc.view.infoPage;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ButtonsPanelVehicle extends JPanel{
    private OptionButton stateButton;
    private OptionButton amountButton;
    private OptionButton rangeButton;


    public ButtonsPanelVehicle() {
        super(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(740, 40));
        

        stateButton = new OptionButton("Registro por Estados", "state");
        amountButton = new OptionButton("Registro por Condado", "county");
        rangeButton = new OptionButton("Registro por ciudad", "city");

        add(stateButton);
        add(amountButton);
        add(rangeButton);
    }

    public OptionButton getStateButton() {
        return stateButton;
    }

    public OptionButton getCountyButton() {
        return amountButton;
    }

    public OptionButton getCityButton() {
        return rangeButton;
    }

    

    
    
}
