package java_DATE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Lớp SimpleDateformat
*/
public class Bai2 {
    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" dd/MM/yyyy ");
//        Date now = new Date();
//        System.out.println(simpleDateFormat.format(now));
        Date now;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd/MM/yyyy");
        String input = "01/01/2000";
        try {
            now = simpleDateFormat.parse(input);
            System.out.println(simpleDateFormat.format(now));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
