package edu.lsdbc.solarsoft.views;

import edu.lsdbc.solarsoft.models.SolarApplication;

import java.util.List;

/**
 * Created by XPS on 12/15/2016.
 */
public class ViewSubmitedApps extends BaseView {

    public void display(List<SolarApplication> saList) {

        for(SolarApplication sa : saList)
        {
            System.out.println(sa.toShortDisplay());
        }
    }


    public void display(String userName) {

    }
}
