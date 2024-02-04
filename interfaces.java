interface interface1 {
    int x = 24; // by default final 
    void check(); // by default public and abstract
    void get(); // by default public and abstract
}

interface interface2 extends interface1{
    void something(); // by default public and abstract
    void anything(); // by default public and abstract
}

class inter implements interface2 {
    public void check(){}
    public void get(){
        System.out.println(x);
    }
    public void something(){}
    public void anything(){}
}

class interfaces{
    public static void main(String[] args) {
        inter obj = new inter();
        obj.get();
    }
}