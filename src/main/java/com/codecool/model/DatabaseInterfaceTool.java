package com.codecool.model;

import com.codecool.properties.propertiesDAO;
import com.codecool.properties.propertiesDAOcsv;
import com.codecool.testfiles.JavaPostgreSqlRetrieve;
import com.codecool.view.View;

import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseInterfaceTool {
    private String url;
    private String user;
    private String password;
    private View view;

    public DatabaseInterfaceTool() {
        propertiesDAO propertiesLoader = new propertiesDAOcsv();
        List<String> propertiesString = propertiesLoader.loadProperties();
        this.url = propertiesString.get(0);
        this.user = propertiesString.get(1);
        this.password = propertiesString.get(2);
        this.view = new View();

    }

    public void retrialQuery(String query) {
        try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery()) {
            view.printResultSet(rs);

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSqlRetrieve.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public void modyficationQuery() {
        int id = 121;
        String first_name = "Lama";
        String last_name = "Lama";
        String nick_name = "Lama";
        int phone_number = 1234567890;
        String email = "BoatyMcboatface@coatalguard.com";
        String city = "Tybet";
        int favourite_number = 13;

        String query = "INSERT INTO mentors(id, first_name, last_name, nick_name," +
                        " phone_number, email, city, favourite_number) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";


        try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, id);
            pst.setString(2, first_name);
            pst.setString(3, last_name);
            pst.setString(4, nick_name);
            pst.setInt(5, phone_number);
            pst.setString(6, email);
            pst.setString(7, city);
            pst.setInt(8, favourite_number);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(JavaPostgreSqlRetrieve.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}



