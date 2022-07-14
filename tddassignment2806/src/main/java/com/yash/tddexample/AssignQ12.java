package com.yash.tddexample;


public class AssignQ12 {

    String name;
    String lastname;
    public AssignQ12(String name, String lastname) {

        this.name = name;
        this.lastname = lastname;
    }


    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssignQ12 that = (AssignQ12) o;
        return name.equals(that.name) &&
          lastname.equals(that.lastname);
    }

    }


