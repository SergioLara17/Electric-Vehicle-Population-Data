package co.edu.uptc.view.geoPage;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Body extends JPanel{
    private JButton stateButton;
    private JButton countyButton;
    private JButton cityButton;
    private JPanel infoPanel;


    public Body() {
        super();
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
