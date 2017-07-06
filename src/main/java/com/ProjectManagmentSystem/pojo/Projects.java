package com.ProjectManagmentSystem.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int project_id;
    @Column(name = "project_name")
    private String project_name;
    @Column(name = "cost")
    private int cost;
    @ManyToMany(mappedBy = "projects")
    private Set<Developers> developerList;

    public Projects() {

    }

    public Projects(int project_id, String project_name, int cost, Set<Developers> developerList) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.cost = cost;
        this.developerList = developerList;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Set<Developers> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(Set<Developers> developerList) {
        this.developerList = developerList;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
