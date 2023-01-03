package OOPs;

import java.util.Scanner;

//class created
class Student {
    String USN;
    String name;
    double marks;
     void Details(String USN, String name, double cgpa) {
        this.USN = USN;
        this.name = name;
        this.marks = cgpa;
    }

    void display() {
        System.out.print("Name is "+name+" USN is "+USN+" Your CGPA is: "+marks);
    }
}
public class OOPS1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] student = new Student[3];
//        student[0] = new Student("2TG21CS016", "Azam Mustufa", 7.45);
//        student[0].display();
        for (int i = 0; i < 3; i++) {
            student[i] = new Student();
        }

    }
}
