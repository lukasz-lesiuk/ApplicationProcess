package com.codecool.properties;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class propertiesDAOcsv implements propertiesDAO {
    @Override
    public List<String> loadProperties() {

//        String filename = "properties.csv";
//
//        BufferedReader br = null;
//        String line = "";
//        String cvsSplitBy = ",";
//
//        try {
//            br = new BufferedReader(new FileReader(filename));
//            while ((line = br.readLine()) != null) {
//                // use comma as separator
//                List<String> propertiesList = Arrays.asList(line.split(cvsSplitBy));
//                System.out.println(propertiesList.get(0) + " " + propertiesList.get(1) + " " + propertiesList.get(2));
//                }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        List<String> tempArraylist = new ArrayList<String>();
        tempArraylist.add("jdbc:postgresql://localhost:5432/application_process_db");
        tempArraylist.add("postgres");
        tempArraylist.add("sMuGa1@1");

        return tempArraylist;
    }
}
