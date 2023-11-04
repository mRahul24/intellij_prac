package oct31.customagestudentexample;

import java.util.ArrayList;
import java.util.List;

public class StudentCustomList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul", 20));
        list.add(new Student("Peter", 40));
        list.add(new Student("Paul", 23));
        list.add(new Student("Mary", 53));
        list.add(new Student("Lima", 23));
        list.add(new Student("Albert", 45));
        list.add(new Student("Pinto", 55));
        list.add(new Student("Sonu", 40));


        for (Student student : list){
            if(student.getAge()>=40){
                System.out.println(student.getName());
            }
        }

    }
}
