package com.ProjectManagmentSystem.main;


import com.ProjectManagmentSystem.connection.HibernateUtil;
import com.ProjectManagmentSystem.pojo.Developers;
import com.ProjectManagmentSystem.pojo.Projects;
import com.ProjectManagmentSystem.pojo.Projects_has_developers;
import com.ProjectManagmentSystem.pojo.Skills;
import com.ProjectManagmentSystem.service.DeveloperService;
import com.ProjectManagmentSystem.service.ProjectService;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class HiberMain {
    public static void main(String[] args) throws SQLException {
        DeveloperService developerService = new DeveloperService();
        ProjectService projectService = new ProjectService();
        Projects_has_developers pHd = new Projects_has_developers();

        Skills skills = new Skills();
        skills.setSkill_name("Java");

        Projects projects = new Projects();
        projects.setProject_name("Project1");
        projects.setCost(50000);

        Developers developers = new Developers();
        developers.setDeveloper_name("Dev1");
        developers.setSalary(2000);

        Set<Developers> developersSet = new HashSet<>();
        developersSet.add(developers);
        projects.setDeveloperList(developersSet);

        Set<Projects> projectsSet = new HashSet<>();
        projectsSet.add(projects);
        developers.setProjects(projectsSet);

        developerService.add(developers);
        projectService.add(projects);

        HibernateUtil.shutdown();
    }
}
