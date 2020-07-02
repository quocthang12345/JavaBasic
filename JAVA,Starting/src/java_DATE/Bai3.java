package java_DATE;

import java.time.LocalDate;

/*
    Lớp local Date
    chú ý : đây là lớp Factory method  nên k cần có phương thức khởi tạo
    sử dụng cho bài toán lớn trong ngày giớ , còn trong phạm vi 1 ngày thì dùng lớp Date
*/
public class Bai3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate = localDate.plusDays(10); // cộng thêm 10 ngày vào ngày hiện tại
        System.out.println(localDate);
        System.out.println(localDate.minusDays(10));// trừ đi 10 ngày vào ngày hiện tại
        System.out.println(localDate.getMonth());// lấy tháng
        System.out.println(localDate.lengthOfYear()); // xuất ra độ dài năm nay . năm nhuận 366 năm bthuong 365
        LocalDate myDate = LocalDate.of(2000,1,1); // khởi tạo đối tượng
        System.out.println(myDate);

    }
}
