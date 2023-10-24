package Oct21.exceptiom.classexample;

public class Example {
    public static void main(String[] args) {
        int[] array = new int[5];

        try{
            for (int i = 0; i< 6;i++){
                array[i] = i;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
