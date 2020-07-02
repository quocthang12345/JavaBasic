package java_DATE;

import java.util.Date;

/*
    Giới thiệu lớp DATE trong class
*/
public class Bai1 {
    public static void main(String[] args) {
        Date now = new Date();
        long otherday = System.currentTimeMillis();
        System.out.println(now.getTime());// lấy mili giây thời gian bây giờ(hàm gettime())
        System.out.println(now); // lấy thời gian bây giờ
        System.out.println(otherday); // một cách khác để take thời gian bây giờ bằng đối tượng system
        Date tomorrow = new Date(otherday + (24*60*60*1000)); // giờ*phút*giây*miligiay
        Date yesterday = new Date(otherday - (24*60*60*1000));
        System.out.println(tomorrow);
        System.out.println(yesterday);
        System.out.println( now.after(yesterday)); // nghĩa là thời điểm bây giờ sau thời điểm ngày trước
        System.out.println(now.before(tomorrow)); // nghĩa là thời điểm bây giờ trước thời diểm hôm qua
    }
}
