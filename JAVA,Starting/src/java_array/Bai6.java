package java_array;
// vòng foreach và ziczac cho mảng 2 chiều
public class Bai6 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {2,3,5},
                {5,9,6}
        };
        for(int[]x: arr) // truy xuất từng {} trong arr
        {
            for(int y : x) // truy xuất tưng số trong {} trong arr
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("Xay dung zizac băng mang 2 chièu");
        // truy xuất và nhập dữ liệu cho zizac sử dụng mảng 2 chiều
        int[][] arr1 = new int[10][];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[i+1];
            for(int j = 0 ; j < arr1[i].length ; j++)
            {
                arr1[i][j] = i+j;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0 ; j < arr1[i].length ; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
