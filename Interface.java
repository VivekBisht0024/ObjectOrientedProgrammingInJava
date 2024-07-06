interface Animal{

    void walk();

}

class Horse implements Animal{


    Horse(){
        System.out.println("Horse Constructor");
    }

    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken implements Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
