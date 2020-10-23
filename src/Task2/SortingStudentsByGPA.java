package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {
    public static void outArray(List<Student> students){
        for (int i=0;i<students.size();i++)
            System.out.println(students.get(i).getTotalScore());
    }

    public static void main(String[] args) {
        List<Student>stud=new ArrayList<>();
        stud.add(new Student(1, 5));
        stud.add(new Student(2,3));
        stud.add(new Student(3,9));
        stud.add(new Student(4, 10));

        Comparator<Student>comStud= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.totalScore>o2.totalScore? 1:-1;
            }
        };

        outArray(stud);
        Collections.sort(stud,comStud);//компоратор, который написан не в классе student
        outArray(stud);
    }
}
