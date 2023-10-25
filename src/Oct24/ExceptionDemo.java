package Oct24;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {2,34,54,675,7};

        try {
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {  //which will execute no matter what// it will execute always
            System.out.println("Finally block");
        }
        System.out.println("Print After exception");
    }
}
