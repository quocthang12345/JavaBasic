package Java_interface;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;

/*
    interface CompareTo , ( dùng để sắp xếp đối tượng)
 */
public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Tran Quoc Thang",20,"K126/15 Le Do","AAA12","ĐHBK" ,8.0f));
        list.add(new Student("Tran Phuong Thao",20,"K126/15 Le Do","AAA18","ĐHBK" ,8.2f));
        list.add(new Student("Tran Thi Boi",2,"K126/15 Le Do","AAA15","ĐHBK" ,8.5f));

        System.out.println("Truoc khi sap xep: ");
        for (var s: list) {
            System.out.println(s);
        }
        System.out.println("Sau khi sap xep: ");
        Collections.sort(list);
        for (var s: list) {
            System.out.println(s);
        }

        System.out.println("Sau khi sap xep diem: ");
        Collections.sort(list, new SortByAvgComparator());
        for (var s: list) {
            System.out.println(s);
        }
    }
}
