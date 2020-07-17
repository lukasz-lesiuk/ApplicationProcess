package com.codecool.properties;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class propertiesDAOtxt implements propertiesDAO {
    @Override
    public List<String> loadProperties(String filename) {
        String result = ""''
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classloader.getResourceAsStream(filename);

            Scanner s = new Scanner(inputStream).useDelimiter("\\A");
            result = s.hasNext() ? s.next() : "";
        } catch(FileNotFoundException e) {

        }
        System.out.println(result);
        return null;
    }
}
