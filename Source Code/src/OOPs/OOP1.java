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

class A {
    String name;
    public A (String name) {
        this.name = name;
        System.out.println(name);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object is destroyed");
    }
}

public class OOP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] student = new Student[3];
//        student[0] = new Student("2TG21CS016", "Azam Mustufa", 7.45);
//        student[0].display();
        final A Azam = new A("Azam Mustufa");
        Azam.name = "Azam"; // You can change the values for non-primitives but not reassign it

        A obj;
        for (double i = 0; i < 1000000000; i++) {
            obj = new A("Azam");
        }

        Integer a = 5; //primitive types can be converted to objects by using Wrapper classes

    }
}
