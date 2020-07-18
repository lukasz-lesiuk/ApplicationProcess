package com.codecool.controller;

import com.codecool.model.DatabaseInterfaceTool;
import com.codecool.view.View;

import java.util.List;
import java.util.Scanner;

public class Controller {
    //close it
    private Scanner scanner = new Scanner(System.in);
    private DatabaseInterfaceTool databaseInterfaceTool;
    private View view;

    public Controller() {
        this.databaseInterfaceTool = new DatabaseInterfaceTool();
        this.view = new View();
    }

    public void run() {
        //main app loop

        boolean shouldRun = true;

        while(shouldRun) {
//            if

            // TODO print menu
            //TODO get choice


            databaseInterfaceTool.modyficationQuery();
            databaseInterfaceTool.retrialQuery("SELECT * FROM mentors;");

//            databaseInterfaceTool.retrialQuery("SELECT first_name, last_name FROM mentors;");
//            databaseInterfaceTool.retrialQuery("SELECT nick_name FROM mentors WHERE city LIKE 'Miskolc';");


            shouldRun = false;
        }
    }

//    public int getOption (List<String> options) {
//
//        System.out.println("Choose coordinates, which you would like to strike");
//
//        boolean isRunning = true;
//        while (isRunning == true) {
//            String playerInput = scanner.nextLine();
//
//        }
//
//        return 0;
//    }
}
