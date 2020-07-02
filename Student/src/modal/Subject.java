package modal;

public class Subject {
    private static int id = 10000000;
    private int subjectID;
    private String subjectName;
    private int TotalLession;
    private String subjectType;

    public Subject() {
    }

    public Subject(int subjectID, String subjectName, int totalLession, String subjectType) {
        if (subjectID == 0){
            this.subjectID = id++;
        }else {
            this.subjectID = subjectID;
        }
        this.subjectName = subjectName;
        TotalLession = totalLession;
        this.subjectType = subjectType;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Subject.id = id;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getTotalLession() {
        return TotalLession;
    }

    public void setTotalLession(int totalLession) {
        TotalLession = totalLession;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID=" + subjectID +
                ", subjectName='" + subjectName + '\'' +
                ", TotalLession=" + TotalLession +
                ", subjectType='" + subjectType + '\'' +
                '}';
    }
}
