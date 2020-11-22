package com.example.demo.service;

import com.example.demo.view.OfficeView;
import com.example.demo.view.UserView;

public interface UserService {

    public UserView getById(long id);

    public UserView listByFilter(String officeId, String firstName, String secondName, String middleName,
                                 String position, int docCode, int citizenshipCode);

    public UserView updateByPost(Long id, int officeId, String firstName, String secondName, String middleName,
                                 String position, int phone, String docName, int docNumber, String docData,
                                 int citizenshipCode, boolean isIdentified);

    public UserView saveByPost(int officeId, String firstName, String secondName, String middleName, String position,
                               int phone, int docCode, String docName, int docNumber, String docData,
                               int citizenshipCode, boolean isIdentified);

}
