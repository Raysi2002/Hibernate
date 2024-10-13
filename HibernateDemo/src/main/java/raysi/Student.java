package raysi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @Column(name = "Sid")
    private int sid;

    @Column (name = "Name")
    private String name;

    @Column (name = "Grade")
    private double grade;
    public Student(){

    }
    public Student( int sid, String name, double grade){
        this.sid = sid;
        this.name = name;
        this.grade = grade;
    }

    //    Getters
    public int getSid(){
        return sid;
    }
    public String getName(){
        return name;
    }
    public double getGrade(double v){
        return grade;
    }

    //    Setters
    public void setSid(int sid){
        this.sid = sid;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }


}
