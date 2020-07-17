package com.codecool.properties;

import java.util.List;

public interface propertiesDAO {
    public List<String> loadProperties(String filename);
}
