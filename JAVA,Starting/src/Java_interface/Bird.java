package Java_interface;

public class Bird implements Animal {
    @Override
    public void Move() {
        System.out.println("Birds Move by flying");
    }

    @Override
    public void Eat() {
        System.out.println("Birds eat different animails");
    }

    @Override
    public void Sleep() {
        System.out.println("Bird sleep in midnight");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
