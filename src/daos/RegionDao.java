/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;
import tools.Connections;

/**
 *
 * @author Rizky
 */
public class RegionDao {

    private Connection connection;

    /**
     * mendeklarasikan koneksi dari tools Connections.java
     */
    public RegionDao() {
        this.connection = new Connections().getConnection();
    }

    /**
     * mendeklarasikan koneksi dari tools Connections.java
     */
    public RegionDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * fungsi menampilkan all data region
     *
     * @return all data region
     */
    public List<Region> selectRegions() {
        List<Region> regions = new ArrayList<>();
        String query = "SELECT * FROM REGIONS ORDER BY REGION_ID";

        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Region region = new Region();
                region.setId(rs.getInt(1));
                region.setName(rs.getString("region_name"));
                regions.add(region);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return regions;
    }

    /**
     * menambahkan data region ke dalam db
     *
     * @return data baru dari region (int id, string name)
     */
//    public boolean createRegion(int id, String name) {
//        String query = "INSERT INTO REGIONS (region_name, region_id) VALUES (?,?)";
//        return executeCreateUpdate(query, name, id);
//    }
    public boolean createRegion(Region region) {
        String query = "INSERT INTO REGIONS (region_name, region_id) VALUES (?,?)";
        return executeCreateUpdate(query, region);
    }

    /**
     * fungsi update data region
     *
     * @param id field id di table region
     * @param name field name di table region
     * @return data baru di table region
     */
//    public boolean updateRegion(int id, String name) {
//        String query = "UPDATE REGIONS SET region_name=? WHERE region_id=?";
//        return executeCreateUpdate(query, name, id);
//    }
     public boolean updateRegion(Region region) {
        String query = "UPDATE REGIONS SET region_name=? WHERE region_id=?";
        return executeCreateUpdate(query, region);
    }

    /**
     * fungsi menghapus data di table region
     *
     * @param id field id yang menjadi parameter yg akan dihapus datanya
     * @return menghapus data sesuai id
     */
    public boolean deleteRegion(Region region) {
        String query = "DELETE FROM REGIONS WHERE region_id=?";
        return executeCreateUpdate(query, region);
    }

    /**
     * fungsi mencari data region sesuai dengan id
     *
     * @param id field id yang menjadi parameter yg akan ditampilkan datanya
     * @return menampilkan data id
     */
    public Region selectById(int id) {
        Region reg = new Region();
        String query = "SELECT * FROM REGIONS WHERE region_id=?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reg.setId(rs.getInt(1));
                reg.setName(rs.getString("region_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reg;
    }

    /**
     * fungsi pencarian data region sesuai keluaran data.
     *
     * @param key parameter, bisa berupa int id ataupun string name. ditentukan
     * dengan query OR pada WHERE CLAUSES
     * @return menampilkan data sesuai inputan
     */
    public List<Region> searchRegion(String key) {
        List<Region> regions = new ArrayList<>();
        String query = "SELECT * FROM REGIONS WHERE region_id LIKE ? OR region_name LIKE ?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, "%" + key + "%");
            ps.setString(2, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Region region = new Region();
                region.setId(rs.getInt(1));
                region.setName(rs.getString(2));
                regions.add(region);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return regions;
    }

    /**
     * fungsi untuk eksekusi perintah create, update, dan delete pada data locations.
     * @param query mengambil perintah query sebelumnya yang ada di function create,
     * update, ataupun delete
     * @param region parameter yang diambil dari model region.java
     * @return mengembalikan nilai T/F dari eksekusi query tsb.
     */
    public boolean executeCreateUpdate(String query, Region region) {
//    public boolean executeCreateUpdate(String query, String name, int id) {
        boolean result = false;
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            if (region.getName() == null){
                ps.setInt(1, region.getId());
            }else {
                ps.setString(1, region.getName());
                ps.setInt(2, region.getId());
            }
            ps.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
