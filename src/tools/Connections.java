/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Rizky
 */
public class Connections {

    private Connection connection = null;
    
    /**
     * membuat koneksi untuk ke database dari db oracle
     * @return connection dari this.connection
     */
    public Connection getConnection() {
        try {
            OracleDataSource dataSource = new OracleDataSource();
            dataSource.setDriverType("thin"); //set driver type
            dataSource.setServerName("localhost"); //set server name
            dataSource.setPortNumber(1521); //set port number
            dataSource.setServiceName("XE"); //set server name
            dataSource.setDatabaseName("HR"); //set database name
            dataSource.setUser("system"); //set username
            dataSource.setPassword("rizky"); //set password
            
            this.connection = dataSource.getConnection();
            this.connection.createStatement().execute("alter session set current_schema = HR");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return this.connection;
    }
    
}
