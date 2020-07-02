package control_flow;
// break and continue
public class Bai5 {
    public static void main(String[] args) {
        int i=99 ;
        int count=0;

        for( ; ;) {
            if(i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            if(count == 40) {
                break;
            }
            i++;
        }
    }
}
