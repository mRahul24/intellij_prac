package oct31;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        System.out.println(arrayList1+ " : Array List 1");

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(50);
        arrayList2.add(60);
        arrayList2.add(70);
        arrayList2.add(80);
        System.out.println(arrayList2+ " : Array List 2");

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1 + " : Combination");

        System.out.println("Index 3: "+ arrayList2.get(3));
        System.out.println("Element Removed : "+arrayList1.remove(3));
        arrayList1.clear();
        System.out.println(arrayList1);

        boolean contains = arrayList1.contains(new Integer(30));
        System.out.println(contains);
    }
}
