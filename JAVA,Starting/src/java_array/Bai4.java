package java_array;

import java.util.Arrays;
import java.util.Collections;

// lớp array dựng sẵn
public class Bai4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,6,8,5,3,7,9,4}; // một mảng số nguyên
        String[] name = new String[]{"Thang","Thao","Tu", "Tuan" , "Nhi" ,"Yen"}; // một mảng string

        String res = Arrays.toString(arr); // chuyển mảng số nguyên sang chuỗi string
        System.out.println(res);

        String res1 =  Arrays.toString(name);
        System.out.println(res1);// chuyển mảng String sang chuỗi string


        Arrays.sort(arr); // hàm sắp xếp tăng dần trong lớp dựng sẵn
        System.out.println(Arrays.toString(arr));


        Arrays.sort(name, Collections.reverseOrder());// hàm sắp xếp giảm dần
        System.out.println(Arrays.toString(name));


        Integer[] arr1 = new Integer[]{2,4,69,5,3,29,0};
        Arrays.sort(arr1, Collections.reverseOrder());// không thể sử dụng arr vì arr thuộc kiểu dữ liệu int chứ ko phải kiểu lớp nên khai báo Integer
        System.out.println(Arrays.toString(arr1));

        String[] name3 = new String[]{"Tu", "Hoa" , "Hien", "Thang", "Thao"};
        int index = Arrays.binarySearch(name3,"Thang");// hàm tìm kiếm trong mảng string và trả vê chỉ số vị trí ở trong mảng
        System.out.println("index = " +  index); // nếu index >= 0 thì trả đúng chỉ số vị trí , < 0 là ko có trong mảng

        int index1 = Arrays.binarySearch(name3, 2 , name3.length, "Tu"); // Arrays.binarySearch(tenMang, vtstart , vtend, tukhoa)
        System.out.println("index1 = " + index1);

        String[] name4 = Arrays.copyOf(name3, 3 ); // hàm copy từ một mảng qua một mảng khác
        // Arrays.copyOf(tenMangcanCopy, soluonglay);
        System.out.println(Arrays.toString(name4));
        System.out.println(Arrays.toString(name3));
        System.out.println(Arrays.equals(name3,name4)); // Hàm so sánh giữa hai mảng nếu true là giống nhau , fasle là khác nhau

        int[] arr5 = new int[10];
        Arrays.fill(arr5 , 20); // hàm thêm phần tử vào mảng
        System.out.println(Arrays.toString(arr5));
    }
}
