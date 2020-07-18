package com.codecool.testfiles;

//package com.zetcode;
import com.codecool.properties.propertiesDAO;
import com.codecool.properties.propertiesDAOcsv;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSqlVersion {

    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("org.postgresql.Driver");

//        propertiesDAO propertiesLoader = new propertiesDAOcsv();
//        propertiesLoader.loadProperties();

        String url = "jdbc:postgresql://localhost:5432/application_process_db";
        String user = "postgres";
        String password = "sMuGa1@1";


        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT VERSION()")) {

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSqlVersion.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
