package control_flow;

import java.util.Scanner;
// đối với switch-case kiểu dữ liệu cho phép gồm 'char, byte, short, int, Ký tự, Byte, Short, Integer, String hoặc enum'
// có thể overload enum sang một kiểu mới để sử dụng cho switch
/* vd
* enum DAY
 {
 MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 }
 public static void printTodaysThrough(DAY theday)
 switch(theday)
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap thang: ");
        int a = scanner.nextInt();
        switch (a)
        {
            case 1:
            case 2:
            case 3: {
                System.out.println("MUA XUAN!");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("MUA HE!");
                break;
            }
            case 7:
            case 8:
            case 9: {
                System.out.println("MUA THU!");
                break;
            }
            case 10:
            case 11:
            case 12:{
                System.out.println("MUA DONG!");
                break;
            }
            default:
            {
                System.out.println("Vui long nhap lai dung thang");
            }

        }
    }
}
