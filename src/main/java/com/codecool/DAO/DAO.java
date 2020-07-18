package com.codecool.DAO;

import com.codecool.people.Applicant;
import com.codecool.people.Mentor;

import java.util.List;

public interface DAO {
    //load database query as object
    public Mentor pickMentor(int id);
    public Applicant pickApplicant(int id);
    public List<Mentor> GetAllMentors();
    public List<Applicant> GetAllApplicants();
}
