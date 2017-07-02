package com.ProjectManagmentSystem.dao;

import com.ProjectManagmentSystem.pojo.Projects_has_developers;

import java.sql.SQLException;
import java.util.List;

public interface Projects_has_developersDAO {

    //CREATE
    void add(Projects_has_developers projects_has_developers) throws SQLException;

    //READ
    List<Projects_has_developers> getAll() throws SQLException;

    //UPDATE
    void update(Projects_has_developers projects_has_developers) throws SQLException;

    //DELETE
    void remove(Projects_has_developers projects_has_developers) throws SQLException;
}
