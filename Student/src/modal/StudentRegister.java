package modal;

public class StudentRegister {
    private Student student;
    private Subject subject;
    private String datetime;
    private int TotalRegister;

    public StudentRegister() {
    }

    public StudentRegister(Student student, Subject subject, String datetime, int totalRegister) {
        this.student = student;
        this.subject = subject;
        this.datetime = datetime;
        TotalRegister = totalRegister;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getTotalRegister() {
        return TotalRegister;
    }

    public void setTotalRegister(int totalRegister) {
        TotalRegister = totalRegister;
    }

    @Override
    public String toString() {
        return "StudentRegister{" +
                "studentID=" + student.getStudentID() +
                ",student=" + student.getFullname() +
                ", subjectID=" + subject.getSubjectID() +
                ", subject=" + subject.getSubjectName() +
                ", datetime='" + datetime + '\'' +
                ", TotalRegister=" + TotalRegister +
                '}';
    }
}
