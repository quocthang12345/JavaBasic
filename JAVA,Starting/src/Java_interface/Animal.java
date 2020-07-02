package Java_interface;


import java.io.Serializable;
import java.util.Collection;

public interface Animal extends Comparable, Serializable { // một interface có thể kế thừa hơn một interface
    void Move();
    void Eat(); // mặc định là public abstract void eat()
    void Sleep();
}
