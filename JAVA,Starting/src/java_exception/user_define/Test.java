package java_exception.user_define;
/* define checked Exception*/
public class Test {
    public static void main(String[] args) {
        try {
            AgeOfDriver age = new AgeOfDriver(17);
            System.out.println(age.getAge());
        } catch (AgeOfDriverException e) {
            e.printStackTrace();
        }
    }
}
