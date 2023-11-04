package oct31;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

//        for(Integer element: list){
//            System.out.println(element);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<Integer> listIterator = list.listIterator();

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }


    }

}
