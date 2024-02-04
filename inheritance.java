class parent{
    int x;
    parent(){
        System.out.println("Parents default constructor");
    }
    parent(int data){
        System.out.println("In the parents parameterized constructor");
        x = data;
    }
    void display(){
        System.out.println("In the parents display x = " + x);
    }
}
class child extends parent {
    int x;
    child(){
        super(20); // default constructor will not run
        System.out.println("In the childs constructor");
        x = 30;
    }
    void display(){
        super.display();
        System.out.println("In the childs display super.x = " + super.x);
        System.out.println("In the childs display x = " + x);
    }
}


class inheritance {
    public static void main(String[] args) {
        parent obj = new child();
        obj.display();
    }    
}
/* 
 * inhertience
 * constructor
 * super keyword
 * super constructor
 * dynamic method dispatch
 * function overriding
 */