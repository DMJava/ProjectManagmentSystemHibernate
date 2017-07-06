package com.ProjectManagmentSystem.dao;

import com.ProjectManagmentSystem.pojo.Developers;

import java.sql.SQLException;
import java.util.List;

public interface DeveloperDAO {
    //CREATE
    void add(Developers developer) throws SQLException;

    //READ
    List getAll() throws SQLException;

    //UPDATE
    void update(Developers developer) throws SQLException;

    //DELETE
    void remove(Developers developer) throws SQLException;

}
