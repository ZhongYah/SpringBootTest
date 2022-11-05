package com.example.demo;

import java.sql.Timestamp;

public class Student {
    Integer id;
    String name;
    Double score;

    Boolean graduate;

    Timestamp create_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore(){return score;}
    public void setScore(Double score){this.score = score;}

    public Boolean isGraduate(){return graduate;}
    public void setGraduate(Boolean graduate){this.graduate = graduate;}

    public Timestamp getCreate_date(){return create_date;}
    public void setCreate_date(Timestamp create_date){this.create_date = create_date;}


}
