package control;

import modal.Student;
import modal.StudentRegister;
import modal.Subject;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataControl {
    private   PrintWriter printWriter;
    private   BufferedWriter bufferedWriter;
    private   FileWriter fileWriter;
    private   Scanner scanner;

    public  void OpenFileToWrite(String FileName){
        try {
            fileWriter = new FileWriter(FileName,true); // nhớ thêm append
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void WriteSubjectToFile(String Filename , Subject subject){
        OpenFileToWrite(Filename);
        printWriter.println(subject.getSubjectID() + "|" + subject.getSubjectName() + "|" + subject.getTotalLession() +"|"
        + subject.getSubjectType());
        CloseFileToWrite(Filename);
    }
    public  void WriteStudentToFile(String Filename , Student student){
        OpenFileToWrite(Filename);
        printWriter.println(student.getStudentID() + "|" + student.getFullname() + "|" + student.getAddress() + "|" + student.getPhonenumber());
        CloseFileToWrite(Filename);
    }
    public  void WriteSRToFile(String Filename , StudentRegister studentRegister){
        OpenFileToWrite(Filename);
        printWriter.println(studentRegister.getStudent().getStudentID() + "|" + studentRegister.getSubject().getSubjectID() +"|"+ studentRegister.getDatetime()+ "|"
        +studentRegister.getTotalRegister());
        CloseFileToWrite(Filename);
    }
    public  void CloseFileToWrite(String FileName){
        printWriter.close();
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  void OpenFileToRead(String FileName){
        try {
            File file = new File(FileName);
            if(!file.exists())
            {
                file.createNewFile();
            }
                scanner = new Scanner(Paths.get(FileName),"UTF-8");
            } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public ArrayList<Subject>ReadSubjectToFile(String FileName){
        OpenFileToRead(FileName);
        ArrayList<Subject> subjects = new ArrayList<>();
        while(scanner.hasNextLine())
        {
            String data = scanner.nextLine();
            Subject subject = CreateSubjectToData(data);
            subjects.add(subject);
        }

        CloseFileToRead(FileName);
        return subjects;
    }
    private  Subject CreateSubjectToData(String data) {
        String[] res = data.split("\\|");
//        Subject(int subjectID, String subjectName, int totalLession, String subjectType)
        Subject subject = new Subject(Integer.parseInt(res[0]),res[1],Integer.parseInt(res[2]),res[3]);
        return subject;
    }

    public  ArrayList<Student> ReadStudentToFile(String FileName){
        OpenFileToRead(FileName);
        ArrayList<Student> students = new ArrayList<>();
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            Student student = CreateStudentToRead(data);
            students.add(student);
        }
        CloseFileToRead(FileName);
        return students;
    }
    private  Student CreateStudentToRead(String data) {
        String[] res = data.split("\\|");
//        Student(int studentID, String fullname, String address, int phonenumber)
        Student student = new Student(Integer.parseInt(res[0]),res[1],res[2],Integer.parseInt(res[3]));
        return student;
    }


    public  ArrayList<StudentRegister> ReadSRToFile(String FileName){
        var students = ReadStudentToFile("STUDENT.DAT");
        var subjects = ReadSubjectToFile("SUBJECT.DAT");
        OpenFileToRead(FileName);
        ArrayList<StudentRegister> studentRegisters = new ArrayList<>();
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            StudentRegister studentRegister = CreateSRToRead(data,students,subjects);
            studentRegisters.add(studentRegister);
        }
        CloseFileToRead(FileName);
        return studentRegisters;
    }
    private StudentRegister CreateSRToRead(String data, ArrayList<Student> students, ArrayList<Subject> subjects) {

        String[] res = data.split("\\|");
//        StudentRegister(Student student, Subject subject, String datetime, int totalRegister)
        StudentRegister studentRegister = new StudentRegister(getStudent(students,Integer.parseInt(res[0])),
                getSubject(subjects,Integer.parseInt(res[1])),res[2],Integer.parseInt(res[3]));
        return studentRegister;
    }
    private Student getStudent(ArrayList<Student> students,int studentID)
    {
        for (int i = 0; i < students.size() ; i++) {
            if(students.get(i).getStudentID() == studentID)
                return students.get(i);
        }
        return null;
    }
    private Subject getSubject(ArrayList<Subject> subjects,int subjectID)
    {
        for (int i = 0; i < subjects.size() ; i++) {
            if(subjects.get(i).getSubjectID() == subjectID)
                return subjects.get(i);
        }
        return null;
    }


    public  void CloseFileToRead(String FileName){
        try {
            scanner.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void UpdateSRcontrol(ArrayList<StudentRegister> sr, String FileName)
    {
        File file = new File(FileName);
        if (file.exists()){
                file.delete();
        }
        OpenFileToWrite(FileName);
        for (var s : sr){
            printWriter.println(s.getStudent().getStudentID() + "|" + s.getSubject().getSubjectID() +"|"+ s.getDatetime()+ "|"
                    +s.getTotalRegister());
        }
        CloseFileToWrite(FileName);
    }
}
