package Oct24;

public class TestFinally extends Exception{
    public static void main(String[] args) {
        String s = null;

        try {
            //System.exit(0);
            // connect to database
            // close the connection
            String s1 = s.toUpperCase();

        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside the finally block ");
        }

        System.out.println("After line 13");
    }
}

// interview : situation when finally block does not execute
