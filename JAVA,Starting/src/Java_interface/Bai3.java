package Java_interface;
/*
        So sánh giữa Comparable với Comparator
 */
public class Bai3 {
    /*So sánh               Comparable interface                        Comparator interface
    1/Implements            Bản thân lớp thực thể                       Lớp độc lập với lớp thực thể
    2/Phương thức           compareTo(Object o): int                    compare(Object o1,Object o2): int
    3/Chức năng             So sánh hai đối tuọng cùng lớp              So sánh hai đối tượng cùng lớp ở một lớp độc lập khác
                            trong bản thân lớp
    4/Tiêu chí              So sánh thuộc tính đơn chỉ sử dụng được     So sánh thuộc tính đơn, chỉ sử dụng được
                            với một thuộc tính                           với một thuộc tính nhưng có thể phân tách thành nhiều lớp
    5/Bước thực hiện        Collections.sort(tên ds);                Collections.sort(tên ds, đói tượng thể hiện của Comparator)

     */
}
