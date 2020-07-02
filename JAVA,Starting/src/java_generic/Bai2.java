package java_generic;
/*Lớp Generic*/
public class Bai2 {
    public static void main(String[] args) {
        MyAnimal<Integer,Catmale> myAnimal = new MyAnimal<Integer, Catmale>(1,new Catmale());
        MyAnimal<String,Cat> myAnimal2 = new MyAnimal<String, Cat>("Meo meo",new Cat());
        MyAnimal<Integer,Mamal> myAnimal3 = new MyAnimal<Integer, Mamal>(3,new Mamal());
        MyAnimal<Integer,Animal1> myAnimal4 = new MyAnimal<Integer, Animal1>(3,new Animal1());
    }
}
