package com.codecool.controller;

import com.codecool.model.DatabaseSearchTool;
import com.codecool.view.View;

public class Controller {
    private DatabaseSearchTool databaseSearchTool;
    private View view;

    public Controller() {
        this.databaseSearchTool = new DatabaseSearchTool();
        this.view = new View();
    }

    public void run() {
        //main app loop

        boolean shouldRun = true;

        while(shouldRun) {
            // TODO print menu
            //TODO get choice
            databaseSearchTool.selectMentorsNames();
            shouldRun = false;
        }
    }
}
