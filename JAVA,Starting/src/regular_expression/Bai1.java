package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    sử dụng regular expression để:
    + Tìm kiếm gần đúng
    + Thay thế một cụm kí tự bằng cụm kí tự khác
*/
/* Lưu ý : chỉ khởi tạo duy nhất một đối tượng của lớp Matcher , còn lớp Pattern thì tùy ý*/
public class Bai1 {
    public static void main(String[] args) {
        String input = "Tran       Quoc        Thang  love  You";
        String[] str1 = {"Tran Quoc Thang","Tran Phuong Thao","Tran Thi Boi", "Ho Thi Ngoc Khue", "Nguyen Van A", "To Hieu"};
        String dkien = ".*Th.*";// dk là có chữ Th và trước sau có 1 hoặc nhiều kí tự (đặt dk trước)
        String dkien1 = "^Ho.*"; // dk là bắt đầu bằng họ ho và sau có 1 hoặc nhiều kí tự
        String dkien2 = "[\\s]+";
        Pattern pattern = Pattern.compile(dkien1);
        Matcher matcher;

        for(int i = 0 ; i < str1.length ; i++)
        {
            matcher = pattern.matcher(str1[i]);
            if(matcher.find())
            {
                System.out.println(str1[i]);
            }
        }
        Pattern pattern1 = Pattern.compile(dkien2);
        matcher = pattern1.matcher(input);
        if(matcher.find())
        {
            System.out.println(matcher.replaceAll(" "));
        }
    }
}
