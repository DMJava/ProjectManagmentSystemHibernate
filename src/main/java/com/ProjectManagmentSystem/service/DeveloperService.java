package com.ProjectManagmentSystem.service;

import com.ProjectManagmentSystem.connection.HibernateUtil;
import com.ProjectManagmentSystem.connection.SessionUtil;
import com.ProjectManagmentSystem.dao.DeveloperDAO;
import com.ProjectManagmentSystem.pojo.Developers;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeveloperService extends SessionUtil implements DeveloperDAO {

    @Override
    public void add(Developers developer) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(developer);
        closeTransactionSession();
    }

    @Override
    public List<Developers> getAll() throws SQLException {
        openTransactionSession();
        String sql = "SELECT * FROM DEVELOPERS";
        Session session = getSession();
        Query query = session.createSQLQuery(sql).addEntity(Developers.class);
        List<Developers> developersList = query.list();
        closeTransactionSession();
        return developersList;
    }

    @Override
    public void update(Developers developer) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.update(developer);
        closeTransactionSession();
    }

    @Override
    public void remove(Developers developer) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.delete(developer);
        closeTransactionSession();
    }
}