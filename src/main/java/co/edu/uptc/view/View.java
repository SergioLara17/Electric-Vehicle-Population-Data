package co.edu.uptc.view;

import co.edu.uptc.view.infoPage.Body;
import co.edu.uptc.view.infoPage.ButtonsPanelGeo;
import co.edu.uptc.view.infoPage.ButtonsPanelVehicle;
import co.edu.uptc.view.infoPage.Header;
import co.edu.uptc.view.infoPage.ShowInfoFrame;
import co.edu.uptc.view.startPage.StartFrame;
import lombok.Getter;
@Getter
public class View  {
    private StartFrame startPageFrame;
    private ShowInfoFrame geoFrame;
    private ShowInfoFrame vehicleFrame;
    public View(){
        startPageFrame = new StartFrame("Pagina de inico");
        startPageFrame.setVisible(true);

        geoFrame = new ShowInfoFrame(new Header("Anàlisis Geogràfico"), new Body(new ButtonsPanelGeo()));
        geoFrame.setVisible(true);

        vehicleFrame = new ShowInfoFrame(new Header("Anàlisis Vehícular"), new Body(new ButtonsPanelVehicle()));
        vehicleFrame.setVisible(true);
    }

    
}
