package java_array;
//    Mảng 1 chiều trong Java
//Giá trị mặc định của kiểu số là 0 , 0.0
//Giá trị mặc định của object , class , string là null
//Giá trị mặc định của boolean là false
//- Chỉ số phần từ nằm trong mảng giới hạn từ : 0-> length - 1
//vd: A[i] -> i là chỉ số của mảng
// mảng là tập hợp các phần tử có cùng kiểu dữ liệu và có ô nhớ nối tiếp nhau
public class Bai1 {
    public static void main(String[] args) {
        int[] arr = new int[10]; // cách 1 khởi tạo
        // cách 2 int arr[100];
        arr[1] = 2;
        arr[3] = 4;
        arr[5] = 5;
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println("A["+i+"]= " + arr[i]); // truy xuất đến các phần tử có trong mảng
        }
    }
}
