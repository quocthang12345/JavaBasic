package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Regular Expression
    + Định dạng mã sinh viên
*/
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String dkien = "[AaBb]{1}\\d{2}[DdEeFf]{4}\\d{3}[AB]{1}"; // định dạng kiểu A22DdeF123A
        Pattern pattern = Pattern.compile(dkien);
        Matcher matcher = pattern.matcher(str);
        if(matcher.find())
        {
            System.out.println("ok");
        }
        else
        {
            System.out.println("Moi nhap lai");
        }
    }
}
