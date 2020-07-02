package Java_interface;

public class Fish implements Animal {
    @Override
    public void Move() {
        System.out.println("Fish move by swimming");
    }

    @Override
    public void Eat() {
        System.out.println("Fish eat a vegetable");
    }

    @Override
    public void Sleep() {
        System.out.println("Fish sleep about 7 hours/day");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
