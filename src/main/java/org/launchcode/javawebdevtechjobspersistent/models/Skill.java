package org.launchcode.javawebdevtechjobspersistent.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @Length(min = 3, max = 300, message = "Description should be less than 3000 characters.")
    private String description;

    //no arg constructor
    public Skill() {};

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    //getter
    public List<Job> getJobs() {
        return jobs;
    }

    //    Do we need to be able to add jobs?
//    public void addJob(Job job) {
//        this.jobs.add(job);
//    }

}