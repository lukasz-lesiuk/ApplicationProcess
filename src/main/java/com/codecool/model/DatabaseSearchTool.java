package com.codecool.model;

import com.codecool.properties.propertiesDAO;
import com.codecool.properties.propertiesDAOcsv;
import com.codecool.testfiles.JavaPostgreSqlRetrieve;
import com.codecool.view.View;

import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseSearchTool {
    private String url;
    private String user;
    private String password;
    private View view;

    public DatabaseSearchTool() {
        propertiesDAO propertiesLoader = new propertiesDAOcsv();
        List<String> propertiesString = propertiesLoader.loadProperties();
        this.url = propertiesString.get(0);
        this.user = propertiesString.get(1);
        this.password = propertiesString.get(2);
        this.view = new View();

    }

    public void selectMentorsNames() {
        try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement("SELECT first_name, last_name FROM mentors LIMIT 3;");
            ResultSet rs = pst.executeQuery()) {

            view.printResultSet(rs);
//            while (rs.next()) {
//                System.out.print(rs.getInt(1));
//                System.out.print(": ");
//                System.out.println(rs.getString(2));
//            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSqlRetrieve.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
