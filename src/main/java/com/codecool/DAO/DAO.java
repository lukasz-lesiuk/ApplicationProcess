package com.codecool.DAO;

import com.codecool.people.Applicant;
import com.codecool.people.Mentor;

public interface DAO {
    //load database query as object
    public Mentor pickMentor(int id);
    public Applicant pickApplicant(int id);
}
