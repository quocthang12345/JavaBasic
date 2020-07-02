package modal;

public class Student {
    private static int id = 10000000;
    private int studentID;
    private String fullname;
    private String address;
    private int phonenumber;

    public Student() {
    }

    public Student(int studentID, String fullname, String address, int phonenumber) {
        if (studentID == 0){
            this.studentID = id++;
        }else {
            this.studentID = studentID;
        }
        this.fullname = fullname;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
