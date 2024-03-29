/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import tools.Connections;

/**
 *
 * @author Rizky
 */
public class RegionReport extends javax.swing.JInternalFrame {
    private Connection connection;
    /**
     * Creates new form RegionReport
     */
    public RegionReport() {
        initComponents();
        this.connection = new Connections().getConnection();
        report();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void report(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            Connection koneksi = this.connection;
//            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "rizky");
            JasperDesign jd = JRXmlLoader.load("./src/reports/ReportRegion.jrxml");
            JasperReport report = JasperCompileManager.compileReport(jd);
            JasperPrint jasperPrint = JasperFillManager.fillReport(report, null, koneksi);
            JRViewer viewer = new JRViewer(jasperPrint);
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            c.add(viewer);
//            File report = new File("./src/reports/ReportRegion.jrxml");
//            JasDes = JRXmlLoader.load(report);
//            JasperReport JasRep = JasperCompileManager.compileReport(JasDes);
//            JasperPrint JasPri = JasperFillManager.fillReport(JasRep, param, konek);
//            JasperViewer.viewReport(JasPri, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
