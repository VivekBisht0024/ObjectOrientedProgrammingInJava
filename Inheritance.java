class Manager{
    public void ManagesWork(){
        System.out.println("Manages the works");
    }
}


class Developer extends Manager{
    public void DevelopesSW(){
        System.out.println("Write codes to develop a S/W");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        Manager m1 = new Manager();
        m1.ManagesWork();
        d1.ManagesWork();
        d1.DevelopesSW();
    }
}

// SUPER Keywords called its parents constructor

// this keyword refers to the current object