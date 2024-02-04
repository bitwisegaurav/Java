class MyException extends Exception{
    public String getMessage(){
        return "Padhle yaar";
    }
}

public class exception_handling1 {
    public static void main(String[] args) throws java.io.IOException {
        MyException err = new MyException();
        try {
            int x = System.in.read();
            char ch = (char)x;
            System.out.println(ch);
            System.out.println(args[2]);
            throw err;
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Your error is "+ e.getMessage());
        }
        catch(MyException e){
            System.out.println("Your message is "+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Kuchh to galat hua hai bs pta nhi chal rha");
        }
        finally{
            System.out.println("Ye to chla ke hi rehna hai");
        }
    }
}