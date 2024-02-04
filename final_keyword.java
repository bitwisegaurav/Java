final class parent{ // cannot be inherited
    final int x = 20; // constant
    final void display(){ // cannot be override
        System.out.println(x);
    }
}

class final_keyword {
    public static void main(String[] args) {
        parent obj = new parent();
        obj.display();
    }
}