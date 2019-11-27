/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Country;
import models.Location;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rizky
 */
public class LocationControllerIT {
    
    public LocationControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class LocationController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String id = "3500";
        String street = "testing";
        String postal = "123456";
        String city = "testing";
        String state = "testing";
        String country = "UK";
        LocationController instance = new LocationController();
        String expResult = "Success to create new location";
        String result = instance.create(id, street, postal, city, state, country);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LocationController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String id = "3500";
        String street = "testing edit";
        String postal = "121212";
        String city = "testing edit";
        String state = "testing edit";
        String country = "IN";
        LocationController instance = new LocationController();
        String expResult = "Success Update Data Location";
        String result = instance.update(id, street, postal, city, state, country);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class LocationController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "3500";
        LocationController instance = new LocationController();
        String expResult = "Success Delete Data Location";
        String result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class LocationController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        LocationController instance = new LocationController();
        List<Location> expResult = new ArrayList<Location>();
        List<Location> result = instance.getAll();
        assertEquals(expResult.contains(this), result.contains(this));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of selectId method, of class LocationController.
     */
    @Test
    public void testSelectId() {
        System.out.println("selectId");
        String id = "3300";
        LocationController instance = new LocationController();
        Location expResult = new Location(3300);
        Location result = instance.selectId(id);
        assertEquals(expResult.getId(), result.getId());
//        assertEquals(expResult.getId(), result.getId());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of searchLoc method, of class LocationController.
     */
    @Test
    public void testSearchLoc() {
        System.out.println("searchLoc");
        String key = "United";
        LocationController instance = new LocationController();
        List<Location> expResult = new ArrayList<Location>();
        List<Location> result = instance.searchLoc(key);
//        assertArrayEquals(expResult, result);
        assertEquals(expResult.contains(this), result.contains(this));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
