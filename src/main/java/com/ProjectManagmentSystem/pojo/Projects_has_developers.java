package com.ProjectManagmentSystem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class Projects_has_developers {

    private int proj_id;
    private int dev_id;

    public Projects_has_developers() {

    }

    public int getProj_id() {
        return proj_id;
    }

    public void setProj_id(int proj_id) {
        this.proj_id = proj_id;
    }

    public int getDev_id() {
        return dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Projects_has_developers that = (Projects_has_developers) o;

        if (proj_id != that.proj_id) return false;
        return dev_id == that.dev_id;
    }

    @Override
    public int hashCode() {
        int result = proj_id;
        result = 31 * result + dev_id;
        return result;
    }

    @Override
    public String toString() {
        return "Projects_has_developers{" +
                "proj_id=" + proj_id +
                ", dev_id=" + dev_id +
                '}';
    }
}
