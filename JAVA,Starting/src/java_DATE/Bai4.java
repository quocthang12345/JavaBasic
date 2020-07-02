package java_DATE;

import java.util.Date;

/*
    Chuyển đổi định dạng ngày tháng năm
    vì sao dùng %<t vì trong phương thức printf  thì mỗi định dạng % tương ứng với 1 biến nhưng khi ta truyền
    một biến chung thì dùng < để thông báo đang dùng chúng 1 biến , bắt đầu từ vị trí định dạng % thứ 2
*/
public class Bai4 {
    public static void main(String[] args) {
        Date now = new Date();
        // in ra định dạng : Monday 07/04/2020 12:35:38 +0700 ICT
        System.out.printf("Time now: %tA %<td/%<tm/%<tY %<tH:%<tM:%<tS %<tp %<tz %<tZ" , now);
    }
}
