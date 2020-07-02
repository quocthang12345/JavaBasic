package Object_input_output_stream;

import model.Person;
import model.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFileOutputStream {
    public static void main(String[] args) {
    Student student = new Student("EF3G4","ĐHBK",7);
    Student student1 = new Student("BK212B","ĐHBK",8);
    Student student2 = new Student("ALC233","ĐHBK",6);
    Student student3 = new Student("CC2O32","ĐHBK",5);
    Student student4 = new Student("DKM23","ĐHBK",4);

    {
        try {
            FileOutputStream fos = new FileOutputStream("STUDENT.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student); // viết nhiều dữ liệu vào 1 file
            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);
            oos.writeObject(student4);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
}
