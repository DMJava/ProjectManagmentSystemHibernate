package com.ProjectManagmentSystem.service;

import com.ProjectManagmentSystem.connection.SessionUtil;
import com.ProjectManagmentSystem.dao.ProjectDAO;
import com.ProjectManagmentSystem.pojo.Projects;
import org.hibernate.Query;
import org.hibernate.Session;

import java.sql.*;
import java.util.List;

public class ProjectService extends SessionUtil implements ProjectDAO {


    @Override
    public void add(Projects project) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(project);
        closeTransactionSession();
    }

    @Override
    public List<Projects> getAll() throws SQLException {
        openTransactionSession();
        Session session = getSession();
        List<Projects> projects = session.createQuery("from Projects").list();
        closeTransactionSession();
        return projects;
    }

    @Override
    public void update(Projects project) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.update(project);
        closeTransactionSession();
    }

    @Override
    public void remove(Projects project) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.delete(project);
        closeTransactionSession();
    }
}
