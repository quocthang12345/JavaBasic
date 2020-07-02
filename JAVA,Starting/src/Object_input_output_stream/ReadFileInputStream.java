package Object_input_output_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFileInputStream {
    public static void main(String[] args) {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("STUDENT.DAT");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available() > 0) {
                obj = ois.readObject();// đọc dữ liệu 1 dối tượng
                System.out.println(obj);
            } // đọc dữ liệu nhiều đối tượng
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        if(obj == null) System.out.println("Nothing");
//        else System.out.println(obj);
    }
}
