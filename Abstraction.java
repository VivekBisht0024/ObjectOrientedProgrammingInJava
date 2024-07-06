// Abstraction - to hide the unnecessary data and to only show the important data to a user.

// Using abstract keyword and Using Interface


//abstract means which can imaginary 

abstract class Animal{

    abstract void walk();
}


class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.walk();
    }
    
}
