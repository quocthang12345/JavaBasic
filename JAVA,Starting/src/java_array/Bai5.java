package java_array;
// Mảng hai chiều
public class Bai5 {
    public static void main(String[] args) {
        // khai báo mảng 2 chiều
        int[][] arr = new int[4][3];
        // khởi tạo mảng 2 chiều
        int[][] arr1 = new int[][]{
            {1,2,3},
            {1,2,3},
            {3,5,7},
            {3,1,6}
        }; // cách 1
        int[][] arr2 = {
                {1,2,3},
                {1,2,3},
                {3,5,7},
                {3,1,6}
        }; // cách 2
        // Xuất các phần tử của mảng;
        for (int i = 0; i < arr1.length; i++) // arr1.length là chỉ số hàng
        {
            for (int j = 0 ; j <arr1[0].length; j++) // arr1[0].length là chỉ số cột
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        // gán phần tử của mảng
        arr[0][1] = 999;
        arr[1][2] = 44;
        arr[arr.length-1][arr[0].length-1] = 1;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0 ; j <arr[0].length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
