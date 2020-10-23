package Task2;

public class Student /*implements Comparable <Student>*/ {
    int IDNumber;
    int totalScore;

    Student(int ID, int totalS){
        IDNumber=ID;
        totalScore=totalS;
    }

    int getTotalScore(){
        return totalScore;
    }

    /*@Override
    public int compareTo(Student o) {//компаратор
        return this.totalScore>o.totalScore? 1:-1;

        *//*if(this.totalScore>o.totalScore){
            return 1;
        } else return -1;*//*
    }*/
}