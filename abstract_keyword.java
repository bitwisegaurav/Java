abstract class parent { // cannot be used to make objects only used in inheritence and can make reference objects
    int data;
    parent(){
        data = 10;
    }
    abstract void display(); // incomplete function which must be override in child class
}

class child extends parent {
    void display(){
        System.out.println(data);
    }
    void get(){
        System.out.println("antshant");
    }
}

class abstract_keyword {
    public static void main(String[] args) {
        parent obj = new child(); // can call only parents functions known as dynamic method dispatch
        obj.display();
    }    
}
