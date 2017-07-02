package com.ProjectManagmentSystem.dao;

import com.ProjectManagmentSystem.pojo.Projects;

import java.sql.SQLException;
import java.util.List;

public interface ProjectDAO {

    //CREATE
    void add(Projects project) throws SQLException;

    //READ
    List<Projects> getAll() throws SQLException;

    //UPDATE
    void update(Projects project) throws SQLException;

    //DELETE
    void remove(Projects project) throws SQLException;
}
