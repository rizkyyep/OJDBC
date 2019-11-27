/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.CountryController;
import controllers.RegionController;
import daos.RegionDao;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import models.Region;

/**
 *
 * @author Rizky
 */
public class ManualTest {

    public static void main(String[] args) {

        String patternstr = "([a-z]+)(\\d+)";
        String samplestr = "Ab c55 24 Hello3 a.2 8a bbb00";

        Pattern pattern = Pattern.compile(patternstr);
        Matcher matcher = pattern.matcher(samplestr);

        System.out.println("pattern: " + pattern);
        System.out.println("sample:  " + samplestr);
        System.out.println();

        System.out.println("subpatterns in matches: ");
        while (matcher.find()) {
            System.out.println(matcher.group()
                    + "\tfirst: " + matcher.group(1) + ", second:" + matcher.group(2));
        }

//      CRUD COUNTRY
        CountryController countryController = new CountryController();
//      CRUD YANG DIPANGGIL MELALUI CONTROLLER
        RegionController regionController = new RegionController();

        // insert data region
//        System.out.println(regionController.create("12", "reg baru"));
        // update data region
//        System.out.println(regionController.update("12", "Batavia"));
        // delete data region
//        System.out.println(regionController.delete("12"));
        //select all region
//        for (Region region : regionController.getAll()) {
//            System.out.println(region.getId()+" "+region.getName());
//        }
        //select by id
//        System.out.println(regionController.selectById("6").getName());
        //search region by key
//        for (Region reg : regionController.search("ca")) {
//            System.out.println(reg.getId()+" "+reg.getName());
//        }
//        Connections connections = new Connections();
//
//        System.out.println(connections.getConnection());
//        RegionDao regionDao = new RegionDao();
//        Region region = new Region();
//        
////        region.setId(5);
////        System.out.println(" "+regionDao.createRegion(new Region(5, "peta")));                       //test add new region
////        System.out.println(" "+regionDao.deleteRegion(new Region(5)));                      //test delete region
//        System.out.println(" "+regionDao.updateRegion(new Region(5, "diubah")));        //test update region
//        
////        System.out.println("");
//        
//        List<Region> regions = new ArrayList<>();                               // select all data from region
//        regions = regionDao.selectRegions();
//        for (Region reg : regions) {
//            System.out.println(reg.getId()+"-"+reg.getName());
//        }
//        System.out.println("");
//        List<Region> regionSearch = new ArrayList<>();                          //search region by id or name
//        regionSearch = regionDao.searchRegion("ame");
//        for (Region region : regionSearch) {
//            System.out.println(region.getId()+"-"+region.getName());
//        }
//        System.out.println("");
//        
//        System.out.println(regionDao.selectById(3).getName());
//        RegionController regionController = new RegionController();
//        System.out.println(regionController.create("8", "Jakarta"));
//        System.out.println(regionController.update("8", "Jkt"));
//        System.out.println(regionController.delete("7"));
//menampilkan data versi 1        
//         List<Region> regions = new ArrayList<>();                               // select all data from region
//        regions = regionDao.selectRegions();
//        for (Region reg : regions) {
//            System.out.println(reg.getId()+"-"+reg.getName());
//        }
//menampilkan data versi 2
//            for (Region region : regionController.getAll()) {
//                System.out.println(region.getId()+" "+region.getName());
//        }
//menampilkan data versi 3
//regionController.getAll().forEach((region) -> {
//    System.out.println(region.getId()+" "+region.getName());
//        });
//        
//        System.out.println(regionController.selectById("3").getName());
//        
//        for (Region region : regionController.search("si")) {
//            System.out.println(region.getId()+" "+region.getName());
//        }
    }
}
