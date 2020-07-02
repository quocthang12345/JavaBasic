package model;
public class PersonFactory {
    private static Person student = new Person();
    public static Person getPersonInstance()
    {
        return student;
    }
}
