package co.edu.uptc.view;

import co.edu.uptc.view.geoPage.GeoFrame;
import co.edu.uptc.view.startPage.StartFrame;

public class View {
    private StartFrame startPageFrame;
    private GeoFrame geoFrame;

    public View(){
        startPageFrame = new StartFrame("Pagina de inico");
        startPageFrame.setVisible(true);

        geoFrame = new GeoFrame();
        geoFrame.setVisible(true);
    }

    
}
