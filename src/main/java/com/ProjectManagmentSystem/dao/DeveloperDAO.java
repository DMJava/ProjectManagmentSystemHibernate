package com.ProjectManagmentSystem.dao;

import com.ProjectManagmentSystem.pojo.Developers;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pc on 20.06.2017.
 */
public interface DeveloperDAO {
    //CREATE
    void add(Developers developer) throws SQLException;

    //READ
    List<Developers> getAll() throws SQLException;

    //UPDATE
    void update(Developers developer) throws SQLException;

    //DELETE
    void remove(Developers developer) throws SQLException;

}
