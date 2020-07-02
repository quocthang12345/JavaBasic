package java_other;

import java.util.ArrayList;

/*
    Lớp ArrayList
*/
public class ArraysList {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(10); // lớp Arraylist cho phép ta khởi tạo với khả năng chứa là 10
        int[] i = new int[10] ; // một mảng bthuong
        // khác biệt giữa mảng thông thường và lớp arraylist
        System.out.println(list.size()); // 0 vì khi khởi tạo lớp Arraylist chỉ cho ta biết khả năng lưu trữ chứ chưa có giá trị phần tử gì cả
        System.out.println(i.length); // 10 vì khi khởi tạo mảng thông thường thì cả 10 phần tử đều mang giá trị null

        list.add("One");
        list.add("Two");
        list.add("Four");
        for (String s: list) {
            System.out.println(s);
        } // xuất phẩn từ của mảng arraylist
        System.out.println();
        list.add(2,"Three"); // thêm phần tử three vào vt 2 đẩy four ra vt 3
        for (String s: list) {
            System.out.println(s);
        } // xuất phẩn từ của mảng arraylist
        System.out.println();
        list.set(2,"Five"); // đặt lại giá trị của vị trí thứ 2 là Five thay vì Three
        for (String s: list) {
            System.out.println(s);
        } // xuất phẩn từ của mảng arraylist
        System.out.println();
        System.out.println(list.get(1)); // xuất phần tử vị trí thứ 1;
        System.out.println();
        list.remove(2); // xóa phần tử vị trí thứ 2 ;
        for (String s: list) {
            System.out.println(s);
        } // xuất phẩn từ của mảng arraylist

    }
}
