package oct28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        //Student<Integer, String> stud = new Student<>(101,"Rahul");

        List<Integer> a1= new ArrayList<>();

        List<Integer>  a2= new LinkedList<>();

        ArrayList<Integer>   arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList + " Test 1");
        arrayList.add(1,29);
        System.out.println(arrayList + " Test 2");

        System.out.println(arrayList);
        Integer i = arrayList.get(1);
        System.out.println(i);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println(linkedList);

    }
}