package edu.lsdbc.solarsoft.dao;

import edu.lsdbc.solarsoft.dao.database.Siberia;
import edu.lsdbc.solarsoft.models.SolarApplication;
import edu.lsdbc.solarsoft.models.AppStatusType;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Glen Turnbow and Craig Smith on 12/13/2016.
 */
public class SolarApplicationDAO {
    //get SolarApplication for a systemUser
    public List<SolarApplication> findUsersSolarApplication(String userName){
        List<SolarApplication> list = Siberia.getInstance().getApplications();
        List<SolarApplication> userItemsReturn = new ArrayList<SolarApplication>();

        for(SolarApplication sa: list){
            if(sa.getUserName().equals(userName)){
                userItemsReturn.add(sa);
            }
        }
            return userItemsReturn;
    }

    public List<SolarApplication> findSolarApplicationByStatus(AppStatusType status){
        List<SolarApplication> list = Siberia.getInstance().getApplications();
        List<SolarApplication> returnItems = new ArrayList<SolarApplication>();

        for(SolarApplication sa: list){
            if(sa.getStatus() == status){
                returnItems.add(sa);
            }
        }
        return returnItems;
    }
}
