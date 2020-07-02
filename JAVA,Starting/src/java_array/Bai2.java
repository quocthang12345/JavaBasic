package java_array;
// vòng lặp foreach
//for(kieuDL object : tenarray/tenlist)
//    vòng lặp foreach dùng để xuất dữ liệu của mảng hoặc danh sách , ko làm thay đổi các phần tử trong danh sách mảng

public class Bai2 {
    public static void main(String[] args) {
        String name = "Thang Thao Hien Nhi Trang Bien Trang Phung ";
        String names[] = name.split(" ");
        for (String s : names ) {
            System.out.println("Ten: " + s);
        }

    }
}
