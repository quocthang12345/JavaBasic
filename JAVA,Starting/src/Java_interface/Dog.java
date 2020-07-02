package Java_interface;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Collection;

public class Dog implements Animal, Readable { // có thể implement(triển khai) nhiều interface
    @Override
    public void Move() {
        System.out.println("Dogs move by this hand");
    }

    @Override
    public void Eat() {
        System.out.println("Dogs like rices");
    }

    @Override
    public void Sleep() {
        System.out.println("Dogs sleep in the morning");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        return 0;
    }
}
