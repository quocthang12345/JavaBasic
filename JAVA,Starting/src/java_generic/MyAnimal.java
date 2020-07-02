package java_generic;

public class MyAnimal < K , V extends Animal1> { // giới hạn kiểu tham số về dạng lớp thưa kế
     private K Key;
    private V Value;

    public MyAnimal(K key, V value) {
        Key = key;
        Value = value;
    }

    public MyAnimal() {
    }

    public V getValue() {
        return Value;
    }

    public void setValue(V value) {
        Value = value;
    }
}
