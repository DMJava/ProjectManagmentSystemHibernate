package com.ProjectManagmentSystem.pojo;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "developers")
public class Developers {
    @Id
    private int developer_id;
    private String developer_name;
    private int salary;
    @OneToMany(cascade = CascadeType.ALL)
    private Skills skills;
    private Set<Projects> projects;

    public Developers() {

    }

    public Developers(int developer_id, String developer_name, int salary, Skills skills, Set<Projects> projects) {
        this.developer_id = developer_id;
        this.developer_name = developer_name;
        this.salary = salary;
        this.skills = skills;
        this.projects = projects;
    }

    public int getDeveloper_id() {
        return developer_id;
    }

    public void setDeveloper_id(int developer_id) {
        this.developer_id = developer_id;
    }

    public String getDeveloper_name() {
        return developer_name;
    }

    public void setDeveloper_name(String developer_name) {
        this.developer_name = developer_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Set<Projects> getProjects() {
        return projects;
    }

    public void setProjects(Set<Projects> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Developers{" +
                "developer_id=" + developer_id +
                ", developer_name='" + developer_name + '\'' +
                ", salary=" + salary +
                ", skills=" + skills +
                '}';
    }
}