package co.edu.uptc.view.geoPage;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Body extends JPanel{
    private OptionButton stateButton;
    private OptionButton countyButton;
    private OptionButton cityButton;
    private JPanel infoPanel;


    public Body() {
        super(new FlowLayout());
        CardLayout card = new CardLayout();

        infoPanel = new JPanel(card);

        infoPanel.add(new JLabel("Esta es la Tarjeta 1"), "Tarjeta 1");
        infoPanel.add(new JLabel("Esta es la Tarjeta 2"), "Tarjeta 2");
        infoPanel.add(new JLabel("Esta es la Tarjeta 3"), "Tarjeta 3");
        infoPanel.setOpaque(true);
        infoPanel.setBackground(Color.BLUE);
        infoPanel.setVisible(true);

        stateButton = new OptionButton("Registro por Estados", "state");
        countyButton = new OptionButton("Registro por Condado", "county");
        cityButton = new OptionButton("Registro por ciudad", "city");

        add(stateButton);
        add(countyButton);
        add(cityButton);
        add(infoPanel);


    }

    

    public JButton getStateButton() {
        return stateButton;
    }

    public void setStateButton(JButton stateButton) {
        this.stateButton = stateButton;
    }

    public JButton getCountyButton() {
        return countyButton;
    }

    public void setCountyButton(JButton countyButton) {
        this.countyButton = countyButton;
    }

    public JButton getCityButton() {
        return cityButton;
    }

    public void setCityButton(JButton cityButton) {
        this.cityButton = cityButton;
    }


    
}
