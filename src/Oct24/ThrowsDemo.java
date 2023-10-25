package Oct24;

public class ThrowsDemo {
    public static void main(String[] args) {
        // throws  -- to declare exception to the caller of method

        try{
            set();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("After exception");

    }

    public  static void set() throws NullPointerException{
        String s = null;
        System.out.println(s.toUpperCase());
    }
}
