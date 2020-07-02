package control_flow;

import java.util.Scanner;
/* for(khởi tạo; đk lặp ; bước nhảy)
{
    doing something
        }

 */
/* biết trước số lần lặp thì dùng vòng for
    chưa biết số lần lặp thì dùng while or do/while
    do/while thực hiện ít nhất 1 lần mã code mới ktr đk
    vòng while kiểm tra ngay từ đầu rồi mới thực hiện code
 */
public class Bai4 {
    public static void main(String[] args) {
        for(int i= 0; i<=100; i++)
        {
            if (i % 2 == 0 ) System.out.print("So chan: "+ i +"\n");
            if (i % 5 == 0) System.out.print("So chia het cho 5: " + i +"\n");
        }
        int i=0;
        while(i!=0) {
            System.out.println("HeLLo");
        }
        int j = 0;
        do {
            System.out.println("HELLO");
        }
        while(j!=0);
    }
}
