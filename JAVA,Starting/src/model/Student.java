package model;

import java.io.Serializable;
import java.util.Objects;

public class Student extends Person implements Comparable<Student>  {
    private String IDStudent;
    private String NameUniverse;
    private double avg;
    public Student()
    {

    }
    public Student(String IDStudent, String nameUniverse, float avg) {
        this.IDStudent = IDStudent;
        NameUniverse = nameUniverse;
        this.avg = avg;
    }

    public Student(String name, int age, String address, String IDStudent, String nameUniverse, float avg) {
        super(name, age, address);
        this.IDStudent = IDStudent;
        NameUniverse = nameUniverse;
        this.avg = avg;
    }

    public Student(int age, String IDStudent, String nameUniverse, float avg) {
        super(age);
        this.IDStudent = IDStudent;
        NameUniverse = nameUniverse;
        this.avg = avg;
    }

    public String getIDStudent() {
        return IDStudent;
    }

    public void setIDStudent(String IDStudent) {
        this.IDStudent = IDStudent;
    }

    public String getNameUniverse() {
        return NameUniverse;
    }

    public void setNameUniverse(String nameUniverse) {
        NameUniverse = nameUniverse;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public void Out() {
        super.Out();
        System.out.println("ID Student: " + IDStudent);
        System.out.println("Name Universe: " + NameUniverse );
        System.out.println("DTB: " +avg);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.avg, avg) == 0 &&
                Objects.equals(IDStudent, student.IDStudent) &&
                Objects.equals(NameUniverse, student.NameUniverse);
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "IDStudent='" + IDStudent + '\'' +
                ", NameUniverse='" + NameUniverse + '\'' +
                ", avg=" + avg +
                '}';
    }
    public void Show(Student s){
        System.out.println(s);
    }

    @Override
    public int compareTo(Student o) {
        String names = getName().substring(getName().lastIndexOf(" "));
        return o.getName().compareTo(getName()); // sắp xếp giảm dần dần , vì getname() - o.getName() > 0
    }

}
