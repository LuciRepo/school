package com.fastrackit;

import java.util.Date;

public final class Student extends Person {


    public Student() {
        super(name);
    }

    // override
    public void setStudentName(String name) {
        this.name = "Student: " + name;
        super.setName("Student: "+ name);
        System.out.println(this.name);


    }


}
