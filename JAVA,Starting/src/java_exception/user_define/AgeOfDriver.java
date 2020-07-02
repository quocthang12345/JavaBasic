package java_exception.user_define;

public class AgeOfDriver {
    private int age;

    public AgeOfDriver(int age) throws AgeOfDriverException {
        setAge(age);
    }

    public AgeOfDriver() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeOfDriverException {
        if(age < 18) throw new AgeOfDriverException("Let's choose the number greater or equals 18");
        else this.age = age;
    }
}
