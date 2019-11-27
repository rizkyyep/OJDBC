package tools;

import controllers.EmployeeController;
import controllers.RegionController;
import daos.EmployeeDao;
import daos.RegionDao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Employee;
import models.Region;

/**
 *
 * @author Elsa
 */
public class ManualTestEmployee {

    public static void main(String[] args) throws ParseException {
        Connections connections = new Connections();
        System.out.println(connections.getConnection());
        RegionDao regionDao = new RegionDao();
        List<Region> regions = new ArrayList<>();

        /**
         * Fungsi insert dengan 2 opsi datanya diambil dari user sehingga
         * inputan method menjadi String
         */
        //Opsi 1 Yang mengambil nilai dari package Daos
        // System.out.println(" " + regionDao.createRegion(new Region(8, "Jakarta")));
        //Opsi 2 Insert yang yang mengambil method dari package Controller
        //RegionController regionController = new RegionController();
        //System.out.println(regionController.create("10", "Central Park"));
        //sampai disini
        //MASIH SALAH
//        EmployeeController employeeController=new EmployeeController();
//        System.out.println(employeeController.create("Elsa", "Kartini", "ELSA", "12", "12-11-2019", "JOB", "200", "0", "100", "90", "10"));        
//        EmployeeController employeeGetAll = new EmployeeController();
//        for (Employee employee : employeeGetAll.getAll()) {
//            System.out.println(employee.getId() + " " + employee.getFirstname());
//        }
//        
        /**
         * Eksekusi Update dengan menggunakan 2 opsi
         */
        //Opsi 1 Cara yang Standart yang mengambil nilai dari Package Dao
        //System.out.println(" "+regionDao.updateRegion(new Region(10, "DKI Jakarta")));
        //Opsi 2 nilai diambil dari user sehingga nilai ID STring dan diparse ke Integer yang mengambil dari Package Controller
//        RegionController regionController = new RegionController();
//        System.out.println(regionController.update("10", "Neo Soho"));
        //sampai disini
        /**
         * Eksekusi fungsi delete dengan menggunakan 2 opsi
         */
        //Opsi 1 yang menggunakan method dari package Daos
        //System.out.println(regionDao.deleteRegion(6));
        //Opsi 2 yang menggunakan method dari package Controller
        //  RegionController regDelete=new RegionController();
        // System.out.println(regDelete.delete("10"));
        //sampai disini
        /**
         * Eksekusi selectRegion tampil semua dengan menggunakan banyak opsi
         *
         */
        //Opsi 1 menggunkan method dari package Daos
//        regions = regionDao.selectRegions();
//        for (Region region : regions) {
//            System.out.println(region.getId() + " " + region.getName());
//        }
        //Opsi 2 yang menggunakan method dari package Controller
//        RegionController regionGetAll = new RegionController();
//        for (Region region : regionGetAll.getAll()) {
//            System.out.println(region.getId() + " " + region.getName());
//
//        }
        //Opsi 3 yang menggunakan method dari package Controller + function
//        regionGetAll.getAll().forEach((region) -> {
//            System.out.println(region.getId() + " " + region.getName());
//        });
        //sampai disini
        /**
         * Eksekusi search dengan menggunakan 2 opsi
         *
         */
        //Region rsDao = new Region();
        //List<Region> regionCari = new ArrayList<>();
        //Opsi 1 dengan tes inputan String
        //regionCari = rsDao.searchRegion("Asia");
        //  for (Region region : regionCari) {
        //      System.out.println(region.getId() + " " + region.getName());
        //  }
        //Opsi 2 dengan menggunakan method dari package Controller
//        RegionController region=new RegionController();
//        List<Region> regSearch=new ArrayList<>();
//        regSearch=region.search("Tanju");
//        for (Region region1 : regSearch) {
//            System.out.println(region1.getId()+". "+region1.getName());
//        }
        // sampai disini
        /**
         * Eksekusi SelectbyId atau getById
         */
        //Opsi 1 dengan menggunakan package dari Daos
//        rsDao=regionDao.selectById(2);
//        System.out.println(rsDao.getId()+" "+rsDao.getName());
        //Opsi 2 dengan  menggunakan package Controller
        // RegionController regionById = new RegionController();
        // System.out.println(regionById.getById("6").getName());
        //Sampai disini
        /*
        Tampil tanggal Date --> String
         */
//       Date todaysDate = new Date();
//       DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//       try
//       {
//           //format() method Formats a Date into a date/time string. 
//           String testDateString = df.format(todaysDate);
//           System.out.println("String in dd/MM/yyyy format is: " + testDateString);
//
//       }
//       catch (Exception ex ){
//          System.out.println(ex);
//       }
        //Sampai disini
//        EmployeeController employeeController = new EmployeeController();
//        System.out.println(employeeController.update("69", "Elsa", "Kartini", "@mail", "12345", "22/11/2019", "Development", "10000", "4000", "100", "100"));
//        
//        EmployeeController employeeGetAll = new EmployeeController();
//        for (Employee employee : employeeGetAll.getAll()) {
//            System.out.println(employee.getId());
//       }
//CEK DEFAULT TIME
//SimpleDateFormat format = new SimpleDateFormat();
//        System.out.println(format.toLocalizedPattern());
//        System.out.println(format.toPattern());
//        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        String dateString="2019-11-21";
//        try {
//            Date date = dateFormat.parse(dateString);
//            System.out.println(date);
//            System.out.println(dateFormat.format(date));
//        } catch (Exception e) {
//        }
        EmployeeController employeeController = new EmployeeController();
        //System.out.println(employeeController.update("69", "Elsa", "Kartini", "@mail", "12345", "2019-11-22", "Development", "10000", "4000", "100", "100"));
       // System.out.println(employeeController.create("Elsa", "Kartini", "ELSA", "1023", "2019-11-22", "AD_VP", "100", "0", "102", "90", "10"));
        System.out.println(employeeController.create("adsf", "adsf", "adf", "121212", "2018-12-12", "AD_VP", "10000", "0", "101", "80", "12"));
        
//       System.out.println(employeeController.create("Elsa", "Kartini", "LALA", "12121", 
//               "2019-11-22", "AD_VP", "100", "0", "100", "60", "11"));

    }
}
