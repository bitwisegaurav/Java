package p1;

class check{
    void printName(){
        System.out.println("My name is Gaurav Mishra");
    }
}

class get extends check{
    void printAge(){
        System.out.println("I am 19 years old");
    }
}

public class packages extends get {
    public void printDetails(){
        printName();
        printAge();
    }
}
