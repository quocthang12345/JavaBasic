package Java_interface;

import model.Student;

import java.util.Comparator;
/*
    Interface Comparator
*/
public class SortByAvgComparator implements Comparator<Student> {

    @Override
    public int compare(Student t1, Student t2) {
        double res = t1.getAvg() - t2.getAvg(); // giảm dần
        //double res = t2.getAvg() - t1.getAvg(); tăng dần
        if (res>0) return -1;
        else if(res<0) return 1;
        return 0;
    }
}
