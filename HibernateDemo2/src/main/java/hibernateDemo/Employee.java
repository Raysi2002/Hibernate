package hibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "EID")
    private int eid;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "SEX")
    private char sex;
    @Column(name = "SALARY")
    private long salary;

    public Employee() {

    }
    public Employee(int eid, String name, String designation,char sex, long salary){
        this.eid = eid;
        this.name = name;
        this.designation = designation;
        this.sex = sex;
        this.salary = salary;

    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
