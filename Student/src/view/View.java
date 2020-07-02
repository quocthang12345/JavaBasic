package view;

import control.DataControl;
import control.UtilityControl;
import modal.Student;
import modal.StudentRegister;
import modal.Subject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {
    public static void main(String[] args) {
        int choose = 0;
        Scanner scanner = new Scanner(System.in);
        DataControl control = new DataControl();
        UtilityControl utility = new UtilityControl();
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<StudentRegister> studentRegisters = new ArrayList<>();
        var FileStudent = "STUDENT.DAT";
        var FileSubject = "SUBJECT.DAT";
        var FileSR = "STUDENTREGISTER.DAT";
        boolean IsCheckIDSuject = false;
        boolean IsCheckIDStudent = false;
        boolean IsRegisterEnough = false;
        do {
            System.out.println("____________________________________MENU CHỨC NĂNG_____________________________________");
            System.out.println("1. Thêm Subject vào file ");
            System.out.println("2. In danh sách Subject từ file ");
            System.out.println("3. Thêm Student vào file ");
            System.out.println("4. In danh sách Student vào file ");
            System.out.println("5. Thông tin đăng kí khóa học ");
            System.out.println("0. Thoát khỏi chương trình ");
            System.out.println(" Lựa chọn của bạn ? ");
            choose = scanner.nextInt();
            scanner.nextLine(); // để xóa dòng của số
            switch (choose){
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi, Hẹn gặp lại <3");
                    break;
                case 1:
//                    if (!IsCheckIDSuject){
//                        CheckIDSubject(control,FileSubject);
//                        IsCheckIDSuject = true;
//                    }

                    String[] type = {"General","Specializations Base","Compulsory Majors", "Specialization Options"};

                    System.out.println("Nhập tên của môn học : ");
                    String subjectName = scanner.nextLine();

                    System.out.println("Nhập số lượng bài học: ");
                    int totalLesson = scanner.nextInt();

                    System.out.println("Nhập môn học: ");
                    int x;
                    String subjectType;
                    do {
                        System.out.println("1.General\t2.Specializations Base\t3.Compulsory Majors\t4.Specialization Options");
                        System.out.println("Nhập 0 để bỏ qua");
                        x = scanner.nextInt();
                    }while(x < 1 || x > 4);
                    subjectType = type[x-1];

                    Subject subject = new Subject(0,subjectName,totalLesson,subjectType);
                    control.WriteSubjectToFile(FileSubject,subject);
                    break;
                case 2:
                    subjects = control.ReadSubjectToFile(FileSubject);
                    showInfoSubject(subjects);
                    break;
                case 3:
                    if (!IsCheckIDStudent){
                        CheckIDStudent(control,FileStudent);
                        IsCheckIDStudent = true;
                    }
                    System.out.println("Nhập họ và tên của học sinh: ");
                    String fullname = scanner.nextLine();
                    System.out.println("Nhập địa chỉ của học sinh: ");
                    String address = scanner.nextLine();
                    System.out.println("Nhập số điện thoại của học sinh: ");
//                    String pattern = "[0-9]{3}-[0-9]{3}-[0-9]{3}";
//                    Pattern pattern1 = Pattern.compile(pattern);
//                    String phone = scanner.nextLine();
//                    Matcher matcher = pattern1.matcher(phone);
//                    do {
//                        if (matcher.find()) break;
//                        else System.out.println("Moi nhap lai");
//                    }while (true); Bài yêu cầu nhập sđt mẫu xxx-xxx-xxx
                    int phoneNumber = scanner.nextInt();
                    Student student = new Student(0,fullname,address,phoneNumber);
                    control.WriteStudentToFile(FileStudent,student);
                    break;
                case 4:
                    students = control.ReadStudentToFile(FileStudent);
                    ShowInfoStudent(students);
                    break;
                case 5:
                    /*
                    Chức năng 5: Khó nhất
                    B1: Đọc ra danh sách của student, subject, Studentregister
                    B2: Chọn một bạn từ danh sách student để cho phép đăng kí học. Nếu đủ số môn đăng kí thì không cho làm nữa
                   ( 1 Student đki <= 8 subject)
                    B3: Nếu được đăng kí tiếp thì thực hiện nhập số môn đăng kí, thời gian hiện hành đăng kí
                    B4: Ghi vào File và cập nhật BRM.DAT
                    B5 : In danh sách ra màn hình
                */
                    int studentID,subjectID;
                    students= control.ReadStudentToFile(FileStudent);
                    subjects = control.ReadSubjectToFile(FileSubject);
                    studentRegisters = control.ReadSRToFile(FileSR);
                    do{
                        System.out.println("______________________Thông tin Student_______________________________");
                        ShowInfoStudent(students);
                        System.out.println("Nhập mã của học sinh:  ");
                        System.out.println("Nhập 0 để bỏ qua? ");
                        studentID = scanner.nextInt();
                        if(studentID == 0) break;
                        else
                        {
                            IsRegisterEnough = CheckLesson(studentRegisters,studentID);
                            if(!IsRegisterEnough) break;
                            else{
                                System.out.println("Học sinh đã đăng kí đủ khóa học");
                            }
                        }
                    }while (true);

                     do{
                         System.out.println("_______________________Thông tin Subject____________________________");
                         showInfoSubject(subjects);
                         System.out.println("Nhập mã của môn học: ");
                         System.out.println("Nhập 0 để bỏ qua? ");
                         subjectID = scanner.nextInt();
                         if (subjectID == 0) break;
                     }while (false);

                     int total = getTotalLesson(studentRegisters,studentID,subjectID);
                     do{
                         System.out.println("Nhập số lượng đăng kí học (hiện đã đăng kí " + total +" ): ");
                         int y = scanner.nextInt();
                         if((total + y) < 0 || (total + y) >8) break;
                         else{
                             total += y;
                             break;
                         }
                     }while (true);
                    Date datetime = new Date();
                    String time;
                    time = datetime.toString();
                    System.out.println("Thời gian bây giờ : " + datetime.toString());

                     Subject subject1 = getSubject(subjects,subjectID);
                     Student student1 = getStudent(students,studentID);
                     StudentRegister studentRegister = new StudentRegister(student1,subject1,time,total);

                     studentRegisters = utility.UpdateSR(studentRegisters,studentRegister);
                     control.UpdateSRcontrol(studentRegisters,FileSR);
                     ShowInfoSR(studentRegisters);
                     break;

            }

        }while(choose != 0);
        
    }

    private static void ShowInfoSR(ArrayList<StudentRegister> studentRegisters) {
        for (var s: studentRegisters) {
            System.out.println(s);
        }
    }

    private static Student getStudent(ArrayList<Student> students,int studentID)
    {
        for (int i = 0; i < students.size() ; i++) {
            if(students.get(i).getStudentID() == studentID)
                return students.get(i);
        }
        return null;
    }
    private static Subject getSubject(ArrayList<Subject> subjects,int subjectID)
    {
        for (int i = 0; i < subjects.size() ; i++) {
            if(subjects.get(i).getSubjectID() == subjectID)
                return subjects.get(i);
        }
        return null;
    }
    private static int getTotalLesson(ArrayList<StudentRegister>studentRegisters , int studentID, int subjectID){
        for (var s: studentRegisters) {
            if(s.getStudent().getStudentID() == studentID && s.getSubject().getSubjectID() == subjectID )
                return s.getTotalRegister();
        }
        return 0;
    }

    private static boolean CheckLesson(ArrayList<StudentRegister> StudentsRegister, int studentID) {
        int count = 0;
        for (var s: StudentsRegister) {
            if (s.getStudent().getStudentID() == studentID)
                count += s.getTotalRegister();
        }
        if(count > 8) return true;
        return false;
    }

    private static void CheckIDStudent(DataControl control, String fileStudent) {
        var list = control.ReadStudentToFile(fileStudent);
        Student.setId(list.get(list.size()-1).getStudentID() + 1);
    }

    private static void ShowInfoStudent(ArrayList<Student> students) {
        for (var s : students) {
            System.out.println(s);
        }
    }

    private static void showInfoSubject(ArrayList<Subject> subjects) {
        for (var s: subjects) {
            System.out.println(s);
        }
    }

    private static void CheckIDSubject(DataControl control , String FileName) {
        var list = control.ReadSubjectToFile(FileName);
        Subject.setId(list.get(list.size()-1).getSubjectID() + 1);
    }
}
