package Task1;
import java.util.ArrayList;

class Student {
   int IDNumber;
   Student(int ID){
       IDNumber=ID;
   }

   int getIDNumber(){
       return IDNumber;
   }
}


public class Main {
    public static void outArray(ArrayList<Student> students){//вывод массива
        for (int i=0;i<students.size();i++)
            System.out.println(students.get(i).getIDNumber());
    }

    public static void sortArray(ArrayList<Student> students) {
        for (int i=0;i<students.size()-1;i++) {
            for (int j=i+1;j<students.size();j++) {
                if (students.get(i).IDNumber>students.get(j).IDNumber) {
                    Student vrem=students.get(i);
                    students.set(i,students.get(j));
                    students.set(j,vrem);
                }
            }
        }
        outArray(students);
    }

    public static void main(String[] args) {
        ArrayList<Student> stud=new ArrayList<Student>();//коллекция
        stud.add(new Student(900));
        stud.add(new Student(800));
        stud.add(new Student(540));
        stud.add(new Student(430));
        outArray(stud);
        System.out.println("---");
        sortArray(stud);
    }
}
