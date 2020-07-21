package com.codecool.controller;

import com.codecool.DAO.DAO;
import com.codecool.DAO.DAOfromPsql;
import com.codecool.model.DatabaseInterfaceTool;
import com.codecool.people.Mentor;
import com.codecool.people.Person;
import com.codecool.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    //close it
    private Scanner scanner = new Scanner(System.in);
    private DatabaseInterfaceTool databaseInterfaceTool;
    private View view;
    private DAO dao;

    public Controller() {
        this.databaseInterfaceTool = new DatabaseInterfaceTool();
        this.view = new View();
        this.dao = new DAOfromPsql();
    }

    public void run() {
        List<String> optionsList = new ArrayList<>();
        optionsList.add("Show all mentors (not working)");
        optionsList.add("Show mentors names");
        optionsList.add("Show mentors nicknames from Miskolc");
        optionsList.add("Add new mentor");
        optionsList.add("Get mentor with id 1");
        optionsList.add("Quit");

        //print name of all the people from table
        //print nickname of mentor from specified city
        //print fullname, phone of person by thier name
        //print fulname, phone of person by part of thier mail
        //insert applicant or mentor
        //delete applicant or mentor
        //update applicant or mentor field;

        boolean shouldRun = true;
        while (shouldRun == true) {
            int userChoice = getChoice(optionsList,"Choose your action:");

            if (userChoice == 1) {
//                databaseInterfaceTool.retrialQuery("SELECT * FROM mentors;");
//                databaseInterfaceTool.retrieveQueryToString("SELECT * FROM mentors;");
                List<Mentor> mentors = dao.getAllMentors();
                for (Mentor mentor: mentors) {
                    String queryResponse = mentor.printMentor();
                    view.printMessage(queryResponse);
                }
            } else if (userChoice == 2) {
                databaseInterfaceTool.retrialQuery("SELECT first_name, last_name FROM mentors;");
            } else if (userChoice == 3) {
                databaseInterfaceTool.retrialQuery("SELECT nick_name FROM mentors WHERE city LIKE 'Miskolc';");
            } else if (userChoice == 4) {
                databaseInterfaceTool.modificationQuery();
            }  else if (userChoice == 5) {
//                databaseInterfaceTool.retrieveQueryToString("SELECT * FROM mentors WHERE id = 1;");
                Mentor mentor = dao.getMentor(1);
                String queryResponse = mentor.printMentor();
                view.printMessage(queryResponse);
            }  else if (userChoice == 6) {
                shouldRun = false;
            }
        }
    }

    private int getChoice (List<String> optionsList, String message) {
        boolean correctOption = false;
        int choice = 999;

        Scanner input = new Scanner(System.in);

        while (!correctOption) {
            view.clear();
            view.printOptions(optionsList, message);
            String StringChoice = input.nextLine();
            choice = validateAsInt(StringChoice);
            if (choice <= optionsList.size()) {
                correctOption = true;
            }
            return choice;
        }

        input.close();
        return choice;
    }

    private int validateAsInt (String inputValue) {

        try {
            return  Integer.parseInt(inputValue);
        } catch (NumberFormatException e) {
            view.printMessage("Value is not number, returning 999");
            return 999;
        }
    }
}
