package com.codecool.DAO;

import com.codecool.people.Applicant;
import com.codecool.people.Mentor;
import com.codecool.people.Person;

import java.util.List;

public interface DAO {
    //load database query as object

    //TODO change to Person, merge 2 methods
    public Mentor pickMentor(int id);
//    public Applicant pickApplicant(int id);
    public List<Mentor> GetAllMentors();
//    public List<Applicant> GetAllApplicants();
    public void updateProperty(Person target, String propertyName);
    public void insertNewPerson(Person newPerson, String tableName);
    public void deletePerson(Person person, String tableName);
}
