/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDao;
import java.util.List;
import models.Region;

/**
 *
 * @author Rizky
 */
public class RegionController {

    private RegionDao dao;

    public RegionController() {
        this.dao = new RegionDao();
    }

    public RegionController(RegionDao dao) {
        this.dao = dao;
    }
    
    public String create(String id, String name ){
        
          //ini prosedur yang lebih panjang
//        Region region = new Region();
//        int ids = Integer.parseInt(id);
//        region.setId(ids);
//        region.setName(name);

//          String message = "Failed to Create Region";
//        ini untuk prosedur lebih singkat dari yang diatas
//        if (this.dao.createRegion(new Region(Integer.parseInt(id), name))){
//            message = "Success to Create Region";
//        }
//        return message;


        return this.dao.createRegion(new Region(Integer.parseInt(id), name)) ?
                "Success to create region" : "Failed to create region"; //ini return yang paling simple
    }
    
    public String update(String id, String name){
        return this.dao.updateRegion(new Region(Integer.parseInt(id), name)) ?
                "Success to Update Region" : "Failed to update region";
    }
    
    public String delete(String id){
        return this.dao.deleteRegion(new Region(Integer.parseInt(id))) ?
                "Data Deleted!" : "Data Failed To Deleted";
    }
    
    public List<Region> getAll(){
        return this.dao.selectRegions();
    }
    
    public Region selectById(String id){
        return this.dao.selectById(Integer.parseInt(id));
    }
    
    public List<Region> search(String key){
        return this.dao.searchRegion(key);
    }

   
}
