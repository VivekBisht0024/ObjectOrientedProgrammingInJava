class Person {
    String name;
    int age;

    public void walk() {
        System.out.println("Walks on 2 legs");
    }

    public void eat() {
        System.out.println("Eats the food");
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.walk();
        p1.eat();
    }
}
