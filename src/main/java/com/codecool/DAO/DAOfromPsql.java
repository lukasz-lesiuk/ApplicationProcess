package com.codecool.DAO;

import com.codecool.model.DatabaseInterfaceTool;
import com.codecool.people.Applicant;
import com.codecool.people.Mentor;
import com.codecool.people.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAOfromPsql implements DAO {
    DatabaseInterfaceTool accessTool = new DatabaseInterfaceTool();

    @Override
    public Mentor getMentor(int id) {
        String retrievedString = accessTool.retrieveQueryToString("SELECT * FROM mentors WHERE id = " + id + " ;");
        List<String> attributesList = new ArrayList<>(Arrays.asList(retrievedString.split(", ")));
        //id retrieval unnecessary since id was declaretd at the start
        String firstName = attributesList.get(1);
        String lastName = attributesList.get(2);
        String nickName = attributesList.get(3);
        String phoneNo = attributesList.get(4);
        String email = attributesList.get(5);
        String city = attributesList.get(6);
        Integer favNum = Integer.parseInt(attributesList.get(7));
//        int favNum = 3;

        return new Mentor(id, firstName, lastName, nickName, phoneNo, email, city, favNum);
    }

    @Override
    public List<Mentor> getAllMentors() {
        int peopleQty = getRecordsQty("mentors");
        List<Mentor> peopleList = new ArrayList<Mentor>();

        for (int i = 0; i < peopleQty; i++) {
            peopleList.add(getMentor(i));
        }
        return peopleList;
    }

    @Override
    public void updateProperty(Person target, String propertyName) {

    }

    @Override
    public void insertNewPerson(Person newPerson, String tableName) {

    }

    @Override
    public void deletePerson(Person person, String tableName) {

    }

    private int getRecordsQty(String tableName) {
        String retrievedString = accessTool.retrieveQueryToString("SELECT COUNT(*) FROM " + tableName + ";");
        return Integer.parseInt(retrievedString);
    }

}
