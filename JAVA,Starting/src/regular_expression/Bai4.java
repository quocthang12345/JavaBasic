package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Regular Expression
    + Định dạng số điện thoại
*/
public class Bai4 {
    public static void main(String[] args) {
        String Phone = "(0905) 703 018";
        String dkien = "^\\(09\\d{2}\\)\\s{1}\\d{3}\\s{1}\\d{3}$";
        Pattern pattern = Pattern.compile(dkien);
        Matcher matcher = pattern.matcher(Phone);
        if(matcher.find())
        {
            System.out.println("ok");
        }
        else
        {
            System.out.println("Non ok");
        }
    }
}
