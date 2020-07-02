package java_generic;
/*
    Method Generic
    Phương thức Generic được định nghĩa đê sử dụng và có thể tái sử dụng với từng kiểu dữ liệu khác nhau
*/
public class Generic {
    public <T> void Show(T[] object) // dạng 1
    {
        for (T o: object) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
    public <K,V> void Show1(K key, V value) // dạng 2
    {
        System.out.println(key + " : " + value);
    }

    public <T extends Comparable<T>> T Findmin(T[] arr)
    {
        T min  = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].compareTo(min) < 0) arr[i] = min ;
        }
        System.out.println("Min = " +min);
        return min;
    }
    public static void main(String[] args) {
        Integer[] integer = {1,2,3,4,5,7};
        String[] strings = {"Tran Quoc Thang", "Tran Thi Phuong Thao" , "Tran Thi Boi"};
        Double[] doubles = {1.2,1.4,1.5,1.6};
        Generic test = new Generic();
        test.Show(integer);
        test.Show(strings);
        test.Show(doubles);

        test.Show1(1,"Quoc Thang");
        test.Show1("Quoc Thang", "Phuong Thao");
        test.Show1(1.4,true);

         test.Findmin(integer);
         test.Findmin(strings);
         test.Findmin(doubles);
    }
}
