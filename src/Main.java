import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] array = {2,5,8,12,35};
        int[] array2 = {4,8,123,45,90,12,67};
        SumArray a1 = new SumArray();
        System.out.println(a1.sumArray(array));
        System.out.println(a1.sumArray(array2));

        CountWords sentence = new CountWords();
        sentence.countWords("Lorem ipsum, domit es ipsum it");


        //Zadanie 4
        Student s1 = new Student(24, 189, "Marek", "Mickiewicz");
        Student s2 = new Student(21, 162, "Anna", "Kowalska");
        Student s3 = new Student(19, 173, "Genowefa", "Pigwa");
        Student s4 = new Student(25, 180, "Nikodem", "Dyzma");
        Student s5 = new Student(38, 193, "Adam", "Zagłoba");

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);

        for(Student s : studentsList){
            System.out.println(s.toString());
        }

        System.out.println();
        }
    }
