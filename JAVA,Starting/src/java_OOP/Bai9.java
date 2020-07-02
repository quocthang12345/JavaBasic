package java_OOP;

import model.Person;

/*
    Các quyền truy cập của một class
    Thành phần pulic cho phép mọi đối tượng được khởi tạo từ lớp Person có thể truy cập mọi thuộc tính hoặc phương thức
    có khai báo public ( với mọi package khác nhau)
    Thành phần private chỉ chó phép quyền truy đến từ các phương thức nội bộ trong lớp , tất cả đối tượng được khởi tạo
    từ lớp ko thể truy cập đến thuộc tính khai báo private . Có thể truy xuất thông tin của thuộc tính có khai báo private
    bằng phương pháp trung gian thông qua một phương thức public
    Thành phần default chỉ cho phép truy cập từ tất cả mọi đối tượng phương thức nằm cùng một package , khác package sẽ
    không bao giờ truy cập đến thuộc tính hay phương thức được khai báo default đc
    Thành phần protected chi cho phép quyền truy cập từ tất cả mọi đối tượng phương thức nằm cùng một lớp , một cây
    phân cấp kế thừa , một package , còn khác 1 trong những cái trên thì ko bao giờ truy cập đến thành phần có khai
    báo protected đc


*/
public class Bai9 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Thang Tran");
        System.out.println(person.getName());
        //System.out.println(person.name);
        //System.out.println(person.othername); lỗi vì k có quyền truy cập
       // System.out.println(person.getOthername());
    }
}
