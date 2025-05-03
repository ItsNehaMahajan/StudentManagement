package com.example.StudentManagement;

import jakarta.persistence.*;

@Entity
@Table(name="rcpitstd")
public class Student {

    @Id
    @Column(name="regno")
    int id;

    @Column(name="firstname")
    String firstName;

    @Column(name="lastname")
    String lastName;

    @Column(name="dept")
    String dept;


    @Column(name="email")
    String email;


    public Student(){

    }

    public Student(int id, String firstName, String lastName, String dept, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dept='" + dept + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
