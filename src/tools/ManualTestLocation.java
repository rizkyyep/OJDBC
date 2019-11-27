/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.LocationController;
import daos.LocationDao;
import java.util.ArrayList;
import java.util.List;
import models.Country;
import models.Location;

/**
 *
 * @author Rizky
 */
public class ManualTestLocation {
    public static void main(String[] args) {
//      CRUD YANG DIPANGGIL MELALUI CONTROLLER
    LocationController locationController = new LocationController();
        //add new location
//        System.out.println(locationController.create("3500", "New", "139", "new", "New","UK"));
        //update location
//        System.out.println(locationController.update("3500", "Jl Raya Pulo Gebang", "13950", "daf", "asdf", "UK"));
        //delete location
//        System.out.println(locationController.delete("3500"));

        //get all location
//        for (Location location1 : locationController.getAll()) {
//            System.out.println(location1.getId()+" "+location1.getStreet()+""
//            + " "+location1.getPostal()+" "+location1.getCity()+" "+location1.getState()+""
//            + " --"+location1.getCountry().getId()+" "+location1.getCountry().getName());
//        }
        
        //select by id location
//        System.out.println(locationController.selectId(3300).getStreet()+" "+locationController.selectId(3300).getCity());
        
        //search location
//        for (Location location : locationController.searchLoc("ter")) {
//            System.out.println(location.getId()+" "+location.getStreet()+" "+location.getCity());
//        }
    
    
        
        
        
        
        
        
//      CRUD YANG DIPANGGIL MELALUI DAO, BUKAN MELALUI CONTROLLER
//        LocationDao location = new LocationDao();
//        System.out.println(" "+ location.createLocation(new Location(3500, 
//                "Pulo Gebang", "13960", "Jakarta Timur", "DKI Jakarta", "UK")));
//        System.out.println(" "+ location.updateLocation(new Location(3500, "kandang besar")));
//        System.out.println(" "+ location.deleteLocation(new Location(3300)));
        
//        List<Location> locations = new ArrayList<>();                               
//        locations = location.selectLocations();
//        for (Location loc : locations) {
//            System.out.println(loc.getId()+" "+loc.getStreet()+""
//            + " "+loc.getPostal()+" "+loc.getCity()+" "+loc.getState()+""
//            + " "+loc.getCountryid());
//        }
//        
//        System.out.println(location.selectLocById(new Location(3500)).getStreet());
//        
//        List<Location> locSearch = new ArrayList<>();
//        locSearch = location.searchLocation("ka");
//        for (Location location1 : locSearch) {
//            System.out.println(location1.getId()+" "+location1.getStreet()+""
//            + " "+location1.getPostal()+" "+location1.getCity()+" "+location1.getState()+""
//            + " "+location1.getCountryid());
//        }
        
    }
}
