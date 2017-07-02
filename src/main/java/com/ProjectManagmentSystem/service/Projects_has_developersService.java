package com.ProjectManagmentSystem.service;


import com.ProjectManagmentSystem.connection.SessionUtil;
import com.ProjectManagmentSystem.dao.Projects_has_developersDAO;
import com.ProjectManagmentSystem.pojo.Developers;
import com.ProjectManagmentSystem.pojo.Projects_has_developers;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Projects_has_developersService extends SessionUtil implements Projects_has_developersDAO {

    @Override
    public void add(Projects_has_developers projects_has_developers) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(projects_has_developers);
        closeTransactionSession();
    }

    @Override
    public List<Projects_has_developers> getAll() throws SQLException {
        openTransactionSession();
        String sql = "SELECT * FROM PROJECTS_HAS_DEVELOPERS";
        Session session = getSession();
        Query query = session.createSQLQuery(sql).addEntity(Projects_has_developers.class);
        List<Projects_has_developers> pHd = query.list();
        closeTransactionSession();
        return pHd;
    }

    @Override
    public void update(Projects_has_developers projects_has_developers) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.update(projects_has_developers);
        closeTransactionSession();
    }

    @Override
    public void remove(Projects_has_developers projects_has_developers) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.delete(projects_has_developers);
        closeTransactionSession();
    }
}
