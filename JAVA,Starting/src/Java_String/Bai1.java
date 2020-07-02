package Java_String;

import java.lang.reflect.Field;
import java.security.acl.LastOwnerException;

/* Khái niệm string(chuỗi/ xâu kí tự)
   Chuỗi con
   Nối chuỗi
* */
public class Bai1 {
    public static void main(String[] args) {
        // có 2 cách khởi tạo một chuỗi string mới
        String Name = "Tran Thang";
        //String Name1 = new String("Phuong Thao");
        System.out.println(Name);
        // chuỗi con có nghĩa là một xâu kí tự thuộc chuỗi string
        String Firstname = Name.substring(0,4);// substring(vtstart,beforevtend)
        String Lastname = Name.substring(5);
        System.out.println("Firstname = " + Firstname);
        System.out.println("Lastname = " +Lastname);
        //Nối 2 chuỗi con với nhau:
        String result = Firstname + Lastname;
        System.out.println(result);
    }
}

