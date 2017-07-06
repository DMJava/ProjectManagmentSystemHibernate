package com.ProjectManagmentSystem.service;

import com.ProjectManagmentSystem.connection.SessionUtil;
import com.ProjectManagmentSystem.dao.DeveloperDAO;
import com.ProjectManagmentSystem.pojo.Developers;
import org.hibernate.Query;
import org.hibernate.Session;

import java.sql.*;
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
        Session session = getSession();
        List<Developers> developers = session.createQuery("from Developers ").list();
        closeTransactionSession();
        return developers;
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